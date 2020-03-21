package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.AutoFilter")
@js.native
class AutoFilter protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.AutoFilter_typekey")
  var ExcelDotAutoFilter_typekey: AutoFilter = js.native
  val FilterMode: Boolean = js.native
  @JSName("Filters")
  val Filters_Original: Filters = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  val Sort: typingsJapgolly.activexExcel.Excel.Sort = js.native
  def ApplyFilter(): Unit = js.native
  def Filters(Index: Double): Filter = js.native
  def Range(Address: String): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
  def ShowAllData(): Unit = js.native
}

