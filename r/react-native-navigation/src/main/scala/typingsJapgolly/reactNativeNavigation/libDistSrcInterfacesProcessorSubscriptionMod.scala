package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesProcessorSubscriptionMod {
  
  trait ProcessorSubscription extends StObject {
    
    def remove(): Unit
  }
  object ProcessorSubscription {
    
    inline def apply(remove: Callback): ProcessorSubscription = {
      val __obj = js.Dynamic.literal(remove = remove.toJsFn)
      __obj.asInstanceOf[ProcessorSubscription]
    }
    
    extension [Self <: ProcessorSubscription](x: Self) {
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    }
  }
}
