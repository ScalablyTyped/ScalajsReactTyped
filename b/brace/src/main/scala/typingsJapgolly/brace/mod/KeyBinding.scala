package typingsJapgolly.brace.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinding extends js.Object {
  def addKeyboardHandler(kb: js.Any, pos: js.Any): Unit
  def getKeyboardHandler(): js.Any
  def onCommandKey(e: js.Any, hashId: js.Any, keyCode: js.Any): Unit
  def onTextInput(text: js.Any): Unit
  def removeKeyboardHandler(kb: js.Any): Boolean
  def setDefaultHandler(kb: js.Any): Unit
  def setKeyboardHandler(kb: js.Any): Unit
}

object KeyBinding {
  @scala.inline
  def apply(
    addKeyboardHandler: (js.Any, js.Any) => Callback,
    getKeyboardHandler: CallbackTo[js.Any],
    onCommandKey: (js.Any, js.Any, js.Any) => Callback,
    onTextInput: js.Any => Callback,
    removeKeyboardHandler: js.Any => CallbackTo[Boolean],
    setDefaultHandler: js.Any => Callback,
    setKeyboardHandler: js.Any => Callback
  ): KeyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addKeyboardHandler")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => addKeyboardHandler(t0, t1).runNow()))
    __obj.updateDynamic("getKeyboardHandler")(getKeyboardHandler.toJsFn)
    __obj.updateDynamic("onCommandKey")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => onCommandKey(t0, t1, t2).runNow()))
    __obj.updateDynamic("onTextInput")(js.Any.fromFunction1((t0: js.Any) => onTextInput(t0).runNow()))
    __obj.updateDynamic("removeKeyboardHandler")(js.Any.fromFunction1((t0: js.Any) => removeKeyboardHandler(t0).runNow()))
    __obj.updateDynamic("setDefaultHandler")(js.Any.fromFunction1((t0: js.Any) => setDefaultHandler(t0).runNow()))
    __obj.updateDynamic("setKeyboardHandler")(js.Any.fromFunction1((t0: js.Any) => setKeyboardHandler(t0).runNow()))
    __obj.asInstanceOf[KeyBinding]
  }
}

