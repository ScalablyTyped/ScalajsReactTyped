package typingsJapgolly.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Custom data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
trait CustomDataValidation extends js.Object {
  /**
    *
    * A custom data validation formula. This creates special input rules, such as preventing duplicates, or limiting the total in a range of cells.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: String
}

object CustomDataValidation {
  @scala.inline
  def apply(formula: String): CustomDataValidation = {
    val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomDataValidation]
  }
}

