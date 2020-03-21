package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoTextEntries")
@js.native
class AutoTextEntries protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.AutoTextEntries_typekey")
  var WordDotAutoTextEntries_typekey: AutoTextEntries = js.native
  def Add(Name: String, Range: Range): AutoTextEntry = js.native
  def AppendToSpike(Range: Range): AutoTextEntry = js.native
  def Item(Index: js.Any): AutoTextEntry = js.native
}

