package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.calendarButtonExampleMod.ICalendarButtonExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarButtonExample {
  def apply(
    buttonString: String = null,
    highlightCurrentMonth: js.UndefOr[Boolean] = js.undefined,
    highlightSelectedMonth: js.UndefOr[Boolean] = js.undefined,
    isDayPickerVisible: js.UndefOr[Boolean] = js.undefined,
    isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined,
    showGoToToday: js.UndefOr[Boolean] = js.undefined,
    showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ICalendarButtonExampleProps, 
    typingsJapgolly.officeUiFabricReact.calendarButtonExampleMod.CalendarButtonExample, 
    Unit, 
    ICalendarButtonExampleProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (buttonString != null) __obj.updateDynamic("buttonString")(buttonString.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightCurrentMonth)) __obj.updateDynamic("highlightCurrentMonth")(highlightCurrentMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSelectedMonth)) __obj.updateDynamic("highlightSelectedMonth")(highlightSelectedMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(isDayPickerVisible)) __obj.updateDynamic("isDayPickerVisible")(isDayPickerVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isMonthPickerVisible)) __obj.updateDynamic("isMonthPickerVisible")(isMonthPickerVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(showGoToToday)) __obj.updateDynamic("showGoToToday")(showGoToToday.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthPickerAsOverlay)) __obj.updateDynamic("showMonthPickerAsOverlay")(showMonthPickerAsOverlay.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.calendarButtonExampleMod.ICalendarButtonExampleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.calendarButtonExampleMod.CalendarButtonExample](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.calendarButtonExampleMod.ICalendarButtonExampleProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/Calendar/examples/Calendar.Button.Example", "CalendarButtonExample")
  @js.native
  object componentImport extends js.Object
  
}

