package typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Adsense.Schema.Payments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsCollection extends js.Object {
  // List the payments for the specified AdSense account.
  def list(accountId: String): Payments
}

object PaymentsCollection {
  @scala.inline
  def apply(list: String => CallbackTo[Payments]): PaymentsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[PaymentsCollection]
  }
}

