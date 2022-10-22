package typingsJapgolly.consoleLogLevel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Logger = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Logger]
  inline def apply(opts: Options): Logger = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  @JSImport("console-log-level", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.trace
    - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.debug
    - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.info
    - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.warn
    - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.error
    - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.fatal
  */
  trait LogLevelNames extends StObject
  object LogLevelNames {
    
    inline def debug: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.debug = "debug".asInstanceOf[typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.debug]
    
    inline def error: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.error = "error".asInstanceOf[typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.error]
    
    inline def fatal: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.fatal = "fatal".asInstanceOf[typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.fatal]
    
    inline def info: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.info = "info".asInstanceOf[typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.info]
    
    inline def trace: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.trace = "trace".asInstanceOf[typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.trace]
    
    inline def warn: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.warn = "warn".asInstanceOf[typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.warn]
  }
  
  /* Inlined std.Record<console-log-level.console-log-level.LogLevelNames, (args : ...any): void> */
  trait Logger extends StObject {
    
    def debug(args: Any*): Unit
    @JSName("debug")
    var debug_Original: js.Function1[/* repeated */ Any, Unit]
    
    def error(args: Any*): Unit
    @JSName("error")
    var error_Original: js.Function1[/* repeated */ Any, Unit]
    
    def fatal(args: Any*): Unit
    @JSName("fatal")
    var fatal_Original: js.Function1[/* repeated */ Any, Unit]
    
    def info(args: Any*): Unit
    @JSName("info")
    var info_Original: js.Function1[/* repeated */ Any, Unit]
    
    def trace(args: Any*): Unit
    @JSName("trace")
    var trace_Original: js.Function1[/* repeated */ Any, Unit]
    
    def warn(args: Any*): Unit
    @JSName("warn")
    var warn_Original: js.Function1[/* repeated */ Any, Unit]
  }
  object Logger {
    
    inline def apply(
      debug: /* repeated */ Any => Callback,
      error: /* repeated */ Any => Callback,
      fatal: /* repeated */ Any => Callback,
      info: /* repeated */ Any => Callback,
      trace: /* repeated */ Any => Callback,
      warn: /* repeated */ Any => Callback
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), fatal = js.Any.fromFunction1((t0: /* repeated */ Any) => fatal(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), trace = js.Any.fromFunction1((t0: /* repeated */ Any) => trace(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setFatal(value: /* repeated */ Any => Callback): Self = StObject.set(x, "fatal", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setTrace(value: /* repeated */ Any => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
  
  trait Options extends StObject {
    
    var level: js.UndefOr[LogLevelNames] = js.undefined
    
    var prefix: js.UndefOr[String | PrefixFunction] = js.undefined
    
    var stderr: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLevel(value: LogLevelNames): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setPrefix(value: String | PrefixFunction): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixFunction1(value: /* level */ String => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    }
  }
  
  type PrefixFunction = js.Function1[/* level */ String, String]
}
