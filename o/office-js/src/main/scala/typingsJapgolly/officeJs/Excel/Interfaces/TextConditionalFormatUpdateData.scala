package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ConditionalTextComparisonRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TextConditionalFormat object, for use in `textConditionalFormat.set({ ... })`. */
trait TextConditionalFormatUpdateData extends StObject {
  
  /**
    * Returns a format object, encapsulating the conditional format's font, fill, borders, and other properties.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatUpdateData] = js.undefined
  
  /**
    * The rule of the conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[ConditionalTextComparisonRule] = js.undefined
}
object TextConditionalFormatUpdateData {
  
  inline def apply(): TextConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextConditionalFormatUpdateData]
  }
  
  extension [Self <: TextConditionalFormatUpdateData](x: Self) {
    
    inline def setFormat(value: ConditionalRangeFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRule(value: ConditionalTextComparisonRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
