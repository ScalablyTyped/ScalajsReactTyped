package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCachediSCSIVolumeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to connect to the target.
    */
  var TargetARN: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.TargetARN] = js.native
  /**
    * The Amazon Resource Name (ARN) of the configured volume.
    */
  var VolumeARN: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.VolumeARN] = js.native
}

object CreateCachediSCSIVolumeOutput {
  @scala.inline
  def apply(TargetARN: TargetARN = null, VolumeARN: VolumeARN = null): CreateCachediSCSIVolumeOutput = {
    val __obj = js.Dynamic.literal()
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN.asInstanceOf[js.Any])
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCachediSCSIVolumeOutput]
  }
}

