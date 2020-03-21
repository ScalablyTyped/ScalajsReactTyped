package typingsJapgolly.pulumiAws.inputMod.ec2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetTargetCapacitySpecification extends js.Object {
  /**
    * Default target capacity type. Valid values: `on-demand`, `spot`.
    */
  var defaultTargetCapacityType: Input[String] = js.native
  /**
    * The number of On-Demand units to request.
    */
  var onDemandTargetCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of Spot units to request.
    */
  var spotTargetCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of units to request, filled using `defaultTargetCapacityType`.
    */
  var totalTargetCapacity: Input[Double] = js.native
}

object FleetTargetCapacitySpecification {
  @scala.inline
  def apply(
    defaultTargetCapacityType: Input[String],
    totalTargetCapacity: Input[Double],
    onDemandTargetCapacity: Input[Double] = null,
    spotTargetCapacity: Input[Double] = null
  ): FleetTargetCapacitySpecification = {
    val __obj = js.Dynamic.literal(defaultTargetCapacityType = defaultTargetCapacityType.asInstanceOf[js.Any], totalTargetCapacity = totalTargetCapacity.asInstanceOf[js.Any])
    if (onDemandTargetCapacity != null) __obj.updateDynamic("onDemandTargetCapacity")(onDemandTargetCapacity.asInstanceOf[js.Any])
    if (spotTargetCapacity != null) __obj.updateDynamic("spotTargetCapacity")(spotTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetTargetCapacitySpecification]
  }
}

