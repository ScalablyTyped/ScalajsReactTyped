package typingsJapgolly.fabric.fabricImplMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtilDomEvent extends StObject {
  
  /**
    * Adds an event listener to an element
    */
  def addListener(element: HTMLElement, eventName: String, handler: js.Function): Unit
  
  /**
    * Cross-browser wrapper for getting event's coordinates
    * @param event Event object
    * @param upperCanvasEl &lt;canvas> element on which object selection is drawn
    */
  def getPointer(event: Event, upperCanvasEl: HTMLCanvasElement): Point
  
  /**
    * Removes an event listener from an element
    */
  def removeListener(element: HTMLElement, eventName: String, handler: js.Function): Unit
}
object IUtilDomEvent {
  
  inline def apply(
    addListener: (HTMLElement, String, js.Function) => Callback,
    getPointer: (Event, HTMLCanvasElement) => Point,
    removeListener: (HTMLElement, String, js.Function) => Callback
  ): IUtilDomEvent = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction3((t0: HTMLElement, t1: String, t2: js.Function) => (addListener(t0, t1, t2)).runNow()), getPointer = js.Any.fromFunction2(getPointer), removeListener = js.Any.fromFunction3((t0: HTMLElement, t1: String, t2: js.Function) => (removeListener(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[IUtilDomEvent]
  }
  
  extension [Self <: IUtilDomEvent](x: Self) {
    
    inline def setAddListener(value: (HTMLElement, String, js.Function) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction3((t0: HTMLElement, t1: String, t2: js.Function) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetPointer(value: (Event, HTMLCanvasElement) => Point): Self = StObject.set(x, "getPointer", js.Any.fromFunction2(value))
    
    inline def setRemoveListener(value: (HTMLElement, String, js.Function) => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction3((t0: HTMLElement, t1: String, t2: js.Function) => (value(t0, t1, t2)).runNow()))
  }
}
