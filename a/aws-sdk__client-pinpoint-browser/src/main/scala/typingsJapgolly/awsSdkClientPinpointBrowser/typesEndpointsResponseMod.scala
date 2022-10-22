package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointResponseMod.EndpointResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointsResponseMod {
  
  trait EndpointsResponse extends StObject {
    
    /**
      * The list of endpoints.
      */
    var Item: js.UndefOr[js.Array[EndpointResponse] | js.Iterable[EndpointResponse]] = js.undefined
  }
  object EndpointsResponse {
    
    inline def apply(): EndpointsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointsResponse]
    }
    
    extension [Self <: EndpointsResponse](x: Self) {
      
      inline def setItem(value: js.Array[EndpointResponse] | js.Iterable[EndpointResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: EndpointResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    }
  }
  
  trait UnmarshalledEndpointsResponse
    extends StObject
       with EndpointsResponse {
    
    /**
      * The list of endpoints.
      */
    @JSName("Item")
    var Item_UnmarshalledEndpointsResponse: js.UndefOr[js.Array[UnmarshalledEndpointResponse]] = js.undefined
  }
  object UnmarshalledEndpointsResponse {
    
    inline def apply(): UnmarshalledEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEndpointsResponse]
    }
    
    extension [Self <: UnmarshalledEndpointsResponse](x: Self) {
      
      inline def setItem(value: js.Array[UnmarshalledEndpointResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: UnmarshalledEndpointResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    }
  }
}
