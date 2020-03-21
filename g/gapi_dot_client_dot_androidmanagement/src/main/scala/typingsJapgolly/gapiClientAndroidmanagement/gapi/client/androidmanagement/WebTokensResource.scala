package typingsJapgolly.gapiClientAndroidmanagement.gapi.client.androidmanagement

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidmanagement.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTokensResource extends js.Object {
  /** Creates a web token to access an embeddable managed Google Play web UI for a given enterprise. */
  def create(request: AnonKey): Request_[WebToken]
}

object WebTokensResource {
  @scala.inline
  def apply(create: AnonKey => CallbackTo[Request_[WebToken]]): WebTokensResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidmanagement.AnonKey) => create(t0).runNow()))
    __obj.asInstanceOf[WebTokensResource]
  }
}

