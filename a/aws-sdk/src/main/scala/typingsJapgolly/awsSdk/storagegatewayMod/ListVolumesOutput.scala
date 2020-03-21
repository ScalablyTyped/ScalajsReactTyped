package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVolumesOutput extends js.Object {
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * Use the marker in your next request to continue pagination of iSCSI volumes. If there are no more volumes to list, this field does not appear in the response body.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * An array of VolumeInfo objects, where each object describes an iSCSI volume. If no volumes are defined for the gateway, then VolumeInfos is an empty array "[]".
    */
  var VolumeInfos: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.VolumeInfos] = js.native
}

object ListVolumesOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null, Marker: Marker = null, VolumeInfos: VolumeInfos = null): ListVolumesOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (VolumeInfos != null) __obj.updateDynamic("VolumeInfos")(VolumeInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVolumesOutput]
  }
}

