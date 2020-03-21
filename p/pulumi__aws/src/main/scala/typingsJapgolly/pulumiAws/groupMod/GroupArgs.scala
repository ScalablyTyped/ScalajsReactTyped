package typingsJapgolly.pulumiAws.groupMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.autoscaling.GroupInitialLifecycleHook
import typingsJapgolly.pulumiAws.inputMod.autoscaling.GroupLaunchTemplate
import typingsJapgolly.pulumiAws.inputMod.autoscaling.GroupMixedInstancesPolicy
import typingsJapgolly.pulumiAws.inputMod.autoscaling.GroupTag
import typingsJapgolly.pulumiAws.launchConfigurationMod.LaunchConfiguration
import typingsJapgolly.pulumiAws.metricsMod.Metric
import typingsJapgolly.pulumiAws.metricsMod.MetricsGranularity
import typingsJapgolly.pulumiAws.placementGroupMod.PlacementGroup
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupArgs extends js.Object {
  /**
    * A list of one or more availability zones for the group. This parameter should not be specified when using `vpcZoneIdentifier`.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
    */
  val defaultCooldown: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of Amazon EC2 instances that
    * should be running in the group. (See also Waiting for
    * Capacity below.)
    */
  val desiredCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * A list of metrics to collect. The allowed values are `GroupDesiredCapacity`, `GroupInServiceCapacity`, `GroupPendingCapacity`, `GroupMinSize`, `GroupMaxSize`, `GroupInServiceInstances`, `GroupPendingInstances`, `GroupStandbyInstances`, `GroupStandbyCapacity`, `GroupTerminatingCapacity`, `GroupTerminatingInstances`, `GroupTotalCapacity`, `GroupTotalInstances`.
    * * `waitForCapacityTimeout` (Default: "10m") A maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
    * wait for ASG instances to be healthy before timing out.  (See also Waiting
    * for Capacity below.) Setting this to "0" causes
    * this provider to skip all Capacity Waiting behavior.
    */
  val enabledMetrics: js.UndefOr[Input[js.Array[Input[Metric]]]] = js.native
  /**
    * Allows deleting the autoscaling group without waiting
    * for all instances in the pool to terminate.  You can force an autoscaling group to delete
    * even if it's in the process of scaling a resource. Normally, this provider
    * drains all the instances before deleting the group.  This bypasses that
    * behavior and potentially leaves resources dangling.
    */
  val forceDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Time (in seconds) after instance comes into service before checking health.
    */
  val healthCheckGracePeriod: js.UndefOr[Input[Double]] = js.native
  /**
    * "EC2" or "ELB". Controls how health checking is done.
    */
  val healthCheckType: js.UndefOr[Input[String]] = js.native
  /**
    * One or more
    * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
    * to attach to the autoscaling group **before** instances are launched. The
    * syntax is exactly the same as the separate
    * [`aws.autoscaling.LifecycleHook`](https://www.terraform.io/docs/providers/aws/r/autoscaling_lifecycle_hook.html)
    * resource, without the `autoscalingGroupName` attribute. Please note that this will only work when creating
    * a new autoscaling group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
    */
  val initialLifecycleHooks: js.UndefOr[Input[js.Array[Input[GroupInitialLifecycleHook]]]] = js.native
  /**
    * The name of the launch configuration to use.
    */
  val launchConfiguration: js.UndefOr[Input[String | LaunchConfiguration]] = js.native
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
    */
  val launchTemplate: js.UndefOr[Input[GroupLaunchTemplate]] = js.native
  /**
    * A list of elastic load balancer names to add to the autoscaling
    * group names. Only valid for classic load balancers. For ALBs, use `targetGroupArns` instead.
    */
  val loadBalancers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The maximum amount of time, in seconds, that an instance can be in service, values must be either equal to 0 or between 604800 and 31536000 seconds.
    */
  val maxInstanceLifetime: js.UndefOr[Input[Double]] = js.native
  /**
    * The maximum size of the auto scale group.
    */
  val maxSize: Input[Double] = js.native
  /**
    * The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
    */
  val metricsGranularity: js.UndefOr[Input[String | MetricsGranularity]] = js.native
  /**
    * Setting this causes this provider to wait for
    * this number of instances from this autoscaling group to show up healthy in the
    * ELB only on creation. Updates will not wait on ELB instance number changes.
    * (See also Waiting for Capacity below.)
    */
  val minElbCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The minimum size of the auto scale group.
    * (See also Waiting for Capacity below.)
    */
  val minSize: Input[Double] = js.native
  /**
    * Configuration block containing settings to define launch targets for Auto Scaling groups. Defined below.
    */
  val mixedInstancesPolicy: js.UndefOr[Input[GroupMixedInstancesPolicy]] = js.native
  /**
    * The name of the auto scaling group. By default generated by this provider.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the placement group into which you'll launch your instances, if any.
    */
  val placementGroup: js.UndefOr[Input[String | PlacementGroup]] = js.native
  /**
    * Allows setting instance protection. The
    * autoscaling group will not select instances with this setting for terminination
    * during scale in events.
    */
  val protectFromScaleIn: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the service-linked role that the ASG will use to call other AWS services
    */
  val serviceLinkedRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of processes to suspend for the AutoScaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
    * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your autoscaling group from functioning properly.
    */
  val suspendedProcesses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of tag blocks. Tags documented below.
    */
  val tags: js.UndefOr[Input[js.Array[Input[GroupTag]]]] = js.native
  /**
    * A list of tag blocks (maps). Tags documented below.
    */
  val tagsCollection: js.UndefOr[Input[js.Array[Input[StringDictionary[_]]]]] = js.native
  /**
    * A list of `aws.alb.TargetGroup` ARNs, for use with Application or Network Load Balancing.
    */
  val targetGroupArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of policies to decide how the instances in the auto scale group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
    */
  val terminationPolicies: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of subnet IDs to launch resources in.
    */
  val vpcZoneIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val waitForCapacityTimeout: js.UndefOr[Input[String]] = js.native
  /**
    * Setting this will cause this provider to wait
    * for exactly this number of healthy instances from this autoscaling group in
    * all attached load balancers on both create and update operations. (Takes
    * precedence over `minElbCapacity` behavior.)
    * (See also Waiting for Capacity below.)
    */
  val waitForElbCapacity: js.UndefOr[Input[Double]] = js.native
}

