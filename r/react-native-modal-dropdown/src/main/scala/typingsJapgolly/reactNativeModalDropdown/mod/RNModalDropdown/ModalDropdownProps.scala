package typingsJapgolly.reactNativeModalDropdown.mod.RNModalDropdown

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeModalDropdown.reactNativeModalDropdownStrings.always
import typingsJapgolly.reactNativeModalDropdown.reactNativeModalDropdownStrings.handled
import typingsJapgolly.reactNativeModalDropdown.reactNativeModalDropdownStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDropdownProps extends js.Object {
  var accessible: js.UndefOr[Boolean] = js.undefined
  var adjustFrame: js.UndefOr[js.Function1[/* positionStyle */ PositionStyle, Unit]] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
  var defaultIndex: js.UndefOr[Double] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownStyle: js.UndefOr[js.Any] = js.undefined
  var dropdownTextHighlightStyle: js.UndefOr[js.Any] = js.undefined
  var dropdownTextStyle: js.UndefOr[js.Any] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[always | never | handled] = js.undefined
  var onDropdownWillHide: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var onDropdownWillShow: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* index */ Double, /* option */ js.Any, Unit]] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var renderButtonText: js.UndefOr[js.Function1[/* text */ js.Any, _]] = js.undefined
  var renderRow: js.UndefOr[
    js.Function3[/* option */ js.Any, /* index */ Double, /* isSelected */ Boolean, _]
  ] = js.undefined
  var renderSeparator: js.UndefOr[js.Function0[_]] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var textStyle: js.UndefOr[js.Any] = js.undefined
}

object ModalDropdownProps {
  @scala.inline
  def apply(
    accessible: js.UndefOr[Boolean] = js.undefined,
    adjustFrame: /* positionStyle */ PositionStyle => Callback = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    defaultIndex: Int | Double = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownStyle: js.Any = null,
    dropdownTextHighlightStyle: js.Any = null,
    dropdownTextStyle: js.Any = null,
    keyboardShouldPersistTaps: always | never | handled = null,
    onDropdownWillHide: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    onDropdownWillShow: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    onSelect: (/* index */ Double, /* option */ js.Any) => Callback = null,
    options: js.Array[_] = null,
    renderButtonText: /* text */ js.Any => CallbackTo[js.Any] = null,
    renderRow: (/* option */ js.Any, /* index */ Double, /* isSelected */ Boolean) => CallbackTo[js.Any] = null,
    renderSeparator: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    textStyle: js.Any = null
  ): ModalDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (adjustFrame != null) __obj.updateDynamic("adjustFrame")(js.Any.fromFunction1((t0: /* positionStyle */ typingsJapgolly.reactNativeModalDropdown.mod.RNModalDropdown.PositionStyle) => adjustFrame(t0).runNow()))
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (dropdownTextHighlightStyle != null) __obj.updateDynamic("dropdownTextHighlightStyle")(dropdownTextHighlightStyle.asInstanceOf[js.Any])
    if (dropdownTextStyle != null) __obj.updateDynamic("dropdownTextStyle")(dropdownTextStyle.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    onDropdownWillHide.foreach(p => __obj.updateDynamic("onDropdownWillHide")(p.toJsFn))
    onDropdownWillShow.foreach(p => __obj.updateDynamic("onDropdownWillShow")(p.toJsFn))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* option */ js.Any) => onSelect(t0, t1).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (renderButtonText != null) __obj.updateDynamic("renderButtonText")(js.Any.fromFunction1((t0: /* text */ js.Any) => renderButtonText(t0).runNow()))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction3((t0: /* option */ js.Any, t1: /* index */ scala.Double, t2: /* isSelected */ scala.Boolean) => renderRow(t0, t1, t2).runNow()))
    renderSeparator.foreach(p => __obj.updateDynamic("renderSeparator")(p.toJsFn))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalDropdownProps]
  }
}

