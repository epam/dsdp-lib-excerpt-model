/*
 * Copyright 2021 EPAM Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.digital.data.platform.excerpt.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Request<T> {

  /** Accepted
   * Jackson unsafe deserialization is flagged because @JsonTypeInfo(use = CLASS) allows
   * arbitrary class instantiation during deserialization. However, this risk is mitigated by the
   * following controls:
   *  1. The Kafka consumer is configured with trusted-packages restricted to
   * "com.epam.digital.data.platform.excerpt.model" only, preventing deserialization of arbitrary
   * classes.
   *  2. The Kafka topics (generate-excerpt, generate-excerpt-docx, generate-excerpt-csv)
   * are internal platform topics not exposed to external systems or untrusted producers.
   *  3. All producers of Request<T> messages are internal platform services (excerpt-service-api) that only
   * create Request<ExcerptWorkerEventDto> with controlled, known payload types.
   *  4. Network policies in the Kubernetes deployment restrict Kafka access to authorized services only.
   *  5. The Request class is used exclusively for internal Kafka messaging within the excerpt service ecosystem,
   * not for external API endpoints or user-facing deserialization. Migrating to @JsonTypeInfo(use =
   * NAME) would require coordinated deployment changes across multiple services.
   * Given the existing controls and the internal nature of this class, the use of CLASS-based deserialization is justified and does not pose an undue security risk.
   * 
   * Suppression is applied via sonar.issue.ignore.multicriteria in pom.xml because 
   * SonarQube FindSecBugs rule reports the issue at file line 1, outside any annotatable Java element, 
   * so @SuppressWarnings has no effect.
   */
  @SuppressWarnings("findsecbugs:JACKSON_UNSAFE_DESERIALIZATION")
  @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@class")
  private T payload;

  public Request() {
  }

  public Request(T payload) {
    this.payload = payload;
  }

  public T getPayload() {
    return payload;
  }

  public void setPayload(T payload) {
    this.payload = payload;
  }
}
