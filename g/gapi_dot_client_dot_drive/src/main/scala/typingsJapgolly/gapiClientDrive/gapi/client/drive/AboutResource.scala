package typingsJapgolly.gapiClientDrive.gapi.client.drive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDrive.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutResource extends js.Object {
  /** Gets information about the user, the user's Drive, and system capabilities. */
  def get(request: AnonAlt): Request_[About_]
}

object AboutResource {
  @scala.inline
  def apply(get: AnonAlt => CallbackTo[Request_[About_]]): AboutResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonAlt) => get(t0).runNow()))
    __obj.asInstanceOf[AboutResource]
  }
}

