package typingsJapgolly.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplicationId = String

type ApplicationIds = js.Array[ApplicationId]

type ApplicationStateList = js.Array[ApplicationState]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type ApplicationStatus = _ApplicationStatus | String

type ConfigurationId = String

type CreatedArtifactDescription = String

type CreatedArtifactList = js.Array[CreatedArtifact]

type CreatedArtifactName = String

type DiscoveredResourceDescription = String

type DiscoveredResourceList = js.Array[DiscoveredResource]

type DryRun = Boolean

type LatestResourceAttributeList = js.Array[ResourceAttribute]

type MaxResults = Double

type MaxResultsCreatedArtifacts = Double

type MaxResultsResources = Double

type MigrationTaskName = String

type MigrationTaskSummaryList = js.Array[MigrationTaskSummary]

type NextUpdateSeconds = Double

type ProgressPercent = Double

type ProgressUpdateStream = String

type ProgressUpdateStreamSummaryList = js.Array[ProgressUpdateStreamSummary]

type ResourceAttributeList = js.Array[ResourceAttribute]

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
type ResourceAttributeType = _ResourceAttributeType | String

type ResourceAttributeValue = String

type ResourceName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type Status = _Status | String

type StatusDetail = String

type Token = String

type UpdateDateTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-05-31`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
