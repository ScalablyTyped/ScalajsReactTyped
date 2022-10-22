package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesEventSubscriptionMod {
  
  trait EventSubscription extends StObject {
    
    def remove(): Unit
  }
  object EventSubscription {
    
    inline def apply(remove: Callback): EventSubscription = {
      val __obj = js.Dynamic.literal(remove = remove.toJsFn)
      __obj.asInstanceOf[EventSubscription]
    }
    
    extension [Self <: EventSubscription](x: Self) {
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
}
