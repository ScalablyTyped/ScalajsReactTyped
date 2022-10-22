package typingsJapgolly.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReverseSshConnectivity extends StObject {
  
  /** The name of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel. */
  var vm: js.UndefOr[String] = js.undefined
  
  /** Required. The IP of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel. */
  var vmIp: js.UndefOr[String] = js.undefined
  
  /** Required. The forwarding port of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel. */
  var vmPort: js.UndefOr[Double] = js.undefined
  
  /** The name of the VPC to peer with the Cloud SQL private network. */
  var vpc: js.UndefOr[String] = js.undefined
}
object ReverseSshConnectivity {
  
  inline def apply(): ReverseSshConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReverseSshConnectivity]
  }
  
  extension [Self <: ReverseSshConnectivity](x: Self) {
    
    inline def setVm(value: String): Self = StObject.set(x, "vm", value.asInstanceOf[js.Any])
    
    inline def setVmIp(value: String): Self = StObject.set(x, "vmIp", value.asInstanceOf[js.Any])
    
    inline def setVmIpUndefined: Self = StObject.set(x, "vmIp", js.undefined)
    
    inline def setVmPort(value: Double): Self = StObject.set(x, "vmPort", value.asInstanceOf[js.Any])
    
    inline def setVmPortUndefined: Self = StObject.set(x, "vmPort", js.undefined)
    
    inline def setVmUndefined: Self = StObject.set(x, "vm", js.undefined)
    
    inline def setVpc(value: String): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
  }
}
