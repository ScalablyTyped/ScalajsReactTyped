package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscLoggingSrcLoggerMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/logging/src/logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    @js.native
    sealed trait debug
      extends StObject
         with LogLevel
    /* 0 */ val debug: typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.debug & Double = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with LogLevel
    /* 3 */ val error: typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.error & Double = js.native
    
    @js.native
    sealed trait info
      extends StObject
         with LogLevel
    /* 1 */ val info: typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.info & Double = js.native
    
    @js.native
    sealed trait warn
      extends StObject
         with LogLevel
    /* 2 */ val warn: typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.warn & Double = js.native
  }
  
  trait Logger extends StObject {
    
    def debug(args: String*): Unit
    
    def error(args: String*): Unit
    
    def info(args: String*): Unit
    
    var level: LogLevel
    
    def warn(args: String*): Unit
  }
  object Logger {
    
    inline def apply(
      debug: /* repeated */ String => Callback,
      error: /* repeated */ String => Callback,
      info: /* repeated */ String => Callback,
      level: LogLevel,
      warn: /* repeated */ String => Callback
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ String) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ String) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ String) => info(t0).runNow()), level = level.asInstanceOf[js.Any], warn = js.Any.fromFunction1((t0: /* repeated */ String) => warn(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: /* repeated */ String => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
      
      inline def setError(value: /* repeated */ String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
      
      inline def setInfo(value: /* repeated */ String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: /* repeated */ String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
    }
  }
}
