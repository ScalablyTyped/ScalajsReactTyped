package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexOffice.Office.MsoArrowheadLength
import typingsJapgolly.activexOffice.Office.MsoArrowheadStyle
import typingsJapgolly.activexOffice.Office.MsoArrowheadWidth
import typingsJapgolly.activexOffice.Office.MsoLineDashStyle
import typingsJapgolly.activexOffice.Office.MsoLineStyle
import typingsJapgolly.activexOffice.Office.MsoPatternType
import typingsJapgolly.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.LineFormat")
@js.native
class LineFormat protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val BackColor: ColorFormat = js.native
  var BeginArrowheadLength: MsoArrowheadLength = js.native
  var BeginArrowheadStyle: MsoArrowheadStyle = js.native
  var BeginArrowheadWidth: MsoArrowheadWidth = js.native
  val Creator: Double = js.native
  var DashStyle: MsoLineDashStyle = js.native
  var EndArrowheadLength: MsoArrowheadLength = js.native
  var EndArrowheadStyle: MsoArrowheadStyle = js.native
  var EndArrowheadWidth: MsoArrowheadWidth = js.native
  val ForeColor: ColorFormat = js.native
  var InsetPen: MsoTriState = js.native
  val Parent: js.Any = js.native
  var Pattern: MsoPatternType = js.native
  var Style: MsoLineStyle = js.native
  var Transparency: Double = js.native
  var Visible: MsoTriState = js.native
  var Weight: Double = js.native
  @JSName("Word.LineFormat_typekey")
  var WordDotLineFormat_typekey: LineFormat = js.native
}

