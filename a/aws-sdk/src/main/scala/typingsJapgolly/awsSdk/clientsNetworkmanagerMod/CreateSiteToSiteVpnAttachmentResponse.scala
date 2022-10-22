package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSiteToSiteVpnAttachmentResponse extends StObject {
  
  /**
    * Details about a site-to-site VPN attachment.
    */
  var SiteToSiteVpnAttachment: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.SiteToSiteVpnAttachment] = js.undefined
}
object CreateSiteToSiteVpnAttachmentResponse {
  
  inline def apply(): CreateSiteToSiteVpnAttachmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSiteToSiteVpnAttachmentResponse]
  }
  
  extension [Self <: CreateSiteToSiteVpnAttachmentResponse](x: Self) {
    
    inline def setSiteToSiteVpnAttachment(value: SiteToSiteVpnAttachment): Self = StObject.set(x, "SiteToSiteVpnAttachment", value.asInstanceOf[js.Any])
    
    inline def setSiteToSiteVpnAttachmentUndefined: Self = StObject.set(x, "SiteToSiteVpnAttachment", js.undefined)
  }
}
