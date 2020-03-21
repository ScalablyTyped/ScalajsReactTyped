package typingsJapgolly.gapiClientAndroidmanagement.gapi.client.androidmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidmanagement.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /** Gets info about an application. */
  def get(request: AnonAccesstoken): Request_[Application]
}

object ApplicationsResource {
  @scala.inline
  def apply(get: AnonAccesstoken => CallbackTo[Request_[Application]]): ApplicationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonAccesstoken) => get(t0).runNow()))
    __obj.asInstanceOf[ApplicationsResource]
  }
}

