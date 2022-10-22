package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableStyleElement extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  def Borders(Index: XlBordersIndex): Border
  @JSName("Borders")
  val Borders_Original: Borders
  
  def Clear(): Unit
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.TableStyleElement_typekey")
  var ExcelDotTableStyleElement_typekey: TableStyleElement
  
  val Font: typingsJapgolly.activexExcel.Excel.Font
  
  val HasFormat: Boolean
  
  val Interior: typingsJapgolly.activexExcel.Excel.Interior
  
  val Parent: Any
  
  var StripeSize: Double
}
object TableStyleElement {
  
  inline def apply(
    Application: Application,
    Borders: Borders,
    Clear: Callback,
    Creator: XlCreator,
    ExcelDotTableStyleElement_typekey: TableStyleElement,
    Font: Font,
    HasFormat: Boolean,
    Interior: Interior,
    Parent: Any,
    StripeSize: Double
  ): TableStyleElement = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Clear = Clear.toJsFn, Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], HasFormat = HasFormat.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StripeSize = StripeSize.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.TableStyleElement_typekey")(ExcelDotTableStyleElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyleElement]
  }
  
  extension [Self <: TableStyleElement](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotTableStyleElement_typekey(value: TableStyleElement): Self = StObject.set(x, "Excel.TableStyleElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setHasFormat(value: Boolean): Self = StObject.set(x, "HasFormat", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setStripeSize(value: Double): Self = StObject.set(x, "StripeSize", value.asInstanceOf[js.Any])
  }
}
