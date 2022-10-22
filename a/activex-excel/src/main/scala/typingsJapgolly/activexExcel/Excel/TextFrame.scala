package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexOffice.Office.MsoTextOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFrame extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  var AutoMargins: Boolean = js.native
  
  var AutoSize: Boolean = js.native
  
  def Characters(): typingsJapgolly.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double): typingsJapgolly.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typingsJapgolly.activexExcel.Excel.Characters = js.native
  def Characters(Start: Unit, Length: Double): typingsJapgolly.activexExcel.Excel.Characters = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.TextFrame_typekey")
  var ExcelDotTextFrame_typekey: TextFrame = js.native
  
  var HorizontalAlignment: XlHAlign = js.native
  
  var HorizontalOverflow: XlOartHorizontalOverflow = js.native
  
  var MarginBottom: Double = js.native
  
  var MarginLeft: Double = js.native
  
  var MarginRight: Double = js.native
  
  var MarginTop: Double = js.native
  
  var Orientation: MsoTextOrientation = js.native
  
  val Parent: Any = js.native
  
  var ReadingOrder: Double = js.native
  
  var VerticalAlignment: XlVAlign = js.native
  
  var VerticalOverflow: XlOartVerticalOverflow = js.native
}
