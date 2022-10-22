package typingsJapgolly.urlState

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import typingsJapgolly.urlState.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("url-state", JSImport.Default)
  @js.native
  val default: UrlState = js.native
  
  /* Inlined parent std.EventTarget */
  /* Inlined parent std.Pick<std.URL, 'href' | 'protocol' | 'hostname' | 'port' | 'pathname' | 'search' | 'hash' | 'host' | 'origin'> */
  @js.native
  trait UrlState extends StObject {
    
    /**
      * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
      *
      * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
      *
      * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
      *
      * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
      *
      * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
      *
      * If an AbortSignal is passed for options's signal, then the event listener will be removed when signal is aborted.
      *
      * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
      */
    /* standard dom */
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, callback: Null, options: AddEventListenerOptions): Unit = js.native
    def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    val back: Boolean = js.native
    
    /** Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise. */
    /* standard dom */
    def dispatchEvent(event: Event): Boolean = js.native
    
    var hash: String = js.native
    
    var host: String = js.native
    
    var hostname: String = js.native
    
    var href: String = js.native
    
    var origin: String = js.native
    
    val params: ReturnType[FnCall] = js.native
    
    var pathname: String = js.native
    
    def pop(): Unit = js.native
    
    var port: String = js.native
    
    var protocol: String = js.native
    
    def push(href: String): Unit = js.native
    def push(href: String, replace: Boolean): Unit = js.native
    
    def query(params: Record[String, String | Null]): Unit = js.native
    def query(params: Record[String, String | Null], replace: Boolean): Unit = js.native
    
    /** Removes the event listener in target's event listener list with the same type, callback, and options. */
    /* standard dom */
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    def replace(href: String): Unit = js.native
    
    var search: String = js.native
  }
  
  type _To = UrlState
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: UrlState = default
}
