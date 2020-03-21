package typingsJapgolly.materialUi.MaterialUI.Menus

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.origin
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownMenuProps extends js.Object {
  // <div/> is the element that gets the 'other' properties
  var anchorOrigin: js.UndefOr[origin] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[ComponentClassP[PopoverAnimationProps with js.Object]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var iconButton: js.UndefOr[Node] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var menuItemStyle: js.UndefOr[CSSProperties] = js.undefined
  var menuStyle: js.UndefOr[CSSProperties] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* e */ ReactEventFrom[js.Object with Element], 
      /* index */ Double, 
      /* menuItemValue */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ ReactEventFrom[js.Object with Element], Unit]] = js.undefined
  var openImmediately: js.UndefOr[Boolean] = js.undefined
  var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.undefined
  var selectionRenderer: js.UndefOr[js.Function2[/* value */ js.Any, /* menuItem */ js.Any, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var targetOrigin: js.UndefOr[origin] = js.undefined
  var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DropDownMenuProps {
  @scala.inline
  def apply(
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ComponentClassP[PopoverAnimationProps with js.Object] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    iconButton: VdomNode = null,
    iconStyle: CSSProperties = null,
    labelStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuItemStyle: CSSProperties = null,
    menuStyle: CSSProperties = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* e */ ReactEventFrom[js.Object with Element], /* index */ Double, /* menuItemValue */ js.Any) => Callback = null,
    onClose: /* e */ ReactEventFrom[js.Object with Element] => Callback = null,
    openImmediately: js.UndefOr[Boolean] = js.undefined,
    selectedMenuItemStyle: CSSProperties = null,
    selectionRenderer: (/* value */ js.Any, /* menuItem */ js.Any) => Callback = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    underlineStyle: CSSProperties = null,
    value: js.Any = null
  ): DropDownMenuProps = {
    val __obj = js.Dynamic.literal()
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (iconButton != null) __obj.updateDynamic("iconButton")(iconButton.rawNode.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* index */ scala.Double, t2: /* menuItemValue */ js.Any) => onChange(t0, t1, t2).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClose(t0).runNow()))
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately.asInstanceOf[js.Any])
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* menuItem */ js.Any) => selectionRenderer(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownMenuProps]
  }
}

