package typingsJapgolly.awsSdkTypes

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoggerMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.all
    - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.log
    - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.info
    - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.warn
    - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.error
    - typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.off
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def all: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.all = "all".asInstanceOf[typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.all]
    
    inline def error: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.error = "error".asInstanceOf[typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.error]
    
    inline def info: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.info = "info".asInstanceOf[typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.info]
    
    inline def log: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.log = "log".asInstanceOf[typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.log]
    
    inline def off: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.off = "off".asInstanceOf[typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.off]
    
    inline def warn: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.warn = "warn".asInstanceOf[typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.warn]
  }
  
  trait Logger extends StObject {
    
    def debug(content: Any*): Unit
    
    def error(content: Any*): Unit
    
    def info(content: Any*): Unit
    
    def warn(content: Any*): Unit
  }
  object Logger {
    
    inline def apply(
      debug: /* repeated */ Any => Callback,
      error: /* repeated */ Any => Callback,
      info: /* repeated */ Any => Callback,
      warn: /* repeated */ Any => Callback
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
  
  trait LoggerOptions extends StObject {
    
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
