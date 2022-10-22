package typingsJapgolly.meteorTypings

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.meteorTypings.anon.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorHttpMod {
  
  object HTTP {
    
    @JSImport("meteor/http", "HTTP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def call(method: String, url: String): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: Auth): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: Auth, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def del(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def del(url: String, callOptions: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def del(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def del(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def get(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def get(url: String, callOptions: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def get(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def get(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def post(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def post(url: String, callOptions: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def post(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def post(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def put(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def put(url: String, callOptions: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def put(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def put(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    trait HTTPRequest extends StObject {
      
      var auth: js.UndefOr[String] = js.undefined
      
      var content: js.UndefOr[String] = js.undefined
      
      var data: js.UndefOr[Any] = js.undefined
      
      var followRedirects: js.UndefOr[Boolean] = js.undefined
      
      var headers: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var npmRequestOptions: js.UndefOr[js.Object] = js.undefined
      
      var params: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var query: js.UndefOr[String] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object HTTPRequest {
      
      inline def apply(): HTTPRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTTPRequest]
      }
      
      extension [Self <: HTTPRequest](x: Self) {
        
        inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
        
        inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
        
        inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setNpmRequestOptions(value: js.Object): Self = StObject.set(x, "npmRequestOptions", value.asInstanceOf[js.Any])
        
        inline def setNpmRequestOptionsUndefined: Self = StObject.set(x, "npmRequestOptions", js.undefined)
        
        inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    trait HTTPResponse extends StObject {
      
      var content: js.UndefOr[String] = js.undefined
      
      var data: js.UndefOr[Any] = js.undefined
      
      var headers: js.UndefOr[StringDictionary[String]] = js.undefined
      
      var statusCode: js.UndefOr[Double] = js.undefined
    }
    object HTTPResponse {
      
      inline def apply(): HTTPResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTTPResponse]
      }
      
      extension [Self <: HTTPResponse](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
        
        inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      }
    }
  }
}
