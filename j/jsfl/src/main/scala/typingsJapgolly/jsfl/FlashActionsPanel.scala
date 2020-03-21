package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashActionsPanel extends js.Object {
  def getClassForObject(): js.Any
  def getScriptAssistMode(): js.Any
  def getSelectedText(): js.Any
  def getText(): js.Any
  def hasSelection(): js.Any
  def replaceSelectedText(): js.Any
  def setScriptAssistMode(): js.Any
  def setSelection(): js.Any
  def setText(): js.Any
}

object FlashActionsPanel {
  @scala.inline
  def apply(
    getClassForObject: CallbackTo[js.Any],
    getScriptAssistMode: CallbackTo[js.Any],
    getSelectedText: CallbackTo[js.Any],
    getText: CallbackTo[js.Any],
    hasSelection: CallbackTo[js.Any],
    replaceSelectedText: CallbackTo[js.Any],
    setScriptAssistMode: CallbackTo[js.Any],
    setSelection: CallbackTo[js.Any],
    setText: CallbackTo[js.Any]
  ): FlashActionsPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getClassForObject")(getClassForObject.toJsFn)
    __obj.updateDynamic("getScriptAssistMode")(getScriptAssistMode.toJsFn)
    __obj.updateDynamic("getSelectedText")(getSelectedText.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("hasSelection")(hasSelection.toJsFn)
    __obj.updateDynamic("replaceSelectedText")(replaceSelectedText.toJsFn)
    __obj.updateDynamic("setScriptAssistMode")(setScriptAssistMode.toJsFn)
    __obj.updateDynamic("setSelection")(setSelection.toJsFn)
    __obj.updateDynamic("setText")(setText.toJsFn)
    __obj.asInstanceOf[FlashActionsPanel]
  }
}

