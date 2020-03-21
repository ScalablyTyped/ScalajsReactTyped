package typingsJapgolly.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSshPublicKeyRequest extends js.Object {
  /**
    * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server instance that has the user assigned to it.
    */
  var ServerId: typingsJapgolly.awsSdk.transferMod.ServerId = js.native
  /**
    * A unique identifier used to reference your user's specific SSH key.
    */
  var SshPublicKeyId: typingsJapgolly.awsSdk.transferMod.SshPublicKeyId = js.native
  /**
    * A unique string that identifies a user whose public key is being deleted.
    */
  var UserName: typingsJapgolly.awsSdk.transferMod.UserName = js.native
}

object DeleteSshPublicKeyRequest {
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyId: SshPublicKeyId, UserName: UserName): DeleteSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSshPublicKeyRequest]
  }
}

