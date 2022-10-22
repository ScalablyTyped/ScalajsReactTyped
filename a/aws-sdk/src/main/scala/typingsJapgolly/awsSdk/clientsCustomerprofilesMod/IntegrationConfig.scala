package typingsJapgolly.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegrationConfig extends StObject {
  
  /**
    * Configuration data for APPFLOW_INTEGRATION workflow type.
    */
  var AppflowIntegration: js.UndefOr[typingsJapgolly.awsSdk.clientsCustomerprofilesMod.AppflowIntegration] = js.undefined
}
object IntegrationConfig {
  
  inline def apply(): IntegrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationConfig]
  }
  
  extension [Self <: IntegrationConfig](x: Self) {
    
    inline def setAppflowIntegration(value: AppflowIntegration): Self = StObject.set(x, "AppflowIntegration", value.asInstanceOf[js.Any])
    
    inline def setAppflowIntegrationUndefined: Self = StObject.set(x, "AppflowIntegration", js.undefined)
  }
}
