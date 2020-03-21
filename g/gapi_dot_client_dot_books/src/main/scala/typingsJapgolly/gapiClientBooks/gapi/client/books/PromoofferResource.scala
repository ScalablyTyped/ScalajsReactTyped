package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonAndroidId
import typingsJapgolly.gapiClientBooks.AnonDevice
import typingsJapgolly.gapiClientBooks.AnonManufacturer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoofferResource extends js.Object {
  def accept(request: AnonAndroidId): Request_[Unit]
  def dismiss(request: AnonDevice): Request_[Unit]
  /** Returns a list of promo offers available to the user */
  def get(request: AnonManufacturer): Request_[Offers]
}

object PromoofferResource {
  @scala.inline
  def apply(
    accept: AnonAndroidId => CallbackTo[Request_[Unit]],
    dismiss: AnonDevice => CallbackTo[Request_[Unit]],
    get: AnonManufacturer => CallbackTo[Request_[Offers]]
  ): PromoofferResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAndroidId) => accept(t0).runNow()))
    __obj.updateDynamic("dismiss")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonDevice) => dismiss(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonManufacturer) => get(t0).runNow()))
    __obj.asInstanceOf[PromoofferResource]
  }
}

