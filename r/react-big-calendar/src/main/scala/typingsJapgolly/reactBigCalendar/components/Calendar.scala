package typingsJapgolly.reactBigCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactBigCalendar.anon.Accessors
import typingsJapgolly.reactBigCalendar.anon.ClassName
import typingsJapgolly.reactBigCalendar.anon.End
import typingsJapgolly.reactBigCalendar.anon.Style
import typingsJapgolly.reactBigCalendar.anon.X
import typingsJapgolly.reactBigCalendar.mod.CalendarProps
import typingsJapgolly.reactBigCalendar.mod.Components_
import typingsJapgolly.reactBigCalendar.mod.Culture
import typingsJapgolly.reactBigCalendar.mod.DateLocalizer
import typingsJapgolly.reactBigCalendar.mod.DayLayoutAlgorithm
import typingsJapgolly.reactBigCalendar.mod.DayLayoutFunction
import typingsJapgolly.reactBigCalendar.mod.Formats
import typingsJapgolly.reactBigCalendar.mod.Messages
import typingsJapgolly.reactBigCalendar.mod.NavigateAction
import typingsJapgolly.reactBigCalendar.mod.SlotInfo
import typingsJapgolly.reactBigCalendar.mod.View
import typingsJapgolly.reactBigCalendar.mod.ViewsProps
import typingsJapgolly.reactBigCalendar.mod.stringOrDate
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  inline def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](localizer: DateLocalizer): Builder[TEvent, TResource] = {
    val __props = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
    new Builder[TEvent, TResource](js.Array(this.component, __props.asInstanceOf[CalendarProps[TEvent, TResource]]))
  }
  
  @JSImport("react-big-calendar", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TEvent /* <: js.Object */, TResource /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBigCalendar.mod.Calendar[TEvent, TResource]] {
    
    inline def allDayAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])): this.type = set("allDayAccessor", value.asInstanceOf[js.Any])
    
    inline def allDayAccessorFunction1(value: TEvent => Boolean): this.type = set("allDayAccessor", js.Any.fromFunction1(value))
    
    inline def backgroundEvents(value: js.Array[TEvent]): this.type = set("backgroundEvents", value.asInstanceOf[js.Any])
    
    inline def backgroundEventsVarargs(value: TEvent*): this.type = set("backgroundEvents", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def components(value: Components_[TEvent, TResource]): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def culture(value: Culture): this.type = set("culture", value.asInstanceOf[js.Any])
    
    inline def date(value: stringOrDate): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def dayLayoutAlgorithm(value: DayLayoutAlgorithm | DayLayoutFunction[TEvent]): this.type = set("dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    
    inline def dayLayoutAlgorithmFunction1(value: /* _ */ Accessors[TEvent] => js.Array[Style[TEvent]]): this.type = set("dayLayoutAlgorithm", js.Any.fromFunction1(value))
    
    inline def dayPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): this.type = set("dayPropGetter", js.Any.fromFunction2(value))
    
    inline def defaultDate(value: stringOrDate): this.type = set("defaultDate", value.asInstanceOf[js.Any])
    
    inline def defaultView(value: View): this.type = set("defaultView", value.asInstanceOf[js.Any])
    
    inline def doShowMoreDrillDown(value: Boolean): this.type = set("doShowMoreDrillDown", value.asInstanceOf[js.Any])
    
    inline def drilldownView(value: View): this.type = set("drilldownView", value.asInstanceOf[js.Any])
    
    inline def drilldownViewNull: this.type = set("drilldownView", null)
    
    inline def elementProps(value: HTMLAttributes[HTMLElement]): this.type = set("elementProps", value.asInstanceOf[js.Any])
    
    inline def enableAutoScroll(value: Boolean): this.type = set("enableAutoScroll", value.asInstanceOf[js.Any])
    
    inline def endAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, js.Date])): this.type = set("endAccessor", value.asInstanceOf[js.Any])
    
    inline def endAccessorFunction1(value: TEvent => js.Date): this.type = set("endAccessor", js.Any.fromFunction1(value))
    
    inline def eventPropGetter(value: (TEvent, /* start */ js.Date, /* end */ js.Date, /* isSelected */ Boolean) => ClassName): this.type = set("eventPropGetter", js.Any.fromFunction4(value))
    
    inline def events(value: js.Array[TEvent]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(value: TEvent*): this.type = set("events", js.Array(value*))
    
    inline def formats(value: Formats): this.type = set("formats", value.asInstanceOf[js.Any])
    
    inline def getDrilldownView(
      value: (/* targetDate */ js.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Callback
    ): this.type = set("getDrilldownView", js.Any.fromFunction3((t0: /* targetDate */ js.Date, t1: /* currentViewName */ View, t2: /* configuredViewNames */ js.Array[View]) => (value(t0, t1, t2)).runNow()))
    
    inline def getDrilldownViewNull: this.type = set("getDrilldownView", null)
    
    inline def getNow(value: CallbackTo[js.UndefOr[stringOrDate]]): this.type = set("getNow", value.toJsFn)
    
    inline def handleDragStart(value: TEvent => Callback): this.type = set("handleDragStart", js.Any.fromFunction1((t0: TEvent) => value(t0).runNow()))
    
    inline def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    
    inline def longPressThreshold(value: Double): this.type = set("longPressThreshold", value.asInstanceOf[js.Any])
    
    inline def max(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def messages(value: Messages): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def min(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onDoubleClickEvent(value: (TEvent, /* e */ ReactEventFrom[HTMLElement]) => Callback): this.type = set("onDoubleClickEvent", js.Any.fromFunction2((t0: TEvent, t1: /* e */ ReactEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onDrillDown(value: (/* date */ js.Date, /* view */ View) => Callback): this.type = set("onDrillDown", js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* view */ View) => (value(t0, t1)).runNow()))
    
    inline def onKeyPressEvent(value: (TEvent, /* e */ ReactEventFrom[HTMLElement]) => Callback): this.type = set("onKeyPressEvent", js.Any.fromFunction2((t0: TEvent, t1: /* e */ ReactEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onNavigate(value: (/* newDate */ js.Date, /* view */ View, /* action */ NavigateAction) => Callback): this.type = set("onNavigate", js.Any.fromFunction3((t0: /* newDate */ js.Date, t1: /* view */ View, t2: /* action */ NavigateAction) => (value(t0, t1, t2)).runNow()))
    
    inline def onRangeChange(value: (/* range */ js.Array[js.Date] | End, /* view */ js.UndefOr[View]) => js.UndefOr[Unit]): this.type = set("onRangeChange", js.Any.fromFunction2(value))
    
    inline def onSelectEvent(value: (TEvent, /* e */ ReactEventFrom[HTMLElement]) => Callback): this.type = set("onSelectEvent", js.Any.fromFunction2((t0: TEvent, t1: /* e */ ReactEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onSelectSlot(value: /* slotInfo */ SlotInfo => Callback): this.type = set("onSelectSlot", js.Any.fromFunction1((t0: /* slotInfo */ SlotInfo) => value(t0).runNow()))
    
    inline def onSelecting(value: /* range */ End => js.UndefOr[Boolean]): this.type = set("onSelecting", js.Any.fromFunction1(value))
    
    inline def onShowMore(value: (/* events */ js.Array[TEvent], /* date */ js.Date) => Callback): this.type = set("onShowMore", js.Any.fromFunction2((t0: /* events */ js.Array[TEvent], t1: /* date */ js.Date) => (value(t0, t1)).runNow()))
    
    inline def onView(value: /* view */ View => Callback): this.type = set("onView", js.Any.fromFunction1((t0: /* view */ View) => value(t0).runNow()))
    
    inline def popup(value: Boolean): this.type = set("popup", value.asInstanceOf[js.Any])
    
    inline def popupOffset(value: Double | X): this.type = set("popupOffset", value.asInstanceOf[js.Any])
    
    inline def resourceAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, Any])): this.type = set("resourceAccessor", value.asInstanceOf[js.Any])
    
    inline def resourceAccessorFunction1(value: TEvent => Any): this.type = set("resourceAccessor", js.Any.fromFunction1(value))
    
    inline def resourceIdAccessor(value: (/* keyof TResource */ String) | (js.Function1[TResource, Any])): this.type = set("resourceIdAccessor", value.asInstanceOf[js.Any])
    
    inline def resourceIdAccessorFunction1(value: TResource => Any): this.type = set("resourceIdAccessor", js.Any.fromFunction1(value))
    
    inline def resourceTitleAccessor(value: (/* keyof TResource */ String) | (js.Function1[TResource, Any])): this.type = set("resourceTitleAccessor", value.asInstanceOf[js.Any])
    
    inline def resourceTitleAccessorFunction1(value: TResource => Any): this.type = set("resourceTitleAccessor", js.Any.fromFunction1(value))
    
    inline def resources(value: js.Array[TResource]): this.type = set("resources", value.asInstanceOf[js.Any])
    
    inline def resourcesVarargs(value: TResource*): this.type = set("resources", js.Array(value*))
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def scrollToTime(value: js.Date): this.type = set("scrollToTime", value.asInstanceOf[js.Any])
    
    inline def selectable(value: Boolean | ignoreEvents): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def selected(value: Any): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def showAllEvents(value: Boolean): this.type = set("showAllEvents", value.asInstanceOf[js.Any])
    
    inline def showMultiDayTimes(value: Boolean): this.type = set("showMultiDayTimes", value.asInstanceOf[js.Any])
    
    inline def slotGroupPropGetter(value: CallbackTo[HTMLAttributes[HTMLDivElement]]): this.type = set("slotGroupPropGetter", value.toJsFn)
    
    inline def slotPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): this.type = set("slotPropGetter", js.Any.fromFunction2(value))
    
    inline def startAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, js.Date])): this.type = set("startAccessor", value.asInstanceOf[js.Any])
    
    inline def startAccessorFunction1(value: TEvent => js.Date): this.type = set("startAccessor", js.Any.fromFunction1(value))
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def timeslots(value: Double): this.type = set("timeslots", value.asInstanceOf[js.Any])
    
    inline def titleAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, String])): this.type = set("titleAccessor", value.asInstanceOf[js.Any])
    
    inline def titleAccessorFunction1(value: TEvent => String): this.type = set("titleAccessor", js.Any.fromFunction1(value))
    
    inline def toolbar(value: Boolean): this.type = set("toolbar", value.asInstanceOf[js.Any])
    
    inline def tooltipAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, String])): this.type = set("tooltipAccessor", value.asInstanceOf[js.Any])
    
    inline def tooltipAccessorFunction1(value: TEvent => String): this.type = set("tooltipAccessor", js.Any.fromFunction1(value))
    
    inline def view(value: View): this.type = set("view", value.asInstanceOf[js.Any])
    
    inline def views(value: ViewsProps[TEvent, TResource]): this.type = set("views", value.asInstanceOf[js.Any])
    
    inline def viewsVarargs(value: View*): this.type = set("views", js.Array(value*))
  }
  
  def withProps[TEvent /* <: js.Object */, TResource /* <: js.Object */](p: CalendarProps[TEvent, TResource]): Builder[TEvent, TResource] = new Builder[TEvent, TResource](js.Array(this.component, p.asInstanceOf[js.Any]))
}
