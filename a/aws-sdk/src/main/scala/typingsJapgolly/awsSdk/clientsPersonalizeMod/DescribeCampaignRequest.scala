package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCampaignRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: Arn
}
object DescribeCampaignRequest {
  
  inline def apply(campaignArn: Arn): DescribeCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCampaignRequest]
  }
  
  extension [Self <: DescribeCampaignRequest](x: Self) {
    
    inline def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
  }
}
