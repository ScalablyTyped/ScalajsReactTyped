package typingsJapgolly.jsonEditor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditor")
@js.native
class JSONEditor[TValue] protected () extends js.Object {
  def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def getEditor(name: String): JSONEditor[TValue] = js.native
  def getValue(): TValue = js.native
  def isEnabled(): Boolean = js.native
  def off(event: String, fn: js.Function): JSONEditor[TValue] = js.native
  def on(event: String, fn: js.Function): JSONEditor[TValue] = js.native
  def setValue(value: TValue): Unit = js.native
  def unwatch(event: String, fn: js.Function): JSONEditor[TValue] = js.native
  def validate(): js.Array[JSONEditorError] = js.native
  def validate(value: TValue): js.Array[JSONEditorError] = js.native
  def watch(event: String, fn: js.Function): JSONEditor[TValue] = js.native
}

/* static members */
@JSGlobal("JSONEditor")
@js.native
object JSONEditor extends js.Object {
  var defaults: AnonCustomvalidators = js.native
  var plugins: AnonAce = js.native
}

