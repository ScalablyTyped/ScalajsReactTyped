package typingsJapgolly.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLoadBalancerListenerSSLCertificateInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  
  /**
    * The port that uses the specified SSL certificate.
    */
  var LoadBalancerPort: AccessPointPort
  
  /**
    * The Amazon Resource Name (ARN) of the SSL certificate.
    */
  var SSLCertificateId: typingsJapgolly.awsSdk.clientsElbMod.SSLCertificateId
}
object SetLoadBalancerListenerSSLCertificateInput {
  
  inline def apply(
    LoadBalancerName: AccessPointName,
    LoadBalancerPort: AccessPointPort,
    SSLCertificateId: SSLCertificateId
  ): SetLoadBalancerListenerSSLCertificateInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPort = LoadBalancerPort.asInstanceOf[js.Any], SSLCertificateId = SSLCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoadBalancerListenerSSLCertificateInput]
  }
  
  extension [Self <: SetLoadBalancerListenerSSLCertificateInput](x: Self) {
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerPort(value: AccessPointPort): Self = StObject.set(x, "LoadBalancerPort", value.asInstanceOf[js.Any])
    
    inline def setSSLCertificateId(value: SSLCertificateId): Self = StObject.set(x, "SSLCertificateId", value.asInstanceOf[js.Any])
  }
}
