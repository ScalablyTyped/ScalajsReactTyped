package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignActivitiesResponse extends StObject {
  
  var ActivitiesResponse: typingsJapgolly.awsSdk.clientsPinpointMod.ActivitiesResponse
}
object GetCampaignActivitiesResponse {
  
  inline def apply(ActivitiesResponse: ActivitiesResponse): GetCampaignActivitiesResponse = {
    val __obj = js.Dynamic.literal(ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignActivitiesResponse]
  }
  
  extension [Self <: GetCampaignActivitiesResponse](x: Self) {
    
    inline def setActivitiesResponse(value: ActivitiesResponse): Self = StObject.set(x, "ActivitiesResponse", value.asInstanceOf[js.Any])
  }
}
