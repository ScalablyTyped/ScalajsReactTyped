package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeaderLines extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Border: typingsJapgolly.activexExcel.Excel.Border
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.LeaderLines_typekey")
  var ExcelDotLeaderLines_typekey: LeaderLines
  
  val Format: ChartFormat
  
  val Parent: Any
  
  def Select(): Unit
}
object LeaderLines {
  
  inline def apply(
    Application: Application,
    Border: Border,
    Creator: XlCreator,
    Delete: Callback,
    ExcelDotLeaderLines_typekey: LeaderLines,
    Format: ChartFormat,
    Parent: Any,
    Select: Callback
  ): LeaderLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Format = Format.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = Select.toJsFn)
    __obj.updateDynamic("Excel.LeaderLines_typekey")(ExcelDotLeaderLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderLines]
  }
  
  extension [Self <: LeaderLines](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setExcelDotLeaderLines_typekey(value: LeaderLines): Self = StObject.set(x, "Excel.LeaderLines_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
  }
}
