package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaResource extends js.Object {
  /** Returns Analytics data for a view (profile). */
  def get(request: AnonAlt): Request_[GaData]
}

object GaResource {
  @scala.inline
  def apply(get: AnonAlt => CallbackTo[Request_[GaData]]): GaResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonAlt) => get(t0).runNow()))
    __obj.asInstanceOf[GaResource]
  }
}

