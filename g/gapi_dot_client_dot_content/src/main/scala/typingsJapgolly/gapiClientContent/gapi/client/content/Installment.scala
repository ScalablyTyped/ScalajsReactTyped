package typingsJapgolly.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Installment extends js.Object {
  /** The amount the buyer has to pay per month. */
  var amount: js.UndefOr[Price] = js.undefined
  /** The number of installments the buyer has to pay. */
  var months: js.UndefOr[String] = js.undefined
}

object Installment {
  @scala.inline
  def apply(amount: Price = null, months: String = null): Installment = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    __obj.asInstanceOf[Installment]
  }
}

