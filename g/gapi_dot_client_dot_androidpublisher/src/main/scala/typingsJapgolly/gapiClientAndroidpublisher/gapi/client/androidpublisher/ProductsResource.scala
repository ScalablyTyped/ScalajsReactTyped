package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /** Checks the purchase and consumption status of an inapp item. */
  def get(request: AnonProductId): Request_[ProductPurchase]
}

object ProductsResource {
  @scala.inline
  def apply(get: AnonProductId => CallbackTo[Request_[ProductPurchase]]): ProductsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonProductId) => get(t0).runNow()))
    __obj.asInstanceOf[ProductsResource]
  }
}

