package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonCreativeStatusId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /**
    * List all details associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each detail.
    */
  def list(request: AnonCreativeStatusId): Request_[ListCreativeStatusBreakdownByDetailResponse]
}

object DetailsResource {
  @scala.inline
  def apply(list: AnonCreativeStatusId => CallbackTo[Request_[ListCreativeStatusBreakdownByDetailResponse]]): DetailsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonCreativeStatusId) => list(t0).runNow()))
    __obj.asInstanceOf[DetailsResource]
  }
}

