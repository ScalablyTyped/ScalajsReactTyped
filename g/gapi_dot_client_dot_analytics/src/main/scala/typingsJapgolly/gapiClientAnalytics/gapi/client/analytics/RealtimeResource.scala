package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeResource extends js.Object {
  /** Returns real time data for a view (profile). */
  def get(request: AnonFields): Request_[RealtimeData]
}

object RealtimeResource {
  @scala.inline
  def apply(get: AnonFields => CallbackTo[Request_[RealtimeData]]): RealtimeResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonFields) => get(t0).runNow()))
    __obj.asInstanceOf[RealtimeResource]
  }
}

