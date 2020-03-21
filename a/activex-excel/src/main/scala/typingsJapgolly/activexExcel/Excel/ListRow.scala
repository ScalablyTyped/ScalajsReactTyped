package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ListRow")
@js.native
class ListRow protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.ListRow_typekey")
  var ExcelDotListRow_typekey: ListRow = js.native
  val Index: Double = js.native
  val InvalidData: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  def Delete(): Unit = js.native
  def Range(Address: String): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
}

