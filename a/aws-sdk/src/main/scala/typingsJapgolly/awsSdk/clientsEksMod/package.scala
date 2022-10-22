package typingsJapgolly.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AL2_x86_64
  - typingsJapgolly.awsSdk.awsSdkStrings.AL2_x86_64_GPU
  - typingsJapgolly.awsSdk.awsSdkStrings.AL2_ARM_64
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - typingsJapgolly.awsSdk.awsSdkStrings.BOTTLEROCKET_ARM_64
  - typingsJapgolly.awsSdk.awsSdkStrings.BOTTLEROCKET_x86_64
  - typingsJapgolly.awsSdk.awsSdkStrings.BOTTLEROCKET_ARM_64_NVIDIA
  - typingsJapgolly.awsSdk.awsSdkStrings.BOTTLEROCKET_x86_64_NVIDIA
  - java.lang.String
*/
type AMITypes = _AMITypes | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.ClusterUnreachable
  - typingsJapgolly.awsSdk.awsSdkStrings.InsufficientNumberOfReplicas
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationConflict
  - typingsJapgolly.awsSdk.awsSdkStrings.AdmissionRequestDenied
  - typingsJapgolly.awsSdk.awsSdkStrings.UnsupportedAddonModification
  - typingsJapgolly.awsSdk.awsSdkStrings.K8sResourceNotFound
  - java.lang.String
*/
type AddonIssueCode = _AddonIssueCode | java.lang.String

