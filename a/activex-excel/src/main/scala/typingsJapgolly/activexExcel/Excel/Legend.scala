package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Legend")
@js.native
class Legend protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: typingsJapgolly.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Legend_typekey")
  var ExcelDotLegend_typekey: Legend = js.native
  val Fill: ChartFillFormat = js.native
  val Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  val Format: ChartFormat = js.native
  var Height: Double = js.native
  var IncludeInLayout: Boolean = js.native
  val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  var Left: Double = js.native
  @JSName("LegendEntries")
  var LegendEntries_Original: LegendEntries with (js.Function1[/* Index */ Double, LegendEntry]) = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var Position: XlLegendPosition = js.native
  var Shadow: Boolean = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def Clear(): js.Any = js.native
  def Delete(): js.Any = js.native
  def LegendEntries(Index: Double): LegendEntry = js.native
  def Select(): js.Any = js.native
}

