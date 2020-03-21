package typingsJapgolly.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsJapgolly.awsSdk.worklinkMod.FleetArn = js.native
}

object DeleteFleetRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DeleteFleetRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFleetRequest]
  }
}

