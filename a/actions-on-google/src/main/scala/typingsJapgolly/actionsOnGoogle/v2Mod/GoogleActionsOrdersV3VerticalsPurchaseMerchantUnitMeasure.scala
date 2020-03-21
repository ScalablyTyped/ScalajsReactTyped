package typingsJapgolly.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure extends js.Object {
  /**
    * Value: Example 1.2.
    */
  var measure: js.UndefOr[Double] = js.undefined
  /**
    * Unit: Example POUND, GRAM.
    */
  var unit: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureUnit] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure {
  @scala.inline
  def apply(
    measure: Int | Double = null,
    unit: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureUnit = null
  ): GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure = {
    val __obj = js.Dynamic.literal()
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure]
  }
}

