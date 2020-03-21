package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexOffice.Office.MsoHorizontalAnchor
import typingsJapgolly.activexOffice.Office.MsoPathFormat
import typingsJapgolly.activexOffice.Office.MsoTextOrientation
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.MsoVerticalAnchor
import typingsJapgolly.activexOffice.Office.MsoWarpFormat
import typingsJapgolly.activexOffice.Office.TextColumn2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextFrame")
@js.native
class TextFrame protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  var AutoSize: Double = js.native
  val Column: TextColumn2 = js.native
  val ContainingRange: Range = js.native
  val Creator: Double = js.native
  val HasText: Double = js.native
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var Next: TextFrame = js.native
  var NoTextRotation: MsoTriState = js.native
  var Orientation: MsoTextOrientation = js.native
  val Overflowing: Boolean = js.native
  val Parent: Shape = js.native
  var PathFormat: MsoPathFormat = js.native
  var Previous: TextFrame = js.native
  val TextRange: Range = js.native
  val ThreeD: ThreeDFormat = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WarpFormat: MsoWarpFormat = js.native
  @JSName("Word.TextFrame_typekey")
  var WordDotTextFrame_typekey: TextFrame = js.native
  var WordWrap: Double = js.native
  def BreakForwardLink(): Unit = js.native
  def DeleteText(): Unit = js.native
  def ValidLinkTarget(TargetTextFrame: TextFrame): Boolean = js.native
}

