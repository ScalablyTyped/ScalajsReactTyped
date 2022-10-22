package typingsJapgolly.reactBigCalendar.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactBigCalendar.anon.CSSPropertiesxOffsetnumbe
import typingsJapgolly.reactBigCalendar.anon.DayProp
import typingsJapgolly.reactBigCalendar.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventWrapperProps[TEvent /* <: js.Object */] extends StObject {
  
  var accessors: Start[TEvent]
  
  var className: String
  
  var continuesEarlier: Boolean
  
  var continuesLater: Boolean
  
  var event: TEvent
  
  var getters: DayProp[TEvent]
  
  var isRtl: Boolean
  
  var label: String
  
  def onClick(e: ReactMouseEventFrom[HTMLElement]): Unit
  
  def onDoubleClick(e: ReactMouseEventFrom[HTMLElement]): Unit
  
  var selected: Boolean
  
  // https://github.com/intljusticemission/react-big-calendar/blob/27a2656b40ac8729634d24376dff8ea781a66d50/src/TimeGridEvent.js#L28
  var style: js.UndefOr[CSSPropertiesxOffsetnumbe] = js.undefined
}
object EventWrapperProps {
  
  inline def apply[TEvent /* <: js.Object */](
    accessors: Start[TEvent],
    className: String,
    continuesEarlier: Boolean,
    continuesLater: Boolean,
    event: TEvent,
    getters: DayProp[TEvent],
    isRtl: Boolean,
    label: String,
    onClick: ReactMouseEventFrom[HTMLElement] => Callback,
    onDoubleClick: ReactMouseEventFrom[HTMLElement] => Callback,
    selected: Boolean
  ): EventWrapperProps[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], continuesEarlier = continuesEarlier.asInstanceOf[js.Any], continuesLater = continuesLater.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], getters = getters.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => onClick(t0).runNow()), onDoubleClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => onDoubleClick(t0).runNow()), selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventWrapperProps[TEvent]]
  }
  
  extension [Self <: EventWrapperProps[?], TEvent /* <: js.Object */](x: Self & EventWrapperProps[TEvent]) {
    
    inline def setAccessors(value: Start[TEvent]): Self = StObject.set(x, "accessors", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setContinuesEarlier(value: Boolean): Self = StObject.set(x, "continuesEarlier", value.asInstanceOf[js.Any])
    
    inline def setContinuesLater(value: Boolean): Self = StObject.set(x, "continuesLater", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setGetters(value: DayProp[TEvent]): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
    
    inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def setOnDoubleClick(value: ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSPropertiesxOffsetnumbe): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
