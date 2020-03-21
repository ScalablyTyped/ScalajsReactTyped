package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonProductId
import typingsJapgolly.gapiClientAdexchangebuyer.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Gets the requested product by id. */
  def get(request: AnonProductId): Request_[Product]
  /** Gets the requested product. */
  def search(request: AnonUserIp): Request_[GetOffersResponse]
}

object ProductsResource {
  @scala.inline
  def apply(
    get: AnonProductId => CallbackTo[Request_[Product]],
    search: AnonUserIp => CallbackTo[Request_[GetOffersResponse]]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonProductId) => get(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonUserIp) => search(t0).runNow()))
    __obj.asInstanceOf[ProductsResource]
  }
}

