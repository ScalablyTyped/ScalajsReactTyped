package typingsJapgolly.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangeseller.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertsResource extends js.Object {
  /** List the alerts for this Ad Exchange account. */
  def list(request: AnonAlt): Request_[Alerts]
}

object AlertsResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[Alerts]]): AlertsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[AlertsResource]
  }
}

