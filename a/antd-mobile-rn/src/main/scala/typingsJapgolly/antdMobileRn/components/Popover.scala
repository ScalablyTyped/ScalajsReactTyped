package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.popoverIndexNativeMod.PopoverProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  def apply(
    contextStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Callback = null,
    overlay: VdomNode = null,
    overlayStyle: StyleProp[ViewStyle] = null,
    renderOverlayComponent: /* values */ js.Any => CallbackTo[Element] = null,
    style: StyleProp[ViewStyle] = null,
    triggerStyle: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopoverProps, typingsJapgolly.antdMobileRn.mod.Popover, Unit, PopoverProps] = {
    val __obj = js.Dynamic.literal()
  
      if (contextStyle != null) __obj.updateDynamic("contextStyle")(contextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* node */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => onSelect(t0, t1).runNow()))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.rawNode.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (renderOverlayComponent != null) __obj.updateDynamic("renderOverlayComponent")(js.Any.fromFunction1((t0: /* values */ js.Any) => renderOverlayComponent(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.popoverIndexNativeMod.PopoverProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.Popover](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.popoverIndexNativeMod.PopoverProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "Popover")
  @js.native
  object componentImport extends js.Object
  
}

