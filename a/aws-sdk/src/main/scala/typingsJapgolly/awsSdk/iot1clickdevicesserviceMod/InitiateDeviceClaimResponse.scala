package typingsJapgolly.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateDeviceClaimResponse extends js.Object {
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[string] = js.native
}

object InitiateDeviceClaimResponse {
  @scala.inline
  def apply(State: string = null): InitiateDeviceClaimResponse = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateDeviceClaimResponse]
  }
}

