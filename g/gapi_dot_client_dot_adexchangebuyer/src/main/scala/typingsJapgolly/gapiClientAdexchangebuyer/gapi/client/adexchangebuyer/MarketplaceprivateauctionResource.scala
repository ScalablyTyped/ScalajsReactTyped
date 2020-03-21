package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplaceprivateauctionResource extends js.Object {
  /** Update a given private auction proposal */
  def updateproposal(request: AnonPrettyPrint): Request_[Unit]
}

object MarketplaceprivateauctionResource {
  @scala.inline
  def apply(updateproposal: AnonPrettyPrint => CallbackTo[Request_[Unit]]): MarketplaceprivateauctionResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updateproposal")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonPrettyPrint) => updateproposal(t0).runNow()))
    __obj.asInstanceOf[MarketplaceprivateauctionResource]
  }
}

