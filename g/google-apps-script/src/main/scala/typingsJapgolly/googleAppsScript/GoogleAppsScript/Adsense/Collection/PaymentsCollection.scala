package typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Schema.Payments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsCollection extends js.Object {
  // List the payments for this AdSense account.
  def list(): Payments
}

object PaymentsCollection {
  @scala.inline
  def apply(list: CallbackTo[Payments]): PaymentsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.asInstanceOf[PaymentsCollection]
  }
}

