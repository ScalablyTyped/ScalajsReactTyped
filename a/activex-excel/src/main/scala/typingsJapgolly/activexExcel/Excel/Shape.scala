package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexOffice.Office.CanvasShapes
import typingsJapgolly.activexOffice.Office.GlowFormat
import typingsJapgolly.activexOffice.Office.MsoAutoShapeType
import typingsJapgolly.activexOffice.Office.MsoBackgroundStyleIndex
import typingsJapgolly.activexOffice.Office.MsoBlackWhiteMode
import typingsJapgolly.activexOffice.Office.MsoFlipCmd
import typingsJapgolly.activexOffice.Office.MsoScaleFrom
import typingsJapgolly.activexOffice.Office.MsoShapeStyleIndex
import typingsJapgolly.activexOffice.Office.MsoShapeType
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.MsoZOrderCmd
import typingsJapgolly.activexOffice.Office.ReflectionFormat
import typingsJapgolly.activexOffice.Office.SoftEdgeFormat
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shape extends StObject {
  
  def Adjustments(Index: Double): Double = js.native
  @JSName("Adjustments")
  val Adjustments_Original: Adjustments = js.native
  
  var AlternativeText: String = js.native
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  def Apply(): Unit = js.native
  
  var AutoShapeType: MsoAutoShapeType = js.native
  
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  
  var BlackWhiteMode: MsoBlackWhiteMode = js.native
  
  def BottomRightCell(Address: String): Range = js.native
  def BottomRightCell(RowIndex: Double): Range = js.native
  def BottomRightCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("BottomRightCell")
  val BottomRightCell_Original: Range = js.native
  
  val Callout: CalloutFormat = js.native
  
  def CanvasCropBottom(Increment: Double): Unit = js.native
  
  def CanvasCropLeft(Increment: Double): Unit = js.native
  
  def CanvasCropRight(Increment: Double): Unit = js.native
  
  def CanvasCropTop(Increment: Double): Unit = js.native
  
  def CanvasItems(Index: String): typingsJapgolly.activexOffice.Office.Shape = js.native
  def CanvasItems(Index: Double): typingsJapgolly.activexOffice.Office.Shape = js.native
  @JSName("CanvasItems")
  val CanvasItems_Original: CanvasShapes = js.native
  
  val Chart: typingsJapgolly.activexExcel.Excel.Chart = js.native
  
  val Child: MsoTriState = js.native
  
  val ConnectionSiteCount: Double = js.native
  
  val Connector: MsoTriState = js.native
  
  val ConnectorFormat: typingsJapgolly.activexExcel.Excel.ConnectorFormat = js.native
  
  val ControlFormat: typingsJapgolly.activexExcel.Excel.ControlFormat = js.native
  
  def Copy(): Unit = js.native
  
  def CopyPicture(): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: XlCopyPictureFormat): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  val Diagram: typingsJapgolly.activexExcel.Excel.Diagram = js.native
  
  val DiagramNode: typingsJapgolly.activexExcel.Excel.DiagramNode = js.native
  
  val DrawingObject: Any = js.native
  
  def Duplicate(): Shape = js.native
  
  /* private */ @JSName("Excel.Shape_typekey")
  var ExcelDotShape_typekey: Shape = js.native
  
  val Fill: FillFormat = js.native
  
  def Flip(FlipCmd: MsoFlipCmd): Unit = js.native
  
  val FormControlType: XlFormControl = js.native
  
  val Glow: GlowFormat = js.native
  
  def GroupItems(Index: String): Shape = js.native
  def GroupItems(Index: Double): Shape = js.native
  @JSName("GroupItems")
  val GroupItems_Original: GroupShapes = js.native
  
  val HasChart: MsoTriState = js.native
  
  val HasDiagram: MsoTriState = js.native
  
  val HasDiagramNode: MsoTriState = js.native
  
  val HasSmartArt: MsoTriState = js.native
  
  var Height: Double = js.native
  
  val HorizontalFlip: MsoTriState = js.native
  
  val Hyperlink: typingsJapgolly.activexExcel.Excel.Hyperlink = js.native
  
  val ID: Double = js.native
  
  def IncrementLeft(Increment: Double): Unit = js.native
  
  def IncrementRotation(Increment: Double): Unit = js.native
  
  def IncrementTop(Increment: Double): Unit = js.native
  
  var Left: Double = js.native
  
  val Line: LineFormat = js.native
  
  val LinkFormat: typingsJapgolly.activexExcel.Excel.LinkFormat = js.native
  
  var LockAspectRatio: MsoTriState = js.native
  
  var Locked: Boolean = js.native
  
  var Name: String = js.native
  
  def Nodes(Index: String): ShapeNode = js.native
  def Nodes(Index: Double): ShapeNode = js.native
  @JSName("Nodes")
  val Nodes_Original: ShapeNodes = js.native
  
  val OLEFormat: typingsJapgolly.activexExcel.Excel.OLEFormat = js.native
  
  var OnAction: String = js.native
  
  val Parent: Any = js.native
  
  val ParentGroup: Shape = js.native
  
  def PickUp(): Unit = js.native
  
  val PictureFormat: typingsJapgolly.activexExcel.Excel.PictureFormat = js.native
  
  var Placement: XlPlacement = js.native
  
  val Reflection: ReflectionFormat = js.native
  
  def RerouteConnections(): Unit = js.native
  
  var Rotation: Double = js.native
  
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleHeight(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState): Unit = js.native
  def ScaleWidth(Factor: Double, RelativeToOriginalSize: MsoTriState, Scale: MsoScaleFrom): Unit = js.native
  
  val Script: typingsJapgolly.activexOffice.Office.Script = js.native
  
  def Select(): Unit = js.native
  def Select(Replace: Boolean): Unit = js.native
  
  def SetShapesDefaultProperties(): Unit = js.native
  
  val Shadow: ShadowFormat = js.native
  
  var ShapeStyle: MsoShapeStyleIndex = js.native
  
  val SmartArt: typingsJapgolly.activexOffice.Office.SmartArt = js.native
  
  val SoftEdge: SoftEdgeFormat = js.native
  
  val TextEffect: TextEffectFormat = js.native
  
  val TextFrame: typingsJapgolly.activexExcel.Excel.TextFrame = js.native
  
  val TextFrame2: typingsJapgolly.activexExcel.Excel.TextFrame2 = js.native
  
  val ThreeD: ThreeDFormat = js.native
  
  var Title: String = js.native
  
  var Top: Double = js.native
  
  def TopLeftCell(Address: String): Range = js.native
  def TopLeftCell(RowIndex: Double): Range = js.native
  def TopLeftCell(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("TopLeftCell")
  val TopLeftCell_Original: Range = js.native
  
  val Type: MsoShapeType = js.native
  
  def Ungroup(): ShapeRange = js.native
  
  val VerticalFlip: MsoTriState = js.native
  
  val Vertices: SafeArray[Double] = js.native
  
  var Visible: MsoTriState = js.native
  
  var Width: Double = js.native
  
  def ZOrder(ZOrderCmd: MsoZOrderCmd): Unit = js.native
  
  val ZOrderPosition: Double = js.native
}