object GroupArgs {
  @scala.inline
  def apply(
    maxSize: Input[Double],
    minSize: Input[Double],
    availabilityZones: Input[js.Array[Input[String]]] = null,
    defaultCooldown: Input[Double] = null,
    desiredCapacity: Input[Double] = null,
    enabledMetrics: Input[js.Array[Input[Metric]]] = null,
    forceDelete: Input[Boolean] = null,
    healthCheckGracePeriod: Input[Double] = null,
    healthCheckType: Input[String] = null,
    initialLifecycleHooks: Input[js.Array[Input[GroupInitialLifecycleHook]]] = null,
    launchConfiguration: Input[String | LaunchConfiguration] = null,
    launchTemplate: Input[GroupLaunchTemplate] = null,
    loadBalancers: Input[js.Array[Input[String]]] = null,
    maxInstanceLifetime: Input[Double] = null,
    metricsGranularity: Input[String | MetricsGranularity] = null,
    minElbCapacity: Input[Double] = null,
    mixedInstancesPolicy: Input[GroupMixedInstancesPolicy] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    placementGroup: Input[String | PlacementGroup] = null,
    protectFromScaleIn: Input[Boolean] = null,
    serviceLinkedRoleArn: Input[String] = null,
    suspendedProcesses: Input[js.Array[Input[String]]] = null,
    tags: Input[js.Array[Input[GroupTag]]] = null,
    tagsCollection: Input[js.Array[Input[StringDictionary[_]]]] = null,
    targetGroupArns: Input[js.Array[Input[String]]] = null,
    terminationPolicies: Input[js.Array[Input[String]]] = null,
    vpcZoneIdentifiers: Input[js.Array[Input[String]]] = null,
    waitForCapacityTimeout: Input[String] = null,
    waitForElbCapacity: Input[Double] = null
  ): GroupArgs = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (defaultCooldown != null) __obj.updateDynamic("defaultCooldown")(defaultCooldown.asInstanceOf[js.Any])
    if (desiredCapacity != null) __obj.updateDynamic("desiredCapacity")(desiredCapacity.asInstanceOf[js.Any])
    if (enabledMetrics != null) __obj.updateDynamic("enabledMetrics")(enabledMetrics.asInstanceOf[js.Any])
    if (forceDelete != null) __obj.updateDynamic("forceDelete")(forceDelete.asInstanceOf[js.Any])
    if (healthCheckGracePeriod != null) __obj.updateDynamic("healthCheckGracePeriod")(healthCheckGracePeriod.asInstanceOf[js.Any])
    if (healthCheckType != null) __obj.updateDynamic("healthCheckType")(healthCheckType.asInstanceOf[js.Any])
    if (initialLifecycleHooks != null) __obj.updateDynamic("initialLifecycleHooks")(initialLifecycleHooks.asInstanceOf[js.Any])
    if (launchConfiguration != null) __obj.updateDynamic("launchConfiguration")(launchConfiguration.asInstanceOf[js.Any])
    if (launchTemplate != null) __obj.updateDynamic("launchTemplate")(launchTemplate.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers.asInstanceOf[js.Any])
    if (maxInstanceLifetime != null) __obj.updateDynamic("maxInstanceLifetime")(maxInstanceLifetime.asInstanceOf[js.Any])
    if (metricsGranularity != null) __obj.updateDynamic("metricsGranularity")(metricsGranularity.asInstanceOf[js.Any])
    if (minElbCapacity != null) __obj.updateDynamic("minElbCapacity")(minElbCapacity.asInstanceOf[js.Any])
    if (mixedInstancesPolicy != null) __obj.updateDynamic("mixedInstancesPolicy")(mixedInstancesPolicy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (placementGroup != null) __obj.updateDynamic("placementGroup")(placementGroup.asInstanceOf[js.Any])
    if (protectFromScaleIn != null) __obj.updateDynamic("protectFromScaleIn")(protectFromScaleIn.asInstanceOf[js.Any])
    if (serviceLinkedRoleArn != null) __obj.updateDynamic("serviceLinkedRoleArn")(serviceLinkedRoleArn.asInstanceOf[js.Any])
    if (suspendedProcesses != null) __obj.updateDynamic("suspendedProcesses")(suspendedProcesses.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tagsCollection != null) __obj.updateDynamic("tagsCollection")(tagsCollection.asInstanceOf[js.Any])
    if (targetGroupArns != null) __obj.updateDynamic("targetGroupArns")(targetGroupArns.asInstanceOf[js.Any])
    if (terminationPolicies != null) __obj.updateDynamic("terminationPolicies")(terminationPolicies.asInstanceOf[js.Any])
    if (vpcZoneIdentifiers != null) __obj.updateDynamic("vpcZoneIdentifiers")(vpcZoneIdentifiers.asInstanceOf[js.Any])
    if (waitForCapacityTimeout != null) __obj.updateDynamic("waitForCapacityTimeout")(waitForCapacityTimeout.asInstanceOf[js.Any])
    if (waitForElbCapacity != null) __obj.updateDynamic("waitForElbCapacity")(waitForElbCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupArgs]
  }
}

