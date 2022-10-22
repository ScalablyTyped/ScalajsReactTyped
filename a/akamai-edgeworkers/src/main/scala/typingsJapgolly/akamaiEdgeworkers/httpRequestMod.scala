package typingsJapgolly.akamaiEdgeworkers

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.akamaiEdgeworkers.EW.ReadAllHeader
import typingsJapgolly.akamaiEdgeworkers.EW.ReadsHeaders
import typingsJapgolly.akamaiEdgeworkers.anon.Headers
import typingsJapgolly.akamaiEdgeworkers.streamsMod.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpRequestMod {
  
  @JSImport("http-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Performs a subrequest, fetching the requested resource asynchronously.
    *
    * @param url A String containing the URL to fetch. Can be an absolute
    *      or relative URL. Relative URLs will use the parent request as
    *      the base URL. Only "http" and "https" are supported for the
    *      scheme. Specifying port numbers is not supported.
    * @param options May include
    *  - `method` The HTTP method to use.
    *  - `headers` Request headers to specify.
    *  - `body` The request payload.
    *  - `timeout` The request timeout, in milliseconds.
    */
  inline def httpRequest(url: String): js.Promise[HttpResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpResponse]]
  inline def httpRequest(url: String, options: Headers): js.Promise[HttpResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpResponse]]
  
  /**
    * Describes the result of a `httpRequest()`.
    */
  trait HttpResponse
    extends StObject
       with ReadsHeaders
       with ReadAllHeader {
    
    var body: ReadableStream[Any]
    
    /**
      * Parses the body of the response as JSON. The response is buffered
      * and `JSON.parse()` is run on the text.
      */
    def json(): js.Promise[Any]
    
    /**
      * A boolean which is true for 2XX responses
      */
    val ok: Boolean
    
    /**
      * The HTTP status code
      */
    val status: Double
    
    /**
      * Returns a Promise that resolves to a string containing the
      * response body. Note that the body is buffered in memory.
      */
    def text(): js.Promise[String]
  }
  object HttpResponse {
    
    inline def apply(
      body: ReadableStream[Any],
      getHeader: String => js.Array[String] | Null,
      getHeaders: CallbackTo[typingsJapgolly.akamaiEdgeworkers.EW.Headers],
      json: CallbackTo[js.Promise[Any]],
      ok: Boolean,
      status: Double,
      text: CallbackTo[js.Promise[String]]
    ): HttpResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getHeaders = getHeaders.toJsFn, json = json.toJsFn, ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.toJsFn)
      __obj.asInstanceOf[HttpResponse]
    }
    
    extension [Self <: HttpResponse](x: Self) {
      
      inline def setBody(value: ReadableStream[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
  
  /**
    * A request body, either in the form of a static string or a readable stream.
    */
  type RequestBody = String | ReadableStream[Any]
}
