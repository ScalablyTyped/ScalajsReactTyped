package typingsJapgolly.atlaskitCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.atlaskitCalendar.mod.ChangeEvent
import typingsJapgolly.atlaskitCalendar.mod.Props
import typingsJapgolly.atlaskitCalendar.mod.SelectEvent
import typingsJapgolly.atlaskitCalendar.mod.default
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  def apply(
    day: Int | Double = null,
    defaultDay: Int | Double = null,
    defaultDisabled: js.Array[String] = null,
    defaultMonth: Int | Double = null,
    defaultPreviouslySelected: js.Array[String] = null,
    defaultSelected: js.Array[String] = null,
    defaultYear: Int | Double = null,
    disabled: js.Array[String] = null,
    innerProps: HTMLAttributes[HTMLDivElement] = null,
    month: Int | Double = null,
    onBlur: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLDivElement]] => Callback = null,
    onChange: /* e */ ChangeEvent => Callback = null,
    onFocus: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLDivElement]] => Callback = null,
    onSelect: /* e */ SelectEvent => Callback = null,
    previouslySelected: js.Array[String] = null,
    selected: js.Array[String] = null,
    today: String = null,
    year: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (defaultDay != null) __obj.updateDynamic("defaultDay")(defaultDay.asInstanceOf[js.Any])
    if (defaultDisabled != null) __obj.updateDynamic("defaultDisabled")(defaultDisabled.asInstanceOf[js.Any])
    if (defaultMonth != null) __obj.updateDynamic("defaultMonth")(defaultMonth.asInstanceOf[js.Any])
    if (defaultPreviouslySelected != null) __obj.updateDynamic("defaultPreviouslySelected")(defaultPreviouslySelected.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (defaultYear != null) __obj.updateDynamic("defaultYear")(defaultYear.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (innerProps != null) __obj.updateDynamic("innerProps")(innerProps.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.atlaskitCalendar.mod.ChangeEvent) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLDivElement]]) => onFocus(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.atlaskitCalendar.mod.SelectEvent) => onSelect(t0).runNow()))
    if (previouslySelected != null) __obj.updateDynamic("previouslySelected")(previouslySelected.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atlaskitCalendar.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atlaskitCalendar.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atlaskitCalendar.mod.Props])(children: _*)
  }
  @JSImport("@atlaskit/calendar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

