package typingsJapgolly.flight

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LogAll extends StObject {
    
    def logAll(): Unit
    
    def logByAction(action: String): Unit
    
    def logByName(name: String): Unit
    
    def logNone(): Unit
  }
  object LogAll {
    
    inline def apply(
      logAll: Callback,
      logByAction: String => Callback,
      logByName: String => Callback,
      logNone: Callback
    ): LogAll = {
      val __obj = js.Dynamic.literal(logAll = logAll.toJsFn, logByAction = js.Any.fromFunction1((t0: String) => logByAction(t0).runNow()), logByName = js.Any.fromFunction1((t0: String) => logByName(t0).runNow()), logNone = logNone.toJsFn)
      __obj.asInstanceOf[LogAll]
    }
    
    extension [Self <: LogAll](x: Self) {
      
      inline def setLogAll(value: Callback): Self = StObject.set(x, "logAll", value.toJsFn)
      
      inline def setLogByAction(value: String => Callback): Self = StObject.set(x, "logByAction", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLogByName(value: String => Callback): Self = StObject.set(x, "logByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLogNone(value: Callback): Self = StObject.set(x, "logNone", value.toJsFn)
    }
  }
}
