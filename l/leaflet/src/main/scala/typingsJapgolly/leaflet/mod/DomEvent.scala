package typingsJapgolly.leaflet.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.leaflet.TypeofDomEvent
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "DomEvent")
@js.native
object DomEvent extends js.Object {
  trait _PropagableEvent extends js.Object
  
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  def disableClickPropagation(el: HTMLElement): TypeofDomEvent = js.native
  def disableScrollPropagation(el: HTMLElement): TypeofDomEvent = js.native
  def getMousePosition(ev: MouseEvent): Point_ = js.native
  def getMousePosition(ev: MouseEvent, container: HTMLElement): Point_ = js.native
  def getWheelDelta(ev: Event_): Double = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  def preventDefault(ev: Event_): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  def stop(ev: PropagableEvent): TypeofDomEvent = js.native
  def stopPropagation(ev: PropagableEvent): TypeofDomEvent = js.native
  type EventHandlerFn = js.Function1[/* event */ Event_, Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.leaflet.mod.LeafletMouseEvent
    - typingsJapgolly.leaflet.mod.LeafletKeyboardEvent
    - typingsJapgolly.leaflet.mod.LeafletEvent
    - typingsJapgolly.std.Event_
  */
  type PropagableEvent = _PropagableEvent | Event_
}

