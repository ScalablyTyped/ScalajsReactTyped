package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCampaignRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: string
}
object DeleteCampaignRequest {
  
  inline def apply(ApplicationId: string, CampaignId: string): DeleteCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCampaignRequest]
  }
  
  extension [Self <: DeleteCampaignRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setCampaignId(value: string): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
  }
}
