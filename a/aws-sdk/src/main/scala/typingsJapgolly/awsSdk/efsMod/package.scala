package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object efsMod {
  type AccessPointArn = java.lang.String
  type AccessPointDescriptions = js.Array[typingsJapgolly.awsSdk.efsMod.AccessPointDescription]
  type AccessPointId = java.lang.String
  type AvailabilityZoneId = java.lang.String
  type AvailabilityZoneName = java.lang.String
  type AwsAccountId = java.lang.String
  type BypassPolicyLockoutSafetyCheck = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.efsMod.ClientApiVersions
  type ClientToken = java.lang.String
  type CreationToken = java.lang.String
  type Encrypted = scala.Boolean
  type FileSystemDescriptions = js.Array[typingsJapgolly.awsSdk.efsMod.FileSystemDescription]
  type FileSystemId = java.lang.String
  type FileSystemNullableSizeValue = scala.Double
  type FileSystemSizeValue = scala.Double
  type Gid = scala.Double
  type IpAddress = java.lang.String
  type KmsKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.creating__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.updating__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type LifeCycleState = typingsJapgolly.awsSdk.efsMod._LifeCycleState | java.lang.String
  type LifecyclePolicies = js.Array[typingsJapgolly.awsSdk.efsMod.LifecyclePolicy]
  type Marker = java.lang.String
  type MaxItems = scala.Double
  type MaxResults = scala.Double
  type MountTargetCount = scala.Double
  type MountTargetDescriptions = js.Array[typingsJapgolly.awsSdk.efsMod.MountTargetDescription]
  type MountTargetId = java.lang.String
  type Name = java.lang.String
  type NetworkInterfaceId = java.lang.String
  type OwnerGid = scala.Double
  type OwnerUid = scala.Double
  type Path = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.generalPurpose
    - typingsJapgolly.awsSdk.awsSdkStrings.maxIO
    - java.lang.String
  */
  type PerformanceMode = typingsJapgolly.awsSdk.efsMod._PerformanceMode | java.lang.String
  type Permissions = java.lang.String
  type Policy = java.lang.String
  type ProvisionedThroughputInMibps = scala.Double
  type ResourceId = java.lang.String
  type SecondaryGids = js.Array[typingsJapgolly.awsSdk.efsMod.Gid]
  type SecurityGroup = java.lang.String
  type SecurityGroups = js.Array[typingsJapgolly.awsSdk.efsMod.SecurityGroup]
  type SubnetId = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.efsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.efsMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.bursting
    - typingsJapgolly.awsSdk.awsSdkStrings.provisioned_
    - java.lang.String
  */
  type ThroughputMode = typingsJapgolly.awsSdk.efsMod._ThroughputMode | java.lang.String
  type Timestamp = js.Date
  type Token = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_7_DAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_14_DAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_30_DAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_60_DAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_90_DAYS
    - java.lang.String
  */
  type TransitionToIARules = typingsJapgolly.awsSdk.efsMod._TransitionToIARules | java.lang.String
  type Uid = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-02-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.efsMod._apiVersion | java.lang.String
}
