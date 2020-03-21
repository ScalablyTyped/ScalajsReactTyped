package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.RecentFile")
@js.native
class RecentFile protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.RecentFile_typekey")
  var ExcelDotRecentFile_typekey: RecentFile = js.native
  val Index: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  def Delete(): Unit = js.native
  def Open(): Workbook = js.native
}

