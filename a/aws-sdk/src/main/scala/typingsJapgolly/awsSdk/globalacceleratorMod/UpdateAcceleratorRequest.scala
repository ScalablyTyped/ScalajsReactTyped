package typingsJapgolly.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAcceleratorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator to update.
    */
  var AcceleratorArn: GenericString = js.native
  /**
    * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, the accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typingsJapgolly.awsSdk.globalacceleratorMod.IpAddressType] = js.native
  /**
    * The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: js.UndefOr[GenericString] = js.native
}

object UpdateAcceleratorRequest {
  @scala.inline
  def apply(
    AcceleratorArn: GenericString,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    IpAddressType: IpAddressType = null,
    Name: GenericString = null
  ): UpdateAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAcceleratorRequest]
  }
}

