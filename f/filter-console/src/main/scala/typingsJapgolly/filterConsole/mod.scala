package typingsJapgolly.filterConsole

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("filter-console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(excludePatterns: js.Array[String | js.RegExp | (js.Function1[/* output */ String, Boolean])]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(excludePatterns.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def default(
    excludePatterns: js.Array[String | js.RegExp | (js.Function1[/* output */ String, Boolean])],
    options: Options
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(excludePatterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  /* Inlined std.Record<filter-console.filter-console.ConsoleMethods, (message : unknown | undefined, optionalParameters : ...unknown): void> */
  trait Console extends StObject {
    
    def debug(message: Any, optionalParameters: Any*): Unit
    def debug(message: Unit, optionalParameters: Any*): Unit
    @JSName("debug")
    var debug_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    
    def error(message: Any, optionalParameters: Any*): Unit
    def error(message: Unit, optionalParameters: Any*): Unit
    @JSName("error")
    var error_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    
    def info(message: Any, optionalParameters: Any*): Unit
    def info(message: Unit, optionalParameters: Any*): Unit
    @JSName("info")
    var info_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    
    def log(message: Any, optionalParameters: Any*): Unit
    def log(message: Unit, optionalParameters: Any*): Unit
    @JSName("log")
    var log_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    
    def warn(message: Any, optionalParameters: Any*): Unit
    def warn(message: Unit, optionalParameters: Any*): Unit
    @JSName("warn")
    var warn_Original: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
  }
  object Console {
    
    inline def apply(
      debug: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback,
      error: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback,
      info: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback,
      log: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback,
      warn: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback
    ): Console = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (debug(t0, t1)).runNow()), error = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (error(t0, t1)).runNow()), info = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (info(t0, t1)).runNow()), log = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (log(t0, t1)).runNow()), warn = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (warn(t0, t1)).runNow()))
      __obj.asInstanceOf[Console]
    }
    
    extension [Self <: Console](x: Self) {
      
      inline def setDebug(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setError(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setInfo(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "info", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setLog(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setWarn(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.filterConsole.filterConsoleStrings.log
    - typingsJapgolly.filterConsole.filterConsoleStrings.debug
    - typingsJapgolly.filterConsole.filterConsoleStrings.info
    - typingsJapgolly.filterConsole.filterConsoleStrings.warn
    - typingsJapgolly.filterConsole.filterConsoleStrings.error
  */
  trait ConsoleMethods extends StObject
  object ConsoleMethods {
    
    inline def debug: typingsJapgolly.filterConsole.filterConsoleStrings.debug = "debug".asInstanceOf[typingsJapgolly.filterConsole.filterConsoleStrings.debug]
    
    inline def error: typingsJapgolly.filterConsole.filterConsoleStrings.error = "error".asInstanceOf[typingsJapgolly.filterConsole.filterConsoleStrings.error]
    
    inline def info: typingsJapgolly.filterConsole.filterConsoleStrings.info = "info".asInstanceOf[typingsJapgolly.filterConsole.filterConsoleStrings.info]
    
    inline def log: typingsJapgolly.filterConsole.filterConsoleStrings.log = "log".asInstanceOf[typingsJapgolly.filterConsole.filterConsoleStrings.log]
    
    inline def warn: typingsJapgolly.filterConsole.filterConsoleStrings.warn = "warn".asInstanceOf[typingsJapgolly.filterConsole.filterConsoleStrings.warn]
  }
  
  trait Options extends StObject {
    
    /**
    	Use a custom `console` object. Can be useful for testing or mocking.
    	@default console
    	*/
    val console: js.UndefOr[Console] = js.undefined
    
    /**
    	Console methods to filter.
    	@default ['log', 'debug', 'info', 'warn', 'error']
    	*/
    val methods: js.UndefOr[js.Array[ConsoleMethods]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setMethods(value: js.Array[ConsoleMethods]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: ConsoleMethods*): Self = StObject.set(x, "methods", js.Array(value*))
    }
  }
}
