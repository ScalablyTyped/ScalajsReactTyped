package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListColumn")
@js.native
class ListColumn protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("DataBodyRange")
  val DataBodyRange_Original: Range = js.native
  @JSName("Excel.ListColumn_typekey")
  var ExcelDotListColumn_typekey: ListColumn = js.native
  val Index: Double = js.native
  val ListDataFormat: typingsJapgolly.activexExcel.Excel.ListDataFormat = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  val SharePointFormula: String = js.native
  @JSName("Total")
  val Total_Original: Range = js.native
  var TotalsCalculation: XlTotalsCalculation = js.native
  val XPath: typingsJapgolly.activexExcel.Excel.XPath = js.native
  val _Default: String = js.native
  def DataBodyRange(Address: String): Range = js.native
  def DataBodyRange(RowIndex: Double): Range = js.native
  def DataBodyRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Delete(): Unit = js.native
  def Range(Address: String): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Total(Address: String): Range = js.native
  def Total(RowIndex: Double): Range = js.native
  def Total(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

