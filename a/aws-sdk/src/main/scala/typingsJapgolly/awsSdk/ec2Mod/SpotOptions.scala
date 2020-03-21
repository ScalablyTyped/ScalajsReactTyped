package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotOptions extends js.Object {
  /**
    * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the EC2 Fleet. If the allocation strategy is lowest-price, EC2 Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy. If the allocation strategy is diversified, EC2 Fleet launches instances from all of the Spot Instance pools that you specify. If the allocation strategy is capacity-optimized, EC2 Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching.
    */
  var AllocationStrategy: js.UndefOr[SpotAllocationStrategy] = js.native
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior] = js.native
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when AllocationStrategy is set to lowest-price. EC2 Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.native
  /**
    * The maximum amount per hour for Spot Instances that you're willing to pay.
    */
  var MaxTotalPrice: js.UndefOr[String] = js.native
  /**
    * The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not reached, the fleet launches no instances.
    */
  var MinTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * Indicates that the fleet launches all Spot Instances into a single Availability Zone. Supported only for fleets of type instant.
    */
  var SingleAvailabilityZone: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet. Supported only for fleets of type instant.
    */
  var SingleInstanceType: js.UndefOr[Boolean] = js.native
}

object SpotOptions {
  @scala.inline
  def apply(
    AllocationStrategy: SpotAllocationStrategy = null,
    InstanceInterruptionBehavior: SpotInstanceInterruptionBehavior = null,
    InstancePoolsToUseCount: Int | scala.Double = null,
    MaxTotalPrice: String = null,
    MinTargetCapacity: Int | scala.Double = null,
    SingleAvailabilityZone: js.UndefOr[scala.Boolean] = js.undefined,
    SingleInstanceType: js.UndefOr[scala.Boolean] = js.undefined
  ): SpotOptions = {
    val __obj = js.Dynamic.literal()
    if (AllocationStrategy != null) __obj.updateDynamic("AllocationStrategy")(AllocationStrategy.asInstanceOf[js.Any])
    if (InstanceInterruptionBehavior != null) __obj.updateDynamic("InstanceInterruptionBehavior")(InstanceInterruptionBehavior.asInstanceOf[js.Any])
    if (InstancePoolsToUseCount != null) __obj.updateDynamic("InstancePoolsToUseCount")(InstancePoolsToUseCount.asInstanceOf[js.Any])
    if (MaxTotalPrice != null) __obj.updateDynamic("MaxTotalPrice")(MaxTotalPrice.asInstanceOf[js.Any])
    if (MinTargetCapacity != null) __obj.updateDynamic("MinTargetCapacity")(MinTargetCapacity.asInstanceOf[js.Any])
    if (!js.isUndefined(SingleAvailabilityZone)) __obj.updateDynamic("SingleAvailabilityZone")(SingleAvailabilityZone.asInstanceOf[js.Any])
    if (!js.isUndefined(SingleInstanceType)) __obj.updateDynamic("SingleInstanceType")(SingleInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotOptions]
  }
}

