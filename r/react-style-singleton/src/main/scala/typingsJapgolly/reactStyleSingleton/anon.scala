package typingsJapgolly.reactStyleSingleton

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Add extends StObject {
    
    def add(style: String): Unit
    
    def remove(): Unit
  }
  object Add {
    
    inline def apply(add: String => Callback, remove: Callback): Add = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: String) => add(t0).runNow()), remove = remove.toJsFn)
      __obj.asInstanceOf[Add]
    }
    
    extension [Self <: Add](x: Self) {
      
      inline def setAdd(value: String => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
}
