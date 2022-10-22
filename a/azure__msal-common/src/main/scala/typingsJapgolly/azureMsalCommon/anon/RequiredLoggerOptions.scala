package typingsJapgolly.azureMsalCommon.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.azureMsalCommon.distLoggerLoggerMod.ILoggerCallback
import typingsJapgolly.azureMsalCommon.distLoggerLoggerMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@azure/msal-common.@azure/msal-common/dist/config/ClientConfiguration.LoggerOptions> */
trait RequiredLoggerOptions extends StObject {
  
  var correlationId: String
  
  var logLevel: LogLevel
  
  def loggerCallback(level: LogLevel, message: String, containsPii: Boolean): Unit
  @JSName("loggerCallback")
  var loggerCallback_Original: ILoggerCallback
  
  var piiLoggingEnabled: Boolean
}
object RequiredLoggerOptions {
  
  inline def apply(
    correlationId: String,
    logLevel: LogLevel,
    loggerCallback: (/* level */ LogLevel, /* message */ String, /* containsPii */ Boolean) => Callback,
    piiLoggingEnabled: Boolean
  ): RequiredLoggerOptions = {
    val __obj = js.Dynamic.literal(correlationId = correlationId.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], loggerCallback = js.Any.fromFunction3((t0: /* level */ LogLevel, t1: /* message */ String, t2: /* containsPii */ Boolean) => (loggerCallback(t0, t1, t2)).runNow()), piiLoggingEnabled = piiLoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredLoggerOptions]
  }
  
  extension [Self <: RequiredLoggerOptions](x: Self) {
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLoggerCallback(value: (/* level */ LogLevel, /* message */ String, /* containsPii */ Boolean) => Callback): Self = StObject.set(x, "loggerCallback", js.Any.fromFunction3((t0: /* level */ LogLevel, t1: /* message */ String, t2: /* containsPii */ Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setPiiLoggingEnabled(value: Boolean): Self = StObject.set(x, "piiLoggingEnabled", value.asInstanceOf[js.Any])
  }
}
