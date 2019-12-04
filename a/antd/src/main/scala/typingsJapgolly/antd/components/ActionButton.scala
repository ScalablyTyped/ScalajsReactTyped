package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libButtonButtonMod.ButtonType
import typingsJapgolly.antd.libButtonButtonMod.NativeButtonProps
import typingsJapgolly.antd.libModalActionButtonMod.ActionButtonProps
import typingsJapgolly.antd.libModalActionButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionButton {
  def apply(
    closeModal: js.Function,
    actionFn: /* repeated */ js.Any => CallbackTo[js.Any | js.Thenable[js.Any]] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    buttonProps: NativeButtonProps = null,
    `type`: ButtonType = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ActionButtonProps, default, Unit, ActionButtonProps] = {
    val __obj = js.Dynamic.literal(closeModal = closeModal.asInstanceOf[js.Any])
  
      if (actionFn != null) __obj.updateDynamic("actionFn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => actionFn(t0).runNow()))
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libModalActionButtonMod.ActionButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libModalActionButtonMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libModalActionButtonMod.ActionButtonProps])(children: _*)
  }
  @JSImport("antd/lib/modal/ActionButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

