package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoHorizontalAnchor
import typingsJapgolly.activexOffice.Office.MsoTextOrientation
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.MsoVerticalAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TextFrame")
@js.native
class TextFrame protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoSize: PpAutoSize = js.native
  val Creator: Double = js.native
  val HasText: MsoTriState = js.native
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var Orientation: MsoTextOrientation = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TextFrame_typekey")
  var PowerPointDotTextFrame_typekey: TextFrame = js.native
  val Ruler: typingsJapgolly.activexPowerpoint.PowerPoint.Ruler = js.native
  val TextRange: typingsJapgolly.activexPowerpoint.PowerPoint.TextRange = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WordWrap: MsoTriState = js.native
  def DeleteText(): Unit = js.native
}

