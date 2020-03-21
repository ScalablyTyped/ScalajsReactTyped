package typingsJapgolly.gapiClientOauth2.gapi.client.oauth2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientOauth2.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserinfoResource extends js.Object {
  var v2: V2Resource
  def get(request: AnonAlt): Request_[Userinfoplus]
}

object UserinfoResource {
  @scala.inline
  def apply(get: AnonAlt => CallbackTo[Request_[Userinfoplus]], v2: V2Resource): UserinfoResource = {
    val __obj = js.Dynamic.literal(v2 = v2.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientOauth2.AnonAlt) => get(t0).runNow()))
    __obj.asInstanceOf[UserinfoResource]
  }
}

