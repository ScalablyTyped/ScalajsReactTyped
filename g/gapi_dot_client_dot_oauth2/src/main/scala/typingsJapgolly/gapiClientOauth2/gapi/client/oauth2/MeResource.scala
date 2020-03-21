package typingsJapgolly.gapiClientOauth2.gapi.client.oauth2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientOauth2.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeResource extends js.Object {
  def get(request: AnonAlt): Request_[Userinfoplus]
}

object MeResource {
  @scala.inline
  def apply(get: AnonAlt => CallbackTo[Request_[Userinfoplus]]): MeResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientOauth2.AnonAlt) => get(t0).runNow()))
    __obj.asInstanceOf[MeResource]
  }
}

