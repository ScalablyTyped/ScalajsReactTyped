package typingsJapgolly.reactBootstrapDaterangepicker.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.daterangepicker.daterangepickerStrings.center
import typingsJapgolly.daterangepicker.daterangepickerStrings.down
import typingsJapgolly.daterangepicker.daterangepickerStrings.left
import typingsJapgolly.daterangepicker.daterangepickerStrings.right
import typingsJapgolly.daterangepicker.daterangepickerStrings.up
import typingsJapgolly.daterangepicker.mod.DateOrString
import typingsJapgolly.daterangepicker.mod.Locale
import typingsJapgolly.moment.mod.Duration_
import typingsJapgolly.moment.mod.MomentInput
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateRangePicker {
  def apply(
    alwaysShowCalendars: js.UndefOr[Boolean] = js.undefined,
    applyButtonClasses: String = null,
    autoApply: js.UndefOr[Boolean] = js.undefined,
    autoUpdateInput: js.UndefOr[Boolean] = js.undefined,
    buttonClasses: js.Array[String] = null,
    cancelButtonClasses: String = null,
    containerClass: String = null,
    containerStyles: CSSProperties = null,
    drops: down | up = null,
    endDate: DateOrString = null,
    isCustomDate: /* date */ DateOrString => CallbackTo[js.UndefOr[String | js.Array[String]]] = null,
    isInvalidDate: (/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString]) => CallbackTo[Boolean] = null,
    linkedCalendars: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    maxDate: DateOrString = null,
    maxSpan: MomentInput | Duration_ = null,
    maxYear: Int | Double = null,
    minDate: DateOrString = null,
    minYear: Int | Double = null,
    onApply: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onCancel: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onEvent: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onHide: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onHideCalendar: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onShow: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onShowCalendar: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    opens: left | right | center = null,
    parentEl: String = null,
    ranges: StringDictionary[js.Tuple2[DateOrString, DateOrString]] = null,
    showCustomRangeLabel: js.UndefOr[Boolean] = js.undefined,
    showDropdowns: js.UndefOr[Boolean] = js.undefined,
    showISOWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    singleDatePicker: js.UndefOr[Boolean] = js.undefined,
    startDate: DateOrString = null,
    timePicker: js.UndefOr[Boolean] = js.undefined,
    timePicker24Hour: js.UndefOr[Boolean] = js.undefined,
    timePickerIncrement: Int | Double = null,
    timePickerSeconds: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    Props, 
    typingsJapgolly.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker.DateRangePicker, 
    Unit, 
    Props
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(alwaysShowCalendars)) __obj.updateDynamic("alwaysShowCalendars")(alwaysShowCalendars.asInstanceOf[js.Any])
    if (applyButtonClasses != null) __obj.updateDynamic("applyButtonClasses")(applyButtonClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdateInput)) __obj.updateDynamic("autoUpdateInput")(autoUpdateInput.asInstanceOf[js.Any])
    if (buttonClasses != null) __obj.updateDynamic("buttonClasses")(buttonClasses.asInstanceOf[js.Any])
    if (cancelButtonClasses != null) __obj.updateDynamic("cancelButtonClasses")(cancelButtonClasses.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (containerStyles != null) __obj.updateDynamic("containerStyles")(containerStyles.asInstanceOf[js.Any])
    if (drops != null) __obj.updateDynamic("drops")(drops.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (isCustomDate != null) __obj.updateDynamic("isCustomDate")(js.Any.fromFunction1((t0: /* date */ typingsJapgolly.daterangepicker.mod.DateOrString) => isCustomDate(t0).runNow()))
    if (isInvalidDate != null) __obj.updateDynamic("isInvalidDate")(js.Any.fromFunction2((t0: /* startDate */ typingsJapgolly.daterangepicker.mod.DateOrString, t1: /* endDate */ js.UndefOr[typingsJapgolly.daterangepicker.mod.DateOrString]) => isInvalidDate(t0, t1).runNow()))
    if (!js.isUndefined(linkedCalendars)) __obj.updateDynamic("linkedCalendars")(linkedCalendars.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxSpan != null) __obj.updateDynamic("maxSpan")(maxSpan.asInstanceOf[js.Any])
    if (maxYear != null) __obj.updateDynamic("maxYear")(maxYear.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minYear != null) __obj.updateDynamic("minYear")(minYear.asInstanceOf[js.Any])
    if (onApply != null) __obj.updateDynamic("onApply")(js.Any.fromFunction2((t0: /* event */ js.UndefOr[js.Any], t1: /* picker */ js.UndefOr[js.Any]) => onApply(t0, t1).runNow()))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2((t0: /* event */ js.UndefOr[js.Any], t1: /* picker */ js.UndefOr[js.Any]) => onCancel(t0, t1).runNow()))
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction2((t0: /* event */ js.UndefOr[js.Any], t1: /* picker */ js.UndefOr[js.Any]) => onEvent(t0, t1).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2((t0: /* event */ js.UndefOr[js.Any], t1: /* picker */ js.UndefOr[js.Any]) => onHide(t0, t1).runNow()))
    if (onHideCalendar != null) __obj.updateDynamic("onHideCalendar")(js.Any.fromFunction2((t0: /* event */ js.UndefOr[js.Any], t1: /* picker */ js.UndefOr[js.Any]) => onHideCalendar(t0, t1).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2((t0: /* event */ js.UndefOr[js.Any], t1: /* picker */ js.UndefOr[js.Any]) => onShow(t0, t1).runNow()))
    if (onShowCalendar != null) __obj.updateDynamic("onShowCalendar")(js.Any.fromFunction2((t0: /* event */ js.UndefOr[js.Any], t1: /* picker */ js.UndefOr[js.Any]) => onShowCalendar(t0, t1).runNow()))
    if (opens != null) __obj.updateDynamic("opens")(opens.asInstanceOf[js.Any])
    if (parentEl != null) __obj.updateDynamic("parentEl")(parentEl.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(showCustomRangeLabel)) __obj.updateDynamic("showCustomRangeLabel")(showCustomRangeLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showDropdowns)) __obj.updateDynamic("showDropdowns")(showDropdowns.asInstanceOf[js.Any])
    if (!js.isUndefined(showISOWeekNumbers)) __obj.updateDynamic("showISOWeekNumbers")(showISOWeekNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDatePicker)) __obj.updateDynamic("singleDatePicker")(singleDatePicker.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(timePicker)) __obj.updateDynamic("timePicker")(timePicker.asInstanceOf[js.Any])
    if (!js.isUndefined(timePicker24Hour)) __obj.updateDynamic("timePicker24Hour")(timePicker24Hour.asInstanceOf[js.Any])
    if (timePickerIncrement != null) __obj.updateDynamic("timePickerIncrement")(timePickerIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(timePickerSeconds)) __obj.updateDynamic("timePickerSeconds")(timePickerSeconds.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker.DateRangePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker.Props])(children: _*)
  }
  @JSGlobal("ReactBootstrapDaterangepicker.DateRangePicker")
  @js.native
  object componentImport extends js.Object
  
}

