package typingsJapgolly.gapiClientDns.gapi.client.dns

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDns.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Fetch the representation of an existing Project. */
  def get(request: AnonKey): Request_[Project]
}

object ProjectsResource {
  @scala.inline
  def apply(get: AnonKey => CallbackTo[Request_[Project]]): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDns.AnonKey) => get(t0).runNow()))
    __obj.asInstanceOf[ProjectsResource]
  }
}

