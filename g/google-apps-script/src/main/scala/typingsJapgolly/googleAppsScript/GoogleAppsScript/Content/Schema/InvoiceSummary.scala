package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceSummary extends js.Object {
  var additionalChargeSummaries: js.UndefOr[js.Array[InvoiceSummaryAdditionalChargeSummary]] = js.undefined
  var customerBalance: js.UndefOr[Amount] = js.undefined
  var googleBalance: js.UndefOr[Amount] = js.undefined
  var merchantBalance: js.UndefOr[Amount] = js.undefined
  var productTotal: js.UndefOr[Amount] = js.undefined
  var promotionSummaries: js.UndefOr[js.Array[Promotion]] = js.undefined
}

object InvoiceSummary {
  @scala.inline
  def apply(
    additionalChargeSummaries: js.Array[InvoiceSummaryAdditionalChargeSummary] = null,
    customerBalance: Amount = null,
    googleBalance: Amount = null,
    merchantBalance: Amount = null,
    productTotal: Amount = null,
    promotionSummaries: js.Array[Promotion] = null
  ): InvoiceSummary = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeSummaries != null) __obj.updateDynamic("additionalChargeSummaries")(additionalChargeSummaries.asInstanceOf[js.Any])
    if (customerBalance != null) __obj.updateDynamic("customerBalance")(customerBalance.asInstanceOf[js.Any])
    if (googleBalance != null) __obj.updateDynamic("googleBalance")(googleBalance.asInstanceOf[js.Any])
    if (merchantBalance != null) __obj.updateDynamic("merchantBalance")(merchantBalance.asInstanceOf[js.Any])
    if (productTotal != null) __obj.updateDynamic("productTotal")(productTotal.asInstanceOf[js.Any])
    if (promotionSummaries != null) __obj.updateDynamic("promotionSummaries")(promotionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceSummary]
  }
}

