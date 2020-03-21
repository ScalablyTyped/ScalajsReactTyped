package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsResource extends js.Object {
  /**
    * Lists analytics data for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: AnonAccesstoken): Request_[ListAnalyticsResponse]
}

object AnalyticsResource {
  @scala.inline
  def apply(list: AnonAccesstoken => CallbackTo[Request_[ListAnalyticsResponse]]): AnalyticsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonAccesstoken) => list(t0).runNow()))
    __obj.asInstanceOf[AnalyticsResource]
  }
}

