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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;

public class ExcerptEventDto {

  private UUID recordId;
  @NotBlank
  private String excerptType;
  private Map<String, Object> excerptInputData;
  private boolean requiresSystemSignature;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String excerptLanguage;

  public ExcerptEventDto() {}

  public ExcerptEventDto(
      String excerptType,
      Map<String, Object> excerptInputData,
      boolean requiresSystemSignature,
      String excerptLanguage) {
    this.excerptType = excerptType;
    this.excerptInputData = new HashMap<>(Objects.requireNonNullElse(excerptInputData, Map.of()));
    this.requiresSystemSignature = requiresSystemSignature;
    this.excerptLanguage = excerptLanguage;
  }

  public UUID getRecordId() {
    return recordId;
  }

  public void setRecordId(UUID recordId) {
    this.recordId = recordId;
  }

  public String getExcerptType() {
    return excerptType;
  }

  public void setExcerptType(String excerptType) {
    this.excerptType = excerptType;
  }

  public Map<String, Object> getExcerptInputData() {
    return new HashMap<>(excerptInputData);
  }

  public void setExcerptInputData(Map<String, Object> excerptInputData) {
    this.excerptInputData = new HashMap<>(Objects.requireNonNullElse(excerptInputData, Map.of()));
  }

  public boolean isRequiresSystemSignature() {
    return requiresSystemSignature;
  }

  public void setRequiresSystemSignature(boolean requiresSystemSignature) {
    this.requiresSystemSignature = requiresSystemSignature;
  }

  public String getExcerptLanguage() {
    return excerptLanguage;
  }

  public void setExcerptLanguage(String excerptLanguage) {
    this.excerptLanguage = excerptLanguage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExcerptEventDto that = (ExcerptEventDto) o;
    return requiresSystemSignature == that.requiresSystemSignature
        && Objects.equals(recordId, that.recordId)
        && Objects.equals(excerptType, that.excerptType)
        && Objects.equals(excerptInputData, that.excerptInputData)
        && Objects.equals(excerptLanguage, that.excerptLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        recordId, excerptType, excerptInputData, requiresSystemSignature, excerptLanguage);
  }
}
