package typingsJapgolly.ava

import japgolly.scalajs.react.Callback
import typingsJapgolly.ava.anon.Complete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSubscribableMod {
  
  trait Subscribable extends StObject {
    
    def subscribe(observer: Complete): Unit
  }
  object Subscribable {
    
    inline def apply(subscribe: Complete => Callback): Subscribable = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1((t0: Complete) => subscribe(t0).runNow()))
      __obj.asInstanceOf[Subscribable]
    }
    
    extension [Self <: Subscribable](x: Self) {
      
      inline def setSubscribe(value: Complete => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction1((t0: Complete) => value(t0).runNow()))
    }
  }
}
