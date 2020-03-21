package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonEndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidedpurchasesResource extends js.Object {
  /** Lists the purchases that were cancelled, refunded or charged-back. */
  def list(request: AnonEndTime): Request_[VoidedPurchasesListResponse]
}

object VoidedpurchasesResource {
  @scala.inline
  def apply(list: AnonEndTime => CallbackTo[Request_[VoidedPurchasesListResponse]]): VoidedpurchasesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonEndTime) => list(t0).runNow()))
    __obj.asInstanceOf[VoidedpurchasesResource]
  }
}

