package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.KeyBinding")
@js.native
class KeyBinding protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Command: String = js.native
  val CommandParameter: String = js.native
  val Context: js.Any = js.native
  val Creator: Double = js.native
  val KeyCategory: WdKeyCategory = js.native
  val KeyCode: Double = js.native
  val KeyCode2: Double = js.native
  val KeyString: String = js.native
  val Parent: js.Any = js.native
  val Protected: Boolean = js.native
  @JSName("Word.KeyBinding_typekey")
  var WordDotKeyBinding_typekey: KeyBinding = js.native
  def Clear(): Unit = js.native
  def Disable(): Unit = js.native
  def Execute(): Unit = js.native
  def Rebind(KeyCategory: WdKeyCategory, Command: String): Unit = js.native
  def Rebind(KeyCategory: WdKeyCategory, Command: String, CommandParameter: js.Any): Unit = js.native
}

