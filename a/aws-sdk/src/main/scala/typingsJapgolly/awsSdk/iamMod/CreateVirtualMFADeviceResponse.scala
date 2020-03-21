package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVirtualMFADeviceResponse extends js.Object {
  /**
    * A structure containing details about the new virtual MFA device.
    */
  var VirtualMFADevice: typingsJapgolly.awsSdk.iamMod.VirtualMFADevice = js.native
}

object CreateVirtualMFADeviceResponse {
  @scala.inline
  def apply(VirtualMFADevice: VirtualMFADevice): CreateVirtualMFADeviceResponse = {
    val __obj = js.Dynamic.literal(VirtualMFADevice = VirtualMFADevice.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateVirtualMFADeviceResponse]
  }
}

