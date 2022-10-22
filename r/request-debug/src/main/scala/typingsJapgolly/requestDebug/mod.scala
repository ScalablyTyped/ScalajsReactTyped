package typingsJapgolly.requestDebug

import typingsJapgolly.request.mod.CoreOptions
import typingsJapgolly.request.mod.Headers
import typingsJapgolly.request.mod.Request
import typingsJapgolly.request.mod.RequestAPI
import typingsJapgolly.request.mod.RequiredUriUrl
import typingsJapgolly.requestDebug.requestDebugStrings.auth
import typingsJapgolly.requestDebug.requestDebugStrings.redirect
import typingsJapgolly.requestDebug.requestDebugStrings.request
import typingsJapgolly.requestDebug.requestDebugStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](request: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = ^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](
    request: RequestAPI[TRequest, TOptions, TUriUrlOptions],
    cb: LogCallback[TRequest, TOptions, TUriUrlOptions]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("request-debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("request-debug", "log")
  @js.native
  val log: LogCallback[Request, CoreOptions, RequiredUriUrl] = js.native
  
  @js.native
  trait LogCallback[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */] extends StObject {
    
    def apply(`type`: redirect | auth, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: LogPhase, data: LogData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: request, data: RequestData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: response, data: ResponseData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.requestDebug.mod.RequestData
    - typingsJapgolly.requestDebug.mod.ResponseData
    - typingsJapgolly.requestDebug.mod.RedirectData
  */
  trait LogData extends StObject
  object LogData {
    
    inline def RedirectData(debugId: Double, headers: Headers, statusCode: Double, uri: String): typingsJapgolly.requestDebug.mod.RedirectData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.requestDebug.mod.RedirectData]
    }
    
    inline def RequestData(debugId: Double, headers: Headers, method: String, uri: String): typingsJapgolly.requestDebug.mod.RequestData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.requestDebug.mod.RequestData]
    }
    
    inline def ResponseData(debugId: Double, headers: Headers, statusCode: Double): typingsJapgolly.requestDebug.mod.ResponseData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.requestDebug.mod.ResponseData]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.requestDebug.requestDebugStrings.request
    - typingsJapgolly.requestDebug.requestDebugStrings.response
    - typingsJapgolly.requestDebug.requestDebugStrings.redirect
    - typingsJapgolly.requestDebug.requestDebugStrings.auth
  */
  trait LogPhase extends StObject
  object LogPhase {
    
    inline def auth: typingsJapgolly.requestDebug.requestDebugStrings.auth = "auth".asInstanceOf[typingsJapgolly.requestDebug.requestDebugStrings.auth]
    
    inline def redirect: typingsJapgolly.requestDebug.requestDebugStrings.redirect = "redirect".asInstanceOf[typingsJapgolly.requestDebug.requestDebugStrings.redirect]
    
    inline def request: typingsJapgolly.requestDebug.requestDebugStrings.request = "request".asInstanceOf[typingsJapgolly.requestDebug.requestDebugStrings.request]
    
    inline def response: typingsJapgolly.requestDebug.requestDebugStrings.response = "response".asInstanceOf[typingsJapgolly.requestDebug.requestDebugStrings.response]
  }
  
  trait RedirectData
    extends StObject
       with LogData {
    
    var debugId: Double
    
    var headers: Headers
    
    var statusCode: Double
    
    var uri: String
  }
  object RedirectData {
    
    inline def apply(debugId: Double, headers: Headers, statusCode: Double, uri: String): RedirectData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectData]
    }
    
    extension [Self <: RedirectData](x: Self) {
      
      inline def setDebugId(value: Double): Self = StObject.set(x, "debugId", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestData
    extends StObject
       with LogData {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var debugId: Double
    
    var headers: Headers
    
    var method: String
    
    var uri: String
  }
  object RequestData {
    
    inline def apply(debugId: Double, headers: Headers, method: String, uri: String): RequestData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    extension [Self <: RequestData](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDebugId(value: Double): Self = StObject.set(x, "debugId", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseData
    extends StObject
       with LogData {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var debugId: Double
    
    var headers: Headers
    
    var statusCode: Double
  }
  object ResponseData {
    
    inline def apply(debugId: Double, headers: Headers, statusCode: Double): ResponseData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseData]
    }
    
    extension [Self <: ResponseData](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDebugId(value: Double): Self = StObject.set(x, "debugId", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
