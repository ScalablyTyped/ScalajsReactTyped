package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonOauthtoken
import typingsJapgolly.gapiClientAdexchangebuyer.AnonPqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacedealsResource extends js.Object {
  /** Delete the specified deals from the proposal */
  def delete(request: AnonOauthtoken): Request_[DeleteOrderDealsResponse]
  /** Add new deals for the specified proposal */
  def insert(request: AnonOauthtoken): Request_[AddOrderDealsResponse]
  /** List all the deals for a given proposal */
  def list(request: AnonPqlQuery): Request_[GetOrderDealsResponse]
  /** Replaces all the deals in the proposal with the passed in deals */
  def update(request: AnonOauthtoken): Request_[EditAllOrderDealsResponse]
}

object MarketplacedealsResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => CallbackTo[Request_[DeleteOrderDealsResponse]],
    insert: AnonOauthtoken => CallbackTo[Request_[AddOrderDealsResponse]],
    list: AnonPqlQuery => CallbackTo[Request_[GetOrderDealsResponse]],
    update: AnonOauthtoken => CallbackTo[Request_[EditAllOrderDealsResponse]]
  ): MarketplacedealsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonOauthtoken) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonOauthtoken) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonPqlQuery) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonOauthtoken) => update(t0).runNow()))
    __obj.asInstanceOf[MarketplacedealsResource]
  }
}

