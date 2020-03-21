package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ListLevel")
@js.native
class ListLevel protected () extends js.Object {
  var Alignment: WdListLevelAlignment = js.native
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Font: typingsJapgolly.activexWord.Word.Font = js.native
  val Index: Double = js.native
  var LinkedStyle: String = js.native
  var NumberFormat: String = js.native
  var NumberPosition: Double = js.native
  var NumberStyle: WdListNumberStyle = js.native
  val Parent: js.Any = js.native
  val PictureBullet: InlineShape = js.native
  var ResetOnHigher: Double = js.native
  var ResetOnHigherOld: Boolean = js.native
  var StartAt: Double = js.native
  var TabPosition: Double = js.native
  var TextPosition: Double = js.native
  var TrailingCharacter: WdTrailingCharacter = js.native
  @JSName("Word.ListLevel_typekey")
  var WordDotListLevel_typekey: ListLevel = js.native
  def ApplyPictureBullet(FileName: String): InlineShape = js.native
}

