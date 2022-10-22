package typingsJapgolly.tsconfigPathsWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.chalk.mod.Chalk
import typingsJapgolly.tsconfigPathsWebpackPlugin.libOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoggerMod {
  
  @JSImport("tsconfig-paths-webpack-plugin/lib/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeLogger(options: Options, colors: Chalk): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLogger")(options.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Logger]
  
  trait Logger extends StObject {
    
    def log(message: String): Unit
    
    def logError(message: String): Unit
    @JSName("logError")
    var logError_Original: LoggerFunc
    
    def logInfo(message: String): Unit
    @JSName("logInfo")
    var logInfo_Original: LoggerFunc
    
    def logWarning(message: String): Unit
    @JSName("logWarning")
    var logWarning_Original: LoggerFunc
    
    @JSName("log")
    var log_Original: LoggerFunc
  }
  object Logger {
    
    inline def apply(
      log: /* message */ String => Callback,
      logError: /* message */ String => Callback,
      logInfo: /* message */ String => Callback,
      logWarning: /* message */ String => Callback
    ): Logger = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1((t0: /* message */ String) => log(t0).runNow()), logError = js.Any.fromFunction1((t0: /* message */ String) => logError(t0).runNow()), logInfo = js.Any.fromFunction1((t0: /* message */ String) => logInfo(t0).runNow()), logWarning = js.Any.fromFunction1((t0: /* message */ String) => logWarning(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setLog(value: /* message */ String => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
      
      inline def setLogError(value: /* message */ String => Callback): Self = StObject.set(x, "logError", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
      
      inline def setLogInfo(value: /* message */ String => Callback): Self = StObject.set(x, "logInfo", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
      
      inline def setLogWarning(value: /* message */ String => Callback): Self = StObject.set(x, "logWarning", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
    }
  }
  
  type LoggerFunc = js.Function1[/* message */ String, Unit]
}
