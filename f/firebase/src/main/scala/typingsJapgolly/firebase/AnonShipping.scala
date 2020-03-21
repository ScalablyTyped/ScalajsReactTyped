package typingsJapgolly.firebase

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebase.mod.analytics.Currency
import typingsJapgolly.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShipping
  extends /* key */ StringDictionary[js.Any] {
  var currency: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var shipping: js.UndefOr[Currency] = js.undefined
  var tax: js.UndefOr[Currency] = js.undefined
  var transaction_id: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object AnonShipping {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    currency: String = null,
    items: js.Array[Item] = null,
    shipping: Currency = null,
    tax: Currency = null,
    transaction_id: String = null,
    value: Int | Double = null
  ): AnonShipping = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    if (transaction_id != null) __obj.updateDynamic("transaction_id")(transaction_id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShipping]
  }
}

