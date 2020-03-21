package typingsJapgolly.wonderJs.mod

import typingsJapgolly.std.HTMLElement
import typingsJapgolly.wonderFrp.streamFromEventPatternStreamMod.FromEventPatternStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
class EventManager ()
  extends typingsJapgolly.wonderJs.eventManagerMod.EventManager

/* static members */
@JSImport("wonder.js/dist/es2015", "EventManager")
@js.native
object EventManager extends js.Object {
  def broadcast(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    event: typingsJapgolly.wonderJs.eventMod.Event
  ): js.Any = js.native
  def broadcast(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    event: typingsJapgolly.wonderJs.eventMod.Event,
    userData: js.Any
  ): js.Any = js.native
  def emit(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    event: typingsJapgolly.wonderJs.eventMod.Event
  ): js.Any = js.native
  def emit(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    event: typingsJapgolly.wonderJs.eventMod.Event,
    userData: js.Any
  ): js.Any = js.native
  def fromEvent(dom: HTMLElement, eventName: String): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent): FromEventPatternStream = js.native
  def fromEvent(
    dom: HTMLElement,
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent,
    priority: Double
  ): FromEventPatternStream = js.native
  def fromEvent(dom: HTMLElement, eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName): FromEventPatternStream = js.native
  def fromEvent(
    dom: HTMLElement,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName,
    priority: Double
  ): FromEventPatternStream = js.native
  def fromEvent(eventName: String): FromEventPatternStream = js.native
  def fromEvent(eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent): FromEventPatternStream = js.native
  def fromEvent(eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent, priority: Double): FromEventPatternStream = js.native
  def fromEvent(eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName): FromEventPatternStream = js.native
  def fromEvent(eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName, priority: Double): FromEventPatternStream = js.native
  def fromEvent(target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject, eventName: String): FromEventPatternStream = js.native
  def fromEvent(target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject, eventName: String, priority: Double): FromEventPatternStream = js.native
  def fromEvent(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent,
    priority: Double
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
  ): FromEventPatternStream = js.native
  def fromEvent(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName,
    priority: Double
  ): FromEventPatternStream = js.native
  def off(): Unit = js.native
  def off(dom: HTMLElement): Unit = js.native
  def off(dom: HTMLElement, eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName): Unit = js.native
  def off(
    dom: HTMLElement,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def off(eventName: String): Unit = js.native
  def off(eventName: String, handler: js.Function): Unit = js.native
  def off(eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent): Unit = js.native
  def off(eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = js.native
  def off(eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName): Unit = js.native
  def off(eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = js.native
  def off(target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject): Unit = js.native
  def off(target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject, eventName: String): Unit = js.native
  def off(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function
  ): Unit = js.native
  def off(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent
  ): Unit = js.native
  def off(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def off(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
  ): Unit = js.native
  def off(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def on(dom: HTMLElement, eventName: String, handler: js.Function): Unit = js.native
  def on(dom: HTMLElement, eventName: String, handler: js.Function, priority: Double): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def on(
    dom: HTMLElement,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(eventName: String, handler: js.Function): Unit = js.native
  def on(eventName: String, handler: js.Function, priority: Double): Unit = js.native
  def on(eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent, handler: js.Function): Unit = js.native
  def on(
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName, handler: js.Function): Unit = js.native
  def on(
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: String,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def on(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function
  ): Unit = js.native
  def on(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    eventName: typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: Double
  ): Unit = js.native
  def setBubbleParent(target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject, parent: js.Any): Unit = js.native
  def trigger(dom: HTMLElement, event: typingsJapgolly.wonderJs.eventMod.Event): Unit = js.native
  def trigger(event: typingsJapgolly.wonderJs.eventMod.Event): Unit = js.native
  def trigger(event: typingsJapgolly.wonderJs.eventMod.Event, userData: js.Any): Unit = js.native
  def trigger(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    event: typingsJapgolly.wonderJs.eventMod.Event
  ): Unit = js.native
  def trigger(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    event: typingsJapgolly.wonderJs.eventMod.Event,
    userData: js.Any
  ): Unit = js.native
  def trigger(
    target: typingsJapgolly.wonderJs.entityObjectMod.EntityObject,
    event: typingsJapgolly.wonderJs.eventMod.Event,
    userData: js.Any,
    notSetTarget: Boolean
  ): Unit = js.native
}

