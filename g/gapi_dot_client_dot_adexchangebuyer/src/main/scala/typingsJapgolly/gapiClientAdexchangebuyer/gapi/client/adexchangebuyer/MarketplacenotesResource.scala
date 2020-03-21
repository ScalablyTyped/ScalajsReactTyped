package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonOauthtoken
import typingsJapgolly.gapiClientAdexchangebuyer.AnonPqlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarketplacenotesResource extends js.Object {
  /** Add notes to the proposal */
  def insert(request: AnonOauthtoken): Request_[AddOrderNotesResponse]
  /** Get all the notes associated with a proposal */
  def list(request: AnonPqlQuery): Request_[GetOrderNotesResponse]
}

object MarketplacenotesResource {
  @scala.inline
  def apply(
    insert: AnonOauthtoken => CallbackTo[Request_[AddOrderNotesResponse]],
    list: AnonPqlQuery => CallbackTo[Request_[GetOrderNotesResponse]]
  ): MarketplacenotesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonOauthtoken) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonPqlQuery) => list(t0).runNow()))
    __obj.asInstanceOf[MarketplacenotesResource]
  }
}

