package typingsJapgolly.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceGroupProperties extends StObject {
  
  /**
    * The provisioning state.
    */
  val provisioningState: js.UndefOr[String] = js.undefined
}
object ResourceGroupProperties {
  
  inline def apply(): ResourceGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupProperties]
  }
  
  extension [Self <: ResourceGroupProperties](x: Self) {
    
    inline def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStateUndefined: Self = StObject.set(x, "provisioningState", js.undefined)
  }
}
