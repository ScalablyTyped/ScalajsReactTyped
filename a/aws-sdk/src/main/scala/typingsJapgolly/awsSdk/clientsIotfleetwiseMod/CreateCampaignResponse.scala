package typingsJapgolly.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCampaignResponse extends StObject {
  
  /**
    *  The ARN of the created campaign. 
    */
  var arn: js.UndefOr[typingsJapgolly.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The name of the created campaign.
    */
  var name: js.UndefOr[campaignName] = js.undefined
}
object CreateCampaignResponse {
  
  inline def apply(): CreateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCampaignResponse]
  }
  
  extension [Self <: CreateCampaignResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: campaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
