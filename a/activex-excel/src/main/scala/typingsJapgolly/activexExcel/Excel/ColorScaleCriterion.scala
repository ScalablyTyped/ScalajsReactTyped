package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorScaleCriterion extends StObject {
  
  /* private */ @JSName("Excel.ColorScaleCriterion_typekey")
  var ExcelDotColorScaleCriterion_typekey: ColorScaleCriterion
  
  val FormatColor: typingsJapgolly.activexExcel.Excel.FormatColor
  
  val Index: Double
  
  var Type: XlConditionValueTypes
  
  var Value: Any
}
object ColorScaleCriterion {
  
  inline def apply(
    ExcelDotColorScaleCriterion_typekey: ColorScaleCriterion,
    FormatColor: FormatColor,
    Index: Double,
    Type: XlConditionValueTypes,
    Value: Any
  ): ColorScaleCriterion = {
    val __obj = js.Dynamic.literal(FormatColor = FormatColor.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ColorScaleCriterion_typekey")(ExcelDotColorScaleCriterion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScaleCriterion]
  }
  
  extension [Self <: ColorScaleCriterion](x: Self) {
    
    inline def setExcelDotColorScaleCriterion_typekey(value: ColorScaleCriterion): Self = StObject.set(x, "Excel.ColorScaleCriterion_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormatColor(value: FormatColor): Self = StObject.set(x, "FormatColor", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setType(value: XlConditionValueTypes): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
