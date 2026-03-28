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

package com.epam.digital.data.platform.excerpt.dao;

import com.epam.digital.data.platform.excerpt.model.ExcerptProcessingStatus;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ExcerptRecord {

  @Id
  @GeneratedValue
  private UUID id;

  private ExcerptProcessingStatus status;
  private String statusDetails;
  private String keycloakId;
  private String checksum;
  private String excerptKey;
  private Boolean signatureRequired;
  private String xDigitalSignature;
  private String xDigitalSignatureDerived;
  private String xSourceSystem;
  private String xSourceApplication;
  private String xSourceBusinessProcess;
  private String xSourceBusinessActivity;
  private String excerptType;

  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
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

  public String getKeycloakId() {
    return keycloakId;
  }

  public void setKeycloakId(String keycloakId) {
    this.keycloakId = keycloakId;
  }

  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public String getExcerptKey() {
    return excerptKey;
  }

  public void setExcerptKey(String excerptKey) {
    this.excerptKey = excerptKey;
  }

  public Boolean getSignatureRequired() {
    return signatureRequired;
  }

  public void setSignatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
  }

  public String getxDigitalSignature() {
    return xDigitalSignature;
  }

  public void setxDigitalSignature(String xDigitalSignature) {
    this.xDigitalSignature = xDigitalSignature;
  }

  public String getxDigitalSignatureDerived() {
    return xDigitalSignatureDerived;
  }

  public void setxDigitalSignatureDerived(String xDigitalSignatureDerived) {
    this.xDigitalSignatureDerived = xDigitalSignatureDerived;
  }

  public String getxSourceSystem() {
    return xSourceSystem;
  }

  public void setxSourceSystem(String xSourceSystem) {
    this.xSourceSystem = xSourceSystem;
  }

  public String getxSourceApplication() {
    return xSourceApplication;
  }

  public void setxSourceApplication(String xSourceApplication) {
    this.xSourceApplication = xSourceApplication;
  }

  public String getxSourceBusinessProcess() {
    return xSourceBusinessProcess;
  }

  public void setxSourceBusinessProcess(String xSourceBusinessProcess) {
    this.xSourceBusinessProcess = xSourceBusinessProcess;
  }

  public String getxSourceBusinessActivity() {
    return xSourceBusinessActivity;
  }

  public void setxSourceBusinessActivity(String xSourceBusinessActivity) {
    this.xSourceBusinessActivity = xSourceBusinessActivity;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getExcerptType() {
    return excerptType;
  }

  public void setExcerptType(String excerptType) {
    this.excerptType = excerptType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcerptRecord that = (ExcerptRecord) o;
    return Objects.equals(id, that.id) && status == that.status && Objects.equals(
        statusDetails, that.statusDetails) && Objects.equals(keycloakId, that.keycloakId)
        && Objects.equals(checksum, that.checksum) && Objects.equals(excerptKey,
        that.excerptKey) && Objects.equals(signatureRequired, that.signatureRequired)
        && Objects.equals(xDigitalSignature, that.xDigitalSignature)
        && Objects.equals(xDigitalSignatureDerived, that.xDigitalSignatureDerived)
        && Objects.equals(xSourceSystem, that.xSourceSystem) && Objects.equals(
        xSourceApplication, that.xSourceApplication) && Objects.equals(
        xSourceBusinessProcess, that.xSourceBusinessProcess) && Objects.equals(
        xSourceBusinessActivity, that.xSourceBusinessActivity) && Objects.equals(createdAt,
        that.createdAt) && Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(excerptType, that.excerptType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, statusDetails, keycloakId, checksum, excerptKey,
        signatureRequired, xDigitalSignature, xDigitalSignatureDerived, xSourceSystem,
        xSourceApplication, xSourceBusinessProcess, xSourceBusinessActivity, createdAt,
        updatedAt, excerptType);
  }
}
