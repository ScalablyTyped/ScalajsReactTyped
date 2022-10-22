package typingsJapgolly.wonderJs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.wonderFrp.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream
import typingsJapgolly.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typingsJapgolly.wonderJs.distEs2015EventEengineeventMod.EEngineEvent
import typingsJapgolly.wonderJs.distEs2015EventObjectEventMod.Event
import typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventEventManagerMod {
  
  @JSImport("wonder.js/dist/es2015/event/EventManager", "EventManager")
  @js.native
  open class EventManager () extends StObject
  /* static members */
  object EventManager {
    
    @JSImport("wonder.js/dist/es2015/event/EventManager", "EventManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def broadcast(target: EntityObject, event: Event): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def broadcast(target: EntityObject, event: Event, userData: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def emit(target: EntityObject, event: Event): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def emit(target: EntityObject, event: Event, userData: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def fromEvent(dom: HTMLElement, eventName: String): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(dom: HTMLElement, eventName: String, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(dom: HTMLElement, eventName: EEngineEvent): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(dom: HTMLElement, eventName: EEngineEvent, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(dom: HTMLElement, eventName: EEventName): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(dom: HTMLElement, eventName: EEventName, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(eventName: String): FromEventPatternStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(eventName: String, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(eventName: EEngineEvent): FromEventPatternStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(eventName: EEngineEvent, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(eventName: EEventName): FromEventPatternStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(eventName: EEventName, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(target: EntityObject, eventName: String): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(target: EntityObject, eventName: String, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(target: EntityObject, eventName: EEngineEvent): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(target: EntityObject, eventName: EEngineEvent, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(target: EntityObject, eventName: EEventName): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    inline def fromEvent(target: EntityObject, eventName: EEventName, priority: Double): FromEventPatternStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[FromEventPatternStream]
    
    inline def off(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")().asInstanceOf[Unit]
    inline def off(dom: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(dom.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off(dom: HTMLElement, eventName: EEventName): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(dom: HTMLElement, eventName: EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off(eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(eventName: EEngineEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off(eventName: EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(eventName: EEventName): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off(eventName: EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(target: EntityObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def off(target: EntityObject, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(target: EntityObject, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(target: EntityObject, eventName: EEngineEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(target: EntityObject, eventName: EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(target: EntityObject, eventName: EEventName): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off(target: EntityObject, eventName: EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on(dom: HTMLElement, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(dom: HTMLElement, eventName: String, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(dom: HTMLElement, eventName: EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(dom: HTMLElement, eventName: EEngineEvent, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(dom: HTMLElement, eventName: EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(dom: HTMLElement, eventName: EEventName, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(dom.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: String, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: EEngineEvent, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(eventName: EEventName, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(target: EntityObject, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(target: EntityObject, eventName: String, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(target: EntityObject, eventName: EEngineEvent, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(target: EntityObject, eventName: EEngineEvent, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(target: EntityObject, eventName: EEventName, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def on(target: EntityObject, eventName: EEventName, handler: js.Function, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setBubbleParent(target: EntityObject, parent: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBubbleParent")(target.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def trigger(dom: HTMLElement, event: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(dom.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def trigger(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def trigger(event: Event, userData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def trigger(target: EntityObject, event: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def trigger(target: EntityObject, event: Event, userData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def trigger(target: EntityObject, event: Event, userData: Any, notSetTarget: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], event.asInstanceOf[js.Any], userData.asInstanceOf[js.Any], notSetTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
