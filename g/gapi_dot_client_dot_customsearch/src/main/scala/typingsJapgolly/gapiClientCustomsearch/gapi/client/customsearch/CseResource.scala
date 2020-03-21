package typingsJapgolly.gapiClientCustomsearch.gapi.client.customsearch

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCustomsearch.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CseResource extends js.Object {
  /** Returns metadata about the search performed, metadata about the custom search engine used for the search, and the search results. */
  def list(request: AnonAlt): Request_[Search]
}

object CseResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[Search]]): CseResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCustomsearch.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[CseResource]
  }
}

