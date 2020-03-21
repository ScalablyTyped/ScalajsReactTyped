package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ChartGroup")
@js.native
class ChartGroup protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  var AxisGroup: XlAxisGroup = js.native
  var BubbleScale: Double = js.native
  val Creator: XlCreator = js.native
  var DoughnutHoleSize: Double = js.native
  val DownBars: typingsJapgolly.activexExcel.Excel.DownBars = js.native
  val DropLines: typingsJapgolly.activexExcel.Excel.DropLines = js.native
  @JSName("Excel.ChartGroup_typekey")
  var ExcelDotChartGroup_typekey: ChartGroup = js.native
  var FirstSliceAngle: Double = js.native
  var GapWidth: Double = js.native
  var Has3DShading: Boolean = js.native
  var HasDropLines: Boolean = js.native
  var HasHiLoLines: Boolean = js.native
  var HasRadarAxisLabels: Boolean = js.native
  var HasSeriesLines: Boolean = js.native
  var HasUpDownBars: Boolean = js.native
  val HiLoLines: typingsJapgolly.activexExcel.Excel.HiLoLines = js.native
  val Index: Double = js.native
  var Overlap: Double = js.native
  val Parent: js.Any = js.native
  val RadarAxisLabels: TickLabels = js.native
  var SecondPlotSize: Double = js.native
  val SeriesLines: typingsJapgolly.activexExcel.Excel.SeriesLines = js.native
  var ShowNegativeBubbles: Boolean = js.native
  var SizeRepresents: XlSizeRepresents = js.native
  var SplitType: XlChartSplitType = js.native
  var SplitValue: Double = js.native
  var SubType: Double = js.native
  var Type: Double = js.native
  val UpBars: typingsJapgolly.activexExcel.Excel.UpBars = js.native
  var VaryByCategories: Boolean = js.native
  def SeriesCollection(): typingsJapgolly.activexExcel.Excel.SeriesCollection | Series = js.native
  def SeriesCollection(Index: String): typingsJapgolly.activexExcel.Excel.SeriesCollection | Series = js.native
  def SeriesCollection(Index: Double): typingsJapgolly.activexExcel.Excel.SeriesCollection | Series = js.native
}

