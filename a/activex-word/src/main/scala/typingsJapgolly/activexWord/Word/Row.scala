package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Row")
@js.native
class Row protected () extends js.Object {
  var Alignment: WdRowAlignment = js.native
  var AllowBreakAcrossPages: Double = js.native
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  var Borders: typingsJapgolly.activexWord.Word.Borders = js.native
  val Cells: typingsJapgolly.activexWord.Word.Cells = js.native
  val Creator: Double = js.native
  var HeadingFormat: Double = js.native
  var Height: Double = js.native
  var HeightRule: WdRowHeightRule = js.native
  var ID: String = js.native
  val Index: Double = js.native
  val IsFirst: Boolean = js.native
  val IsLast: Boolean = js.native
  var LeftIndent: Double = js.native
  val NestingLevel: Double = js.native
  val Next: Row = js.native
  val Parent: js.Any = js.native
  val Previous: Row = js.native
  val Range: typingsJapgolly.activexWord.Word.Range = js.native
  val Shading: typingsJapgolly.activexWord.Word.Shading = js.native
  var SpaceBetweenColumns: Double = js.native
  @JSName("Word.Row_typekey")
  var WordDotRow_typekey: Row = js.native
  def ConvertToText(): typingsJapgolly.activexWord.Word.Range = js.native
  def ConvertToText(Separator: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def ConvertToText(Separator: js.Any, NestedTables: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def ConvertToTextOld(): typingsJapgolly.activexWord.Word.Range = js.native
  def ConvertToTextOld(Separator: js.Any): typingsJapgolly.activexWord.Word.Range = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
  def SetHeight(RowHeight: Double, HeightRule: WdRowHeightRule): Unit = js.native
  def SetLeftIndent(LeftIndent: Double, RulerStyle: WdRulerStyle): Unit = js.native
}

