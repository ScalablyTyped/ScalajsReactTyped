package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typingsJapgolly.officeUiFabricReact.calendarYearMod.ICalendarYearHeaderProps
import typingsJapgolly.officeUiFabricReact.calendarYearMod.ICalendarYearProps
import typingsJapgolly.officeUiFabricReact.calendarYearMod.ICalendarYearStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarYear {
  def apply(
    className: String = null,
    maxYear: Int | Double = null,
    minYear: Int | Double = null,
    navigatedYear: Int | Double = null,
    navigationIcons: ICalendarIconStrings = null,
    onHeaderSelect: /* focus */ Boolean => Callback = null,
    onRenderTitle: /* props */ ICalendarYearHeaderProps => CallbackTo[Node] = null,
    onRenderYear: /* year */ Double => CallbackTo[Node] = null,
    onSelectYear: /* year */ Double => Callback = null,
    selectedYear: Int | Double = null,
    strings: ICalendarYearStrings = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ICalendarYearProps, 
    typingsJapgolly.officeUiFabricReact.calendarYearMod.CalendarYear, 
    Unit, 
    ICalendarYearProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (maxYear != null) __obj.updateDynamic("maxYear")(maxYear.asInstanceOf[js.Any])
    if (minYear != null) __obj.updateDynamic("minYear")(minYear.asInstanceOf[js.Any])
    if (navigatedYear != null) __obj.updateDynamic("navigatedYear")(navigatedYear.asInstanceOf[js.Any])
    if (navigationIcons != null) __obj.updateDynamic("navigationIcons")(navigationIcons.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1((t0: /* focus */ scala.Boolean) => onHeaderSelect(t0).runNow()))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.calendarYearMod.ICalendarYearHeaderProps) => onRenderTitle(t0).runNow()))
    if (onRenderYear != null) __obj.updateDynamic("onRenderYear")(js.Any.fromFunction1((t0: /* year */ scala.Double) => onRenderYear(t0).runNow()))
    if (onSelectYear != null) __obj.updateDynamic("onSelectYear")(js.Any.fromFunction1((t0: /* year */ scala.Double) => onSelectYear(t0).runNow()))
    if (selectedYear != null) __obj.updateDynamic("selectedYear")(selectedYear.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.calendarYearMod.ICalendarYearProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.calendarYearMod.CalendarYear](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.calendarYearMod.ICalendarYearProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarYear", "CalendarYear")
  @js.native
  object componentImport extends js.Object
  
}

