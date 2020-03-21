package typingsJapgolly.rmcInputNumber.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcInputNumber.inputHandlerMod.PropsType
import typingsJapgolly.rmcInputNumber.inputHandlerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputHandler {
  def apply(
    prefixCls: String,
    onTouchEnd: js.Any => Callback,
    onTouchStart: js.Any => Callback,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    unselectable: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PropsType, default, Unit, PropsType] = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: js.Any) => onTouchEnd(t0).runNow()))
    __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: js.Any) => onTouchStart(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcInputNumber.inputHandlerMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcInputNumber.inputHandlerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcInputNumber.inputHandlerMod.PropsType])(children: _*)
  }
  @JSImport("rmc-input-number/lib/InputHandler", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

