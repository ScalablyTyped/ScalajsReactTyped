package typingsJapgolly.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceSummary extends StObject {
  
  /**
    * A string map that contains the following information:   The attributes that are associated with the instance.    For each attribute, the applicable value.   Supported attribute keys include the following:  AWS_ALIAS_DNS_NAME  For an alias record that routes traffic to an Elastic Load Balancing load balancer, the DNS name that's associated with the load balancer.   AWS_EC2_INSTANCE_ID (HTTP namespaces only)  The Amazon EC2 instance ID for the instance. When the AWS_EC2_INSTANCE_ID attribute is specified, then the AWS_INSTANCE_IPV4 attribute contains the primary private IPv4 address.  AWS_INIT_HEALTH_STATUS  If the service configuration includes HealthCheckCustomConfig, you can optionally use AWS_INIT_HEALTH_STATUS to specify the initial status of the custom health check, HEALTHY or UNHEALTHY. If you don't specify a value for AWS_INIT_HEALTH_STATUS, the initial status is HEALTHY.  AWS_INSTANCE_CNAME  For a CNAME record, the domain name that Route 53 returns in response to DNS queries (for example, example.com).  AWS_INSTANCE_IPV4  For an A record, the IPv4 address that Route 53 returns in response to DNS queries (for example, 192.0.2.44).  AWS_INSTANCE_IPV6  For an AAAA record, the IPv6 address that Route 53 returns in response to DNS queries (for example, 2001:0db8:85a3:0000:0000:abcd:0001:2345).  AWS_INSTANCE_PORT  For an SRV record, the value that Route 53 returns for the port. In addition, if the service includes HealthCheckConfig, the port on the endpoint that Route 53 sends requests to.  
    */
  var Attributes: js.UndefOr[typingsJapgolly.awsSdk.clientsServicediscoveryMod.Attributes] = js.undefined
  
  /**
    * The ID for an instance that you created by using a specified service.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
}
object InstanceSummary {
  
  inline def apply(): InstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSummary]
  }
  
  extension [Self <: InstanceSummary](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
