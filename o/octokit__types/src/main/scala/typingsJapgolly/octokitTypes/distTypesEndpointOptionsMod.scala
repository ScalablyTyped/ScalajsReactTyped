package typingsJapgolly.octokitTypes

import typingsJapgolly.octokitTypes.distTypesRequestMethodMod.RequestMethod
import typingsJapgolly.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typingsJapgolly.octokitTypes.distTypesUrlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointOptionsMod {
  
  trait EndpointOptions
    extends StObject
       with RequestParameters {
    
    var method: RequestMethod
    
    var url: Url
  }
  object EndpointOptions {
    
    inline def apply(method: RequestMethod, url: Url): EndpointOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointOptions]
    }
    
    extension [Self <: EndpointOptions](x: Self) {
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
