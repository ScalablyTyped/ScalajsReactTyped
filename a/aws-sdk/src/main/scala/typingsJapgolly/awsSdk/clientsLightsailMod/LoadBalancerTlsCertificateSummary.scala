package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerTlsCertificateSummary extends StObject {
  
  /**
    * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
    */
  var isAttached: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the SSL/TLS certificate.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
}
object LoadBalancerTlsCertificateSummary {
  
  inline def apply(): LoadBalancerTlsCertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateSummary]
  }
  
  extension [Self <: LoadBalancerTlsCertificateSummary](x: Self) {
    
    inline def setIsAttached(value: Boolean): Self = StObject.set(x, "isAttached", value.asInstanceOf[js.Any])
    
    inline def setIsAttachedUndefined: Self = StObject.set(x, "isAttached", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
