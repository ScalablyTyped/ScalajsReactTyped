package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.KeysBoundTo")
@js.native
class KeysBoundTo protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Command: String = js.native
  val CommandParameter: String = js.native
  val Context: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val KeyCategory: WdKeyCategory = js.native
  val Parent: js.Any = js.native
  @JSName("Word.KeysBoundTo_typekey")
  var WordDotKeysBoundTo_typekey: KeysBoundTo = js.native
  def Item(Index: Double): KeyBinding = js.native
  def Key(KeyCode: Double): KeyBinding = js.native
  def Key(KeyCode: Double, KeyCode2: js.Any): KeyBinding = js.native
}

