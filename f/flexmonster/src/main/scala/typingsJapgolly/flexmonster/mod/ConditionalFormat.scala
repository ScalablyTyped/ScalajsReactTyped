package typingsJapgolly.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormat extends StObject {
  
  var column: js.UndefOr[Double] = js.undefined
  
  var format: js.UndefOr[Style] = js.undefined
  
  var formatCSS: js.UndefOr[String] = js.undefined
  
  var formula: js.UndefOr[String] = js.undefined
  
  var hierarchy: js.UndefOr[String] = js.undefined
  
  var isTotal: js.UndefOr[Double] = js.undefined
  
  var measureName: js.UndefOr[String] = js.undefined
  
  var member: js.UndefOr[String] = js.undefined
  
  var row: js.UndefOr[Double] = js.undefined
}
object ConditionalFormat {
  
  inline def apply(): ConditionalFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormat]
  }
  
  extension [Self <: ConditionalFormat](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setFormat(value: Style): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatCSS(value: String): Self = StObject.set(x, "formatCSS", value.asInstanceOf[js.Any])
    
    inline def setFormatCSSUndefined: Self = StObject.set(x, "formatCSS", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setHierarchy(value: String): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
    
    inline def setIsTotal(value: Double): Self = StObject.set(x, "isTotal", value.asInstanceOf[js.Any])
    
    inline def setIsTotalUndefined: Self = StObject.set(x, "isTotal", js.undefined)
    
    inline def setMeasureName(value: String): Self = StObject.set(x, "measureName", value.asInstanceOf[js.Any])
    
    inline def setMeasureNameUndefined: Self = StObject.set(x, "measureName", js.undefined)
    
    inline def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
