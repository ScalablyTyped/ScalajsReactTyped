package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVolumeInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typingsJapgolly.awsSdk.storagegatewayMod.VolumeARN = js.native
}

object DeleteVolumeInput {
  @scala.inline
  def apply(VolumeARN: VolumeARN): DeleteVolumeInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVolumeInput]
  }
}

