package typingsJapgolly.antDesignReactNative.popoverMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.popoverStyleMod.PopoverStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends WithThemeStyles[PopoverStyle] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* node */ js.Any, /* index */ js.UndefOr[Double], Unit]] = js.undefined
  var overlay: Node
  var placement: js.UndefOr[Placement | auto] = js.undefined
  var renderOverlayComponent: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.undefined
  var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Callback = null,
    overlay: VdomNode = null,
    placement: Placement | auto = null,
    renderOverlayComponent: /* node */ Node => CallbackTo[Node] = null,
    styles: Partial[PopoverStyle] = null,
    triggerStyle: StyleProp[ViewStyle] = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* node */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => onSelect(t0, t1).runNow()))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.rawNode.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (renderOverlayComponent != null) __obj.updateDynamic("renderOverlayComponent")(js.Any.fromFunction1((t0: /* node */ japgolly.scalajs.react.raw.React.Node) => renderOverlayComponent(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

