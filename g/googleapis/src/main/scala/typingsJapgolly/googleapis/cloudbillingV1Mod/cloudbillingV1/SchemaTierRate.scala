package typingsJapgolly.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The price rate indicating starting usage and its corresponding price.
  */
@js.native
trait SchemaTierRate extends js.Object {
  /**
    * Usage is priced at this rate only after this amount. Example:
    * start_usage_amount of 10 indicates that the usage will be priced at the
    * unit_price after the first 10 usage_units.
    */
  var startUsageAmount: js.UndefOr[Double] = js.native
  /**
    * The price per unit of usage. Example: unit_price of amount $10 indicates
    * that each unit will cost $10.
    */
  var unitPrice: js.UndefOr[SchemaMoney] = js.native
}

object SchemaTierRate {
  @scala.inline
  def apply(startUsageAmount: Int | Double = null, unitPrice: SchemaMoney = null): SchemaTierRate = {
    val __obj = js.Dynamic.literal()
    if (startUsageAmount != null) __obj.updateDynamic("startUsageAmount")(startUsageAmount.asInstanceOf[js.Any])
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTierRate]
  }
}