type AddonIssueList = js.Array[AddonIssue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DEGRADED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type AddonStatus = _AddonStatus | java.lang.String

type AddonVersionInfoList = js.Array[AddonVersionInfo]

type Addons = js.Array[AddonInfo]

type AutoScalingGroupList = js.Array[AutoScalingGroup]

type Boolean = scala.Boolean

type BoxedBoolean = scala.Boolean

type BoxedInteger = Double

type Capacity = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
  - typingsJapgolly.awsSdk.awsSdkStrings.SPOT
  - java.lang.String
*/
type CapacityTypes = _CapacityTypes | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
  - typingsJapgolly.awsSdk.awsSdkStrings.ClusterUnreachable
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationConflict
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceLimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFound
  - java.lang.String
*/
type ClusterIssueCode = _ClusterIssueCode | java.lang.String

type ClusterIssueList = js.Array[ClusterIssue]

type ClusterName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type ClusterStatus = _ClusterStatus | java.lang.String

type Compatibilities = js.Array[Compatibility]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EKS_ANYWHERE
  - typingsJapgolly.awsSdk.awsSdkStrings.ANTHOS
  - typingsJapgolly.awsSdk.awsSdkStrings.GKE
  - typingsJapgolly.awsSdk.awsSdkStrings.AKS
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENSHIFT
  - typingsJapgolly.awsSdk.awsSdkStrings.TANZU
  - typingsJapgolly.awsSdk.awsSdkStrings.RANCHER
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2
  - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type ConnectorConfigProvider = _ConnectorConfigProvider | java.lang.String

type DescribeAddonVersionsRequestMaxResults = Double

type EncryptionConfigList = js.Array[EncryptionConfig]

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
  - typingsJapgolly.awsSdk.awsSdkStrings.ClusterUnreachable
  - typingsJapgolly.awsSdk.awsSdkStrings.InsufficientNumberOfReplicas
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigurationConflict
  - typingsJapgolly.awsSdk.awsSdkStrings.AdmissionRequestDenied
  - typingsJapgolly.awsSdk.awsSdkStrings.UnsupportedAddonModification
  - typingsJapgolly.awsSdk.awsSdkStrings.K8sResourceNotFound
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorDetails = js.Array[ErrorDetail]

type FargateProfileLabel = StringDictionary[String]

type FargateProfileSelectors = js.Array[FargateProfileSelector]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type FargateProfileStatus = _FargateProfileStatus | java.lang.String

type FargateProfilesRequestMaxResults = Double

type IdentityProviderConfigs = js.Array[IdentityProviderConfig]

type IncludeClustersList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ipv4__
  - typingsJapgolly.awsSdk.awsSdkStrings.ipv6__
  - java.lang.String
*/
type IpFamily = _IpFamily | java.lang.String

type IssueList = js.Array[Issue]

type ListAddonsRequestMaxResults = Double

type ListClustersRequestMaxResults = Double

type ListIdentityProviderConfigsRequestMaxResults = Double

type ListNodegroupsRequestMaxResults = Double

type ListUpdatesRequestMaxResults = Double

type LogSetups = js.Array[LogSetup]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.api_
  - typingsJapgolly.awsSdk.awsSdkStrings.audit_
  - typingsJapgolly.awsSdk.awsSdkStrings.authenticator
  - typingsJapgolly.awsSdk.awsSdkStrings.controllerManager
  - typingsJapgolly.awsSdk.awsSdkStrings.scheduler
  - java.lang.String
*/
type LogType = _LogType | java.lang.String

type LogTypes = js.Array[LogType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AutoScalingGroupNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.AutoScalingGroupInvalidConfiguration
  - typingsJapgolly.awsSdk.awsSdkStrings.Ec2SecurityGroupNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.Ec2SecurityGroupDeletionFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.Ec2LaunchTemplateNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.Ec2LaunchTemplateVersionMismatch
  - typingsJapgolly.awsSdk.awsSdkStrings.Ec2SubnetNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.Ec2SubnetInvalidConfiguration
  - typingsJapgolly.awsSdk.awsSdkStrings.IamInstanceProfileNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.IamLimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.IamNodeRoleNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.NodeCreationFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.AsgInstanceLaunchFailures
  - typingsJapgolly.awsSdk.awsSdkStrings.InstanceLimitExceeded
  - typingsJapgolly.awsSdk.awsSdkStrings.InsufficientFreeAddresses
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalFailure
  - typingsJapgolly.awsSdk.awsSdkStrings.ClusterUnreachable
  - typingsJapgolly.awsSdk.awsSdkStrings.Ec2SubnetMissingIpv6Assignment
  - java.lang.String
*/
type NodegroupIssueCode = _NodegroupIssueCode | java.lang.String

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
type NodegroupStatus = _NodegroupStatus | java.lang.String

type NonZeroInteger = Double

type PercentCapacity = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OVERWRITE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.PRESERVE
  - java.lang.String
*/
type ResolveConflicts = _ResolveConflicts | java.lang.String

type RoleArn = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_SCHEDULE
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_EXECUTE
  - typingsJapgolly.awsSdk.awsSdkStrings.PREFER_NO_SCHEDULE
  - java.lang.String
*/
type TaintEffect = _TaintEffect | java.lang.String

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
  - typingsJapgolly.awsSdk.awsSdkStrings.TaintsToAdd
  - typingsJapgolly.awsSdk.awsSdkStrings.TaintsToRemove
  - typingsJapgolly.awsSdk.awsSdkStrings.MaxSize
  - typingsJapgolly.awsSdk.awsSdkStrings.MinSize
  - typingsJapgolly.awsSdk.awsSdkStrings.ReleaseVersion
  - typingsJapgolly.awsSdk.awsSdkStrings.PublicAccessCidrs
  - typingsJapgolly.awsSdk.awsSdkStrings.LaunchTemplateName
  - typingsJapgolly.awsSdk.awsSdkStrings.LaunchTemplateVersion
  - typingsJapgolly.awsSdk.awsSdkStrings.IdentityProviderConfig
  - typingsJapgolly.awsSdk.awsSdkStrings.EncryptionConfig
  - typingsJapgolly.awsSdk.awsSdkStrings.AddonVersion
  - typingsJapgolly.awsSdk.awsSdkStrings.ServiceAccountRoleArn
  - typingsJapgolly.awsSdk.awsSdkStrings.ResolveConflicts
  - typingsJapgolly.awsSdk.awsSdkStrings.MaxUnavailable
  - typingsJapgolly.awsSdk.awsSdkStrings.MaxUnavailablePercentage
  - java.lang.String
*/
type UpdateParamType = _UpdateParamType | java.lang.String

type UpdateParams = js.Array[UpdateParam]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
  - java.lang.String
*/
type UpdateStatus = _UpdateStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VersionUpdate
  - typingsJapgolly.awsSdk.awsSdkStrings.EndpointAccessUpdate
  - typingsJapgolly.awsSdk.awsSdkStrings.LoggingUpdate
  - typingsJapgolly.awsSdk.awsSdkStrings.ConfigUpdate
  - typingsJapgolly.awsSdk.awsSdkStrings.AssociateIdentityProviderConfig
  - typingsJapgolly.awsSdk.awsSdkStrings.DisassociateIdentityProviderConfig
  - typingsJapgolly.awsSdk.awsSdkStrings.AssociateEncryptionConfig
  - typingsJapgolly.awsSdk.awsSdkStrings.AddonUpdate
  - java.lang.String
*/
type UpdateType = _UpdateType | java.lang.String

type ZeroCapacity = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-11-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type configStatus = _configStatus | java.lang.String

type labelKey = java.lang.String

type labelValue = java.lang.String

type labelsKeyList = js.Array[String]

type labelsMap = StringDictionary[labelValue]

type requiredClaimsKey = java.lang.String

type requiredClaimsMap = StringDictionary[requiredClaimsValue]

type requiredClaimsValue = java.lang.String

type taintKey = java.lang.String

type taintValue = java.lang.String

type taintsList = js.Array[Taint]
