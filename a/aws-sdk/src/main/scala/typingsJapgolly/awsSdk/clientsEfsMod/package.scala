package typingsJapgolly.awsSdk.clientsEfsMod

import typingsJapgolly.awsSdk.awsSdkStrings.AFTER_1_ACCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessPointArn = String

type AccessPointDescriptions = js.Array[AccessPointDescription]

type AccessPointId = String

type AvailabilityZoneId = String

type AvailabilityZoneName = String

type AwsAccountId = String

type Backup = Boolean

type BypassPolicyLockoutSafetyCheck = Boolean

type ClientToken = String

type CreationToken = String

type Destinations = js.Array[Destination]

type DestinationsToCreate = js.Array[DestinationToCreate]

type Encrypted = Boolean

type FileSystemArn = String

type FileSystemDescriptions = js.Array[FileSystemDescription]

type FileSystemId = String

type FileSystemNullableSizeValue = Double

type FileSystemSizeValue = Double

type Gid = Double

type IpAddress = String

type KmsKeyId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.creating__
  - typingsJapgolly.awsSdk.awsSdkStrings.available__
  - typingsJapgolly.awsSdk.awsSdkStrings.updating__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
  - typingsJapgolly.awsSdk.awsSdkStrings.error__
  - java.lang.String
*/
type LifeCycleState = _LifeCycleState | String

type LifecyclePolicies = js.Array[LifecyclePolicy]

type Marker = String

type MaxItems = Double

type MaxResults = Double

type MountTargetCount = Double

type MountTargetDescriptions = js.Array[MountTargetDescription]

type MountTargetId = String

type Name = String

type NetworkInterfaceId = String

type OwnerGid = Double

type OwnerUid = Double

type Path = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.generalPurpose
  - typingsJapgolly.awsSdk.awsSdkStrings.maxIO
  - java.lang.String
*/
type PerformanceMode = _PerformanceMode | String

type Permissions = String

type Policy = String

type ProvisionedThroughputInMibps = Double

type RegionName = String

type ReplicationConfigurationDescriptions = js.Array[ReplicationConfigurationDescription]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type ReplicationStatus = _ReplicationStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_SYSTEM
  - typingsJapgolly.awsSdk.awsSdkStrings.MOUNT_TARGET
  - java.lang.String
*/
type Resource = _Resource | String

type ResourceId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LONG_ID
  - typingsJapgolly.awsSdk.awsSdkStrings.SHORT_ID
  - java.lang.String
*/
type ResourceIdType = _ResourceIdType | String

type Resources = js.Array[Resource]

type SecondaryGids = js.Array[Gid]

type SecurityGroup = String

type SecurityGroups = js.Array[SecurityGroup]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
  - java.lang.String
*/
type Status = _Status | String

type SubnetId = String

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.bursting
  - typingsJapgolly.awsSdk.awsSdkStrings.provisioned__
  - java.lang.String
*/
type ThroughputMode = _ThroughputMode | String

type Timestamp = js.Date

type Token = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_7_DAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_14_DAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_30_DAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_60_DAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_90_DAYS
  - java.lang.String
*/
type TransitionToIARules = _TransitionToIARules | String

type TransitionToPrimaryStorageClassRules = AFTER_1_ACCESS | String

type Uid = Double

type VpcId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-02-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
