package typingsJapgolly.rmcInputNumber.inputHandlerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var prefixCls: String
  var role: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[Boolean] = js.undefined
  def onTouchEnd(e: js.Any): Unit
  def onTouchStart(e: js.Any): Unit
}

object PropsType {
  @scala.inline
  def apply(
    onTouchEnd: js.Any => Callback,
    onTouchStart: js.Any => Callback,
    prefixCls: String,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    unselectable: js.UndefOr[Boolean] = js.undefined
  ): PropsType = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: js.Any) => onTouchEnd(t0).runNow()))
    __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: js.Any) => onTouchStart(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

