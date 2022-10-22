package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayFormat extends StObject {
  
  val AddIndent: Boolean | Null = js.native
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  def Borders(Index: XlBordersIndex): Border = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  
  def Characters(): typingsJapgolly.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double): typingsJapgolly.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typingsJapgolly.activexExcel.Excel.Characters = js.native
  def Characters(Start: Unit, Length: Double): typingsJapgolly.activexExcel.Excel.Characters = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.DisplayFormat_typekey")
  var ExcelDotDisplayFormat_typekey: DisplayFormat = js.native
  
  val Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  
  val FormulaHidden: Boolean | Null = js.native
  
  val HorizontalAlignment: Any = js.native
  
  val IndentLevel: Any = js.native
  
  val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  val Locked: Boolean | Null = js.native
  
  val MergeCells: Boolean = js.native
  
  val NumberFormat: String | Null = js.native
  
  val NumberFormatLocal: String | Null = js.native
  
  val Orientation: Any = js.native
  
  val Parent: Any = js.native
  
  val ReadingOrder: Double = js.native
  
  val ShrinkToFit: Boolean = js.native
  
  val Style: typingsJapgolly.activexExcel.Excel.Style = js.native
  
  val VerticalAlignment: Any = js.native
  
  val WrapText: Boolean = js.native
}
