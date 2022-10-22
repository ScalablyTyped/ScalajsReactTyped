package typingsJapgolly.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateSshScriptRequest extends StObject {
  
  /** Required. Bastion VM Instance name to use or to create. */
  var vm: js.UndefOr[String] = js.undefined
  
  /** The VM creation configuration */
  var vmCreationConfig: js.UndefOr[VmCreationConfig] = js.undefined
  
  /** The port that will be open on the bastion host */
  var vmPort: js.UndefOr[Double] = js.undefined
  
  /** The VM selection configuration */
  var vmSelectionConfig: js.UndefOr[VmSelectionConfig] = js.undefined
}
object GenerateSshScriptRequest {
  
  inline def apply(): GenerateSshScriptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateSshScriptRequest]
  }
  
  extension [Self <: GenerateSshScriptRequest](x: Self) {
    
    inline def setVm(value: String): Self = StObject.set(x, "vm", value.asInstanceOf[js.Any])
    
    inline def setVmCreationConfig(value: VmCreationConfig): Self = StObject.set(x, "vmCreationConfig", value.asInstanceOf[js.Any])
    
    inline def setVmCreationConfigUndefined: Self = StObject.set(x, "vmCreationConfig", js.undefined)
    
    inline def setVmPort(value: Double): Self = StObject.set(x, "vmPort", value.asInstanceOf[js.Any])
    
    inline def setVmPortUndefined: Self = StObject.set(x, "vmPort", js.undefined)
    
    inline def setVmSelectionConfig(value: VmSelectionConfig): Self = StObject.set(x, "vmSelectionConfig", value.asInstanceOf[js.Any])
    
    inline def setVmSelectionConfigUndefined: Self = StObject.set(x, "vmSelectionConfig", js.undefined)
    
    inline def setVmUndefined: Self = StObject.set(x, "vm", js.undefined)
  }
}
