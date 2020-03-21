package typingsJapgolly.antdMobileRn.popoverIndexNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobileRn.popoverPropsTypeMod.PopoverPropsType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends PopoverPropsType {
  var contextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var renderOverlayComponent: js.UndefOr[js.Function1[/* values */ js.Any, Element]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    contextStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Callback = null,
    overlay: VdomNode = null,
    overlayStyle: StyleProp[ViewStyle] = null,
    renderOverlayComponent: /* values */ js.Any => CallbackTo[Element] = null,
    style: StyleProp[ViewStyle] = null,
    triggerStyle: StyleProp[ViewStyle] = null
  ): PopoverProps = {
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
    __obj.asInstanceOf[PopoverProps]
  }
}

