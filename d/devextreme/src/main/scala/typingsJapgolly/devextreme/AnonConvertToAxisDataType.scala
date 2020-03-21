package typingsJapgolly.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConvertToAxisDataType extends js.Object {
  var checkTypeForAllData: js.UndefOr[Boolean] = js.undefined
  var convertToAxisDataType: js.UndefOr[Boolean] = js.undefined
  var sortingMethod: js.UndefOr[Boolean | (js.Function2[/* a */ AnonArg, /* b */ AnonArg, Double])] = js.undefined
}

object AnonConvertToAxisDataType {
  @scala.inline
  def apply(
    checkTypeForAllData: js.UndefOr[Boolean] = js.undefined,
    convertToAxisDataType: js.UndefOr[Boolean] = js.undefined,
    sortingMethod: Boolean | (js.Function2[/* a */ AnonArg, /* b */ AnonArg, Double]) = null
  ): AnonConvertToAxisDataType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkTypeForAllData)) __obj.updateDynamic("checkTypeForAllData")(checkTypeForAllData.asInstanceOf[js.Any])
    if (!js.isUndefined(convertToAxisDataType)) __obj.updateDynamic("convertToAxisDataType")(convertToAxisDataType.asInstanceOf[js.Any])
    if (sortingMethod != null) __obj.updateDynamic("sortingMethod")(sortingMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConvertToAxisDataType]
  }
}

