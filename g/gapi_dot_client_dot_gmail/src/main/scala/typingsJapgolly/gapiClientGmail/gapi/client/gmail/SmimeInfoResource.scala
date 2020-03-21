package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonOauthtoken
import typingsJapgolly.gapiClientGmail.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmimeInfoResource extends js.Object {
  /** Deletes the specified S/MIME config for the specified send-as alias. */
  def delete(request: AnonOauthtoken): Request_[Unit]
  /** Gets the specified S/MIME config for the specified send-as alias. */
  def get(request: AnonOauthtoken): Request_[SmimeInfo]
  /** Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key. */
  def insert(request: AnonPrettyPrint): Request_[SmimeInfo]
  /** Lists S/MIME configs for the specified send-as alias. */
  def list(request: AnonPrettyPrint): Request_[ListSmimeInfoResponse]
  /** Sets the default S/MIME config for the specified send-as alias. */
  def setDefault(request: AnonOauthtoken): Request_[Unit]
}

object SmimeInfoResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => CallbackTo[Request_[Unit]],
    get: AnonOauthtoken => CallbackTo[Request_[SmimeInfo]],
    insert: AnonPrettyPrint => CallbackTo[Request_[SmimeInfo]],
    list: AnonPrettyPrint => CallbackTo[Request_[ListSmimeInfoResponse]],
    setDefault: AnonOauthtoken => CallbackTo[Request_[Unit]]
  ): SmimeInfoResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonOauthtoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonPrettyPrint) => list(t0).runNow()))
    __obj.updateDynamic("setDefault")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonOauthtoken) => setDefault(t0).runNow()))
    __obj.asInstanceOf[SmimeInfoResource]
  }
}

