package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSSHPublicKeyResponse extends js.Object {
  /**
    * Contains information about the SSH public key.
    */
  var SSHPublicKey: js.UndefOr[typingsJapgolly.awsSdk.iamMod.SSHPublicKey] = js.native
}

object UploadSSHPublicKeyResponse {
  @scala.inline
  def apply(SSHPublicKey: SSHPublicKey = null): UploadSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (SSHPublicKey != null) __obj.updateDynamic("SSHPublicKey")(SSHPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSSHPublicKeyResponse]
  }
}

