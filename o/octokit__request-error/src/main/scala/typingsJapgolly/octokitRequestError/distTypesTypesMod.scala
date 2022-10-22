package typingsJapgolly.octokitRequestError

import typingsJapgolly.octokitTypes.distTypesOctokitResponseMod.OctokitResponse
import typingsJapgolly.octokitTypes.distTypesRequestOptionsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.octokitRequestError.anon.Headers
    - typingsJapgolly.octokitRequestError.anon.Request
  */
  trait RequestErrorOptions extends StObject
  object RequestErrorOptions {
    
    inline def Headers(request: RequestOptions): typingsJapgolly.octokitRequestError.anon.Headers = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.octokitRequestError.anon.Headers]
    }
    
    inline def Request(request: RequestOptions, response: OctokitResponse[Any, Double]): typingsJapgolly.octokitRequestError.anon.Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.octokitRequestError.anon.Request]
    }
  }
}
