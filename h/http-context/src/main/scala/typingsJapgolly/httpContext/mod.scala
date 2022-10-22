package typingsJapgolly.httpContext

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.accepts.mod.Accepts
import typingsJapgolly.httpContext.httpContextBooleans.`false`
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.OutgoingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Context = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Context]
  
  @JSImport("http-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Context
    extends StObject
       with RequestDelegate
       with ResponseDelegate {
    
    var request: Request = js.native
    
    var response: Response = js.native
  }
  
  @js.native
  trait Request
    extends StObject
       with RequestDelegate {
    
    var accept: Accepts = js.native
    
    var charset: String = js.native
    
    def inspect(): RequestJSON = js.native
    
    var length: Double = js.native
    
    var request: IncomingMessage = js.native
    
    def toJSON(): RequestJSON = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait RequestDelegate extends StObject {
    
    def accepts(types: String*): js.Array[String] | String | `false` = js.native
    def accepts(types: js.Array[String]): js.Array[String] | String | `false` = js.native
    
    def acceptsCharsets(charsets: String*): String | `false` = js.native
    def acceptsCharsets(charsets: js.Array[String]): String | `false` = js.native
    
    def acceptsEncodings(encodings: String*): String | `false` = js.native
    def acceptsEncodings(encodings: js.Array[String]): String | `false` = js.native
    
    def acceptsLanguages(languages: String*): String | `false` = js.native
    def acceptsLanguages(languages: js.Array[String]): String | `false` = js.native
    
    var fresh: Boolean = js.native
    
    def get(field: String): String = js.native
    
    var header: IncomingHttpHeaders = js.native
    
    var headers: IncomingHttpHeaders = js.native
    
    var host: String = js.native
    
    var hostname: String = js.native
    
    var href: String = js.native
    
    var idempotent: Boolean = js.native
    
    def is(types: String*): String | `false` = js.native
    def is(types: js.Array[String]): String | `false` = js.native
    
    var method: String = js.native
    
    var path: String = js.native
    
    var protocol: String = js.native
    
    var query: StringDictionary[String | js.Array[String]] = js.native
    
    var querystring: String = js.native
    
    var search: String = js.native
    
    var secure: Boolean = js.native
    
    var subdomains: js.Array[String] = js.native
    
    var url: String = js.native
  }
  
  trait RequestJSON extends StObject {
    
    var header: IncomingHttpHeaders
    
    var method: String
    
    var url: String
  }
  object RequestJSON {
    
    inline def apply(header: IncomingHttpHeaders, method: String, url: String): RequestJSON = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestJSON]
    }
    
    extension [Self <: RequestJSON](x: Self) {
      
      inline def setHeader(value: IncomingHttpHeaders): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response
    extends StObject
       with ResponseDelegate {
    
    def get(field: String): String = js.native
    
    var header: OutgoingHttpHeaders = js.native
    
    def inspect(): ResponseJSON = js.native
    
    def is(types: String*): String | `false` = js.native
    def is(types: js.Array[String]): String | `false` = js.native
    
    var response: OutgoingMessage[IncomingMessage] = js.native
    
    def toJSON(): ResponseJSON = js.native
  }
  
  @js.native
  trait ResponseDelegate extends StObject {
    
    def append(field: String, `val`: String*): Unit = js.native
    def append(field: String, `val`: js.Array[String]): Unit = js.native
    
    def attachment(filename: String): Unit = js.native
    
    var body: Any = js.native
    
    var etag: String = js.native
    
    var headerSent: Boolean = js.native
    
    var lastModified: String | js.Date = js.native
    
    var length: Double = js.native
    
    var message: String = js.native
    
    def redirect(url: String, alt: String): Unit = js.native
    
    def remove(field: String): Unit = js.native
    
    def set(field: String, `val`: String): Unit = js.native
    
    var status: Double = js.native
    
    var `type`: String = js.native
    
    def vary(field: String): Unit = js.native
    
    var writable: Boolean = js.native
  }
  
  trait ResponseJSON extends StObject {
    
    var header: OutgoingHttpHeaders
    
    var message: String
    
    var status: Double
  }
  object ResponseJSON {
    
    inline def apply(header: OutgoingHttpHeaders, message: String, status: Double): ResponseJSON = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseJSON]
    }
    
    extension [Self <: ResponseJSON](x: Self) {
      
      inline def setHeader(value: OutgoingHttpHeaders): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
