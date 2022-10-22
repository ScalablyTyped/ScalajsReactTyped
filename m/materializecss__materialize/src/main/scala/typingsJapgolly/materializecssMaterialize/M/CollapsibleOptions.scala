package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleOptions extends StObject {
  
  /**
    * If accordion versus collapsible
    * @default true
    */
  var accordion: Boolean
  
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: Double
  
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit
  
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit
  
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit
  
  /**
    * Transition out duration in milliseconds.
    * @default 300
    */
  var outDuration: Double
}
object CollapsibleOptions {
  
  inline def apply(
    accordion: Boolean,
    inDuration: Double,
    onCloseEnd: Element => Callback,
    onCloseStart: Element => Callback,
    onOpenEnd: Element => Callback,
    onOpenStart: Element => Callback,
    outDuration: Double
  ): CollapsibleOptions = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1((t0: Element) => onCloseEnd(t0).runNow()), onCloseStart = js.Any.fromFunction1((t0: Element) => onCloseStart(t0).runNow()), onOpenEnd = js.Any.fromFunction1((t0: Element) => onOpenEnd(t0).runNow()), onOpenStart = js.Any.fromFunction1((t0: Element) => onOpenStart(t0).runNow()), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleOptions]
  }
  
  extension [Self <: CollapsibleOptions](x: Self) {
    
    inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEnd(value: Element => Callback): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnCloseStart(value: Element => Callback): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenEnd(value: Element => Callback): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenStart(value: Element => Callback): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
  }
}
