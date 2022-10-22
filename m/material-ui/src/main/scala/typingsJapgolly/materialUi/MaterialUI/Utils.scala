package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typingsJapgolly.materialUi.anon.Left
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  object ColorManipulator {
    
    trait MuiColorObject extends StObject {
      
      var `type`: String
      
      var values: js.Array[Double]
    }
    object MuiColorObject {
      
      inline def apply(`type`: String, values: js.Array[Double]): MuiColorObject = {
        val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[MuiColorObject]
      }
      
      extension [Self <: MuiColorObject](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
      }
    }
  }
  
  trait Dom extends StObject {
    
    def addClass(el: Element, className: String): Unit
    
    def forceRedraw(el: HTMLElement): Unit
    
    def getStyleAttributeAsNumber(el: HTMLElement, attr: String): Double
    
    def hasClass(el: Element, className: String): Boolean
    
    def isDescendant(parent: Node, child: Node): Boolean
    
    def offset(el: Element): Left
    
    def removeClass(el: Element, className: String): Unit
    
    def toggleClass(el: Element, className: String): Unit
    
    def withoutTransition(el: HTMLElement, callback: js.Function0[Unit]): Unit
  }
  object Dom {
    
    inline def apply(
      addClass: (Element, String) => Callback,
      forceRedraw: HTMLElement => Callback,
      getStyleAttributeAsNumber: (HTMLElement, String) => Double,
      hasClass: (Element, String) => Boolean,
      isDescendant: (Node, Node) => Boolean,
      offset: Element => Left,
      removeClass: (Element, String) => Callback,
      toggleClass: (Element, String) => Callback,
      withoutTransition: (HTMLElement, js.Function0[Unit]) => Callback
    ): Dom = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction2((t0: Element, t1: String) => (addClass(t0, t1)).runNow()), forceRedraw = js.Any.fromFunction1((t0: HTMLElement) => forceRedraw(t0).runNow()), getStyleAttributeAsNumber = js.Any.fromFunction2(getStyleAttributeAsNumber), hasClass = js.Any.fromFunction2(hasClass), isDescendant = js.Any.fromFunction2(isDescendant), offset = js.Any.fromFunction1(offset), removeClass = js.Any.fromFunction2((t0: Element, t1: String) => (removeClass(t0, t1)).runNow()), toggleClass = js.Any.fromFunction2((t0: Element, t1: String) => (toggleClass(t0, t1)).runNow()), withoutTransition = js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[Unit]) => (withoutTransition(t0, t1)).runNow()))
      __obj.asInstanceOf[Dom]
    }
    
    extension [Self <: Dom](x: Self) {
      
      inline def setAddClass(value: (Element, String) => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction2((t0: Element, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setForceRedraw(value: HTMLElement => Callback): Self = StObject.set(x, "forceRedraw", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def setGetStyleAttributeAsNumber(value: (HTMLElement, String) => Double): Self = StObject.set(x, "getStyleAttributeAsNumber", js.Any.fromFunction2(value))
      
      inline def setHasClass(value: (Element, String) => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction2(value))
      
      inline def setIsDescendant(value: (Node, Node) => Boolean): Self = StObject.set(x, "isDescendant", js.Any.fromFunction2(value))
      
      inline def setOffset(value: Element => Left): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: (Element, String) => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction2((t0: Element, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setToggleClass(value: (Element, String) => Callback): Self = StObject.set(x, "toggleClass", js.Any.fromFunction2((t0: Element, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setWithoutTransition(value: (HTMLElement, js.Function0[Unit]) => Callback): Self = StObject.set(x, "withoutTransition", js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Events extends StObject {
    
    def isKeyboard(e: Event): Boolean
    
    def off(el: Element, `type`: String, callback: EventListener): Unit
    
    def on(el: Element, `type`: String, callback: EventListener): Unit
    
    def once(el: Element, `type`: String, callback: EventListener): Unit
  }
  object Events {
    
    inline def apply(
      isKeyboard: Event => Boolean,
      off: (Element, String, EventListener) => Callback,
      on: (Element, String, EventListener) => Callback,
      once: (Element, String, EventListener) => Callback
    ): Events = {
      val __obj = js.Dynamic.literal(isKeyboard = js.Any.fromFunction1(isKeyboard), off = js.Any.fromFunction3((t0: Element, t1: String, t2: EventListener) => (off(t0, t1, t2)).runNow()), on = js.Any.fromFunction3((t0: Element, t1: String, t2: EventListener) => (on(t0, t1, t2)).runNow()), once = js.Any.fromFunction3((t0: Element, t1: String, t2: EventListener) => (once(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setIsKeyboard(value: Event => Boolean): Self = StObject.set(x, "isKeyboard", js.Any.fromFunction1(value))
      
      inline def setOff(value: (Element, String, EventListener) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction3((t0: Element, t1: String, t2: EventListener) => (value(t0, t1, t2)).runNow()))
      
      inline def setOn(value: (Element, String, EventListener) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction3((t0: Element, t1: String, t2: EventListener) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnce(value: (Element, String, EventListener) => Callback): Self = StObject.set(x, "once", js.Any.fromFunction3((t0: Element, t1: String, t2: EventListener) => (value(t0, t1, t2)).runNow()))
    }
  }
}
