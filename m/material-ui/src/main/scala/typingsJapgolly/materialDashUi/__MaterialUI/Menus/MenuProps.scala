package typingsJapgolly.materialDashUi.__MaterialUI.Menus

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDashUi.__MaterialUI.ReactLink
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  // <List/> is the element that get the 'other' properties
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var desktop: js.UndefOr[Boolean] = js.undefined
  var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
  var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* e */ ReactEventFrom[js.Object with Element], 
      /* itemValue */ js.Any | js.Array[_], 
      Unit
    ]
  ] = js.undefined
  var onEscKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onItemClick: js.UndefOr[
    js.Function2[/* e */ ReactEventFrom[js.Object with Element], /* item */ MenuItem, Unit]
  ] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  var valueLink: js.UndefOr[ReactLink[_ | js.Array[_]]] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    desktop: js.UndefOr[Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* e */ ReactEventFrom[js.Object with Element], /* itemValue */ js.Any | js.Array[js.Any]) => Callback = null,
    onEscKeyDown: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onItemClick: (/* e */ ReactEventFrom[js.Object with Element], /* item */ MenuItem) => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    selectedMenuItemStyle: CSSProperties = null,
    style: CSSProperties = null,
    value: js.Any | js.Array[_] = null,
    valueLink: ReactLink[_ | js.Array[_]] = null,
    width: String | Double = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyKeyboardFocused)) __obj.updateDynamic("initiallyKeyboardFocused")(initiallyKeyboardFocused.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* itemValue */ js.Any | js.Array[js.Any]) => onChange(t0, t1).runNow()))
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onEscKeyDown(t0).runNow()))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* item */ typingsJapgolly.materialDashUi.__MaterialUI.Menus.MenuItem) => onItemClick(t0, t1).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

