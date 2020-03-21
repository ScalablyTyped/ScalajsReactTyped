package typingsJapgolly.materialUi.MaterialUI.DatePicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.AnonCall
import typingsJapgolly.materialUi.MaterialUI.propTypes.utils
import typingsJapgolly.materialUi.materialUiStrings.`inline`
import typingsJapgolly.materialUi.materialUiStrings.dialog
import typingsJapgolly.materialUi.materialUiStrings.landscape
import typingsJapgolly.materialUi.materialUiStrings.portrait
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  // <TextField/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[AnonCall] = js.undefined
  var autoOk: js.UndefOr[Boolean] = js.undefined
  var cancelLabel: js.UndefOr[Node] = js.undefined
  // From <TextField />
  var className: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[dialog | `inline`] = js.undefined
  var defaultDate: js.UndefOr[js.Date] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var dialogContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var disableYearSelection: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorStyle: js.UndefOr[CSSProperties] = js.undefined
  var errorText: js.UndefOr[Node] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.undefined
  var floatingLabelText: js.UndefOr[Node] = js.undefined
  var formatDate: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var hideCalendarDate: js.UndefOr[Boolean] = js.undefined
  var hintStyle: js.UndefOr[CSSProperties] = js.undefined
  var hintText: js.UndefOr[Node] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var mode: js.UndefOr[portrait | landscape] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var okLabel: js.UndefOr[Node] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* e */ js.Any, /* date */ js.Date, Unit]] = js.undefined
  var onClick: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
   // e is always null
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var openToYearSelection: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsMax: js.UndefOr[Double] = js.undefined
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var textFieldStyle: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineShow: js.UndefOr[Boolean] = js.undefined
  var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
  var utils: js.UndefOr[typingsJapgolly.materialUi.MaterialUI.propTypes.utils] = js.undefined
  var value: js.UndefOr[js.Date] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    DateTimeFormat: AnonCall = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: VdomNode = null,
    className: String = null,
    container: dialog | `inline` = null,
    defaultDate: js.Date = null,
    defaultValue: String = null,
    dialogContainerStyle: CSSProperties = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: VdomNode = null,
    firstDayOfWeek: Int | Double = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: VdomNode = null,
    formatDate: /* date */ js.Date => CallbackTo[String] = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hideCalendarDate: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: VdomNode = null,
    id: String = null,
    inputStyle: CSSProperties = null,
    locale: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    mode: portrait | landscape = null,
    name: String = null,
    okLabel: VdomNode = null,
    onBlur: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    onChange: (/* e */ js.Any, /* date */ js.Date) => Callback = null,
    onClick: ReactTouchEventFrom[js.Object with Element] => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onFocus: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[js.Object with Element] => Callback = null,
    onShow: js.UndefOr[Callback] = js.undefined,
    openToYearSelection: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    rowsMax: Int | Double = null,
    shouldDisableDate: /* day */ js.Date => CallbackTo[Boolean] = null,
    style: CSSProperties = null,
    textFieldStyle: CSSProperties = null,
    `type`: String = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    utils: utils = null,
    value: js.Date = null
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dialogContainerStyle != null) __obj.updateDynamic("dialogContainerStyle")(dialogContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.rawNode.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle.asInstanceOf[js.Any])
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.rawNode.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction1((t0: /* date */ js.Date) => formatDate(t0).runNow()))
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCalendarDate)) __obj.updateDynamic("hideCalendarDate")(hideCalendarDate.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.rawNode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.rawNode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* date */ js.Date) => onChange(t0, t1).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (!js.isUndefined(openToYearSelection)) __obj.updateDynamic("openToYearSelection")(openToYearSelection.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1((t0: /* day */ js.Date) => shouldDisableDate(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle.asInstanceOf[js.Any])
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (utils != null) __obj.updateDynamic("utils")(utils.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProps]
  }
}

