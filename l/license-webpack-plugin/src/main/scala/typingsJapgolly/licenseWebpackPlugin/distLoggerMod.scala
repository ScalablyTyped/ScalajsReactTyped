package typingsJapgolly.licenseWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerMod {
  
  trait Logger extends StObject {
    
    def error(compilation: WebpackCompilation, message: String): Unit
    
    /* private */ var stats: Any
    
    def warn(compilation: WebpackCompilation, message: String): Unit
  }
  object Logger {
    
    inline def apply(
      error: (WebpackCompilation, String) => Callback,
      stats: Any,
      warn: (WebpackCompilation, String) => Callback
    ): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction2((t0: WebpackCompilation, t1: String) => (error(t0, t1)).runNow()), stats = stats.asInstanceOf[js.Any], warn = js.Any.fromFunction2((t0: WebpackCompilation, t1: String) => (warn(t0, t1)).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setError(value: (WebpackCompilation, String) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction2((t0: WebpackCompilation, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setStats(value: Any): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: (WebpackCompilation, String) => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction2((t0: WebpackCompilation, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
