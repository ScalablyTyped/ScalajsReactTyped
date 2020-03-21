package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emrMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_JOB_FLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_CLUSTER
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCEL_AND_WAIT
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUE
    - java.lang.String
  */
  type ActionOnFailure = typingsJapgolly.awsSdk.emrMod._ActionOnFailure | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CHANGE_IN_CAPACITY
    - typingsJapgolly.awsSdk.awsSdkStrings.PERCENT_CHANGE_IN_CAPACITY
    - typingsJapgolly.awsSdk.awsSdkStrings.EXACT_CAPACITY
    - java.lang.String
  */
  type AdjustmentType = typingsJapgolly.awsSdk.emrMod._AdjustmentType | java.lang.String
  type ApplicationList = js.Array[typingsJapgolly.awsSdk.emrMod.Application]
  type ArnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ATTACHING
    - typingsJapgolly.awsSdk.awsSdkStrings.ATTACHED
    - typingsJapgolly.awsSdk.awsSdkStrings.DETACHING
    - typingsJapgolly.awsSdk.awsSdkStrings.DETACHED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AutoScalingPolicyState = typingsJapgolly.awsSdk.emrMod._AutoScalingPolicyState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_REQUEST
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVISION_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.CLEANUP_FAILURE
    - java.lang.String
  */
  type AutoScalingPolicyStateChangeReasonCode = typingsJapgolly.awsSdk.emrMod._AutoScalingPolicyStateChangeReasonCode | java.lang.String
  type Boolean = scala.Boolean
  type BooleanObject = scala.Boolean
  type BootstrapActionConfigList = js.Array[typingsJapgolly.awsSdk.emrMod.BootstrapActionConfig]
  type BootstrapActionDetailList = js.Array[typingsJapgolly.awsSdk.emrMod.BootstrapActionDetail]
  type CancelStepsInfoList = js.Array[typingsJapgolly.awsSdk.emrMod.CancelStepsInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CancelStepsRequestStatus = typingsJapgolly.awsSdk.emrMod._CancelStepsRequestStatus | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.emrMod.ClientApiVersions
  type ClusterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.WAITING
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED_WITH_ERRORS
    - java.lang.String
  */
  type ClusterState = typingsJapgolly.awsSdk.emrMod._ClusterState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_FLEET_TIMEOUT
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_REQUEST
    - typingsJapgolly.awsSdk.awsSdkStrings.STEP_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_STEPS_COMPLETED
    - java.lang.String
  */
  type ClusterStateChangeReasonCode = typingsJapgolly.awsSdk.emrMod._ClusterStateChangeReasonCode | java.lang.String
  type ClusterStateList = js.Array[typingsJapgolly.awsSdk.emrMod.ClusterState]
  type ClusterSummaryList = js.Array[typingsJapgolly.awsSdk.emrMod.ClusterSummary]
  type CommandList = js.Array[typingsJapgolly.awsSdk.emrMod.Command]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL
    - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
    - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
    - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL
    - java.lang.String
  */
  type ComparisonOperator = typingsJapgolly.awsSdk.emrMod._ComparisonOperator | java.lang.String
  type ConfigurationList = js.Array[typingsJapgolly.awsSdk.emrMod.Configuration]
  type Date = js.Date
  type EC2InstanceIdsList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceId]
  type EC2InstanceIdsToTerminateList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceId]
  type EbsBlockDeviceConfigList = js.Array[typingsJapgolly.awsSdk.emrMod.EbsBlockDeviceConfig]
  type EbsBlockDeviceList = js.Array[typingsJapgolly.awsSdk.emrMod.EbsBlockDevice]
  type EbsVolumeList = js.Array[typingsJapgolly.awsSdk.emrMod.EbsVolume]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_FLEET
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_GROUP
    - java.lang.String
  */
  type InstanceCollectionType = typingsJapgolly.awsSdk.emrMod._InstanceCollectionType | java.lang.String
  type InstanceFleetConfigList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceFleetConfig]
  type InstanceFleetId = java.lang.String
  type InstanceFleetList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceFleet]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.RESIZING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type InstanceFleetState = typingsJapgolly.awsSdk.emrMod._InstanceFleetState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceFleetStateChangeReasonCode = typingsJapgolly.awsSdk.emrMod._InstanceFleetStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MASTER
    - typingsJapgolly.awsSdk.awsSdkStrings.CORE
    - typingsJapgolly.awsSdk.awsSdkStrings.TASK
    - java.lang.String
  */
  type InstanceFleetType = typingsJapgolly.awsSdk.emrMod._InstanceFleetType | java.lang.String
  type InstanceGroupConfigList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceGroupConfig]
  type InstanceGroupDetailList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceGroupDetail]
  type InstanceGroupId = java.lang.String
  type InstanceGroupIdsList = js.Array[typingsJapgolly.awsSdk.emrMod.XmlStringMaxLen256]
  type InstanceGroupList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceGroup]
  type InstanceGroupModifyConfigList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceGroupModifyConfig]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.RECONFIGURING
    - typingsJapgolly.awsSdk.awsSdkStrings.RESIZING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - typingsJapgolly.awsSdk.awsSdkStrings.ARRESTED
    - typingsJapgolly.awsSdk.awsSdkStrings.SHUTTING_DOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.ENDED
    - java.lang.String
  */
  type InstanceGroupState = typingsJapgolly.awsSdk.emrMod._InstanceGroupState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceGroupStateChangeReasonCode = typingsJapgolly.awsSdk.emrMod._InstanceGroupStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MASTER
    - typingsJapgolly.awsSdk.awsSdkStrings.CORE
    - typingsJapgolly.awsSdk.awsSdkStrings.TASK
    - java.lang.String
  */
  type InstanceGroupType = typingsJapgolly.awsSdk.emrMod._InstanceGroupType | java.lang.String
  type InstanceGroupTypeList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceGroupType]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[typingsJapgolly.awsSdk.emrMod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MASTER
    - typingsJapgolly.awsSdk.awsSdkStrings.CORE
    - typingsJapgolly.awsSdk.awsSdkStrings.TASK
    - java.lang.String
  */
  type InstanceRoleType = typingsJapgolly.awsSdk.emrMod._InstanceRoleType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWAITING_FULFILLMENT
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONING
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type InstanceState = typingsJapgolly.awsSdk.emrMod._InstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceStateChangeReasonCode = typingsJapgolly.awsSdk.emrMod._InstanceStateChangeReasonCode | java.lang.String
  type InstanceStateList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceState]
  type InstanceType = java.lang.String
  type InstanceTypeConfigList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceTypeConfig]
  type InstanceTypeSpecificationList = js.Array[typingsJapgolly.awsSdk.emrMod.InstanceTypeSpecification]
  type Integer = scala.Double
  type JobFlowDetailList = js.Array[typingsJapgolly.awsSdk.emrMod.JobFlowDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.WAITING
    - typingsJapgolly.awsSdk.awsSdkStrings.SHUTTING_DOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type JobFlowExecutionState = typingsJapgolly.awsSdk.emrMod._JobFlowExecutionState | java.lang.String
  type JobFlowExecutionStateList = js.Array[typingsJapgolly.awsSdk.emrMod.JobFlowExecutionState]
  type KeyValueList = js.Array[typingsJapgolly.awsSdk.emrMod.KeyValue]
  type Long = scala.Double
  type Marker = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
    - typingsJapgolly.awsSdk.awsSdkStrings.SPOT
    - java.lang.String
  */
  type MarketType = typingsJapgolly.awsSdk.emrMod._MarketType | java.lang.String
  type MetricDimensionList = js.Array[typingsJapgolly.awsSdk.emrMod.MetricDimension]
  type NewSupportedProductsList = js.Array[typingsJapgolly.awsSdk.emrMod.SupportedProductConfig]
  type NonNegativeDouble = scala.Double
  type OptionalArnType = java.lang.String
  type Port = scala.Double
  type PortRanges = js.Array[typingsJapgolly.awsSdk.emrMod.PortRange]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type RepoUpgradeOnBoot = typingsJapgolly.awsSdk.emrMod._RepoUpgradeOnBoot | java.lang.String
  type ResourceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_AT_INSTANCE_HOUR
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_AT_TASK_COMPLETION
    - java.lang.String
  */
  type ScaleDownBehavior = typingsJapgolly.awsSdk.emrMod._ScaleDownBehavior | java.lang.String
  type ScalingRuleList = js.Array[typingsJapgolly.awsSdk.emrMod.ScalingRule]
  type SecurityConfigurationList = js.Array[typingsJapgolly.awsSdk.emrMod.SecurityConfigurationSummary]
  type SecurityGroupsList = js.Array[typingsJapgolly.awsSdk.emrMod.XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SWITCH_TO_ON_DEMAND
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_CLUSTER
    - java.lang.String
  */
  type SpotProvisioningTimeoutAction = typingsJapgolly.awsSdk.emrMod._SpotProvisioningTimeoutAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SAMPLE_COUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.AVERAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.SUM
    - typingsJapgolly.awsSdk.awsSdkStrings.MINIMUM
    - typingsJapgolly.awsSdk.awsSdkStrings.MAXIMUM
    - java.lang.String
  */
  type Statistic = typingsJapgolly.awsSdk.emrMod._Statistic | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SEND_INTERRUPT
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATE_PROCESS
    - java.lang.String
  */
  type StepCancellationOption = typingsJapgolly.awsSdk.emrMod._StepCancellationOption | java.lang.String
  type StepConfigList = js.Array[typingsJapgolly.awsSdk.emrMod.StepConfig]
  type StepDetailList = js.Array[typingsJapgolly.awsSdk.emrMod.StepDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUE
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERRUPTED
    - java.lang.String
  */
  type StepExecutionState = typingsJapgolly.awsSdk.emrMod._StepExecutionState | java.lang.String
  type StepId = java.lang.String
  type StepIdsList = js.Array[typingsJapgolly.awsSdk.emrMod.XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCEL_PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERRUPTED
    - java.lang.String
  */
  type StepState = typingsJapgolly.awsSdk.emrMod._StepState | java.lang.String
  type StepStateChangeReasonCode = typingsJapgolly.awsSdk.awsSdkStrings.NONE | java.lang.String
  type StepStateList = js.Array[typingsJapgolly.awsSdk.emrMod.StepState]
  type StepSummaryList = js.Array[typingsJapgolly.awsSdk.emrMod.StepSummary]
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.emrMod.String]
  type StringMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.emrMod.String]
  type SupportedProductsList = js.Array[typingsJapgolly.awsSdk.emrMod.XmlStringMaxLen256]
  type TagList = js.Array[typingsJapgolly.awsSdk.emrMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.SECONDS
    - typingsJapgolly.awsSdk.awsSdkStrings.MICRO_SECONDS
    - typingsJapgolly.awsSdk.awsSdkStrings.MILLI_SECONDS
    - typingsJapgolly.awsSdk.awsSdkStrings.BYTES
    - typingsJapgolly.awsSdk.awsSdkStrings.KILO_BYTES
    - typingsJapgolly.awsSdk.awsSdkStrings.MEGA_BYTES
    - typingsJapgolly.awsSdk.awsSdkStrings.GIGA_BYTES
    - typingsJapgolly.awsSdk.awsSdkStrings.TERA_BYTES
    - typingsJapgolly.awsSdk.awsSdkStrings.BITS
    - typingsJapgolly.awsSdk.awsSdkStrings.KILO_BITS
    - typingsJapgolly.awsSdk.awsSdkStrings.MEGA_BITS
    - typingsJapgolly.awsSdk.awsSdkStrings.GIGA_BITS
    - typingsJapgolly.awsSdk.awsSdkStrings.TERA_BITS
    - typingsJapgolly.awsSdk.awsSdkStrings.PERCENT
    - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.BYTES_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.KILO_BYTES_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.MEGA_BYTES_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.GIGA_BYTES_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.TERA_BYTES_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.BITS_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.KILO_BITS_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.MEGA_BITS_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.GIGA_BITS_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.TERA_BITS_PER_SECOND
    - typingsJapgolly.awsSdk.awsSdkStrings.COUNT_PER_SECOND
    - java.lang.String
  */
  type Unit = typingsJapgolly.awsSdk.emrMod._Unit | java.lang.String
  type WholeNumber = scala.Double
  type XmlString = java.lang.String
  type XmlStringList = js.Array[typingsJapgolly.awsSdk.emrMod.XmlString]
  type XmlStringMaxLen256 = java.lang.String
  type XmlStringMaxLen256List = js.Array[typingsJapgolly.awsSdk.emrMod.XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2009-03-31`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.emrMod._apiVersion | java.lang.String
}
