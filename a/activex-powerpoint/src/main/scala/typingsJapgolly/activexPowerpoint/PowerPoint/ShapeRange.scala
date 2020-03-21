package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.GlowFormat
import typingsJapgolly.activexOffice.Office.MsoAlignCmd
import typingsJapgolly.activexOffice.Office.MsoAutoShapeType
import typingsJapgolly.activexOffice.Office.MsoBackgroundStyleIndex
import typingsJapgolly.activexOffice.Office.MsoBlackWhiteMode
import typingsJapgolly.activexOffice.Office.MsoDistributeCmd
import typingsJapgolly.activexOffice.Office.MsoFlipCmd
import typingsJapgolly.activexOffice.Office.MsoScaleFrom
import typingsJapgolly.activexOffice.Office.MsoShapeStyleIndex
import typingsJapgolly.activexOffice.Office.MsoShapeType
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.MsoZOrderCmd
import typingsJapgolly.activexOffice.Office.ReflectionFormat
import typingsJapgolly.activexOffice.Office.SmartArtLayout
import typingsJapgolly.activexOffice.Office.SoftEdgeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ShapeRange")
@js.native
class ShapeRange protected () extends js.Object {
  val ActionSettings: typingsJapgolly.activexPowerpoint.PowerPoint.ActionSettings = js.native
  val Adjustments: typingsJapgolly.activexPowerpoint.PowerPoint.Adjustments = js.native
  var AlternativeText: String = js.native
  val AnimationSettings: typingsJapgolly.activexPowerpoint.PowerPoint.AnimationSettings = js.native
  val Application: js.Any = js.native
  var AutoShapeType: MsoAutoShapeType = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  val Callout: CalloutFormat = js.native
  val CanvasItems: CanvasShapes = js.native
  val Chart: typingsJapgolly.activexPowerpoint.PowerPoint.Chart = js.native
  val Child: MsoTriState = js.native
  val ConnectionSiteCount: Double = js.native
  val Connector: MsoTriState = js.native
  val ConnectorFormat: typingsJapgolly.activexPowerpoint.PowerPoint.ConnectorFormat = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val CustomerData: typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData = js.native
  val Diagram: typingsJapgolly.activexPowerpoint.PowerPoint.Diagram = js.native
  val DiagramNode: typingsJapgolly.activexPowerpoint.PowerPoint.DiagramNode = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val GroupItems: GroupShapes = js.native
  val HasChart: MsoTriState = js.native
  val HasDiagram: MsoTriState = js.native
  val HasDiagramNode: MsoTriState = js.native
  val HasSmartArt: MsoTriState = js.native
  val HasTable: MsoTriState = js.native
  val HasTextFrame: MsoTriState = js.native
  var Height: Double = js.native
  val HorizontalFlip: MsoTriState = js.native
  val Id: Double = js.native
  var Left: Double = js.native
  val Line: LineFormat = js.native
  val LinkFormat: typingsJapgolly.activexPowerpoint.PowerPoint.LinkFormat = js.native
  var LockAspectRatio: MsoTriState = js.native
  val MediaFormat: typingsJapgolly.activexPowerpoint.PowerPoint.MediaFormat = js.native
  val MediaType: PpMediaType = js.native
  var Name: String = js.native
  val Nodes: ShapeNodes = js.native
  val OLEFormat: typingsJapgolly.activexPowerpoint.PowerPoint.OLEFormat = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: typingsJapgolly.activexPowerpoint.PowerPoint.PictureFormat = js.native
  val PlaceholderFormat: typingsJapgolly.activexPowerpoint.PowerPoint.PlaceholderFormat = js.native
  @JSName("PowerPoint.ShapeRange_typekey")
  var PowerPointDotShapeRange_typekey: ShapeRange = js.native
  val RTF: String = js.native
  val Reflection: ReflectionFormat = js.native
  var Rotation: Double = js.native
  val Script: typingsJapgolly.activexOffice.Office.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: MsoShapeStyleIndex = js.native
  val SmartArt: typingsJapgolly.activexOffice.Office.SmartArt = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  val SoundFormat: typingsJapgolly.activexPowerpoint.PowerPoint.SoundFormat = js.native
  val Table: typingsJapgolly.activexPowerpoint.PowerPoint.Table = js.native
  val Tags: typingsJapgolly.activexPowerpoint.PowerPoint.Tags = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: typingsJapgolly.activexPowerpoint.PowerPoint.TextFrame = js.native
  val TextFrame2: typingsJapgolly.activexPowerpoint.PowerPoint.TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: String = js.native
  var Top: Double = js.native
  val Type: MsoShapeType = js.native
  val VerticalFlip: MsoTriState = js.native
  val Vertices: js.Any = js.native
  var Visible: MsoTriState = js.native
  var Width: Double = js.native
  val ZOrderPosition: Double = js.native
  def Align(AlignCmd: MsoAlignCmd, RelativeTo: MsoTriState): Unit = js.native
  def Apply(): Unit = js.native
  def ApplyAnimation(): Unit = js.native
  def CanvasCropBottom(Increment: Double): Unit = js.native
  def CanvasCropLeft(Increment: Double): Unit = js.native
  def CanvasCropRight(Increment: Double): Unit = js.native
  def CanvasCropTop(Increment: Double): Unit = js.native
  def ConvertTextToSmartArt(Layout: SmartArtLayout): Unit = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Distribute(DistributeCmd: MsoDistributeCmd, RelativeTo: MsoTriState): Unit = js.native
  def Duplicate(): ShapeRange = js.native
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    * @param PowerPoint.PpExportMode [ExportMode=1]
    */
  def Export(PathName: String, Filter: PpShapeFormat): Unit = js.native
  def Export(PathName: String, Filter: PpShapeFormat, ScaleWidth: Double): Unit = js.native
  def Export(PathName: String, Filter: PpShapeFormat, ScaleWidth: Double, ScaleHeight: Double): Unit = js.native
  def Export(
    PathName: String,
    Filter: PpShapeFormat,
    ScaleWidth: Double,
    ScaleHeight: Double,
    ExportMode: PpExportMode
  ): Unit = js.native
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  def Group(): Shape = js.native
  def IncrementLeft(Increment: Double): Unit = js.native
  def IncrementRotation(Increment: Double): Unit = js.native
  def IncrementTop(Increment: Double): Unit = js.native
  def Item(Index: js.Any): Shape = js.native
  def PickUp(): Unit = js.native
  def PickupAnimation(): Unit = js.native
  def Regroup(): Shape = js.native
  def RerouteConnections(): Unit = js.native
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, fScale: MsoScaleFrom): Unit = js.native
  /** @param Office.MsoTriState [Replace=-1] */
  def Select(): Unit = js.native
  def Select(Replace: MsoTriState): Unit = js.native
  def SetShapesDefaultProperties(): Unit = js.native
  def Ungroup(): ShapeRange = js.native
  def UpgradeMedia(): Unit = js.native
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
}

