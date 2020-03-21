package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSharedFormulaValue extends _CellValue {
  var date1904: Boolean
  val formula: js.UndefOr[String] = js.undefined
  var result: js.UndefOr[Double | String | js.Date | AnonError] = js.undefined
  var sharedFormula: String
}

object CellSharedFormulaValue {
  @scala.inline
  def apply(
    date1904: Boolean,
    sharedFormula: String,
    formula: String = null,
    result: Double | String | js.Date | AnonError = null
  ): CellSharedFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], sharedFormula = sharedFormula.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSharedFormulaValue]
  }
}

