package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDevEndpointsRequest extends StObject {
  
  /**
    * The list of DevEndpoint names, which might be the names returned from the ListDevEndpoint operation.
    */
  var DevEndpointNames: typingsJapgolly.awsSdk.clientsGlueMod.DevEndpointNames
}
object BatchGetDevEndpointsRequest {
  
  inline def apply(DevEndpointNames: DevEndpointNames): BatchGetDevEndpointsRequest = {
    val __obj = js.Dynamic.literal(DevEndpointNames = DevEndpointNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDevEndpointsRequest]
  }
  
  extension [Self <: BatchGetDevEndpointsRequest](x: Self) {
    
    inline def setDevEndpointNames(value: DevEndpointNames): Self = StObject.set(x, "DevEndpointNames", value.asInstanceOf[js.Any])
    
    inline def setDevEndpointNamesVarargs(value: GenericString*): Self = StObject.set(x, "DevEndpointNames", js.Array(value*))
  }
}
