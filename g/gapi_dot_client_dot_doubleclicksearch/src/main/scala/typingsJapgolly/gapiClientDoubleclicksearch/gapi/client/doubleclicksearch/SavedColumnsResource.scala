package typingsJapgolly.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDoubleclicksearch.AnonAgencyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedColumnsResource extends js.Object {
  /** Retrieve the list of saved columns for a specified advertiser. */
  def list(request: AnonAgencyId): Request_[SavedColumnList]
}

object SavedColumnsResource {
  @scala.inline
  def apply(list: AnonAgencyId => CallbackTo[Request_[SavedColumnList]]): SavedColumnsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDoubleclicksearch.AnonAgencyId) => list(t0).runNow()))
    __obj.asInstanceOf[SavedColumnsResource]
  }
}

