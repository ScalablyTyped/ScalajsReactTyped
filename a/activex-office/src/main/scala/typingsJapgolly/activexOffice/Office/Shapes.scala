package typingsJapgolly.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shapes extends js.Object {
  val Application: js.Any = js.native
  val Background: Shape = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Default: Shape = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): Shape = js.native
  def AddCallout(Type: MsoCalloutType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddCanvas(Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  /**
    * @param Type [Type=-1]
    * @param Left [Left=-1]
    * @param Top [Top=-1]
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    */
  def AddChart(): Shape = js.native
  def AddChart(Type: XlChartType): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddChart(Type: XlChartType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  /**
    * @param Style [Style=-1]
    * @param Type [Type=-1]
    * @param Left [Left=-1]
    * @param Top [Top=-1]
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    * @param NewLayout [NewLayout=true]
    */
  def AddChart2(
    Style: js.UndefOr[Double],
    Type: js.UndefOr[XlChartType],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double],
    NewLayout: js.UndefOr[Boolean]
  ): Shape = js.native
  def AddConnector(Type: MsoConnectorType, BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  def AddCurve(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddDiagram(Type: MsoDiagramType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddLabel(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Shape = js.native
  /**
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    */
  def AddPicture(
    FileName: String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: Double,
    Top: Double
  ): Shape = js.native
  def AddPicture(
    FileName: String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: Double,
    Top: Double,
    Width: Double
  ): Shape = js.native
  def AddPicture(
    FileName: String,
    LinkToFile: MsoTriState,
    SaveWithDocument: MsoTriState,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double
  ): Shape = js.native
  def AddPolyline(SafeArrayOfPoints: js.Any): Shape = js.native
  def AddShape(Type: MsoAutoShapeType, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  /**
    * @param Left [Left=-1]
    * @param Top [Top=-1]
    * @param Width [Width=-1]
    * @param Height [Height=-1]
    */
  def AddSmartArt(Layout: SmartArtLayout): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Double, Width: Double): Shape = js.native
  def AddSmartArt(Layout: SmartArtLayout, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddTable(NumRows: Double, NumColumns: Double, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def AddTextEffect(
    PresetTextEffect: MsoPresetTextEffect,
    Text: String,
    FontName: String,
    FontSize: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    Left: Double,
    Top: Double
  ): Shape = js.native
  def AddTextbox(Orientation: MsoTextOrientation, Left: Double, Top: Double, Width: Double, Height: Double): Shape = js.native
  def BuildFreeform(EditingType: MsoEditingType, X1: Double, Y1: Double): FreeformBuilder = js.native
  def Item(Index: js.Any): Shape = js.native
  def Range(Index: js.Any): ShapeRange = js.native
  def SelectAll(): Unit = js.native
}

