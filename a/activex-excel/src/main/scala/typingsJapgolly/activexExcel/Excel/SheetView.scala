package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexExcel.Excel.WorksheetView
  - typingsJapgolly.activexExcel.Excel.DialogSheetView
*/
trait SheetView extends StObject
object SheetView {
  
  inline def DialogSheetView(
    Application: Application,
    Creator: XlCreator,
    ExcelDotDialogSheetView_typekey: typingsJapgolly.activexExcel.Excel.DialogSheetView,
    Parent: Any,
    Sheet: DialogSheet
  ): typingsJapgolly.activexExcel.Excel.DialogSheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DialogSheetView_typekey")(ExcelDotDialogSheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.activexExcel.Excel.DialogSheetView]
  }
  
  inline def WorksheetView(
    Application: Application,
    Creator: XlCreator,
    DisplayFormulas: Boolean,
    DisplayGridlines: Boolean,
    DisplayHeadings: Boolean,
    DisplayOutline: Boolean,
    DisplayZeros: Boolean,
    ExcelDotWorksheetView_typekey: typingsJapgolly.activexExcel.Excel.WorksheetView,
    Parent: Any,
    Sheet: Worksheet
  ): typingsJapgolly.activexExcel.Excel.WorksheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayFormulas = DisplayFormulas.asInstanceOf[js.Any], DisplayGridlines = DisplayGridlines.asInstanceOf[js.Any], DisplayHeadings = DisplayHeadings.asInstanceOf[js.Any], DisplayOutline = DisplayOutline.asInstanceOf[js.Any], DisplayZeros = DisplayZeros.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.WorksheetView_typekey")(ExcelDotWorksheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.activexExcel.Excel.WorksheetView]
  }
}
