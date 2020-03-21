package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySpotFleetRequestRequest extends js.Object {
  /**
    * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is decreased below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.ExcessCapacityTerminationPolicy] = js.native
  /**
    * The number of On-Demand Instances in the fleet.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: typingsJapgolly.awsSdk.ec2Mod.SpotFleetRequestId = js.native
  /**
    * The size of the fleet.
    */
  var TargetCapacity: js.UndefOr[Integer] = js.native
}

object ModifySpotFleetRequestRequest {
  @scala.inline
  def apply(
    SpotFleetRequestId: SpotFleetRequestId,
    ExcessCapacityTerminationPolicy: ExcessCapacityTerminationPolicy = null,
    OnDemandTargetCapacity: Int | scala.Double = null,
    TargetCapacity: Int | scala.Double = null
  ): ModifySpotFleetRequestRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestId = SpotFleetRequestId.asInstanceOf[js.Any])
    if (ExcessCapacityTerminationPolicy != null) __obj.updateDynamic("ExcessCapacityTerminationPolicy")(ExcessCapacityTerminationPolicy.asInstanceOf[js.Any])
    if (OnDemandTargetCapacity != null) __obj.updateDynamic("OnDemandTargetCapacity")(OnDemandTargetCapacity.asInstanceOf[js.Any])
    if (TargetCapacity != null) __obj.updateDynamic("TargetCapacity")(TargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySpotFleetRequestRequest]
  }
}

