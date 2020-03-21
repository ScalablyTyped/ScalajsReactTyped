package typingsJapgolly.gapiClientQpxexpress.gapi.client.qpxexpress

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientQpxexpress.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripsResource extends js.Object {
  /** Returns a list of flights. */
  def search(request: AnonAlt): Request_[TripsSearchResponse]
}

object TripsResource {
  @scala.inline
  def apply(search: AnonAlt => CallbackTo[Request_[TripsSearchResponse]]): TripsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientQpxexpress.AnonAlt) => search(t0).runNow()))
    __obj.asInstanceOf[TripsResource]
  }
}

