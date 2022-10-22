package typingsJapgolly.mangopay2NodejsSdk.typingsBaseMod.base

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  /**
    * API Version
    * @default 'v2.01'
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * API Base URL.The fault base value points to sandbox.
    * Production is 'https://api.mangopay.com'
    *
    * @default "https://api.sandbox.mangopay.com"
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * API Client Api Key
    */
  var clientApiKey: String
  
  /**
    * API Client Id
    */
  var clientId: String
  
  /**
    * Set the connection timeout limit(in milliseconds)
    * @default 30000
    */
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Active debugging
    * @default false
    */
  var debugMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set a custom error handler
    * @default `console.error`
    */
  var errorHandler: js.UndefOr[js.Function2[/* options */ Any, /* err */ Any, Unit]] = js.undefined
  
  /**
    * Log function to be used for debug
    * @default `console.log`
    */
  var logClass: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  /**
    * Set the response timeout limit(in milliseconds)
    * @default 80000
    */
  var responseTimeout: js.UndefOr[Double] = js.undefined
}
object Config {
  
  inline def apply(clientApiKey: String, clientId: String): Config = {
    val __obj = js.Dynamic.literal(clientApiKey = clientApiKey.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setClientApiKey(value: String): Self = StObject.set(x, "clientApiKey", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
    
    inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
    
    inline def setErrorHandler(value: (/* options */ Any, /* err */ Any) => Callback): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2((t0: /* options */ Any, t1: /* err */ Any) => (value(t0, t1)).runNow()))
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setLogClass(value: /* repeated */ Any => Callback): Self = StObject.set(x, "logClass", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setLogClassUndefined: Self = StObject.set(x, "logClass", js.undefined)
    
    inline def setResponseTimeout(value: Double): Self = StObject.set(x, "responseTimeout", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeoutUndefined: Self = StObject.set(x, "responseTimeout", js.undefined)
  }
}
