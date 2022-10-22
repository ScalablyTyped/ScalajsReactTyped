package typingsJapgolly.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateNetworkSiteResponse extends StObject {
  
  /**
    * Information about the network site.
    */
  var networkSite: js.UndefOr[NetworkSite] = js.undefined
}
object ActivateNetworkSiteResponse {
  
  inline def apply(): ActivateNetworkSiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateNetworkSiteResponse]
  }
  
  extension [Self <: ActivateNetworkSiteResponse](x: Self) {
    
    inline def setNetworkSite(value: NetworkSite): Self = StObject.set(x, "networkSite", value.asInstanceOf[js.Any])
    
    inline def setNetworkSiteUndefined: Self = StObject.set(x, "networkSite", js.undefined)
  }
}
