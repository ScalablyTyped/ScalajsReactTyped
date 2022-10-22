package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointConfiguration extends StObject {
  
  /**
    * Indicates whether client IP address preservation is enabled for an endpoint. The value is true or false. The default value is true for new accelerators.  If the value is set to true, the client's IP address is preserved in the X-Forwarded-For request header as traffic travels to applications on the endpoint fronted by the accelerator. Client IP address preservation is supported, in specific Amazon Web Services Regions, for endpoints that are Application Load Balancers and Amazon EC2 instances. For more information, see  Preserve client IP addresses in Global Accelerator in the Global Accelerator Developer Guide.
    */
  var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID. For Amazon EC2 instances, this is the EC2 instance ID. A resource must be valid and active when you add it as an endpoint. An Application Load Balancer can be either internal or internet-facing.
    */
  var EndpointId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The weight associated with the endpoint. When you add weights to endpoints, you configure Global Accelerator to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see Endpoint weights in the Global Accelerator Developer Guide.
    */
  var Weight: js.UndefOr[EndpointWeight] = js.undefined
}
object EndpointConfiguration {
  
  inline def apply(): EndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConfiguration]
  }
  
  extension [Self <: EndpointConfiguration](x: Self) {
    
    inline def setClientIPPreservationEnabled(value: GenericBoolean): Self = StObject.set(x, "ClientIPPreservationEnabled", value.asInstanceOf[js.Any])
    
    inline def setClientIPPreservationEnabledUndefined: Self = StObject.set(x, "ClientIPPreservationEnabled", js.undefined)
    
    inline def setEndpointId(value: GenericString): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    inline def setWeight(value: EndpointWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
