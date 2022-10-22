package typingsJapgolly.lifeomicAxiosFetch

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.delete_
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.get_
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.head_
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.link_
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.options_
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.patch_
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.post_
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.purge_
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.put_
import typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.unlink_
import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAxiosTypesMod {
  
  trait AxiosInstance extends StObject {
    
    def request[T](config: AxiosRequestConfig): AxiosPromise[T]
  }
  object AxiosInstance {
    
    inline def apply(request: AxiosRequestConfig => AxiosPromise[Any]): AxiosInstance = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[AxiosInstance]
    }
    
    extension [Self <: AxiosInstance](x: Self) {
      
      inline def setRequest(value: AxiosRequestConfig => AxiosPromise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait AxiosPromise[T]
    extends StObject
       with Promise[AxiosResponse[T]]
  
  trait AxiosRequestConfig
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var method: js.UndefOr[Method] = js.undefined
    
    var responseType: js.UndefOr[ResponseType] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object AxiosRequestConfig {
    
    inline def apply(): AxiosRequestConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxiosRequestConfig]
    }
    
    extension [Self <: AxiosRequestConfig](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait AxiosResponse[T] extends StObject {
    
    var config: AxiosRequestConfig
    
    var data: T
    
    var headers: Any
    
    var request: js.UndefOr[Any] = js.undefined
    
    var status: Double
    
    var statusText: String
  }
  object AxiosResponse {
    
    inline def apply[T](config: AxiosRequestConfig, data: T, headers: Any, status: Double, statusText: String): AxiosResponse[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosResponse[T]]
    }
    
    extension [Self <: AxiosResponse[?], T](x: Self & AxiosResponse[T]) {
      
      inline def setConfig(value: AxiosRequestConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.get_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.GET
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.delete_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.DELETE
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.head_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.HEAD
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.options_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.OPTIONS
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.post_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.POST
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.put_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PUT
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.patch_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PATCH
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.purge_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PURGE
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.link_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.LINK
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.unlink_
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.UNLINK
  */
  trait Method extends StObject
  object Method {
    
    inline def DELETE: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.DELETE]
    
    inline def GET: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.GET = "GET".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.GET]
    
    inline def HEAD: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.HEAD]
    
    inline def LINK: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.LINK = "LINK".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.LINK]
    
    inline def OPTIONS: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.OPTIONS]
    
    inline def PATCH: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PATCH]
    
    inline def POST: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.POST = "POST".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.POST]
    
    inline def PURGE: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PURGE = "PURGE".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PURGE]
    
    inline def PUT: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.PUT]
    
    inline def UNLINK: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.UNLINK = "UNLINK".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.UNLINK]
    
    inline def delete: delete_ = "delete".asInstanceOf[delete_]
    
    inline def get: get_ = "get".asInstanceOf[get_]
    
    inline def head: head_ = "head".asInstanceOf[head_]
    
    inline def link: link_ = "link".asInstanceOf[link_]
    
    inline def options: options_ = "options".asInstanceOf[options_]
    
    inline def patch: patch_ = "patch".asInstanceOf[patch_]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def purge: purge_ = "purge".asInstanceOf[purge_]
    
    inline def put: put_ = "put".asInstanceOf[put_]
    
    inline def unlink: unlink_ = "unlink".asInstanceOf[unlink_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.arraybuffer
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.blob
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.document
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.json
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.text
    - typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.stream
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    inline def arraybuffer: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.arraybuffer = "arraybuffer".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.arraybuffer]
    
    inline def blob: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.blob = "blob".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.blob]
    
    inline def document: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.document = "document".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.document]
    
    inline def json: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.json = "json".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.json]
    
    inline def stream: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.stream = "stream".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.stream]
    
    inline def text: typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.text = "text".asInstanceOf[typingsJapgolly.lifeomicAxiosFetch.lifeomicAxiosFetchStrings.text]
  }
}
