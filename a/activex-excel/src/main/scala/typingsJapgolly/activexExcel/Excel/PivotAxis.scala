package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotAxis")
@js.native
class PivotAxis protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.PivotAxis_typekey")
  var ExcelDotPivotAxis_typekey: PivotAxis = js.native
  val Parent: js.Any = js.native
  @JSName("PivotLines")
  val PivotLines_Original: PivotLines = js.native
  def PivotLines(Index: Double): PivotLine = js.native
}

