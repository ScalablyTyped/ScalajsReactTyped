package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.InlineShape")
@js.native
class InlineShape protected () extends js.Object {
  var AlternativeText: String = js.native
  val AnchorID: Double = js.native
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  var Borders: typingsJapgolly.activexWord.Word.Borders = js.native
  val Chart: typingsJapgolly.activexWord.Word.Chart = js.native
  val Creator: Double = js.native
  val EditID: Double = js.native
  val Field: typingsJapgolly.activexWord.Word.Field = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val GroupItems: GroupShapes = js.native
  val HasChart: MsoTriState = js.native
  val HasSmartArt: MsoTriState = js.native
  var Height: Double = js.native
  val HorizontalLineFormat: typingsJapgolly.activexWord.Word.HorizontalLineFormat = js.native
  val Hyperlink: typingsJapgolly.activexWord.Word.Hyperlink = js.native
  val IsPictureBullet: Boolean = js.native
  val Line: LineFormat = js.native
  val LinkFormat: typingsJapgolly.activexWord.Word.LinkFormat = js.native
  var LockAspectRatio: MsoTriState = js.native
  val OLEFormat: typingsJapgolly.activexWord.Word.OLEFormat = js.native
  val OWSAnchor: Double = js.native
  val Parent: js.Any = js.native
  var PictureFormat: typingsJapgolly.activexWord.Word.PictureFormat = js.native
  val Range: typingsJapgolly.activexWord.Word.Range = js.native
  val Reflection: ReflectionFormat = js.native
  var ScaleHeight: Double = js.native
  var ScaleWidth: Double = js.native
  val Script: typingsJapgolly.activexOffice.Office.Script = js.native
  val Shadow: ShadowFormat = js.native
  val SmartArt: typingsJapgolly.activexOffice.Office.SmartArt = js.native
  val SoftEdge: SoftEdgeFormat = js.native
  var TextEffect: TextEffectFormat = js.native
  var Title: String = js.native
  val Type: WdInlineShapeType = js.native
  var Width: Double = js.native
  @JSName("Word.InlineShape_typekey")
  var WordDotInlineShape_typekey: InlineShape = js.native
  def Activate(): Unit = js.native
  def ConvertToShape(): Shape = js.native
  def Delete(): Unit = js.native
  def Reset(): Unit = js.native
  def Select(): Unit = js.native
}

