package typingsJapgolly.gapiClientOslogin.gapi.client.oslogin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientOslogin.AnonAccesstoken
import typingsJapgolly.gapiClientOslogin.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  var sshPublicKeys: SshPublicKeysResource
  /**
    * Retrieves the profile information used for logging in to a virtual machine
    * on Google Compute Engine.
    */
  def getLoginProfile(request: AnonAccesstoken): Request_[LoginProfile]
  /**
    * Adds an SSH public key and returns the profile information. Default POSIX
    * account information is set when no username and UID exist as part of the
    * login profile.
    */
  def importSshPublicKey(request: AnonBearertoken): Request_[ImportSshPublicKeyResponse]
}

object UsersResource {
  @scala.inline
  def apply(
    getLoginProfile: AnonAccesstoken => CallbackTo[Request_[LoginProfile]],
    importSshPublicKey: AnonBearertoken => CallbackTo[Request_[ImportSshPublicKeyResponse]],
    sshPublicKeys: SshPublicKeysResource
  ): UsersResource = {
    val __obj = js.Dynamic.literal(sshPublicKeys = sshPublicKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("getLoginProfile")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientOslogin.AnonAccesstoken) => getLoginProfile(t0).runNow()))
    __obj.updateDynamic("importSshPublicKey")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientOslogin.AnonBearertoken) => importSshPublicKey(t0).runNow()))
    __obj.asInstanceOf[UsersResource]
  }
}

