package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriceSchedule extends js.Object {
  /**
    * The current price schedule, as determined by the term remaining for the Reserved Instance in the listing. A specific price schedule is always in effect, but only one price schedule can be active at any time. Take, for example, a Reserved Instance listing that has five months remaining in its term. When you specify price schedules for five months and two months, this means that schedule 1, covering the first three months of the remaining term, will be active during months 5, 4, and 3. Then schedule 2, covering the last two months of the term, will be active for months 2 and 1.
    */
  var Active: js.UndefOr[Boolean] = js.native
  /**
    * The currency for transacting the Reserved Instance resale. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The fixed price for the term.
    */
  var Price: js.UndefOr[Double] = js.native
  /**
    * The number of months remaining in the reservation. For example, 2 is the second to the last month before the capacity reservation expires.
    */
  var Term: js.UndefOr[Long] = js.native
}

object PriceSchedule {
  @scala.inline
  def apply(
    Active: js.UndefOr[scala.Boolean] = js.undefined,
    CurrencyCode: CurrencyCodeValues = null,
    Price: Int | scala.Double = null,
    Term: Int | scala.Double = null
  ): PriceSchedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active.asInstanceOf[js.Any])
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Price != null) __obj.updateDynamic("Price")(Price.asInstanceOf[js.Any])
    if (Term != null) __obj.updateDynamic("Term")(Term.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceSchedule]
  }
}

