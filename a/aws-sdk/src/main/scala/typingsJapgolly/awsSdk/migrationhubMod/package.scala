package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object migrationhubMod {
  type ApplicationId = java.lang.String
  type ApplicationIds = js.Array[typingsJapgolly.awsSdk.migrationhubMod.ApplicationId]
  type ApplicationStateList = js.Array[typingsJapgolly.awsSdk.migrationhubMod.ApplicationState]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type ApplicationStatus = typingsJapgolly.awsSdk.migrationhubMod._ApplicationStatus | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.migrationhubMod.ClientApiVersions
  type ConfigurationId = java.lang.String
  type CreatedArtifactDescription = java.lang.String
  type CreatedArtifactList = js.Array[typingsJapgolly.awsSdk.migrationhubMod.CreatedArtifact]
  type CreatedArtifactName = java.lang.String
  type DiscoveredResourceDescription = java.lang.String
  type DiscoveredResourceList = js.Array[typingsJapgolly.awsSdk.migrationhubMod.DiscoveredResource]
  type DryRun = scala.Boolean
  type LatestResourceAttributeList = js.Array[typingsJapgolly.awsSdk.migrationhubMod.ResourceAttribute]
  type MaxResults = scala.Double
  type MaxResultsCreatedArtifacts = scala.Double
  type MaxResultsResources = scala.Double
  type MigrationTaskName = java.lang.String
  type MigrationTaskSummaryList = js.Array[typingsJapgolly.awsSdk.migrationhubMod.MigrationTaskSummary]
  type NextUpdateSeconds = scala.Double
  type ProgressPercent = scala.Double
  type ProgressUpdateStream = java.lang.String
  type ProgressUpdateStreamSummaryList = js.Array[typingsJapgolly.awsSdk.migrationhubMod.ProgressUpdateStreamSummary]
  type ResourceAttributeList = js.Array[typingsJapgolly.awsSdk.migrationhubMod.ResourceAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IPV4_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.IPV6_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.MAC_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FQDN
    - typingsJapgolly.awsSdk.awsSdkStrings.VM_MANAGER_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.VM_MANAGED_OBJECT_REFERENCE
    - typingsJapgolly.awsSdk.awsSdkStrings.VM_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.VM_PATH
    - typingsJapgolly.awsSdk.awsSdkStrings.BIOS_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.MOTHERBOARD_SERIAL_NUMBER
    - java.lang.String
  */
  type ResourceAttributeType = typingsJapgolly.awsSdk.migrationhubMod._ResourceAttributeType | java.lang.String
  type ResourceAttributeValue = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.migrationhubMod._Status | java.lang.String
  type StatusDetail = java.lang.String
  type Token = java.lang.String
  type UpdateDateTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-05-31`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.migrationhubMod._apiVersion | java.lang.String
}
