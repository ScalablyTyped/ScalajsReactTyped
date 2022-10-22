package typingsJapgolly.materialCircularProgress

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCCircularProgressAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def getDeterminateCircleAttribute(attributeName: String): String | Null
    
    def hasClass(className: String): Boolean
    
    def removeAttribute(attributeName: String): Unit
    
    def removeClass(className: String): Unit
    
    def setAttribute(attributeName: String, value: String): Unit
    
    def setDeterminateCircleAttribute(attributeName: String, value: String): Unit
  }
  object MDCCircularProgressAdapter {
    
    inline def apply(
      addClass: String => Callback,
      getDeterminateCircleAttribute: String => String | Null,
      hasClass: String => Boolean,
      removeAttribute: String => Callback,
      removeClass: String => Callback,
      setAttribute: (String, String) => Callback,
      setDeterminateCircleAttribute: (String, String) => Callback
    ): MDCCircularProgressAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), getDeterminateCircleAttribute = js.Any.fromFunction1(getDeterminateCircleAttribute), hasClass = js.Any.fromFunction1(hasClass), removeAttribute = js.Any.fromFunction1((t0: String) => removeAttribute(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setAttribute(t0, t1)).runNow()), setDeterminateCircleAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setDeterminateCircleAttribute(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCCircularProgressAdapter]
    }
    
    extension [Self <: MDCCircularProgressAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetDeterminateCircleAttribute(value: String => String | Null): Self = StObject.set(x, "getDeterminateCircleAttribute", js.Any.fromFunction1(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRemoveAttribute(value: String => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetDeterminateCircleAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setDeterminateCircleAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
