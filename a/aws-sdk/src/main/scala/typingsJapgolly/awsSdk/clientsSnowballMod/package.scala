package typingsJapgolly.awsSdk.clientsSnowballMod

import typingsJapgolly.awsSdk.awsSdkStrings.TB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddressId = java.lang.String

type AddressList = js.Array[Address]

type AmiId = java.lang.String

type Boolean = scala.Boolean

type ClusterId = java.lang.String

type ClusterListEntryList = js.Array[ClusterListEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AwaitingQuorum
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.InUse
  - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
type ClusterState = _ClusterState | java.lang.String

type CompatibleImageList = js.Array[CompatibleImage]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NFS_ON_DEVICE_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_ON_DEVICE_SERVICE
  - java.lang.String
*/
type DeviceServiceName = _DeviceServiceName | java.lang.String

type Ec2AmiResourceList = js.Array[Ec2AmiResource]

type EventTriggerDefinitionList = js.Array[EventTriggerDefinition]

type GSTIN = java.lang.String

type Integer = Double

type JavaBoolean = scala.Boolean

type JobId = java.lang.String

type JobListEntryList = js.Array[JobListEntry]

type JobMetadataList = js.Array[JobMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.New_
  - typingsJapgolly.awsSdk.awsSdkStrings.PreparingAppliance
  - typingsJapgolly.awsSdk.awsSdkStrings.PreparingShipment
  - typingsJapgolly.awsSdk.awsSdkStrings.InTransitToCustomer
  - typingsJapgolly.awsSdk.awsSdkStrings.WithCustomer
  - typingsJapgolly.awsSdk.awsSdkStrings.InTransitToAWS
  - typingsJapgolly.awsSdk.awsSdkStrings.WithAWSSortingFacility
  - typingsJapgolly.awsSdk.awsSdkStrings.WithAWS
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Listing
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - java.lang.String
*/
type JobState = _JobState | java.lang.String

type JobStateList = js.Array[JobState]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_USE
  - java.lang.String
*/
type JobType = _JobType | java.lang.String

type KmsKeyARN = java.lang.String

type LambdaResourceList = js.Array[LambdaResource]

type ListLimit = Double

type Long = Double

type LongTermPricingAssociatedJobIdList = js.Array[JobId]

type LongTermPricingEntryList = js.Array[LongTermPricingListEntry]

type LongTermPricingId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OneYear
  - typingsJapgolly.awsSdk.awsSdkStrings.ThreeYear
  - java.lang.String
*/
type LongTermPricingType = _LongTermPricingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLED_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLED_AUTOSTART
  - java.lang.String
*/
type RemoteManagement = _RemoteManagement | java.lang.String

type ResourceARN = java.lang.String

type RoleARN = java.lang.String

type S3ResourceList = js.Array[S3Resource]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RECEIVED
  - typingsJapgolly.awsSdk.awsSdkStrings.RETURNED
  - java.lang.String
*/
type ShipmentState = _ShipmentState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.TimedOut_
  - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type ShippingLabelStatus = _ShippingLabelStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SECOND_DAY
  - typingsJapgolly.awsSdk.awsSdkStrings.NEXT_DAY
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - java.lang.String
*/
type ShippingOption = _ShippingOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.T50
  - typingsJapgolly.awsSdk.awsSdkStrings.T80
  - typingsJapgolly.awsSdk.awsSdkStrings.T100
  - typingsJapgolly.awsSdk.awsSdkStrings.T42
  - typingsJapgolly.awsSdk.awsSdkStrings.T98
  - typingsJapgolly.awsSdk.awsSdkStrings.T8
  - typingsJapgolly.awsSdk.awsSdkStrings.T14
  - typingsJapgolly.awsSdk.awsSdkStrings.NoPreference
  - typingsJapgolly.awsSdk.awsSdkStrings.T32
  - java.lang.String
*/
type SnowballCapacity = _SnowballCapacity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.EDGE
  - typingsJapgolly.awsSdk.awsSdkStrings.EDGE_C
  - typingsJapgolly.awsSdk.awsSdkStrings.EDGE_CG
  - typingsJapgolly.awsSdk.awsSdkStrings.EDGE_S
  - typingsJapgolly.awsSdk.awsSdkStrings.SNC1_HDD
  - typingsJapgolly.awsSdk.awsSdkStrings.SNC1_SSD
  - typingsJapgolly.awsSdk.awsSdkStrings.V3_5C
  - java.lang.String
*/
type SnowballType = _SnowballType | java.lang.String

type SnsTopicARN = java.lang.String

type StorageLimit = Double

type StorageUnit = TB | java.lang.String

type String = java.lang.String

type TargetOnDeviceServiceList = js.Array[TargetOnDeviceService]

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_USE
  - java.lang.String
*/
type TransferOption = _TransferOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-06-30`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
