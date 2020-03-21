package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonCreativeId
import typingsJapgolly.gapiClientAdexchangebuyer2.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealAssociationsResource extends js.Object {
  /** Associate an existing deal with a creative. */
  def add(request: AnonCreativeId): Request_[js.Object]
  /** List all creative-deal associations. */
  def list(request: AnonKey): Request_[ListDealAssociationsResponse]
  /** Remove the association between a deal and a creative. */
  def remove(request: AnonCreativeId): Request_[js.Object]
}

object DealAssociationsResource {
  @scala.inline
  def apply(
    add: AnonCreativeId => CallbackTo[Request_[js.Object]],
    list: AnonKey => CallbackTo[Request_[ListDealAssociationsResponse]],
    remove: AnonCreativeId => CallbackTo[Request_[js.Object]]
  ): DealAssociationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonCreativeId) => add(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer2.AnonCreativeId) => remove(t0).runNow()))
    __obj.asInstanceOf[DealAssociationsResource]
  }
}

