package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.wixStyleReact.buttonMod.ButtonPriority
import typingsJapgolly.wixStyleReact.buttonMod.ButtonProps
import typingsJapgolly.wixStyleReact.buttonMod.ButtonSize
import typingsJapgolly.wixStyleReact.buttonMod.ButtonSkin
import typingsJapgolly.wixStyleReact.buttonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  def apply(
    as: js.Any = null,
    className: String = null,
    dataHook: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    onClick: ReactMouseEventFrom[HTMLElement] => Callback = null,
    prefixIcon: VdomElement = null,
    priority: ButtonPriority = null,
    size: ButtonSize = null,
    skin: ButtonSkin = null,
    suffixIcon: VdomElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ButtonProps, default, Unit, ButtonProps] = {
    val __obj = js.Dynamic.literal()
  
      if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataHook != null) __obj.updateDynamic("dataHook")(dataHook.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (prefixIcon != null) __obj.updateDynamic("prefixIcon")(prefixIcon.rawElement.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.rawElement.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.wixStyleReact.buttonMod.ButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.wixStyleReact.buttonMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.wixStyleReact.buttonMod.ButtonProps])(children: _*)
  }
  @JSImport("wix-style-react/Button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

