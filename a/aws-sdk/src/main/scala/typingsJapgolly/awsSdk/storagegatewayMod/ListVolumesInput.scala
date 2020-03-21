package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVolumesInput extends js.Object {
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * Specifies that the list of volumes returned be limited to the specified number of items.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * A string that indicates the position at which to begin the returned list of volumes. Obtain the marker from the response of a previous List iSCSI Volumes request.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.Marker] = js.native
}

object ListVolumesInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null, Limit: Int | Double = null, Marker: Marker = null): ListVolumesInput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVolumesInput]
  }
}

