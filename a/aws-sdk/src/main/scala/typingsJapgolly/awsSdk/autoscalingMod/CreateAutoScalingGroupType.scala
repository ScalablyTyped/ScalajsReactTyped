package typingsJapgolly.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAutoScalingGroupType extends js.Object {
  /**
    * The name of the Auto Scaling group. This name must be unique per Region per account.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  /**
    * One or more Availability Zones for the group. This parameter is optional if you specify one or more subnets for VPCZoneIdentifier. Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into EC2-Classic.
    */
  var AvailabilityZones: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.AvailabilityZones] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default value is 300. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var DefaultCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The number of Amazon EC2 instances that the Auto Scaling group attempts to maintain. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a desired capacity, the default is the minimum size of the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.native
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. During this time, any health check failures for the instance are ignored. The default value is 0. For more information, see Health Check Grace Period in the Amazon EC2 Auto Scaling User Guide. Conditional: This parameter is required if you are adding an ELB health check.
    */
  var HealthCheckGracePeriod: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.native
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. The default value is EC2. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks. For more information, see Health Checks for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.native
  /**
    * The ID of the instance used to create a launch configuration for the group. When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and associates it with the group. This launch configuration derives its attributes from the specified instance, except for the block device mapping. For more information, see Create an Auto Scaling Group Using an EC2 Instance in the Amazon EC2 Auto Scaling User Guide. You must specify one of the following parameters in your request: LaunchConfigurationName, LaunchTemplate, InstanceId, or MixedInstancesPolicy.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.native
  /**
    * The name of the launch configuration. If you do not specify LaunchConfigurationName, you must specify one of the following parameters: InstanceId, LaunchTemplate, or MixedInstancesPolicy.
    */
  var LaunchConfigurationName: js.UndefOr[ResourceName] = js.native
  /**
    * The launch template to use to launch instances. For more information, see LaunchTemplateSpecification in the Amazon EC2 Auto Scaling API Reference. If you do not specify LaunchTemplate, you must specify one of the following parameters: InstanceId, LaunchConfigurationName, or MixedInstancesPolicy.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  /**
    * One or more lifecycle hooks.
    */
  var LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications] = js.native
  /**
    * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers and Network Load Balancers, specify a list of target groups using the TargetGroupARNs property instead. For more information, see Using a Load Balancer with an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var LoadBalancerNames: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.LoadBalancerNames] = js.native
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. Valid Range: Minimum value of 604800.
    */
  var MaxInstanceLifetime: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.MaxInstanceLifetime] = js.native
  /**
    * The maximum size of the group.
    */
  var MaxSize: AutoScalingGroupMaxSize = js.native
  /**
    * The minimum size of the group.
    */
  var MinSize: AutoScalingGroupMinSize = js.native
  /**
    * An embedded object that specifies a mixed instances policy. The required parameters must be specified. If optional parameters are unspecified, their default values are used. The policy includes parameters that not only define the distribution of On-Demand Instances and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill On-Demand and Spot capacity, but also the parameters that specify the instance configuration information—the launch template and instance types. For more information, see MixedInstancesPolicy in the Amazon EC2 Auto Scaling API Reference and Auto Scaling Groups with Multiple Instance Types and Purchase Options in the Amazon EC2 Auto Scaling User Guide. You must specify one of the following parameters in your request: LaunchConfigurationName, LaunchTemplate, InstanceId, or MixedInstancesPolicy.
    */
  var MixedInstancesPolicy: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.MixedInstancesPolicy] = js.native
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in. For more information about preventing instances from terminating on scale in, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.native
  /**
    * The name of the placement group into which to launch your instances, if any. A placement group is a logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a placement group. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see Service-Linked Roles in the Amazon EC2 Auto Scaling User Guide.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.native
  /**
    * One or more tags. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.Tags] = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are registered as targets in a target group, and traffic is routed to the target group. For more information, see Using a Load Balancer with an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var TargetGroupARNs: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.TargetGroupARNs] = js.native
  /**
    * One or more termination policies used to select the instance to terminate. These policies are executed in the order that they are listed. For more information, see Controlling Which Instances Auto Scaling Terminates During Scale In in the Amazon EC2 Auto Scaling User Guide.
    */
  var TerminationPolicies: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.TerminationPolicies] = js.native
  /**
    * A comma-separated list of subnet IDs for your virtual private cloud (VPC). If you specify VPCZoneIdentifier with AvailabilityZones, the subnets that you specify for this parameter must reside in those Availability Zones. Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a VPC.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.native
}

object CreateAutoScalingGroupType {
  @scala.inline
  def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    MaxSize: AutoScalingGroupMaxSize,
    MinSize: AutoScalingGroupMinSize,
    AvailabilityZones: AvailabilityZones = null,
    DefaultCooldown: Int | Double = null,
    DesiredCapacity: Int | Double = null,
    HealthCheckGracePeriod: Int | Double = null,
    HealthCheckType: XmlStringMaxLen32 = null,
    InstanceId: XmlStringMaxLen19 = null,
    LaunchConfigurationName: ResourceName = null,
    LaunchTemplate: LaunchTemplateSpecification = null,
    LifecycleHookSpecificationList: LifecycleHookSpecifications = null,
    LoadBalancerNames: LoadBalancerNames = null,
    MaxInstanceLifetime: Int | Double = null,
    MixedInstancesPolicy: MixedInstancesPolicy = null,
    NewInstancesProtectedFromScaleIn: js.UndefOr[Boolean] = js.undefined,
    PlacementGroup: XmlStringMaxLen255 = null,
    ServiceLinkedRoleARN: ResourceName = null,
    Tags: Tags = null,
    TargetGroupARNs: TargetGroupARNs = null,
    TerminationPolicies: TerminationPolicies = null,
    VPCZoneIdentifier: XmlStringMaxLen2047 = null
  ): CreateAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (DefaultCooldown != null) __obj.updateDynamic("DefaultCooldown")(DefaultCooldown.asInstanceOf[js.Any])
    if (DesiredCapacity != null) __obj.updateDynamic("DesiredCapacity")(DesiredCapacity.asInstanceOf[js.Any])
    if (HealthCheckGracePeriod != null) __obj.updateDynamic("HealthCheckGracePeriod")(HealthCheckGracePeriod.asInstanceOf[js.Any])
    if (HealthCheckType != null) __obj.updateDynamic("HealthCheckType")(HealthCheckType.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (LaunchConfigurationName != null) __obj.updateDynamic("LaunchConfigurationName")(LaunchConfigurationName.asInstanceOf[js.Any])
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate.asInstanceOf[js.Any])
    if (LifecycleHookSpecificationList != null) __obj.updateDynamic("LifecycleHookSpecificationList")(LifecycleHookSpecificationList.asInstanceOf[js.Any])
    if (LoadBalancerNames != null) __obj.updateDynamic("LoadBalancerNames")(LoadBalancerNames.asInstanceOf[js.Any])
    if (MaxInstanceLifetime != null) __obj.updateDynamic("MaxInstanceLifetime")(MaxInstanceLifetime.asInstanceOf[js.Any])
    if (MixedInstancesPolicy != null) __obj.updateDynamic("MixedInstancesPolicy")(MixedInstancesPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(NewInstancesProtectedFromScaleIn)) __obj.updateDynamic("NewInstancesProtectedFromScaleIn")(NewInstancesProtectedFromScaleIn.asInstanceOf[js.Any])
    if (PlacementGroup != null) __obj.updateDynamic("PlacementGroup")(PlacementGroup.asInstanceOf[js.Any])
    if (ServiceLinkedRoleARN != null) __obj.updateDynamic("ServiceLinkedRoleARN")(ServiceLinkedRoleARN.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TargetGroupARNs != null) __obj.updateDynamic("TargetGroupARNs")(TargetGroupARNs.asInstanceOf[js.Any])
    if (TerminationPolicies != null) __obj.updateDynamic("TerminationPolicies")(TerminationPolicies.asInstanceOf[js.Any])
    if (VPCZoneIdentifier != null) __obj.updateDynamic("VPCZoneIdentifier")(VPCZoneIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoScalingGroupType]
  }
}

