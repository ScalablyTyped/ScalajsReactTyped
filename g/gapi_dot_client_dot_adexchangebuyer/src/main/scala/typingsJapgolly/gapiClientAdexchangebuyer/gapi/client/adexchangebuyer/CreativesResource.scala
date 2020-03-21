package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonBuyerCreativeId
import typingsJapgolly.gapiClientAdexchangebuyer.AnonDealsStatusFilter
import typingsJapgolly.gapiClientAdexchangebuyer.AnonFields
import typingsJapgolly.gapiClientAdexchangebuyer.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesResource extends js.Object {
  /** Add a deal id association for the creative. */
  def addDeal(request: AnonBuyerCreativeId): Request_[Unit]
  /** Gets the status for a single creative. A creative will be available 30-40 minutes after submission. */
  def get(request: AnonKey): Request_[Creative]
  /** Submit a new creative. */
  def insert(request: AnonFields): Request_[Creative]
  /** Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission. */
  def list(request: AnonDealsStatusFilter): Request_[CreativesList]
  /** Lists the external deal ids associated with the creative. */
  def listDeals(request: AnonKey): Request_[CreativeDealIds]
  /** Remove a deal id associated with the creative. */
  def removeDeal(request: AnonBuyerCreativeId): Request_[Unit]
}

object CreativesResource {
  @scala.inline
  def apply(
    addDeal: AnonBuyerCreativeId => CallbackTo[Request_[Unit]],
    get: AnonKey => CallbackTo[Request_[Creative]],
    insert: AnonFields => CallbackTo[Request_[Creative]],
    list: AnonDealsStatusFilter => CallbackTo[Request_[CreativesList]],
    listDeals: AnonKey => CallbackTo[Request_[CreativeDealIds]],
    removeDeal: AnonBuyerCreativeId => CallbackTo[Request_[Unit]]
  ): CreativesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDeal")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonBuyerCreativeId) => addDeal(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonDealsStatusFilter) => list(t0).runNow()))
    __obj.updateDynamic("listDeals")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonKey) => listDeals(t0).runNow()))
    __obj.updateDynamic("removeDeal")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonBuyerCreativeId) => removeDeal(t0).runNow()))
    __obj.asInstanceOf[CreativesResource]
  }
}

