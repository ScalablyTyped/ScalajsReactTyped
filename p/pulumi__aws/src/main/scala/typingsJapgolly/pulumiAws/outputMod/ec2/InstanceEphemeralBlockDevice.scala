package typingsJapgolly.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceEphemeralBlockDevice extends js.Object {
  /**
    * The name of the block device to mount on the instance.
    */
  var deviceName: String = js.native
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[Boolean] = js.native
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[String] = js.native
}

object InstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, noDevice: js.UndefOr[Boolean] = js.undefined, virtualName: String = null): InstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    if (!js.isUndefined(noDevice)) __obj.updateDynamic("noDevice")(noDevice.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEphemeralBlockDevice]
  }
}

