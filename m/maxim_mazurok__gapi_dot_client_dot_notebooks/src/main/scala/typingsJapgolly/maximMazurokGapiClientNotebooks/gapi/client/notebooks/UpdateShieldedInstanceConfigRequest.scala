package typingsJapgolly.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateShieldedInstanceConfigRequest extends StObject {
  
  /** ShieldedInstance configuration to be updated. */
  var shieldedInstanceConfig: js.UndefOr[ShieldedInstanceConfig] = js.undefined
}
object UpdateShieldedInstanceConfigRequest {
  
  inline def apply(): UpdateShieldedInstanceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShieldedInstanceConfigRequest]
  }
  
  extension [Self <: UpdateShieldedInstanceConfigRequest](x: Self) {
    
    inline def setShieldedInstanceConfig(value: ShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
  }
}
