package typingsJapgolly.devexpressUtils

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassEventHandlersHolderMod {
  
  @JSImport("@devexpress/utils/lib/class/event-handlers-holder", "DomEventHandlersHolder")
  @js.native
  open class DomEventHandlersHolder () extends StObject {
    
    def addListener(element: Document, eventName: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def addListener(
      element: Document,
      eventName: String,
      handler: EventListenerOrEventListenerObject,
      options: Boolean
    ): Unit = js.native
    def addListener(
      element: Document,
      eventName: String,
      handler: EventListenerOrEventListenerObject,
      options: AddEventListenerOptions
    ): Unit = js.native
    def addListener(element: Element, eventName: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def addListener(element: Element, eventName: String, handler: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addListener(
      element: Element,
      eventName: String,
      handler: EventListenerOrEventListenerObject,
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def addListenerToDocument(eventName: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def addListenerToDocument(eventName: String, handler: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addListenerToDocument(eventName: String, handler: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def addListenerToWindow(eventName: String, handler: EventListenerOrEventListenerObject): Unit = js.native
    def addListenerToWindow(eventName: String, handler: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addListenerToWindow(eventName: String, handler: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* private */ var handlers: Any = js.native
    
    def removeAllListeners(): Unit = js.native
  }
}
