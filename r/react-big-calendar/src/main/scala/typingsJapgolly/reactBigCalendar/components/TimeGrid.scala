package typingsJapgolly.reactBigCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBigCalendar.mod.NavigateAction
import typingsJapgolly.reactBigCalendar.mod.SlotInfo
import typingsJapgolly.reactBigCalendar.mod.TimeGridProps
import typingsJapgolly.reactBigCalendar.mod.View
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeGrid {
  
  inline def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](eventOffset: Double): Builder[TEvent, TResource] = {
    val __props = js.Dynamic.literal(eventOffset = eventOffset.asInstanceOf[js.Any])
    new Builder[TEvent, TResource](js.Array(this.component, __props.asInstanceOf[TimeGridProps[TEvent, TResource]]))
  }
  
  @JSImport("react-big-calendar", "TimeGrid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TEvent /* <: js.Object */, TResource /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBigCalendar.mod.TimeGrid[TEvent, TResource]] {
    
    inline def accessors(value: js.Object): this.type = set("accessors", value.asInstanceOf[js.Any])
    
    inline def backgroundEvents(value: js.Array[TEvent]): this.type = set("backgroundEvents", value.asInstanceOf[js.Any])
    
    inline def backgroundEventsVarargs(value: TEvent*): this.type = set("backgroundEvents", js.Array(value*))
    
    inline def components(value: js.Object): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def dayLayoutAlgorithm(value: Any): this.type = set("dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    
    inline def events(value: js.Array[TEvent]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(value: TEvent*): this.type = set("events", js.Array(value*))
    
    inline def getDrilldownView(
      value: (/* targetDate */ js.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Callback
    ): this.type = set("getDrilldownView", js.Any.fromFunction3((t0: /* targetDate */ js.Date, t1: /* currentViewName */ View, t2: /* configuredViewNames */ js.Array[View]) => (value(t0, t1, t2)).runNow()))
    
    inline def getDrilldownViewNull: this.type = set("getDrilldownView", null)
    
    inline def getNow(value: CallbackTo[js.Date]): this.type = set("getNow", value.toJsFn)
    
    inline def getters(value: js.Object): this.type = set("getters", value.asInstanceOf[js.Any])
    
    inline def localizer(value: js.Object): this.type = set("localizer", value.asInstanceOf[js.Any])
    
    inline def longPressThreshold(value: Double): this.type = set("longPressThreshold", value.asInstanceOf[js.Any])
    
    inline def max(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onDoubleClickEvent(value: (TEvent, /* e */ ReactEventFrom[HTMLElement]) => Callback): this.type = set("onDoubleClickEvent", js.Any.fromFunction2((t0: TEvent, t1: /* e */ ReactEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onDrillDown(value: (/* date */ js.Date, /* view */ View) => Callback): this.type = set("onDrillDown", js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* view */ View) => (value(t0, t1)).runNow()))
    
    inline def onKeyPressEvent(value: /* repeated */ Any => Any): this.type = set("onKeyPressEvent", js.Any.fromFunction1(value))
    
    inline def onNavigate(value: /* action */ NavigateAction => Callback): this.type = set("onNavigate", js.Any.fromFunction1((t0: /* action */ NavigateAction) => value(t0).runNow()))
    
    inline def onSelectEnd(value: /* repeated */ Any => Any): this.type = set("onSelectEnd", js.Any.fromFunction1(value))
    
    inline def onSelectEvent(value: (TEvent, /* e */ ReactEventFrom[HTMLElement]) => Callback): this.type = set("onSelectEvent", js.Any.fromFunction2((t0: TEvent, t1: /* e */ ReactEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
    
    inline def onSelectSlot(value: /* slotInfo */ SlotInfo => Callback): this.type = set("onSelectSlot", js.Any.fromFunction1((t0: /* slotInfo */ SlotInfo) => value(t0).runNow()))
    
    inline def onSelectStart(value: /* repeated */ Any => Any): this.type = set("onSelectStart", js.Any.fromFunction1(value))
    
    inline def range(value: js.Array[Any]): this.type = set("range", value.asInstanceOf[js.Any])
    
    inline def rangeVarargs(value: Any*): this.type = set("range", js.Array(value*))
    
    inline def resources(value: js.Array[TResource]): this.type = set("resources", value.asInstanceOf[js.Any])
    
    inline def resourcesVarargs(value: TResource*): this.type = set("resources", js.Array(value*))
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def scrollToTime(value: js.Date): this.type = set("scrollToTime", value.asInstanceOf[js.Any])
    
    inline def selectable(value: Boolean | ignoreEvents): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def selected(value: js.Object): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def showMultiDayTimes(value: Boolean): this.type = set("showMultiDayTimes", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def timeslots(value: Double): this.type = set("timeslots", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps[TEvent /* <: js.Object */, TResource /* <: js.Object */](p: TimeGridProps[TEvent, TResource]): Builder[TEvent, TResource] = new Builder[TEvent, TResource](js.Array(this.component, p.asInstanceOf[js.Any]))
}
