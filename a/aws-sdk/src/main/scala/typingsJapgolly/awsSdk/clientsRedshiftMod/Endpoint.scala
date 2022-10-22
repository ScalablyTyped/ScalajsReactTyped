package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * The DNS address of the Cluster.
    */
  var Address: js.UndefOr[String] = js.undefined
  
  /**
    * The port that the database engine is listening on.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * Describes a connection endpoint.
    */
  var VpcEndpoints: js.UndefOr[VpcEndpointsList] = js.undefined
}
object Endpoint {
  
  inline def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setVpcEndpoints(value: VpcEndpointsList): Self = StObject.set(x, "VpcEndpoints", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointsUndefined: Self = StObject.set(x, "VpcEndpoints", js.undefined)
    
    inline def setVpcEndpointsVarargs(value: VpcEndpoint*): Self = StObject.set(x, "VpcEndpoints", js.Array(value*))
  }
}
