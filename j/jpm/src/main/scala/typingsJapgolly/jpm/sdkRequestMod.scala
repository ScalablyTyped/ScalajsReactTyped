package typingsJapgolly.jpm

import japgolly.scalajs.react.Callback
import typingsJapgolly.jpm.FFAddonSDK.SDKURL
import typingsJapgolly.jpm.anon.Anonymous
import typingsJapgolly.jpm.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Make simple network requests
  */
object sdkRequestMod {
  
  trait Request
    extends StObject
       with BaseRequest {
    
    var response: Response
  }
  object Request {
    
    @JSImport("sdk/request", "Request")
    @js.native
    def apply(options: Anonymous): Request = js.native
    @JSImport("sdk/request", "Request")
    @js.native
    def apply[ResponseType](options: Content[ResponseType]): STRequest[ResponseType] = js.native
    
    extension [Self <: Request](x: Self) {
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseRequest extends StObject {
    
    var content: String
    
    var contentType: String
    
    def delete(): Unit
    
    def get(): Unit
    
    def head(): Unit
    
    var headers: js.Object
    
    def post(): Unit
    
    def put(): Unit
    
    var url: String | SDKURL
  }
  object BaseRequest {
    
    inline def apply(
      content: String,
      contentType: String,
      delete: Callback,
      get: Callback,
      head: Callback,
      headers: js.Object,
      post: Callback,
      put: Callback,
      url: String | SDKURL
    ): BaseRequest = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], delete = delete.toJsFn, get = get.toJsFn, head = head.toJsFn, headers = headers.asInstanceOf[js.Any], post = post.toJsFn, put = put.toJsFn, url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseRequest]
    }
    
    extension [Self <: BaseRequest](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: Callback): Self = StObject.set(x, "delete", value.toJsFn)
      
      inline def setGet(value: Callback): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setHead(value: Callback): Self = StObject.set(x, "head", value.toJsFn)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPost(value: Callback): Self = StObject.set(x, "post", value.toJsFn)
      
      inline def setPut(value: Callback): Self = StObject.set(x, "put", value.toJsFn)
      
      inline def setUrl(value: String | SDKURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseResponse extends StObject {
    
    var anonymous: Boolean
    
    var headers: js.Object
    
    var status: Double
    
    var statusText: String
    
    var text: String
    
    var url: String
  }
  object BaseResponse {
    
    inline def apply(
      anonymous: Boolean,
      headers: js.Object,
      status: Double,
      statusText: String,
      text: String,
      url: String
    ): BaseResponse = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResponse]
    }
    
    extension [Self <: BaseResponse](x: Self) {
      
      inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response
    extends StObject
       with BaseResponse {
    
    var json: js.Object
  }
  object Response {
    
    inline def apply(
      anonymous: Boolean,
      headers: js.Object,
      json: js.Object,
      status: Double,
      statusText: String,
      text: String,
      url: String
    ): Response = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setJson(value: js.Object): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  trait STRequest[ResponseType]
    extends StObject
       with BaseRequest {
    
    var response: STResponse[ResponseType]
  }
  object STRequest {
    
    inline def apply[ResponseType](
      content: String,
      contentType: String,
      delete: Callback,
      get: Callback,
      head: Callback,
      headers: js.Object,
      post: Callback,
      put: Callback,
      response: STResponse[ResponseType],
      url: String | SDKURL
    ): STRequest[ResponseType] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], delete = delete.toJsFn, get = get.toJsFn, head = head.toJsFn, headers = headers.asInstanceOf[js.Any], post = post.toJsFn, put = put.toJsFn, response = response.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[STRequest[ResponseType]]
    }
    
    extension [Self <: STRequest[?], ResponseType](x: Self & STRequest[ResponseType]) {
      
      inline def setResponse(value: STResponse[ResponseType]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait STResponse[T] extends StObject {
    
    var json: T
  }
  object STResponse {
    
    inline def apply[T](json: T): STResponse[T] = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[STResponse[T]]
    }
    
    extension [Self <: STResponse[?], T](x: Self & STResponse[T]) {
      
      inline def setJson(value: T): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
}
