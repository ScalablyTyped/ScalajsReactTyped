package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.blueprintjsCore.hotkeyMod.IHotkeyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hotkey {
  def apply(
    combo: String,
    label: String,
    allowInInput: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    onKeyDown: /* e */ KeyboardEvent => CallbackTo[js.Any] = null,
    onKeyUp: /* e */ KeyboardEvent => CallbackTo[js.Any] = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IHotkeyProps, typingsJapgolly.blueprintjsCore.mod.Hotkey, Unit, IHotkeyProps] = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
      if (!js.isUndefined(allowInInput)) __obj.updateDynamic("allowInInput")(allowInInput.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.KeyboardEvent) => onKeyUp(t0).runNow()))
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.hotkeyMod.IHotkeyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.Hotkey](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.hotkeyMod.IHotkeyProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Hotkey")
  @js.native
  object componentImport extends js.Object
  
}

