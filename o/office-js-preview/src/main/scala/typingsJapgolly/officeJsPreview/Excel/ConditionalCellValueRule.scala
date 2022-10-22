package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Between
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EqualTo
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqual
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LessThan
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LessThanOrEqual
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NotBetween
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.NotEqualTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a cell value conditional format rule.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalCellValueRule extends StObject {
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formula1: String
  
  /**
    * The formula, if required, on which to evaluate the conditional format rule.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formula2: js.UndefOr[String] = js.undefined
  
  /**
    * The operator of the cell value conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
}
object ConditionalCellValueRule {
  
  inline def apply(
    formula1: String,
    operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
  ): ConditionalCellValueRule = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalCellValueRule]
  }
  
  extension [Self <: ConditionalCellValueRule](x: Self) {
    
    inline def setFormula1(value: String): Self = StObject.set(x, "formula1", value.asInstanceOf[js.Any])
    
    inline def setFormula2(value: String): Self = StObject.set(x, "formula2", value.asInstanceOf[js.Any])
    
    inline def setFormula2Undefined: Self = StObject.set(x, "formula2", js.undefined)
    
    inline def setOperator(
      value: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
