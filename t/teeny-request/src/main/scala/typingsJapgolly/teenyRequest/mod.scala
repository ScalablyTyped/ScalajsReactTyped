package typingsJapgolly.teenyRequest

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.httpsMod.Agent
import typingsJapgolly.node.httpsMod.AgentOptions
import typingsJapgolly.node.streamMod.PassThrough
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.std.Error
import typingsJapgolly.teenyRequest.teenyRequestBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("teeny-request", "RequestError")
  @js.native
  open class RequestError ()
    extends StObject
       with Error {
    
    var code: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait CoreOptions extends StObject {
    
    var body: js.UndefOr[String | js.Object] = js.undefined
    
    var forever: js.UndefOr[Boolean] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var json: js.UndefOr[Any] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var multipart: js.UndefOr[js.Array[RequestPart]] = js.undefined
    
    var pool: js.UndefOr[AgentOptions | typingsJapgolly.node.httpMod.AgentOptions] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var qs: js.UndefOr[Any] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var useQuerystring: js.UndefOr[Boolean] = js.undefined
  }
  object CoreOptions {
    
    inline def apply(): CoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreOptions]
    }
    
    extension [Self <: CoreOptions](x: Self) {
      
      inline def setBody(value: String | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setForever(value: Boolean): Self = StObject.set(x, "forever", value.asInstanceOf[js.Any])
      
      inline def setForeverUndefined: Self = StObject.set(x, "forever", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMultipart(value: js.Array[RequestPart]): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
      
      inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
      
      inline def setMultipartVarargs(value: RequestPart*): Self = StObject.set(x, "multipart", js.Array(value*))
      
      inline def setPool(value: AgentOptions | typingsJapgolly.node.httpMod.AgentOptions): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setQs(value: Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseQuerystring(value: Boolean): Self = StObject.set(x, "useQuerystring", value.asInstanceOf[js.Any])
      
      inline def setUseQuerystringUndefined: Self = StObject.set(x, "useQuerystring", js.undefined)
    }
  }
  
  type Headers = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.teenyRequest.mod.OptionsWithUri
    - typingsJapgolly.teenyRequest.mod.OptionsWithUrl
  */
  trait Options extends StObject
  object Options {
    
    inline def OptionsWithUri(uri: String): typingsJapgolly.teenyRequest.mod.OptionsWithUri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.teenyRequest.mod.OptionsWithUri]
    }
    
    inline def OptionsWithUrl(url: String): typingsJapgolly.teenyRequest.mod.OptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.teenyRequest.mod.OptionsWithUrl]
    }
  }
  
  trait OptionsWithUri
    extends StObject
       with CoreOptions
       with Options {
    
    var uri: String
  }
  object OptionsWithUri {
    
    inline def apply(uri: String): OptionsWithUri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithUri]
    }
    
    extension [Self <: OptionsWithUri](x: Self) {
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsWithUrl
    extends StObject
       with CoreOptions
       with Options {
    
    var url: String
  }
  object OptionsWithUrl {
    
    inline def apply(url: String): OptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithUrl]
    }
    
    extension [Self <: OptionsWithUrl](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Request extends PassThrough {
    
    var agent: Agent | `false` = js.native
    
    var headers: Headers = js.native
    
    var href: js.UndefOr[String] = js.native
  }
  
  type RequestCallback[T] = js.Function3[
    /* err */ js.Error | Null, 
    /* response */ Response[Any], 
    /* body */ js.UndefOr[T], 
    Unit
  ]
  
  trait RequestPart extends StObject {
    
    var body: String | Readable
  }
  object RequestPart {
    
    inline def apply(body: String | Readable): RequestPart = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestPart]
    }
    
    extension [Self <: RequestPart](x: Self) {
      
      inline def setBody(value: String | Readable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response[T] extends StObject {
    
    var body: T
    
    var headers: Headers
    
    var request: Request
    
    var statusCode: Double
    
    var statusMessage: js.UndefOr[String] = js.undefined
  }
  object Response {
    
    inline def apply[T](body: T, headers: Headers, request: Request, statusCode: Double): Response[T] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[T]]
    }
    
    extension [Self <: Response[?], T](x: Self & Response[T]) {
      
      inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    }
  }
}
