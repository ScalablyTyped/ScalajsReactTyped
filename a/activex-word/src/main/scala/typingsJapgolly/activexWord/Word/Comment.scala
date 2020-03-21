package typingsJapgolly.activexWord.Word

import typingsJapgolly.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Comment")
@js.native
class Comment protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  var Author: String = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val Index: Double = js.native
  var Initial: String = js.native
  val IsInk: Boolean = js.native
  val Parent: js.Any = js.native
  val Range: typingsJapgolly.activexWord.Word.Range = js.native
  val Reference: typingsJapgolly.activexWord.Word.Range = js.native
  val Scope: typingsJapgolly.activexWord.Word.Range = js.native
  var ShowTip: Boolean = js.native
  @JSName("Word.Comment_typekey")
  var WordDotComment_typekey: Comment = js.native
  def Delete(): Unit = js.native
  def Edit(): Unit = js.native
}

