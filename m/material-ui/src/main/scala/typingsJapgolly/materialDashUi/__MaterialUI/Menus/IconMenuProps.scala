package typingsJapgolly.materialDashUi.__MaterialUI.Menus

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialDashUi.__MaterialUI.propTypes.origin
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconMenuProps extends js.Object {
  // <Menu/> is the element that get the 'other' properties
  var anchorOrigin: js.UndefOr[origin] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[ComponentClassP[PopoverAnimationProps with js.Object]] = js.undefined
  // Other properties from <Menu/>
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clickCloseDelay: js.UndefOr[Double] = js.undefined
  var desktop: js.UndefOr[Boolean] = js.undefined
  var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
  var iconButtonElement: Element
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var menuStyle: js.UndefOr[CSSProperties] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* e */ ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], 
      /* itemValue */ js.Any | js.Array[_], 
      Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* e */ ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], Unit]
  ] = js.undefined
  var onItemClick: js.UndefOr[
    js.Function2[
      /* e */ ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], 
      /* item */ MenuItem, 
      Unit
    ]
  ] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[
      /* e */ ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element], 
      /* isKeyboardFocused */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var targetOrigin: js.UndefOr[origin] = js.undefined
  var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[js.Any | js.Array[_]] = js.undefined
}

object IconMenuProps {
  @scala.inline
  def apply(
    iconButtonElement: VdomElement,
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ComponentClassP[PopoverAnimationProps with js.Object] = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clickCloseDelay: Int | Double = null,
    desktop: js.UndefOr[Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    iconStyle: CSSProperties = null,
    initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuStyle: CSSProperties = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* e */ ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], /* itemValue */ js.Any | js.Array[js.Any]) => Callback = null,
    onClick: /* e */ ReactEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onItemClick: (/* e */ ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], /* item */ MenuItem) => Callback = null,
    onKeyboardFocus: (/* e */ ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element], /* isKeyboardFocused */ Boolean) => Callback = null,
    onMouseDown: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseEnter: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseLeave: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onMouseUp: ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element] => Callback = null,
    onRequestChange: (/* opening */ Boolean, /* reason */ String) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined,
    value: js.Any | js.Array[_] = null
  ): IconMenuProps = {
    val __obj = js.Dynamic.literal()
    if (iconButtonElement != null) __obj.updateDynamic("iconButtonElement")(iconButtonElement.rawElement.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clickCloseDelay != null) __obj.updateDynamic("clickCloseDelay")(clickCloseDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyKeyboardFocused)) __obj.updateDynamic("initiallyKeyboardFocused")(initiallyKeyboardFocused.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* itemValue */ js.Any | js.Array[js.Any]) => onChange(t0, t1).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* item */ typingsJapgolly.materialDashUi.__MaterialUI.Menus.MenuItem) => onItemClick(t0, t1).runNow()))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* isKeyboardFocused */ scala.Boolean) => onKeyboardFocus(t0, t1).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onMouseUp(t0).runNow()))
    if (onRequestChange != null) __obj.updateDynamic("onRequestChange")(js.Any.fromFunction2((t0: /* opening */ scala.Boolean, t1: /* reason */ java.lang.String) => onRequestChange(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconMenuProps]
  }
}

