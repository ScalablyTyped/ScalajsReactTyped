package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledServicePrincipal extends StObject {
  
  /**
    * The date that the service principal was enabled for integration with Organizations.
    */
  var DateEnabled: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the service principal. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typingsJapgolly.awsSdk.clientsOrganizationsMod.ServicePrincipal] = js.undefined
}
object EnabledServicePrincipal {
  
  inline def apply(): EnabledServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnabledServicePrincipal]
  }
  
  extension [Self <: EnabledServicePrincipal](x: Self) {
    
    inline def setDateEnabled(value: js.Date): Self = StObject.set(x, "DateEnabled", value.asInstanceOf[js.Any])
    
    inline def setDateEnabledUndefined: Self = StObject.set(x, "DateEnabled", js.undefined)
    
    inline def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalUndefined: Self = StObject.set(x, "ServicePrincipal", js.undefined)
  }
}
