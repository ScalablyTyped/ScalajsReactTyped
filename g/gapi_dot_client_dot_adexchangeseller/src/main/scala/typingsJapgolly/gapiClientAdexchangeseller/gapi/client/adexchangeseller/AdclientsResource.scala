package typingsJapgolly.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangeseller.AnonAccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdclientsResource extends js.Object {
  /** List all ad clients in this Ad Exchange account. */
  def list(request: AnonAccountId): Request_[AdClients]
}

object AdclientsResource {
  @scala.inline
  def apply(list: AnonAccountId => CallbackTo[Request_[AdClients]]): AdclientsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonAccountId) => list(t0).runNow()))
    __obj.asInstanceOf[AdclientsResource]
  }
}

