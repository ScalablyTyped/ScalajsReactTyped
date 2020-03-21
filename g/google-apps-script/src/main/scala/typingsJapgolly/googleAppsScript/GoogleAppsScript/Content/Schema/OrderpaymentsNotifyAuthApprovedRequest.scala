package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsNotifyAuthApprovedRequest extends js.Object {
  var authAmountPretax: js.UndefOr[Price] = js.undefined
  var authAmountTax: js.UndefOr[Price] = js.undefined
}

object OrderpaymentsNotifyAuthApprovedRequest {
  @scala.inline
  def apply(authAmountPretax: Price = null, authAmountTax: Price = null): OrderpaymentsNotifyAuthApprovedRequest = {
    val __obj = js.Dynamic.literal()
    if (authAmountPretax != null) __obj.updateDynamic("authAmountPretax")(authAmountPretax.asInstanceOf[js.Any])
    if (authAmountTax != null) __obj.updateDynamic("authAmountTax")(authAmountTax.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderpaymentsNotifyAuthApprovedRequest]
  }
}

