package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormulaValue extends _CellValue {
  var date1904: Boolean
  var formula: String
  var result: js.UndefOr[Double | String | js.Date | AnonError] = js.undefined
}

object CellFormulaValue {
  @scala.inline
  def apply(date1904: Boolean, formula: String, result: Double | String | js.Date | AnonError = null): CellFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFormulaValue]
  }
}

