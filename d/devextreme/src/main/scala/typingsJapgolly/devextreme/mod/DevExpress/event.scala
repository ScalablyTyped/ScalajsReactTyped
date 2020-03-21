package typingsJapgolly.devextreme.mod.DevExpress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.devextreme.mod.DevExpress.dxEvent
  - typingsJapgolly.devextreme.mod._Global_.JQueryEventObject
*/
trait event extends js.Object

object event {
  @scala.inline
  def dxEvent(
    currentTarget: Element,
    data: js.Any,
    delegateTarget: Element,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    preventDefault: Callback,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: Element
  ): event = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[event]
  }
  @scala.inline
  def JQueryEventObject(cancel: js.UndefOr[Boolean] = js.undefined): event = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[event]
  }
}

