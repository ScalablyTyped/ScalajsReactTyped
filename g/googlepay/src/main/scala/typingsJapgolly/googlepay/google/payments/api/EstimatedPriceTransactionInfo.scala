package typingsJapgolly.googlepay.google.payments.api

import typingsJapgolly.googlepay.googlepayStrings.DEFAULT
import typingsJapgolly.googlepay.googlepayStrings.ESTIMATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EstimatedPriceTransactionInfo
  extends KnownPriceTransactionInfo
     with TransactionInfo {
  @JSName("checkoutOption")
  var checkoutOption_EstimatedPriceTransactionInfo: js.UndefOr[DEFAULT] = js.undefined
  @JSName("totalPriceStatus")
  var totalPriceStatus_EstimatedPriceTransactionInfo: ESTIMATED
}

object EstimatedPriceTransactionInfo {
  @scala.inline
  def apply(
    currencyCode: String,
    totalPrice: String,
    totalPriceStatus: ESTIMATED,
    checkoutOption: DEFAULT = null,
    countryCode: String = null,
    displayItems: js.Array[DisplayItem] = null,
    totalPriceLabel: String = null,
    transactionId: String = null
  ): EstimatedPriceTransactionInfo = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], totalPrice = totalPrice.asInstanceOf[js.Any], totalPriceStatus = totalPriceStatus.asInstanceOf[js.Any])
    if (checkoutOption != null) __obj.updateDynamic("checkoutOption")(checkoutOption.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (totalPriceLabel != null) __obj.updateDynamic("totalPriceLabel")(totalPriceLabel.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EstimatedPriceTransactionInfo]
  }
}

