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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class StatusDto {

  private ExcerptProcessingStatus status;
  private String statusDetails;

  public StatusDto() {
  }

  public StatusDto(ExcerptProcessingStatus status, String statusDetails) {
    this.status = status;
    this.statusDetails = statusDetails;
  }

  public ExcerptProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(ExcerptProcessingStatus status) {
    this.status = status;
  }

  public String getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
  }

  @Override
  public String toString() {
    return "StatusDto{" +
        "status=" + status +
        ", statusDetails='" + statusDetails + '\'' +
        '}';
  }
}
