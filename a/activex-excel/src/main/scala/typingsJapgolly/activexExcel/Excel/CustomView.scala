package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomView extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.CustomView_typekey")
  var ExcelDotCustomView_typekey: CustomView
  
  val Name: String
  
  val Parent: Any
  
  val PrintSettings: Boolean
  
  val RowColSettings: Boolean
  
  def Show(): Unit
}
object CustomView {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: Callback,
    ExcelDotCustomView_typekey: CustomView,
    Name: String,
    Parent: Any,
    PrintSettings: Boolean,
    RowColSettings: Boolean,
    Show: Callback
  ): CustomView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PrintSettings = PrintSettings.asInstanceOf[js.Any], RowColSettings = RowColSettings.asInstanceOf[js.Any], Show = Show.toJsFn)
    __obj.updateDynamic("Excel.CustomView_typekey")(ExcelDotCustomView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomView]
  }
  
  extension [Self <: CustomView](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setExcelDotCustomView_typekey(value: CustomView): Self = StObject.set(x, "Excel.CustomView_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPrintSettings(value: Boolean): Self = StObject.set(x, "PrintSettings", value.asInstanceOf[js.Any])
    
    inline def setRowColSettings(value: Boolean): Self = StObject.set(x, "RowColSettings", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Callback): Self = StObject.set(x, "Show", value.toJsFn)
  }
}
