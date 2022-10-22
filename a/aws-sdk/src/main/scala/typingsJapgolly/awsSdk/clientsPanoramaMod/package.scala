package typingsJapgolly.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.PACKAGE
import typingsJapgolly.awsSdk.awsSdkStrings.RTSP_CAMERA_STREAM
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlternateSoftwares = js.Array[AlternateSoftwareMetadata]

type ApplicationInstanceArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - java.lang.String
*/
type ApplicationInstanceHealthStatus = _ApplicationInstanceHealthStatus | String

type ApplicationInstanceId = String

type ApplicationInstanceName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_REQUESTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_REQUESTED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_FAILED
  - java.lang.String
*/
type ApplicationInstanceStatus = _ApplicationInstanceStatus | String

type ApplicationInstanceStatusDescription = String

type ApplicationInstances = js.Array[ApplicationInstance]

type Boolean = scala.Boolean

type Bucket = String

type BucketName = String

type Certificates = Buffer | js.typedarray.Uint8Array | Blob | String

type ClientToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STATIC_IP
  - typingsJapgolly.awsSdk.awsSdkStrings.DHCP
  - java.lang.String
*/
type ConnectionType = _ConnectionType | String

type CreatedTime = js.Date

type CurrentSoftware = String

type DefaultGateway = String

type DefaultRuntimeContextDevice = String

type Description = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVED
  - java.lang.String
*/
type DesiredState = _DesiredState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.AWAITING_PROVISIONING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.ONLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.OFFLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.LEASE_EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_NEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.REBOOTING
  - java.lang.String
*/
type DeviceAggregatedStatus = _DeviceAggregatedStatus | String

type DeviceArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_PANORAMA
  - typingsJapgolly.awsSdk.awsSdkStrings.LENOVO
  - java.lang.String
*/
type DeviceBrand = _DeviceBrand | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ONLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.OFFLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWAITING_CREDENTIALS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type DeviceConnectionStatus = _DeviceConnectionStatus | String

type DeviceId = String

type DeviceIdList = js.Array[DeviceId]

type DeviceJobList = js.Array[DeviceJob]

type DeviceList = js.Array[Device]

type DeviceName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOP_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCHED
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALL_IN_PROGRESS
  - java.lang.String
*/
type DeviceReportedStatus = _DeviceReportedStatus | String

type DeviceSerialNumber = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWAITING_PROVISIONING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type DeviceStatus = _DeviceStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PANORAMA_APPLIANCE_DEVELOPER_KIT
  - typingsJapgolly.awsSdk.awsSdkStrings.PANORAMA_APPLIANCE
  - java.lang.String
*/
type DeviceType = _DeviceType | String

type Dns = String

type DnsList = js.Array[Dns]

type HwAddress = String

type ImageVersion = String

type InputPortList = js.Array[NodeInputPort]

type IotThingName = String

type IpAddress = String

type IpAddressOrServerName = String

type JobId = String

type JobList = js.Array[Job]

type JobResourceType = PACKAGE | String

type JobTagsList = js.Array[JobResourceTags]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OTA
  - typingsJapgolly.awsSdk.awsSdkStrings.REBOOT
  - java.lang.String
*/
type JobType = _JobType | String

type LastUpdatedTime = js.Date

type LatestAlternateSoftware = String

type LatestSoftware = String

type LeaseExpirationTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_AGGREGATED_STATUS
  - java.lang.String
*/
type ListDevicesSortBy = _ListDevicesSortBy | String

type ManifestOverridesPayloadData = String

type ManifestPayloadData = String

type MarkLatestPatch = scala.Boolean

type Mask = String

type MaxConnections = Double

type MaxSize25 = Double

type NameFilter = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTING
  - java.lang.String
*/
type NetworkConnectionStatus = _NetworkConnectionStatus | String

type NextToken = String

type NodeAssetName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BUSINESS_LOGIC
  - typingsJapgolly.awsSdk.awsSdkStrings.ML_MODEL
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIA_SOURCE
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIA_SINK
  - java.lang.String
*/
type NodeCategory = _NodeCategory | String

type NodeFromTemplateJobList = js.Array[NodeFromTemplateJob]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type NodeFromTemplateJobStatus = _NodeFromTemplateJobStatus | String

type NodeFromTemplateJobStatusMessage = String

type NodeId = String

type NodeInstanceId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PAUSED
  - java.lang.String
*/
type NodeInstanceStatus = _NodeInstanceStatus | String

type NodeInstances = js.Array[NodeInstance]

type NodeName = String

type NodePackageArn = String

type NodePackageId = String

type NodePackageName = String

type NodePackagePatchVersion = String

type NodePackageVersion = String

type NodeSignalList = js.Array[NodeSignal]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PAUSE
  - typingsJapgolly.awsSdk.awsSdkStrings.RESUME
  - java.lang.String
*/
type NodeSignalValue = _NodeSignalValue | String

type NodesList = js.Array[Node]

type NtpServerList = js.Array[IpAddressOrServerName]

type NtpServerName = String

type Object = String

type ObjectKey = String

type OutputPortList = js.Array[NodeOutputPort]

type PackageImportJobList = js.Array[PackageImportJob]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PackageImportJobStatus = _PackageImportJobStatus | String

type PackageImportJobStatusMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NODE_PACKAGE_VERSION
  - typingsJapgolly.awsSdk.awsSdkStrings.MARKETPLACE_NODE_PACKAGE_VERSION
  - java.lang.String
*/
type PackageImportJobType = _PackageImportJobType | String

type PackageList = js.Array[PackageListItem]

type PackageObjects = js.Array[PackageObject]

type PackageOwnerAccount = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTER_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTER_COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type PackageVersionStatus = _PackageVersionStatus | String

type PackageVersionStatusDescription = String

type PortDefaultValue = String

type PortName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.INT32
  - typingsJapgolly.awsSdk.awsSdkStrings.FLOAT32
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDIA
  - java.lang.String
*/
type PortType = _PortType | String

type PrincipalArn = String

type PrincipalArnsList = js.Array[PrincipalArn]

type Region = String

type ReportedRuntimeContextStates = js.Array[ReportedRuntimeContextState]

type ResourceArn = String

type RuntimeContextName = String

type RuntimeRoleArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVAL_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING_DEPLOYMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING_REMOVAL
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYMENT_FAILED
  - java.lang.String
*/
type StatusFilter = _StatusFilter | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TemplateKey = String

type TemplateParametersMap = StringDictionary[TemplateValue]

type TemplateType = RTSP_CAMERA_STREAM | String

type TemplateValue = String

type TimeStamp = js.Date

type Token = String

type UpdateCreatedTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.VERIFYING
  - typingsJapgolly.awsSdk.awsSdkStrings.REBOOTING
  - typingsJapgolly.awsSdk.awsSdkStrings.DOWNLOADING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type UpdateProgress = _UpdateProgress | String

type Version = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-07-24`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
