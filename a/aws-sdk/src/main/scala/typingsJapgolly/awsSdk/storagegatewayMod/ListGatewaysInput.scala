package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGatewaysInput extends js.Object {
  /**
    * Specifies that the list of gateways returned be limited to the specified number of items.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * An opaque string that indicates the position at which to begin the returned list of gateways.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.Marker] = js.native
}

object ListGatewaysInput {
  @scala.inline
  def apply(Limit: Int | Double = null, Marker: Marker = null): ListGatewaysInput = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewaysInput]
  }
}

