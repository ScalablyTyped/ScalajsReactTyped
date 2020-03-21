package typingsJapgolly.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangeseller.AnonDealId
import typingsJapgolly.gapiClientAdexchangeseller.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferreddealsResource extends js.Object {
  /** Get information about the selected Ad Exchange Preferred Deal. */
  def get(request: AnonDealId): Request_[PreferredDeal]
  /** List the preferred deals for this Ad Exchange account. */
  def list(request: AnonKey): Request_[PreferredDeals]
}

object PreferreddealsResource {
  @scala.inline
  def apply(
    get: AnonDealId => CallbackTo[Request_[PreferredDeal]],
    list: AnonKey => CallbackTo[Request_[PreferredDeals]]
  ): PreferreddealsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonDealId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangeseller.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[PreferreddealsResource]
  }
}

