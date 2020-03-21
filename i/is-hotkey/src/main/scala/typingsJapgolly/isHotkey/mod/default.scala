package typingsJapgolly.isHotkey.mod

import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-hotkey", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: typingsJapgolly.std.KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: typingsJapgolly.std.KeyboardEvent, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: typingsJapgolly.std.KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: typingsJapgolly.std.KeyboardEvent, event: KeyboardEvent): Boolean = js.native
}

