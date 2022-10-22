package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexOffice.Office.MsoChartElementType
import typingsJapgolly.activexOffice.Office.XlChartType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart extends StObject {
  
  val Application: Any = js.native
  
  def ApplyChartTemplate(FileName: String): Unit = js.native
  
  def ApplyCustomType(ChartType: XlChartType): Unit = js.native
  def ApplyCustomType(ChartType: XlChartType, TypeName: Any): Unit = js.native
  
  /** @param Word.XlDataLabelsType [Type=2] */
  def ApplyDataLabels(
    Type: js.UndefOr[XlDataLabelsType],
    LegendKey: js.UndefOr[Any],
    AutoText: js.UndefOr[Any],
    HasLeaderLines: js.UndefOr[Any],
    ShowSeriesName: js.UndefOr[Any],
    ShowCategoryName: js.UndefOr[Any],
    ShowValue: js.UndefOr[Any],
    ShowPercentage: js.UndefOr[Any],
    ShowBubbleSize: js.UndefOr[Any],
    Separator: js.UndefOr[Any]
  ): Unit = js.native
  
  def ApplyLayout(Layout: Double): Unit = js.native
  def ApplyLayout(Layout: Double, ChartType: Any): Unit = js.native
  
  val Area3DGroup: ChartGroup = js.native
  
  def AreaGroups(): Any = js.native
  def AreaGroups(Index: Any): Any = js.native
  
  def AutoFormat(Gallery: Double): Unit = js.native
  def AutoFormat(Gallery: Double, Format: Any): Unit = js.native
  
  var AutoScaling: Boolean = js.native
  
  /** @param Word.XlAxisGroup [AxisGroup=1] */
  def Axes(Type: Any): Any = js.native
  def Axes(Type: Any, AxisGroup: XlAxisGroup): Any = js.native
  
  val BackWall: typingsJapgolly.activexWord.Word.Walls = js.native
  
  val Bar3DGroup: ChartGroup = js.native
  
  def BarGroups(): Any = js.native
  def BarGroups(Index: Any): Any = js.native
  
  var BarShape: XlBarShape = js.native
  
  val ChartArea: typingsJapgolly.activexWord.Word.ChartArea = js.native
  
  val ChartData: typingsJapgolly.activexWord.Word.ChartData = js.native
  
  def ChartGroups(): Any = js.native
  def ChartGroups(Index: Any): Any = js.native
  
  var ChartStyle: Any = js.native
  
  val ChartTitle: typingsJapgolly.activexWord.Word.ChartTitle = js.native
  
  var ChartType: XlChartType = js.native
  
  def ChartWizard(
    Source: js.UndefOr[Any],
    Gallery: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    PlotBy: js.UndefOr[Any],
    CategoryLabels: js.UndefOr[Any],
    SeriesLabels: js.UndefOr[Any],
    HasLegend: js.UndefOr[Any],
    Title: js.UndefOr[Any],
    CategoryTitle: js.UndefOr[Any],
    ValueTitle: js.UndefOr[Any],
    ExtraTitle: js.UndefOr[Any]
  ): Unit = js.native
  
  def ClearToMatchStyle(): Unit = js.native
  
  val Column3DGroup: ChartGroup = js.native
  
  def ColumnGroups(): Any = js.native
  def ColumnGroups(Index: Any): Any = js.native
  
  def Copy(): Unit = js.native
  def Copy(Before: Any): Unit = js.native
  def Copy(Before: Any, After: Any): Unit = js.native
  def Copy(Before: Unit, After: Any): Unit = js.native
  
  /**
    * @param Word.XlPictureAppearance [Appearance=1]
    * @param Word.XlCopyPictureFormat [Format=-4147]
    * @param Word.XlPictureAppearance [Size=2]
    */
  def CopyPicture(): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: Unit, Size: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: XlCopyPictureFormat): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: XlCopyPictureFormat, Size: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: Unit, Size: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat, Size: XlPictureAppearance): Unit = js.native
  
  val Corners: typingsJapgolly.activexWord.Word.Corners = js.native
  
  val Creator: Double = js.native
  
  val DataTable: typingsJapgolly.activexWord.Word.DataTable = js.native
  
  def Delete(): Any = js.native
  
  var DepthPercent: Double = js.native
  
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  
  def DoughnutGroups(): Any = js.native
  def DoughnutGroups(Index: Any): Any = js.native
  
  var Elevation: Double = js.native
  
  def Export(FileName: String): Boolean = js.native
  def Export(FileName: String, FilterName: Any): Boolean = js.native
  def Export(FileName: String, FilterName: Any, Interactive: Any): Boolean = js.native
  def Export(FileName: String, FilterName: Unit, Interactive: Any): Boolean = js.native
  
  val Floor: typingsJapgolly.activexWord.Word.Floor = js.native
  
  var GapDepth: Double = js.native
  
  def GetChartElement(x: Double, y: Double, ElementID: Double, Arg1: Double, Arg2: Double): Unit = js.native
  
  def HasAxis(): Any = js.native
  def HasAxis(Index1: Any): Any = js.native
  def HasAxis(Index1: Any, Index2: Any): Any = js.native
  def HasAxis(Index1: Unit, Index2: Any): Any = js.native
  
  var HasDataTable: Boolean = js.native
  
  var HasLegend: Boolean = js.native
  
  var HasPivotFields: Boolean = js.native
  
  var HasTitle: Boolean = js.native
  
  var HeightPercent: Double = js.native
  
  val Legend: typingsJapgolly.activexWord.Word.Legend = js.native
  
  val Line3DGroup: ChartGroup = js.native
  
  def LineGroups(): Any = js.native
  def LineGroups(Index: Any): Any = js.native
  
  val Parent: Any = js.native
  
  def Paste(): Unit = js.native
  def Paste(Type: Any): Unit = js.native
  
  var Perspective: Double = js.native
  
  val Pie3DGroup: ChartGroup = js.native
  
  def PieGroups(): Any = js.native
  def PieGroups(Index: Any): Any = js.native
  
  val PivotLayout: Any = js.native
  
  val PlotArea: typingsJapgolly.activexWord.Word.PlotArea = js.native
  
  var PlotBy: XlRowCol = js.native
  
  var PlotVisibleOnly: Boolean = js.native
  
  def RadarGroups(): Any = js.native
  def RadarGroups(Index: Any): Any = js.native
  
  def Refresh(): Unit = js.native
  
  var RightAngleAxes: Any = js.native
  
  var Rotation: Any = js.native
  
  def SaveChartTemplate(FileName: String): Unit = js.native
  
  def Select(): Any = js.native
  def Select(Replace: Any): Any = js.native
  
  def SeriesCollection(): Any = js.native
  def SeriesCollection(Index: Any): Any = js.native
  
  def SetBackgroundPicture(FileName: String): Unit = js.native
  
  def SetDefaultChart(Name: Any): Unit = js.native
  
  def SetElement(Element: MsoChartElementType): Unit = js.native
  
  def SetSourceData(Source: String): Unit = js.native
  def SetSourceData(Source: String, PlotBy: Any): Unit = js.native
  
  val Shapes: Any = js.native
  
  var ShowAllFieldButtons: Boolean = js.native
  
  var ShowAxisFieldButtons: Boolean = js.native
  
  var ShowDataLabelsOverMaximum: Boolean = js.native
  
  var ShowLegendFieldButtons: Boolean = js.native
  
  var ShowReportFilterFieldButtons: Boolean = js.native
  
  var ShowValueFieldButtons: Boolean = js.native
  
  val SideWall: typingsJapgolly.activexWord.Word.Walls = js.native
  
  var SubType: Double = js.native
  
  val SurfaceGroup: ChartGroup = js.native
  
  var Type: Double = js.native
  
  val Walls: typingsJapgolly.activexWord.Word.Walls = js.native
  
  /* private */ @JSName("Word.Chart_typekey")
  var WordDotChart_typekey: Chart = js.native
  
  def XYGroups(): Any = js.native
  def XYGroups(Index: Any): Any = js.native
}
