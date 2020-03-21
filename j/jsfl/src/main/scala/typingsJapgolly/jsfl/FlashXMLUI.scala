package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashXMLUI extends js.Object {
  def accept(): js.Any
  def cancel(): js.Any
  def get(): js.Any
  def getControlItemElement(): js.Any
  def getEnabled(): js.Any
  def getVisible(): js.Any
  def set(): js.Any
  def setControItemElement(): js.Any
  def setControItemElements(): js.Any
  def setEnabled(): js.Any
  def setVisible(): js.Any
}

object FlashXMLUI {
  @scala.inline
  def apply(
    accept: CallbackTo[js.Any],
    cancel: CallbackTo[js.Any],
    get: CallbackTo[js.Any],
    getControlItemElement: CallbackTo[js.Any],
    getEnabled: CallbackTo[js.Any],
    getVisible: CallbackTo[js.Any],
    set: CallbackTo[js.Any],
    setControItemElement: CallbackTo[js.Any],
    setControItemElements: CallbackTo[js.Any],
    setEnabled: CallbackTo[js.Any],
    setVisible: CallbackTo[js.Any]
  ): FlashXMLUI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(accept.toJsFn)
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getControlItemElement")(getControlItemElement.toJsFn)
    __obj.updateDynamic("getEnabled")(getEnabled.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("set")(set.toJsFn)
    __obj.updateDynamic("setControItemElement")(setControItemElement.toJsFn)
    __obj.updateDynamic("setControItemElements")(setControItemElements.toJsFn)
    __obj.updateDynamic("setEnabled")(setEnabled.toJsFn)
    __obj.updateDynamic("setVisible")(setVisible.toJsFn)
    __obj.asInstanceOf[FlashXMLUI]
  }
}

