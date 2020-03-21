package typingsJapgolly.reactDayPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.SFC
import typingsJapgolly.reactDayPicker.AnonNextMonth
import typingsJapgolly.reactDayPicker.PartialModifiers
import typingsJapgolly.reactDayPicker.commonMod.ClassNames
import typingsJapgolly.reactDayPicker.commonMod.DayModifiers
import typingsJapgolly.reactDayPicker.commonMod.Modifier
import typingsJapgolly.reactDayPicker.propsMod.CaptionElementProps
import typingsJapgolly.reactDayPicker.propsMod.DayPickerProps
import typingsJapgolly.reactDayPicker.propsMod.NavbarElementProps
import typingsJapgolly.reactDayPicker.propsMod.WeekdayElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DayPickerProps1932505023[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    canChangeMonth: js.UndefOr[Boolean] = js.undefined,
    captionElement: Element | (ComponentClassP[CaptionElementProps with js.Object]) | SFC[CaptionElementProps] = null,
    className: String = null,
    classNames: ClassNames = null,
    containerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = null,
    dir: String = null,
    disabledDays: Modifier | js.Array[Modifier] = null,
    enableOutsideDaysClick: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: Int | Double = null,
    fixedWeeks: js.UndefOr[Boolean] = js.undefined,
    fromMonth: js.Date = null,
    initialMonth: js.Date = null,
    labels: AnonNextMonth = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    modifiers: PartialModifiers = null,
    modifiersStyles: js.Object = null,
    month: js.Date = null,
    months: js.Array[String] = null,
    navbarElement: Element | (ComponentClassP[NavbarElementProps with js.Object]) | SFC[NavbarElementProps] = null,
    numberOfMonths: Int | Double = null,
    onBlur: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onCaptionClick: (/* month */ js.Date, /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onDayClick: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onDayKeyDown: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ ReactKeyboardEventFrom[HTMLDivElement]) => Callback = null,
    onDayMouseDown: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onDayMouseEnter: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onDayMouseLeave: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onDayMouseUp: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    onDayTouchEnd: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ ReactTouchEventFrom[HTMLDivElement]) => Callback = null,
    onDayTouchStart: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ ReactTouchEventFrom[HTMLDivElement]) => Callback = null,
    onFocus: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback = null,
    onKeyDown: /* e */ ReactKeyboardEventFrom[HTMLDivElement] => Callback = null,
    onMonthChange: /* month */ js.Date => Callback = null,
    onTodayButtonClick: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ ReactMouseEventFrom[HTMLButtonElement]) => Callback = null,
    onWeekClick: (/* weekNumber */ Double, /* days */ js.Array[js.Date], /* e */ ReactMouseEventFrom[HTMLDivElement]) => Callback = null,
    pagedNavigation: js.UndefOr[Boolean] = js.undefined,
    renderDay: (/* date */ js.Date, /* modifiers */ DayModifiers) => CallbackTo[Node] = null,
    renderWeek: (/* weekNumber */ Double, /* week */ js.Array[js.Date], /* month */ js.Date) => CallbackTo[Node] = null,
    reverseMonths: js.UndefOr[Boolean] = js.undefined,
    selectedDays: Modifier | js.Array[Modifier] = null,
    showOutsideDays: js.UndefOr[Boolean] = js.undefined,
    showWeekDays: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    toMonth: js.Date = null,
    todayButton: String = null,
    weekdayElement: Element | (ComponentClassP[WeekdayElementProps with js.Object]) | SFC[WeekdayElementProps] = null,
    weekdaysLong: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DayPickerProps, ComponentRef, Unit, DayPickerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(canChangeMonth)) __obj.updateDynamic("canChangeMonth")(canChangeMonth.asInstanceOf[js.Any])
    if (captionElement != null) __obj.updateDynamic("captionElement")(captionElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOutsideDaysClick)) __obj.updateDynamic("enableOutsideDaysClick")(enableOutsideDaysClick.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWeeks)) __obj.updateDynamic("fixedWeeks")(fixedWeeks.asInstanceOf[js.Any])
    if (fromMonth != null) __obj.updateDynamic("fromMonth")(fromMonth.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (modifiersStyles != null) __obj.updateDynamic("modifiersStyles")(modifiersStyles.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (navbarElement != null) __obj.updateDynamic("navbarElement")(navbarElement.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBlur(t0).runNow()))
    if (onCaptionClick != null) __obj.updateDynamic("onCaptionClick")(js.Any.fromFunction2((t0: /* month */ js.Date, t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onCaptionClick(t0, t1).runNow()))
    if (onDayClick != null) __obj.updateDynamic("onDayClick")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDayClick(t0, t1, t2).runNow()))
    if (onDayKeyDown != null) __obj.updateDynamic("onDayKeyDown")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* e */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDayKeyDown(t0, t1, t2).runNow()))
    if (onDayMouseDown != null) __obj.updateDynamic("onDayMouseDown")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDayMouseDown(t0, t1, t2).runNow()))
    if (onDayMouseEnter != null) __obj.updateDynamic("onDayMouseEnter")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDayMouseEnter(t0, t1, t2).runNow()))
    if (onDayMouseLeave != null) __obj.updateDynamic("onDayMouseLeave")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDayMouseLeave(t0, t1, t2).runNow()))
    if (onDayMouseUp != null) __obj.updateDynamic("onDayMouseUp")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDayMouseUp(t0, t1, t2).runNow()))
    if (onDayTouchEnd != null) __obj.updateDynamic("onDayTouchEnd")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* e */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDayTouchEnd(t0, t1, t2).runNow()))
    if (onDayTouchStart != null) __obj.updateDynamic("onDayTouchStart")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* e */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onDayTouchStart(t0, t1, t2).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onFocus(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onKeyDown(t0).runNow()))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1((t0: /* month */ js.Date) => onMonthChange(t0).runNow()))
    if (onTodayButtonClick != null) __obj.updateDynamic("onTodayButtonClick")(js.Any.fromFunction3((t0: /* day */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers, t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onTodayButtonClick(t0, t1, t2).runNow()))
    if (onWeekClick != null) __obj.updateDynamic("onWeekClick")(js.Any.fromFunction3((t0: /* weekNumber */ scala.Double, t1: /* days */ js.Array[js.Date], t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onWeekClick(t0, t1, t2).runNow()))
    if (!js.isUndefined(pagedNavigation)) __obj.updateDynamic("pagedNavigation")(pagedNavigation.asInstanceOf[js.Any])
    if (renderDay != null) __obj.updateDynamic("renderDay")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* modifiers */ typingsJapgolly.reactDayPicker.commonMod.DayModifiers) => renderDay(t0, t1).runNow()))
    if (renderWeek != null) __obj.updateDynamic("renderWeek")(js.Any.fromFunction3((t0: /* weekNumber */ scala.Double, t1: /* week */ js.Array[js.Date], t2: /* month */ js.Date) => renderWeek(t0, t1, t2).runNow()))
    if (!js.isUndefined(reverseMonths)) __obj.updateDynamic("reverseMonths")(reverseMonths.asInstanceOf[js.Any])
    if (selectedDays != null) __obj.updateDynamic("selectedDays")(selectedDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekDays)) __obj.updateDynamic("showWeekDays")(showWeekDays.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (toMonth != null) __obj.updateDynamic("toMonth")(toMonth.asInstanceOf[js.Any])
    if (todayButton != null) __obj.updateDynamic("todayButton")(todayButton.asInstanceOf[js.Any])
    if (weekdayElement != null) __obj.updateDynamic("weekdayElement")(weekdayElement.asInstanceOf[js.Any])
    if (weekdaysLong != null) __obj.updateDynamic("weekdaysLong")(weekdaysLong.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDayPicker.propsMod.DayPickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDayPicker.propsMod.DayPickerProps])(children: _*)
  }
}

