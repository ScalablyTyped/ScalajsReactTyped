package typingsJapgolly.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCampaignRequest extends StObject {
  
  var id: CampaignId
}
object DescribeCampaignRequest {
  
  inline def apply(id: CampaignId): DescribeCampaignRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCampaignRequest]
  }
  
  extension [Self <: DescribeCampaignRequest](x: Self) {
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
