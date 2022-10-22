package typingsJapgolly.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback extends StObject {
    
    def callback(fragment: String): Unit
    
    var routePattern: js.RegExp
  }
  object Callback {
    
    inline def apply(callback: String => japgolly.scalajs.react.Callback, routePattern: js.RegExp): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: String) => callback(t0).runNow()), routePattern = routePattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRoutePattern(value: js.RegExp): Self = StObject.set(x, "routePattern", value.asInstanceOf[js.Any])
    }
  }
}
