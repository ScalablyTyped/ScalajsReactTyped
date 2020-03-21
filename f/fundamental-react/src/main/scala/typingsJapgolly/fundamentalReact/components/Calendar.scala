package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.AnonDay1Sun
import typingsJapgolly.fundamentalReact.calendarMod.CalendarProps
import typingsJapgolly.fundamentalReact.calendarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    blockedDates: js.Array[js.Date] = null,
    customStyles: StringDictionary[js.Any] = null,
    disableAfterDate: js.Date = null,
    disableBeforeDate: js.Date = null,
    disableFutureDates: js.UndefOr[Boolean] = js.undefined,
    disablePastDates: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disableWeekday: js.Array[String] = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    disabledDates: js.Array[js.Date] = null,
    localizedText: AnonDay1Sun = null,
    monthListProps: StringDictionary[js.Any] = null,
    onChange: /* date */ js.Date => Callback = null,
    tableBodyProps: StringDictionary[js.Any] = null,
    tableHeaderProps: StringDictionary[js.Any] = null,
    tableProps: StringDictionary[js.Any] = null,
    yearListProps: StringDictionary[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CalendarProps, default, Unit, CalendarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (blockedDates != null) __obj.updateDynamic("blockedDates")(blockedDates.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (disableAfterDate != null) __obj.updateDynamic("disableAfterDate")(disableAfterDate.asInstanceOf[js.Any])
    if (disableBeforeDate != null) __obj.updateDynamic("disableBeforeDate")(disableBeforeDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFutureDates)) __obj.updateDynamic("disableFutureDates")(disableFutureDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePastDates)) __obj.updateDynamic("disablePastDates")(disablePastDates.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disableWeekday != null) __obj.updateDynamic("disableWeekday")(disableWeekday.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (monthListProps != null) __obj.updateDynamic("monthListProps")(monthListProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* date */ js.Date) => onChange(t0).runNow()))
    if (tableBodyProps != null) __obj.updateDynamic("tableBodyProps")(tableBodyProps.asInstanceOf[js.Any])
    if (tableHeaderProps != null) __obj.updateDynamic("tableHeaderProps")(tableHeaderProps.asInstanceOf[js.Any])
    if (tableProps != null) __obj.updateDynamic("tableProps")(tableProps.asInstanceOf[js.Any])
    if (yearListProps != null) __obj.updateDynamic("yearListProps")(yearListProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fundamentalReact.calendarMod.CalendarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fundamentalReact.calendarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.calendarMod.CalendarProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/Calendar/Calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

