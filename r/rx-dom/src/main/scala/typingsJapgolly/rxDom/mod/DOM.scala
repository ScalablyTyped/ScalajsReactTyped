package typingsJapgolly.rxDom.mod

import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.MutationObserverInit
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.Position
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.UIEvent
import typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM.AjaxSettings
import typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM.AjaxSuccessResponse
import typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM.GeolocationOptions
import typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM.JsonpSettings
import typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM.JsonpSuccessResponse
import typingsJapgolly.std.Event_
import typingsJapgolly.std.MutationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "DOM")
@js.native
object DOM extends js.Object {
  def ajax(settingsOrUrl: String): typingsJapgolly.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  // Ajax
  def ajax(settingsOrUrl: AjaxSettings): typingsJapgolly.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  // Event Shortcuts
  def blur(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def change(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def change(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def click(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def error(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def error(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def error(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def focus(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def focusin(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  // Events
  def fromEvent[T](element: js.Any, eventName: String): typingsJapgolly.rxLiteAggregates.Rx.Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[T] = js.native
  // Server-Sent Events
  def fromEventSource[T](url: String): typingsJapgolly.rxLiteAggregates.Rx.Observable[T] = js.native
  def fromEventSource[T](url: String, openObservable: typingsJapgolly.rxCore.Rx.Observer[T]): typingsJapgolly.rxLiteAggregates.Rx.Observable[T] = js.native
  // Mutation Observers
  def fromMutationObserver(target: Node, options: MutationObserverInit): typingsJapgolly.rxLiteAggregates.Rx.Observable[MutationEvent] = js.native
  // Web Sockets
  def fromWebSocket(url: String, protocol: String): typingsJapgolly.rxCoreBinding.Rx.Subject[MessageEvent] = js.native
  def fromWebSocket(url: String, protocol: String, openObserver: typingsJapgolly.rxCore.Rx.Observer[Event_]): typingsJapgolly.rxCoreBinding.Rx.Subject[MessageEvent] = js.native
  def fromWebSocket(
    url: String,
    protocol: String,
    openObserver: typingsJapgolly.rxCore.Rx.Observer[Event_],
    closingObserver: typingsJapgolly.rxCore.Rx.Observer[CloseEvent]
  ): typingsJapgolly.rxCoreBinding.Rx.Subject[MessageEvent] = js.native
  // Web Workers
  def fromWebWorker(url: String): typingsJapgolly.rxCoreBinding.Rx.Subject[String] = js.native
  def get(url: String): typingsJapgolly.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  def getJSON(url: String): typingsJapgolly.rxLiteAggregates.Rx.Observable[String] = js.native
  def jsonpRequest(settings: JsonpSettings): typingsJapgolly.rxLiteAggregates.Rx.Observable[JsonpSuccessResponse] = js.native
  def jsonpRequest(url: String): typingsJapgolly.rxLiteAggregates.Rx.Observable[String] = js.native
  def keydown(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def load(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def mousedown(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  // Pointer Events
  def pointerdown(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def post(url: String, body: js.Any): typingsJapgolly.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  def ready(): typingsJapgolly.rxLiteAggregates.Rx.Observable[_] = js.native
  def resize(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def select(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def select(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def select(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def submit(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def submit(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def submit(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  // Touch Events
  def touchcancel(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def unload(element: Element): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def unload(element: Element, selector: js.Function): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def unload(element: Element, selector: js.Function, useCapture: Boolean): typingsJapgolly.rxLiteAggregates.Rx.Observable[Event_] = js.native
  // Geolocation
  @js.native
  object geolocation extends js.Object {
    def getCurrentPosition(): typingsJapgolly.rxLiteAggregates.Rx.Observable[Position] = js.native
    def getCurrentPosition(geolocationOptions: GeolocationOptions): typingsJapgolly.rxLiteAggregates.Rx.Observable[Position] = js.native
    def watchPosition(): typingsJapgolly.rxLiteAggregates.Rx.Observable[Position] = js.native
    def watchPosition(geolocationOptions: GeolocationOptions): typingsJapgolly.rxLiteAggregates.Rx.Observable[Position] = js.native
  }
  
}

