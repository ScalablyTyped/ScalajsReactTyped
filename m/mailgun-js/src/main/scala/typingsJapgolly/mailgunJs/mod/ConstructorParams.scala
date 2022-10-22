package typingsJapgolly.mailgunJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.mailgunJs.anon.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorParams extends StObject {
  
  var apiKey: String
  
  var domain: String
  
  var endpoint: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var mute: js.UndefOr[Boolean] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[String] = js.undefined
  
  var publicApiKey: js.UndefOr[String] = js.undefined
  
  var retry: js.UndefOr[Double | Interval] = js.undefined
  
  var testMode: js.UndefOr[Boolean] = js.undefined
  
  var testModeLogger: js.UndefOr[
    js.Function3[
      /* httpOptions */ LoggerHttpOptions, 
      /* payload */ String, 
      /* form */ typingsJapgolly.formData.mod.^, 
      Unit
    ]
  ] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object ConstructorParams {
  
  inline def apply(apiKey: String, domain: String): ConstructorParams = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorParams]
  }
  
  extension [Self <: ConstructorParams](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setPublicApiKey(value: String): Self = StObject.set(x, "publicApiKey", value.asInstanceOf[js.Any])
    
    inline def setPublicApiKeyUndefined: Self = StObject.set(x, "publicApiKey", js.undefined)
    
    inline def setRetry(value: Double | Interval): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setTestMode(value: Boolean): Self = StObject.set(x, "testMode", value.asInstanceOf[js.Any])
    
    inline def setTestModeLogger(
      value: (/* httpOptions */ LoggerHttpOptions, /* payload */ String, /* form */ typingsJapgolly.formData.mod.^) => Callback
    ): Self = StObject.set(x, "testModeLogger", js.Any.fromFunction3((t0: /* httpOptions */ LoggerHttpOptions, t1: /* payload */ String, t2: /* form */ typingsJapgolly.formData.mod.^) => (value(t0, t1, t2)).runNow()))
    
    inline def setTestModeLoggerUndefined: Self = StObject.set(x, "testModeLogger", js.undefined)
    
    inline def setTestModeUndefined: Self = StObject.set(x, "testMode", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
