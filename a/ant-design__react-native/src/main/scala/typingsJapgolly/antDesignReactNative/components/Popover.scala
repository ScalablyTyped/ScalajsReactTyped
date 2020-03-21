package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsJapgolly.antDesignReactNative.popoverMod.PopoverProps
import typingsJapgolly.antDesignReactNative.popoverMod.default
import typingsJapgolly.antDesignReactNative.popoverStyleMod.PopoverStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Callback = null,
    overlay: VdomNode = null,
    placement: Placement | auto = null,
    renderOverlayComponent: /* node */ Node => CallbackTo[Node] = null,
    styles: Partial[PopoverStyle] = null,
    triggerStyle: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopoverProps, default, Unit, PopoverProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* node */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => onSelect(t0, t1).runNow()))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.rawNode.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (renderOverlayComponent != null) __obj.updateDynamic("renderOverlayComponent")(js.Any.fromFunction1((t0: /* node */ japgolly.scalajs.react.raw.React.Node) => renderOverlayComponent(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.popoverMod.PopoverProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.popoverMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.popoverMod.PopoverProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/popover", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

