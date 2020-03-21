package typingsJapgolly.gapiClientOslogin.gapi.client.oslogin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientOslogin.AnonAccesstoken
import typingsJapgolly.gapiClientOslogin.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshPublicKeysResource extends js.Object {
  /** Deletes an SSH public key. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Retrieves an SSH public key. */
  def get(request: AnonAccesstoken): Request_[SshPublicKey]
  /**
    * Updates an SSH public key and returns the profile information. This method
    * supports patch semantics.
    */
  def patch(request: AnonAlt): Request_[SshPublicKey]
}

object SshPublicKeysResource {
  @scala.inline
  def apply(
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonAccesstoken => CallbackTo[Request_[SshPublicKey]],
    patch: AnonAlt => CallbackTo[Request_[SshPublicKey]]
  ): SshPublicKeysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientOslogin.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientOslogin.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientOslogin.AnonAlt) => patch(t0).runNow()))
    __obj.asInstanceOf[SshPublicKeysResource]
  }
}

