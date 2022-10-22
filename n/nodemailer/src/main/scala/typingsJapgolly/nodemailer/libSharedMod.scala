package typingsJapgolly.nodemailer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.nodemailer.libSmtpConnectionMod.Options
import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import typingsJapgolly.nodemailer.nodemailerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSharedMod {
  
  @JSImport("nodemailer/lib/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Object, sources: js.Object*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  
  inline def callbackPromise(resolve: js.Function1[/* repeated */ Any, Unit], reject: js.Function1[/* err */ js.Error, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("callbackPromise")(resolve.asInstanceOf[js.Any], reject.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def encodeXText(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeXText")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[Logger]
  inline def getLogger(options: StringDictionary[Any]): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(options.asInstanceOf[js.Any]).asInstanceOf[Logger]
  inline def getLogger(options: StringDictionary[Any], defaults: StringDictionary[Any]): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Logger]
  inline def getLogger(options: Unit, defaults: StringDictionary[Any]): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Logger]
  
  inline def parseConnectionUrl(url: String): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("parseConnectionUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Options]
  
  inline def resolveContent(data: js.Array[Any], key: String): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  inline def resolveContent(
    data: js.Array[Any],
    key: String,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveContent(data: js.Array[Any], key: Double): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  inline def resolveContent(
    data: js.Array[Any],
    key: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveContent(data: js.Object, key: String): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  inline def resolveContent(
    data: js.Object,
    key: String,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveContent(data: js.Object, key: Double): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  inline def resolveContent(
    data: js.Object,
    key: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveHostname(
    options: Null,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHostname")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveHostname(
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHostname")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveHostname(
    options: ResolveHostnameOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHostname")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Logger extends StObject {
    
    def debug(params: Any*): Unit
    
    def error(params: Any*): Unit
    
    def fatal(params: Any*): Unit
    
    def info(params: Any*): Unit
    
    def level(level: LoggerLevel): Unit
    
    def trace(params: Any*): Unit
    
    def warn(params: Any*): Unit
  }
  object Logger {
    
    inline def apply(
      debug: /* repeated */ Any => Callback,
      error: /* repeated */ Any => Callback,
      fatal: /* repeated */ Any => Callback,
      info: /* repeated */ Any => Callback,
      level: LoggerLevel => Callback,
      trace: /* repeated */ Any => Callback,
      warn: /* repeated */ Any => Callback
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), fatal = js.Any.fromFunction1((t0: /* repeated */ Any) => fatal(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), level = js.Any.fromFunction1((t0: LoggerLevel) => level(t0).runNow()), trace = js.Any.fromFunction1((t0: /* repeated */ Any) => trace(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setFatal(value: /* repeated */ Any => Callback): Self = StObject.set(x, "fatal", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setLevel(value: LoggerLevel => Callback): Self = StObject.set(x, "level", js.Any.fromFunction1((t0: LoggerLevel) => value(t0).runNow()))
      
      inline def setTrace(value: /* repeated */ Any => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodemailer.nodemailerStrings.trace
    - typingsJapgolly.nodemailer.nodemailerStrings.debug
    - typingsJapgolly.nodemailer.nodemailerStrings.info
    - typingsJapgolly.nodemailer.nodemailerStrings.warn
    - typingsJapgolly.nodemailer.nodemailerStrings.error
    - typingsJapgolly.nodemailer.nodemailerStrings.fatal
  */
  trait LoggerLevel extends StObject
  object LoggerLevel {
    
    inline def debug: typingsJapgolly.nodemailer.nodemailerStrings.debug = "debug".asInstanceOf[typingsJapgolly.nodemailer.nodemailerStrings.debug]
    
    inline def error: typingsJapgolly.nodemailer.nodemailerStrings.error = "error".asInstanceOf[typingsJapgolly.nodemailer.nodemailerStrings.error]
    
    inline def fatal: typingsJapgolly.nodemailer.nodemailerStrings.fatal = "fatal".asInstanceOf[typingsJapgolly.nodemailer.nodemailerStrings.fatal]
    
    inline def info: typingsJapgolly.nodemailer.nodemailerStrings.info = "info".asInstanceOf[typingsJapgolly.nodemailer.nodemailerStrings.info]
    
    inline def trace: typingsJapgolly.nodemailer.nodemailerStrings.trace = "trace".asInstanceOf[typingsJapgolly.nodemailer.nodemailerStrings.trace]
    
    inline def warn: typingsJapgolly.nodemailer.nodemailerStrings.warn = "warn".asInstanceOf[typingsJapgolly.nodemailer.nodemailerStrings.warn]
  }
  
  trait ResolveHostnameOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var servername: js.UndefOr[String | `false`] = js.undefined
  }
  object ResolveHostnameOptions {
    
    inline def apply(): ResolveHostnameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveHostnameOptions]
    }
    
    extension [Self <: ResolveHostnameOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setServername(value: String | `false`): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    }
  }
  
  trait ResolveHostnameValue extends StObject {
    
    var _cached: js.UndefOr[`true`] = js.undefined
    
    var host: String
    
    var servername: String | `false`
  }
  object ResolveHostnameValue {
    
    inline def apply(host: String, servername: String | `false`): ResolveHostnameValue = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], servername = servername.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveHostnameValue]
    }
    
    extension [Self <: ResolveHostnameValue](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setServername(value: String | `false`): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def set_cached(value: `true`): Self = StObject.set(x, "_cached", value.asInstanceOf[js.Any])
      
      inline def set_cachedUndefined: Self = StObject.set(x, "_cached", js.undefined)
    }
  }
}
