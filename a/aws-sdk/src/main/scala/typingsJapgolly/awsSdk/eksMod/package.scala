package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eksMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AL2_x86_64
    - typingsJapgolly.awsSdk.awsSdkStrings.AL2_x86_64_GPU
    - java.lang.String
  */
  type AMITypes = typingsJapgolly.awsSdk.eksMod._AMITypes | java.lang.String
  type AutoScalingGroupList = js.Array[typingsJapgolly.awsSdk.eksMod.AutoScalingGroup]
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type BoxedInteger = scala.Double
  type Capacity = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.eksMod.ClientApiVersions
  type ClusterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type ClusterStatus = typingsJapgolly.awsSdk.eksMod._ClusterStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SubnetNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.SecurityGroupNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.EniLimitReached
    - typingsJapgolly.awsSdk.awsSdkStrings.IpNotAvailable
    - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
    - typingsJapgolly.awsSdk.awsSdkStrings.OperationNotPermitted
    - typingsJapgolly.awsSdk.awsSdkStrings.VpcIdNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.Unknown_
    - typingsJapgolly.awsSdk.awsSdkStrings.NodeCreationFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.PodEvictionFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.InsufficientFreeAddresses
    - java.lang.String
  */
  type ErrorCode = typingsJapgolly.awsSdk.eksMod._ErrorCode | java.lang.String
  type ErrorDetails = js.Array[typingsJapgolly.awsSdk.eksMod.ErrorDetail]
  type FargateProfileLabel = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.eksMod.String]
  type FargateProfileSelectors = js.Array[typingsJapgolly.awsSdk.eksMod.FargateProfileSelector]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type FargateProfileStatus = typingsJapgolly.awsSdk.eksMod._FargateProfileStatus | java.lang.String
  type FargateProfilesRequestMaxResults = scala.Double
  type IssueList = js.Array[typingsJapgolly.awsSdk.eksMod.Issue]
  type ListClustersRequestMaxResults = scala.Double
  type ListNodegroupsRequestMaxResults = scala.Double
  type ListUpdatesRequestMaxResults = scala.Double
  type LogSetups = js.Array[typingsJapgolly.awsSdk.eksMod.LogSetup]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.api_
    - typingsJapgolly.awsSdk.awsSdkStrings.audit_
    - typingsJapgolly.awsSdk.awsSdkStrings.authenticator
    - typingsJapgolly.awsSdk.awsSdkStrings.controllerManager
    - typingsJapgolly.awsSdk.awsSdkStrings.scheduler
    - java.lang.String
  */
  type LogType = typingsJapgolly.awsSdk.eksMod._LogType | java.lang.String
  type LogTypes = js.Array[typingsJapgolly.awsSdk.eksMod.LogType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AutoScalingGroupNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.AutoScalingGroupInvalidConfiguration
    - typingsJapgolly.awsSdk.awsSdkStrings.Ec2SecurityGroupNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.Ec2SecurityGroupDeletionFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.Ec2LaunchTemplateNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.Ec2LaunchTemplateVersionMismatch
    - typingsJapgolly.awsSdk.awsSdkStrings.Ec2SubnetNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.IamInstanceProfileNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.IamNodeRoleNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.AsgInstanceLaunchFailures
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceLimitExceeded
    - typingsJapgolly.awsSdk.awsSdkStrings.InsufficientFreeAddresses
    - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalFailure
    - java.lang.String
  */
  type NodegroupIssueCode = typingsJapgolly.awsSdk.eksMod._NodegroupIssueCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DEGRADED
    - java.lang.String
  */
  type NodegroupStatus = typingsJapgolly.awsSdk.eksMod._NodegroupStatus | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.eksMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.eksMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.eksMod.TagValue]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Version_
    - typingsJapgolly.awsSdk.awsSdkStrings.PlatformVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.EndpointPrivateAccess
    - typingsJapgolly.awsSdk.awsSdkStrings.EndpointPublicAccess
    - typingsJapgolly.awsSdk.awsSdkStrings.ClusterLogging
    - typingsJapgolly.awsSdk.awsSdkStrings.DesiredSize
    - typingsJapgolly.awsSdk.awsSdkStrings.LabelsToAdd
    - typingsJapgolly.awsSdk.awsSdkStrings.LabelsToRemove
    - typingsJapgolly.awsSdk.awsSdkStrings.MaxSize
    - typingsJapgolly.awsSdk.awsSdkStrings.MinSize
    - typingsJapgolly.awsSdk.awsSdkStrings.ReleaseVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.PublicAccessCidrs
    - java.lang.String
  */
  type UpdateParamType = typingsJapgolly.awsSdk.eksMod._UpdateParamType | java.lang.String
  type UpdateParams = js.Array[typingsJapgolly.awsSdk.eksMod.UpdateParam]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
    - java.lang.String
  */
  type UpdateStatus = typingsJapgolly.awsSdk.eksMod._UpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VersionUpdate
    - typingsJapgolly.awsSdk.awsSdkStrings.EndpointAccessUpdate
    - typingsJapgolly.awsSdk.awsSdkStrings.LoggingUpdate
    - typingsJapgolly.awsSdk.awsSdkStrings.ConfigUpdate
    - java.lang.String
  */
  type UpdateType = typingsJapgolly.awsSdk.eksMod._UpdateType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-11-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.eksMod._apiVersion | java.lang.String
  type labelKey = java.lang.String
  type labelValue = java.lang.String
  type labelsKeyList = js.Array[typingsJapgolly.awsSdk.eksMod.String]
  type labelsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.eksMod.labelValue]
}
