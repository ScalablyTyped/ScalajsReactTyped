package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Formula
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.HighestValue
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LowestValue
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Number
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Percent
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Percentile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a color scale criterion which contains a type, value, and a color.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalColorScaleCriterion extends StObject {
  
  /**
    * HTML color code representation of the color scale color (e.g., #FF0000 represents Red).
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * A number, a formula, or `null` (if `type` is `lowestValue`).
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.undefined
  
  /**
    * What the criterion conditional formula should be based on.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile
}
object ConditionalColorScaleCriterion {
  
  inline def apply(
    `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile
  ): ConditionalColorScaleCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriterion]
  }
  
  extension [Self <: ConditionalColorScaleCriterion](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setType(
      value: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
