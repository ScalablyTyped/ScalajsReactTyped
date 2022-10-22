package typingsJapgolly.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCampaignResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the deleted campaign.  The ARN isn’t returned if a campaign doesn’t exist. 
    */
  var arn: js.UndefOr[typingsJapgolly.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The name of the deleted campaign.
    */
  var name: js.UndefOr[campaignName] = js.undefined
}
object DeleteCampaignResponse {
  
  inline def apply(): DeleteCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCampaignResponse]
  }
  
  extension [Self <: DeleteCampaignResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: campaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
