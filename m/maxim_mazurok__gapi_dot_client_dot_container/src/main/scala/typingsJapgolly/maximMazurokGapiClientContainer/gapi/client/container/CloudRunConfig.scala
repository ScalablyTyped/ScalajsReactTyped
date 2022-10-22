package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudRunConfig extends StObject {
  
  /** Whether Cloud Run addon is enabled for this cluster. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** Which load balancer type is installed for Cloud Run. */
  var loadBalancerType: js.UndefOr[String] = js.undefined
}
object CloudRunConfig {
  
  inline def apply(): CloudRunConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudRunConfig]
  }
  
  extension [Self <: CloudRunConfig](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLoadBalancerType(value: String): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
  }
}
