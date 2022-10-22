package typingsJapgolly.mapboxMapboxSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassesMapiResponseMod {
  
  trait MapiResponse[T] extends StObject {
    
    /**
      * The response body, parsed as JSON.
      */
    var body: T
    
    def hasNextPage(): Boolean
    
    /**
      * The parsed response headers.
      */
    var headers: Any
    
    /**
      * The parsed response links
      */
    var links: Any
    
    def nextPage(): MapiRequest[T] | Null
    
    /**
      * The raw response body.
      */
    var rawBody: String
    
    /**
      * The response's originating MapiRequest.
      */
    var request: MapiRequest[T]
    
    /**
      * The response's status code.
      */
    var statusCode: Double
  }
  object MapiResponse {
    
    inline def apply[T](
      body: T,
      hasNextPage: CallbackTo[Boolean],
      headers: Any,
      links: Any,
      nextPage: CallbackTo[MapiRequest[T] | Null],
      rawBody: String,
      request: MapiRequest[T],
      statusCode: Double
    ): MapiResponse[T] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hasNextPage = hasNextPage.toJsFn, headers = headers.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nextPage = nextPage.toJsFn, rawBody = rawBody.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapiResponse[T]]
    }
    
    extension [Self <: MapiResponse[?], T](x: Self & MapiResponse[T]) {
      
      inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHasNextPage(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNextPage", value.toJsFn)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Any): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setNextPage(value: CallbackTo[MapiRequest[T] | Null]): Self = StObject.set(x, "nextPage", value.toJsFn)
      
      inline def setRawBody(value: String): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: MapiRequest[T]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
