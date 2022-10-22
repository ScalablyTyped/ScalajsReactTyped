package typingsJapgolly.awsSdk.clientsDatasyncMod

import typingsJapgolly.awsSdk.awsSdkStrings.SIMPLE_PATTERN
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivationKey = String

type AgentArn = String

type AgentArnList = js.Array[AgentArn]

type AgentList = js.Array[AgentListEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ONLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.OFFLINE
  - java.lang.String
*/
type AgentStatus = _AgentStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.BEST_EFFORT
  - java.lang.String
*/
type Atime = _Atime | String

type BytesPerSecond = Double

type DestinationNetworkInterfaceArns = js.Array[NetworkInterfaceArn]

type Duration = Double

type Ec2SecurityGroupArn = String

type Ec2SecurityGroupArnList = js.Array[Ec2SecurityGroupArn]

type Ec2SubnetArn = String

type EfsAccessPointArn = String

type EfsFilesystemArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.TLS1_2
  - java.lang.String
*/
type EfsInTransitEncryption = _EfsInTransitEncryption | String

type EfsSubdirectory = String

type Endpoint = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE_LINK
  - typingsJapgolly.awsSdk.awsSdkStrings.FIPS
  - java.lang.String
*/
type EndpointType = _EndpointType | String

type FilterAttributeValue = String

type FilterList = js.Array[FilterRule]

type FilterType = SIMPLE_PATTERN | String

type FilterValue = String

type FilterValues = js.Array[FilterAttributeValue]

type FsxFilesystemArn = String

type FsxLustreSubdirectory = String

type FsxOntapSubdirectory = String

type FsxOpenZfsSubdirectory = String

type FsxWindowsSubdirectory = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.INT_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.BOTH
  - java.lang.String
*/
type Gid = _Gid | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SIMPLE
  - typingsJapgolly.awsSdk.awsSdkStrings.KERBEROS
  - java.lang.String
*/
type HdfsAuthenticationType = _HdfsAuthenticationType | String

type HdfsBlockSize = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHENTICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGRITY
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVACY
  - java.lang.String
*/
type HdfsDataTransferProtection = _HdfsDataTransferProtection | String

type HdfsNameNodeList = js.Array[HdfsNameNode]

type HdfsReplicationFactor = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHENTICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGRITY
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVACY
  - java.lang.String
*/
type HdfsRpcProtection = _HdfsRpcProtection | String

type HdfsServerHostname = String

type HdfsServerPort = Double

type HdfsSubdirectory = String

type HdfsUser = String

type IamRoleArn = String

type InputTagList = js.Array[TagListEntry]

type KerberosKeytabFile = Buffer | js.typedarray.Uint8Array | Blob | String

type KerberosKrb5ConfFile = Buffer | js.typedarray.Uint8Array | Blob | String

type KerberosPrincipal = String

type KmsKeyProviderUri = String

type LocationArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LocationUri
  - typingsJapgolly.awsSdk.awsSdkStrings.LocationType
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type LocationFilterName = _LocationFilterName | String

type LocationFilters = js.Array[LocationFilter]

type LocationList = js.Array[LocationListEntry]

type LocationUri = String

type LogGroupArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OFF
  - typingsJapgolly.awsSdk.awsSdkStrings.BASIC
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFER
  - java.lang.String
*/
type LogLevel = _LogLevel | String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
  - java.lang.String
*/
type Mtime = _Mtime | String

type NetworkInterfaceArn = String

type NextToken = String

type NfsSubdirectory = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
  - typingsJapgolly.awsSdk.awsSdkStrings.NFS3
  - typingsJapgolly.awsSdk.awsSdkStrings.NFS4_0
  - typingsJapgolly.awsSdk.awsSdkStrings.NFS4_1
  - java.lang.String
*/
type NfsVersion = _NfsVersion | String

type ObjectStorageAccessKey = String

type ObjectStorageBucketName = String

type ObjectStorageSecretKey = String

type ObjectStorageServerPort = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTPS
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
type ObjectStorageServerProtocol = _ObjectStorageServerProtocol | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ObjectTags = _ObjectTags | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Equals_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotEquals
  - typingsJapgolly.awsSdk.awsSdkStrings.In_
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEqual
  - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEqual
  - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
  - typingsJapgolly.awsSdk.awsSdkStrings.Contains_
  - typingsJapgolly.awsSdk.awsSdkStrings.NotContains
  - typingsJapgolly.awsSdk.awsSdkStrings.BeginsWith
  - java.lang.String
*/
type Operator = _Operator | String

type OutputTagList = js.Array[TagListEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
  - java.lang.String
*/
type OverwriteMode = _OverwriteMode | String

type PLSecurityGroupArnList = js.Array[Ec2SecurityGroupArn]

type PLSubnetArnList = js.Array[Ec2SubnetArn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type PhaseStatus = _PhaseStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
  - java.lang.String
*/
type PosixPermissions = _PosixPermissions | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
  - java.lang.String
*/
type PreserveDeletedFiles = _PreserveDeletedFiles | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
  - java.lang.String
*/
type PreserveDevices = _PreserveDevices | String

type S3BucketArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
  - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
  - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
  - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTPOSTS
  - java.lang.String
*/
type S3StorageClass = _S3StorageClass | String

type S3Subdirectory = String

type ScheduleExpressionCron = String

type ServerHostname = String

type SmbDomain = String

type SmbPassword = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.OWNER_DACL
  - typingsJapgolly.awsSdk.awsSdkStrings.OWNER_DACL_SACL
  - java.lang.String
*/
type SmbSecurityDescriptorCopyFlags = _SmbSecurityDescriptorCopyFlags | String

type SmbSubdirectory = String

type SmbUser = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
  - typingsJapgolly.awsSdk.awsSdkStrings.SMB2
  - typingsJapgolly.awsSdk.awsSdkStrings.SMB3
  - java.lang.String
*/
type SmbVersion = _SmbVersion | String

type SourceNetworkInterfaceArns = js.Array[NetworkInterfaceArn]

type StorageVirtualMachineArn = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagValue = String

type TaggableResourceArn = String

type TaskArn = String

type TaskExecutionArn = String

type TaskExecutionList = js.Array[TaskExecutionListEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCHING
  - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFERRING
  - typingsJapgolly.awsSdk.awsSdkStrings.VERIFYING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type TaskExecutionStatus = _TaskExecutionStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LocationId
  - typingsJapgolly.awsSdk.awsSdkStrings.CreationTime
  - java.lang.String
*/
type TaskFilterName = _TaskFilterName | String

type TaskFilters = js.Array[TaskFilter]

type TaskList = js.Array[TaskListEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type TaskQueueing = _TaskQueueing | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type TaskStatus = _TaskStatus | String

type Time = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CHANGED
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type TransferMode = _TransferMode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.INT_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.BOTH
  - java.lang.String
*/
type Uid = _Uid | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.POINT_IN_TIME_CONSISTENT
  - typingsJapgolly.awsSdk.awsSdkStrings.ONLY_FILES_TRANSFERRED
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type VerifyMode = _VerifyMode | String

type VpcEndpointId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-09`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type long = Double
