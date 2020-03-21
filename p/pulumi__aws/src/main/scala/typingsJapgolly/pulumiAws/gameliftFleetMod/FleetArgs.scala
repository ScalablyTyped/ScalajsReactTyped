package typingsJapgolly.pulumiAws.gameliftFleetMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.gamelift.FleetEc2InboundPermission
import typingsJapgolly.pulumiAws.inputMod.gamelift.FleetResourceCreationLimitPolicy
import typingsJapgolly.pulumiAws.inputMod.gamelift.FleetRuntimeConfiguration
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetArgs extends js.Object {
  /**
    * ID of the Gamelift Build to be deployed on the fleet.
    */
  val buildId: Input[String] = js.native
  /**
    * Human-readable description of the fleet.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
    */
  val ec2InboundPermissions: js.UndefOr[Input[js.Array[Input[FleetEc2InboundPermission]]]] = js.native
  /**
    * Name of an EC2 instance type. e.g. `t2.micro`
    */
  val ec2InstanceType: Input[String] = js.native
  /**
    * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
    */
  val fleetType: js.UndefOr[Input[String]] = js.native
  /**
    * ARN of an IAM role that instances in the fleet can assume.
    */
  val instanceRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
    */
  val metricGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the fleet.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Game session protection policy to apply to all instances in this fleet. e.g. `FullProtection`. Defaults to `NoProtection`.
    */
  val newGameSessionProtectionPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
    */
  val resourceCreationLimitPolicy: js.UndefOr[Input[FleetResourceCreationLimitPolicy]] = js.native
  /**
    * Instructions for launching server processes on each instance in the fleet. See below.
    */
  val runtimeConfiguration: js.UndefOr[Input[FleetRuntimeConfiguration]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object FleetArgs {
  @scala.inline
  def apply(
    buildId: Input[String],
    ec2InstanceType: Input[String],
    description: Input[String] = null,
    ec2InboundPermissions: Input[js.Array[Input[FleetEc2InboundPermission]]] = null,
    fleetType: Input[String] = null,
    instanceRoleArn: Input[String] = null,
    metricGroups: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    newGameSessionProtectionPolicy: Input[String] = null,
    resourceCreationLimitPolicy: Input[FleetResourceCreationLimitPolicy] = null,
    runtimeConfiguration: Input[FleetRuntimeConfiguration] = null,
    tags: Input[StringDictionary[_]] = null
  ): FleetArgs = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], ec2InstanceType = ec2InstanceType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ec2InboundPermissions != null) __obj.updateDynamic("ec2InboundPermissions")(ec2InboundPermissions.asInstanceOf[js.Any])
    if (fleetType != null) __obj.updateDynamic("fleetType")(fleetType.asInstanceOf[js.Any])
    if (instanceRoleArn != null) __obj.updateDynamic("instanceRoleArn")(instanceRoleArn.asInstanceOf[js.Any])
    if (metricGroups != null) __obj.updateDynamic("metricGroups")(metricGroups.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (newGameSessionProtectionPolicy != null) __obj.updateDynamic("newGameSessionProtectionPolicy")(newGameSessionProtectionPolicy.asInstanceOf[js.Any])
    if (resourceCreationLimitPolicy != null) __obj.updateDynamic("resourceCreationLimitPolicy")(resourceCreationLimitPolicy.asInstanceOf[js.Any])
    if (runtimeConfiguration != null) __obj.updateDynamic("runtimeConfiguration")(runtimeConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetArgs]
  }
}

