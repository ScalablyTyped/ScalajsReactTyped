package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonSeriesid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesResource extends js.Object {
  var membership: MembershipResource
  /** Returns Series metadata for the given series ids. */
  def get(request: AnonSeriesid): Request_[Series]
}

object SeriesResource {
  @scala.inline
  def apply(get: AnonSeriesid => CallbackTo[Request_[Series]], membership: MembershipResource): SeriesResource = {
    val __obj = js.Dynamic.literal(membership = membership.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonSeriesid) => get(t0).runNow()))
    __obj.asInstanceOf[SeriesResource]
  }
}

