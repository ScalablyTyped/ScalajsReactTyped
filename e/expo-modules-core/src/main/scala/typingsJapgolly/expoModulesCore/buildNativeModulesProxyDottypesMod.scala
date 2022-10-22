package typingsJapgolly.expoModulesCore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildNativeModulesProxyDottypesMod {
  
  trait ProxyNativeModule
    extends StObject
       with /* propertyName */ StringDictionary[Any] {
    
    def addListener(eventName: String): Unit
    
    def removeListeners(count: Double): Unit
  }
  object ProxyNativeModule {
    
    inline def apply(addListener: String => Callback, removeListeners: Double => Callback): ProxyNativeModule = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1((t0: String) => addListener(t0).runNow()), removeListeners = js.Any.fromFunction1((t0: Double) => removeListeners(t0).runNow()))
      __obj.asInstanceOf[ProxyNativeModule]
    }
    
    extension [Self <: ProxyNativeModule](x: Self) {
      
      inline def setAddListener(value: String => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveListeners(value: Double => Callback): Self = StObject.set(x, "removeListeners", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
