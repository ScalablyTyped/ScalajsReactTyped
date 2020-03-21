package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredBidsResource extends js.Object {
  var creatives: CreativesResource
  var details: DetailsResource
  /**
    * List all reasons for which bids were filtered, with the number of bids
    * filtered for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListFilteredBidsResponse]
}

object FilteredBidsResource {
  @scala.inline
  def apply(
    creatives: CreativesResource,
    details: DetailsResource,
    list: AnonFilterSetId => CallbackTo[Request_[ListFilteredBidsResponse]]
  ): FilteredBidsResource = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonFilterSetId) => list(t0).runNow()))
    __obj.asInstanceOf[FilteredBidsResource]
  }
}

