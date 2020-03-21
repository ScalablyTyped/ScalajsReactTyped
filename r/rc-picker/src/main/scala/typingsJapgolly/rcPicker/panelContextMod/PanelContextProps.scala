package typingsJapgolly.rcPicker.panelContextMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.rcPicker.interfaceMod.OnSelect
import typingsJapgolly.rcPicker.rcPickerStrings.key
import typingsJapgolly.rcPicker.rcPickerStrings.mouse
import typingsJapgolly.rcPicker.rcPickerStrings.submit
import typingsJapgolly.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelContextProps extends js.Object {
  /** Only used for TimePicker and this is a deprecated prop */
  var defaultOpenValue: js.UndefOr[js.Any] = js.undefined
  /** Only work with time panel */
  var hideHeader: js.UndefOr[Boolean] = js.undefined
  var hideNextBtn: js.UndefOr[Boolean] = js.undefined
  var hidePrevBtn: js.UndefOr[Boolean] = js.undefined
  var hideRanges: js.UndefOr[Boolean] = js.undefined
  var onDateMouseEnter: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.undefined
  var onDateMouseLeave: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.undefined
  var onSelect: js.UndefOr[OnSelect[_]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var operationRef: js.UndefOr[MutableRefObject[ContextOperationRefProps | Null]] = js.undefined
  var panelRef: js.UndefOr[Ref] = js.undefined
}

object PanelContextProps {
  @scala.inline
  def apply(
    defaultOpenValue: js.Any = null,
    hideHeader: js.UndefOr[Boolean] = js.undefined,
    hideNextBtn: js.UndefOr[Boolean] = js.undefined,
    hidePrevBtn: js.UndefOr[Boolean] = js.undefined,
    hideRanges: js.UndefOr[Boolean] = js.undefined,
    onDateMouseEnter: /* date */ js.Any => Callback = null,
    onDateMouseLeave: /* date */ js.Any => Callback = null,
    onSelect: (js.Any, /* type */ key | mouse | submit) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    operationRef: MutableRefObject[ContextOperationRefProps | Null] = null,
    panelRef: Ref = null
  ): PanelContextProps = {
    val __obj = js.Dynamic.literal()
    if (defaultOpenValue != null) __obj.updateDynamic("defaultOpenValue")(defaultOpenValue.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHeader)) __obj.updateDynamic("hideHeader")(hideHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNextBtn)) __obj.updateDynamic("hideNextBtn")(hideNextBtn.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePrevBtn)) __obj.updateDynamic("hidePrevBtn")(hidePrevBtn.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRanges)) __obj.updateDynamic("hideRanges")(hideRanges.asInstanceOf[js.Any])
    if (onDateMouseEnter != null) __obj.updateDynamic("onDateMouseEnter")(js.Any.fromFunction1((t0: /* date */ js.Any) => onDateMouseEnter(t0).runNow()))
    if (onDateMouseLeave != null) __obj.updateDynamic("onDateMouseLeave")(js.Any.fromFunction1((t0: /* date */ js.Any) => onDateMouseLeave(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: js.Any, t1: /* type */ typingsJapgolly.rcPicker.rcPickerStrings.key | typingsJapgolly.rcPicker.rcPickerStrings.mouse | typingsJapgolly.rcPicker.rcPickerStrings.submit) => onSelect(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (operationRef != null) __obj.updateDynamic("operationRef")(operationRef.asInstanceOf[js.Any])
    if (panelRef != null) __obj.updateDynamic("panelRef")(panelRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelContextProps]
  }
}

