package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseHostReservationResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The currency in which the totalUpfrontPrice and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * Describes the details of the purchase.
    */
  var Purchase: js.UndefOr[PurchaseSet] = js.native
  /**
    * The total hourly price of the reservation calculated per hour.
    */
  var TotalHourlyPrice: js.UndefOr[String] = js.native
  /**
    * The total amount charged to your account when you purchase the reservation.
    */
  var TotalUpfrontPrice: js.UndefOr[String] = js.native
}

object PurchaseHostReservationResult {
  @scala.inline
  def apply(
    ClientToken: String = null,
    CurrencyCode: CurrencyCodeValues = null,
    Purchase: PurchaseSet = null,
    TotalHourlyPrice: String = null,
    TotalUpfrontPrice: String = null
  ): PurchaseHostReservationResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Purchase != null) __obj.updateDynamic("Purchase")(Purchase.asInstanceOf[js.Any])
    if (TotalHourlyPrice != null) __obj.updateDynamic("TotalHourlyPrice")(TotalHourlyPrice.asInstanceOf[js.Any])
    if (TotalUpfrontPrice != null) __obj.updateDynamic("TotalUpfrontPrice")(TotalUpfrontPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseHostReservationResult]
  }
}

