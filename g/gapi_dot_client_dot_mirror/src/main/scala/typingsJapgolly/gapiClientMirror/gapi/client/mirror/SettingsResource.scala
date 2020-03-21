package typingsJapgolly.gapiClientMirror.gapi.client.mirror

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMirror.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  /** Gets a single setting by ID. */
  def get(request: AnonAlt): Request_[Setting]
}

object SettingsResource {
  @scala.inline
  def apply(get: AnonAlt => CallbackTo[Request_[Setting]]): SettingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => get(t0).runNow()))
    __obj.asInstanceOf[SettingsResource]
  }
}

