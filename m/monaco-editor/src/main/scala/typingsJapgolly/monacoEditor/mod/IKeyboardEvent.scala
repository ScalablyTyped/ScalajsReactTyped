package typingsJapgolly.monacoEditor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.monacoEditor.monacoEditorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardEvent extends js.Object {
  val _standardKeyboardEventBrand: `true`
  val altKey: Boolean
  val browserEvent: KeyboardEvent
  val code: String
  val ctrlKey: Boolean
  val keyCode: KeyCode
  val metaKey: Boolean
  val shiftKey: Boolean
  val target: HTMLElement
  def equals(keybinding: Double): Boolean
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object IKeyboardEvent {
  @scala.inline
  def apply(
    _standardKeyboardEventBrand: `true`,
    altKey: Boolean,
    browserEvent: KeyboardEvent,
    code: String,
    ctrlKey: Boolean,
    equals: Double => CallbackTo[Boolean],
    keyCode: KeyCode,
    metaKey: Boolean,
    preventDefault: Callback,
    shiftKey: Boolean,
    stopPropagation: Callback,
    target: HTMLElement
  ): IKeyboardEvent = {
    val __obj = js.Dynamic.literal(_standardKeyboardEventBrand = _standardKeyboardEventBrand.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], browserEvent = browserEvent.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: scala.Double) => equals(t0).runNow()))
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[IKeyboardEvent]
  }
}

