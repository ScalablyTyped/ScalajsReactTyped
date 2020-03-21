package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Frames")
@js.native
class Frames protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Frames_typekey")
  var WordDotFrames_typekey: Frames = js.native
  def Add(Range: Range): Frame = js.native
  def Delete(): Unit = js.native
  def Item(Index: Double): Frame = js.native
}

