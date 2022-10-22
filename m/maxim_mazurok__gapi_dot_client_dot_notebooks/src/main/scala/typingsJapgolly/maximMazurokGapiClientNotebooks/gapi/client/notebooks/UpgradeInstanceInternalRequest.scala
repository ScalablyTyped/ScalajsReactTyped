package typingsJapgolly.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeInstanceInternalRequest extends StObject {
  
  /** Optional. The optional UpgradeType. Setting this field will search for additional compute images to upgrade this instance. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Required. The VM hardware token for authenticating the VM. https://cloud.google.com/compute/docs/instances/verifying-instance-identity */
  var vmId: js.UndefOr[String] = js.undefined
}
object UpgradeInstanceInternalRequest {
  
  inline def apply(): UpgradeInstanceInternalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeInstanceInternalRequest]
  }
  
  extension [Self <: UpgradeInstanceInternalRequest](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
