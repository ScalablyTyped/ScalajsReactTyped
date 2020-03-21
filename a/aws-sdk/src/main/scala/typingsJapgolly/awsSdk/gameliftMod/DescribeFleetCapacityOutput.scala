package typingsJapgolly.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetCapacityOutput extends js.Object {
  /**
    * A collection of objects containing capacity information for each requested fleet ID. Leave this parameter empty to retrieve capacity information for all fleets.
    */
  var FleetCapacity: js.UndefOr[FleetCapacityList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeFleetCapacityOutput {
  @scala.inline
  def apply(FleetCapacity: FleetCapacityList = null, NextToken: NonZeroAndMaxString = null): DescribeFleetCapacityOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetCapacity != null) __obj.updateDynamic("FleetCapacity")(FleetCapacity.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetCapacityOutput]
  }
}

