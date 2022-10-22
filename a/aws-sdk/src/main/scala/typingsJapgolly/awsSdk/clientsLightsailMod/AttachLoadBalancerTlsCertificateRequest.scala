package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachLoadBalancerTlsCertificateRequest extends StObject {
  
  /**
    * The name of your SSL/TLS certificate.
    */
  var certificateName: ResourceName
  
  /**
    * The name of the load balancer to which you want to associate the SSL/TLS certificate.
    */
  var loadBalancerName: ResourceName
}
object AttachLoadBalancerTlsCertificateRequest {
  
  inline def apply(certificateName: ResourceName, loadBalancerName: ResourceName): AttachLoadBalancerTlsCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateName = certificateName.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancerTlsCertificateRequest]
  }
  
  extension [Self <: AttachLoadBalancerTlsCertificateRequest](x: Self) {
    
    inline def setCertificateName(value: ResourceName): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
