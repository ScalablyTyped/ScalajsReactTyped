package typingsJapgolly.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAcceleratorRequest extends js.Object {
  /**
    * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of an accelerator.
    */
  var IdempotencyToken: typingsJapgolly.awsSdk.globalacceleratorMod.IdempotencyToken = js.native
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typingsJapgolly.awsSdk.globalacceleratorMod.IpAddressType] = js.native
  /**
    * The name of an accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: GenericString = js.native
}

object CreateAcceleratorRequest {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Name: GenericString,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    IpAddressType: IpAddressType = null
  ): CreateAcceleratorRequest = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAcceleratorRequest]
  }
}

