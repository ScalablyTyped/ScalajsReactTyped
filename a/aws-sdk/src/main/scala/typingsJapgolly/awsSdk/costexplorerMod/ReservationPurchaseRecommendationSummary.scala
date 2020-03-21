package typingsJapgolly.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPurchaseRecommendationSummary extends js.Object {
  /**
    * The currency code used for this recommendation.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month.
    */
  var TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your costs.
    */
  var TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.native
}

object ReservationPurchaseRecommendationSummary {
  @scala.inline
  def apply(
    CurrencyCode: GenericString = null,
    TotalEstimatedMonthlySavingsAmount: GenericString = null,
    TotalEstimatedMonthlySavingsPercentage: GenericString = null
  ): ReservationPurchaseRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (TotalEstimatedMonthlySavingsAmount != null) __obj.updateDynamic("TotalEstimatedMonthlySavingsAmount")(TotalEstimatedMonthlySavingsAmount.asInstanceOf[js.Any])
    if (TotalEstimatedMonthlySavingsPercentage != null) __obj.updateDynamic("TotalEstimatedMonthlySavingsPercentage")(TotalEstimatedMonthlySavingsPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationPurchaseRecommendationSummary]
  }
}

