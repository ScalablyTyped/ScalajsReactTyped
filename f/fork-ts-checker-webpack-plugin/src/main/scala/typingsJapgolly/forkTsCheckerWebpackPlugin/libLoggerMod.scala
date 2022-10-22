package typingsJapgolly.forkTsCheckerWebpackPlugin

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoggerMod {
  
  trait Logger extends StObject {
    
    def error(message: String): Unit
    
    def log(message: String): Unit
  }
  object Logger {
    
    inline def apply(error: String => Callback, log: String => Callback): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), log = js.Any.fromFunction1((t0: String) => log(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLog(value: String => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
