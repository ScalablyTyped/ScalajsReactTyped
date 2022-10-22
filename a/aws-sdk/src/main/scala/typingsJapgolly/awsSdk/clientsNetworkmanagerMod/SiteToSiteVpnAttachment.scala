package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiteToSiteVpnAttachment extends StObject {
  
  /**
    * Provides details about a site-to-site VPN attachment.
    */
  var Attachment: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.Attachment] = js.undefined
  
  /**
    * The ARN of the site-to-site VPN attachment. 
    */
  var VpnConnectionArn: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.VpnConnectionArn] = js.undefined
}
object SiteToSiteVpnAttachment {
  
  inline def apply(): SiteToSiteVpnAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteToSiteVpnAttachment]
  }
  
  extension [Self <: SiteToSiteVpnAttachment](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setVpnConnectionArn(value: VpnConnectionArn): Self = StObject.set(x, "VpnConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionArnUndefined: Self = StObject.set(x, "VpnConnectionArn", js.undefined)
  }
}
