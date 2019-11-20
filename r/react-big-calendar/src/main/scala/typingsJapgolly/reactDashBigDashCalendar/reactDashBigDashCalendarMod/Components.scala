package typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.react.reactMod.SFC
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import typingsJapgolly.reactDashBigDashCalendar.Anon_Date
import typingsJapgolly.reactDashBigDashCalendar.Anon_DateHeader
import typingsJapgolly.reactDashBigDashCalendar.Anon_Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components[TEvent /* <: js.Object */] extends js.Object {
  var agenda: js.UndefOr[Anon_Date] = js.undefined
  var dateCellWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var day: js.UndefOr[Anon_Event] = js.undefined
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.undefined
  var eventContainerWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var eventWrapper: js.UndefOr[ComponentType[EventWrapperProps[TEvent]]] = js.undefined
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[ComponentType[HeaderProps]] = js.undefined
  var month: js.UndefOr[Anon_DateHeader] = js.undefined
  var resourceHeader: js.UndefOr[ComponentType[ResourceHeaderProps]] = js.undefined
  var timeGutterHeader: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var timeGutterWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var timeSlotWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element
  ] = js.undefined
  var toolbar: js.UndefOr[ComponentType[ToolbarProps]] = js.undefined
  var week: js.UndefOr[Anon_Event] = js.undefined
}

object Components {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    agenda: Anon_Date = null,
    dateCellWrapper: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    day: Anon_Event = null,
    event: ComponentType[EventProps[TEvent]] = null,
    eventContainerWrapper: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    eventWrapper: ComponentType[EventWrapperProps[TEvent]] = null,
    header: ComponentType[HeaderProps] = null,
    month: Anon_DateHeader = null,
    resourceHeader: ComponentType[ResourceHeaderProps] = null,
    timeGutterHeader: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    timeGutterWrapper: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    timeSlotWrapper: SFC[js.Object] | (Component[js.Object, js.Object]) | ComponentClassP[js.Object] | Element = null,
    toolbar: ComponentType[ToolbarProps] = null,
    week: Anon_Event = null
  ): Components[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda.asInstanceOf[js.Any])
    if (dateCellWrapper != null) __obj.updateDynamic("dateCellWrapper")(dateCellWrapper.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventContainerWrapper != null) __obj.updateDynamic("eventContainerWrapper")(eventContainerWrapper.asInstanceOf[js.Any])
    if (eventWrapper != null) __obj.updateDynamic("eventWrapper")(eventWrapper.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (resourceHeader != null) __obj.updateDynamic("resourceHeader")(resourceHeader.asInstanceOf[js.Any])
    if (timeGutterHeader != null) __obj.updateDynamic("timeGutterHeader")(timeGutterHeader.asInstanceOf[js.Any])
    if (timeGutterWrapper != null) __obj.updateDynamic("timeGutterWrapper")(timeGutterWrapper.asInstanceOf[js.Any])
    if (timeSlotWrapper != null) __obj.updateDynamic("timeSlotWrapper")(timeSlotWrapper.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components[TEvent]]
  }
}

trait components extends js.Object {
  var dateCellWrapper: ComponentType[js.Object]
  var eventWrapper: ComponentType[Event]
}

object components {
  @scala.inline
  def apply(dateCellWrapper: ComponentType[js.Object], eventWrapper: ComponentType[Event]): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[components]
  }
}

