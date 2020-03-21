package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datasyncMod {
  type ActivationKey = java.lang.String
  type AgentArn = java.lang.String
  type AgentArnList = js.Array[typingsJapgolly.awsSdk.datasyncMod.AgentArn]
  type AgentList = js.Array[typingsJapgolly.awsSdk.datasyncMod.AgentListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ONLINE
    - typingsJapgolly.awsSdk.awsSdkStrings.OFFLINE
    - java.lang.String
  */
  type AgentStatus = typingsJapgolly.awsSdk.datasyncMod._AgentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.BEST_EFFORT
    - java.lang.String
  */
  type Atime = typingsJapgolly.awsSdk.datasyncMod._Atime | java.lang.String
  type BytesPerSecond = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.datasyncMod.ClientApiVersions
  type DestinationNetworkInterfaceArns = js.Array[typingsJapgolly.awsSdk.datasyncMod.NetworkInterfaceArn]
  type Duration = scala.Double
  type Ec2SecurityGroupArn = java.lang.String
  type Ec2SecurityGroupArnList = js.Array[typingsJapgolly.awsSdk.datasyncMod.Ec2SecurityGroupArn]
  type Ec2SubnetArn = java.lang.String
  type EfsFilesystemArn = java.lang.String
  type EfsSubdirectory = java.lang.String
  type Endpoint = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE_LINK
    - typingsJapgolly.awsSdk.awsSdkStrings.FIPS
    - java.lang.String
  */
  type EndpointType = typingsJapgolly.awsSdk.datasyncMod._EndpointType | java.lang.String
  type FilterList = js.Array[typingsJapgolly.awsSdk.datasyncMod.FilterRule]
  type FilterType = typingsJapgolly.awsSdk.awsSdkStrings.SIMPLE_PATTERN | java.lang.String
  type FilterValue = java.lang.String
  type FsxFilesystemArn = java.lang.String
  type FsxWindowsSubdirectory = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.INT_VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.BOTH
    - java.lang.String
  */
  type Gid = typingsJapgolly.awsSdk.datasyncMod._Gid | java.lang.String
  type IamRoleArn = java.lang.String
  type LocationArn = java.lang.String
  type LocationList = js.Array[typingsJapgolly.awsSdk.datasyncMod.LocationListEntry]
  type LocationUri = java.lang.String
  type LogGroupArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OFF
    - typingsJapgolly.awsSdk.awsSdkStrings.BASIC
    - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFER
    - java.lang.String
  */
  type LogLevel = typingsJapgolly.awsSdk.datasyncMod._LogLevel | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
    - java.lang.String
  */
  type Mtime = typingsJapgolly.awsSdk.datasyncMod._Mtime | java.lang.String
  type NetworkInterfaceArn = java.lang.String
  type NextToken = java.lang.String
  type NfsSubdirectory = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
    - typingsJapgolly.awsSdk.awsSdkStrings.NFS3
    - typingsJapgolly.awsSdk.awsSdkStrings.NFS4_0
    - typingsJapgolly.awsSdk.awsSdkStrings.NFS4_1
    - java.lang.String
  */
  type NfsVersion = typingsJapgolly.awsSdk.datasyncMod._NfsVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.NEVER
    - java.lang.String
  */
  type OverwriteMode = typingsJapgolly.awsSdk.datasyncMod._OverwriteMode | java.lang.String
  type PLSecurityGroupArnList = js.Array[typingsJapgolly.awsSdk.datasyncMod.Ec2SecurityGroupArn]
  type PLSubnetArnList = js.Array[typingsJapgolly.awsSdk.datasyncMod.Ec2SubnetArn]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type PhaseStatus = typingsJapgolly.awsSdk.datasyncMod._PhaseStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
    - java.lang.String
  */
  type PosixPermissions = typingsJapgolly.awsSdk.datasyncMod._PosixPermissions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE
    - java.lang.String
  */
  type PreserveDeletedFiles = typingsJapgolly.awsSdk.datasyncMod._PreserveDeletedFiles | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
    - java.lang.String
  */
  type PreserveDevices = typingsJapgolly.awsSdk.datasyncMod._PreserveDevices | java.lang.String
  type S3BucketArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.ONEZONE_IA
    - typingsJapgolly.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
    - typingsJapgolly.awsSdk.awsSdkStrings.GLACIER
    - typingsJapgolly.awsSdk.awsSdkStrings.DEEP_ARCHIVE
    - java.lang.String
  */
  type S3StorageClass = typingsJapgolly.awsSdk.datasyncMod._S3StorageClass | java.lang.String
  type S3Subdirectory = java.lang.String
  type ScheduleExpressionCron = java.lang.String
  type ServerHostname = java.lang.String
  type SmbDomain = java.lang.String
  type SmbPassword = java.lang.String
  type SmbSubdirectory = java.lang.String
  type SmbUser = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATIC
    - typingsJapgolly.awsSdk.awsSdkStrings.SMB2
    - typingsJapgolly.awsSdk.awsSdkStrings.SMB3
    - java.lang.String
  */
  type SmbVersion = typingsJapgolly.awsSdk.datasyncMod._SmbVersion | java.lang.String
  type SourceNetworkInterfaceArns = js.Array[typingsJapgolly.awsSdk.datasyncMod.NetworkInterfaceArn]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.datasyncMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.datasyncMod.TagListEntry]
  type TagValue = java.lang.String
  type TaggableResourceArn = java.lang.String
  type TaskArn = java.lang.String
  type TaskExecutionArn = java.lang.String
  type TaskExecutionList = js.Array[typingsJapgolly.awsSdk.datasyncMod.TaskExecutionListEntry]
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
  type TaskExecutionStatus = typingsJapgolly.awsSdk.datasyncMod._TaskExecutionStatus | java.lang.String
  type TaskList = js.Array[typingsJapgolly.awsSdk.datasyncMod.TaskListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type TaskQueueing = typingsJapgolly.awsSdk.datasyncMod._TaskQueueing | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type TaskStatus = typingsJapgolly.awsSdk.datasyncMod._TaskStatus | java.lang.String
  type Time = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.INT_VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.BOTH
    - java.lang.String
  */
  type Uid = typingsJapgolly.awsSdk.datasyncMod._Uid | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.POINT_IN_TIME_CONSISTENT
    - typingsJapgolly.awsSdk.awsSdkStrings.ONLY_FILES_TRANSFERRED
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type VerifyMode = typingsJapgolly.awsSdk.datasyncMod._VerifyMode | java.lang.String
  type VpcEndpointId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-09`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.datasyncMod._apiVersion | java.lang.String
  type long = scala.Double
}
