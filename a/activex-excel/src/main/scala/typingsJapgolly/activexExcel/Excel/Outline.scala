package typingsJapgolly.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outline extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  var AutomaticStyles: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.Outline_typekey")
  var ExcelDotOutline_typekey: Outline = js.native
  
  val Parent: Any = js.native
  
  def ShowLevels(): Any = js.native
  def ShowLevels(RowLevels: Double): Any = js.native
  def ShowLevels(RowLevels: Double, ColumnLevels: Double): Any = js.native
  def ShowLevels(RowLevels: Unit, ColumnLevels: Double): Any = js.native
  
  var SummaryColumn: XlSummaryColumn = js.native
  
  var SummaryRow: XlSummaryRow = js.native
}
