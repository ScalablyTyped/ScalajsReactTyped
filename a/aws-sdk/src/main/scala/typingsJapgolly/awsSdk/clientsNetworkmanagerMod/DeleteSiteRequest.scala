package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSiteRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The ID of the site.
    */
  var SiteId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.SiteId
}
object DeleteSiteRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId, SiteId: SiteId): DeleteSiteRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSiteRequest]
  }
  
  extension [Self <: DeleteSiteRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
