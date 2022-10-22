package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignEventFilter extends StObject {
  
  /**
    * The dimension settings of the event filter for the campaign.
    */
  var Dimensions: EventDimensions
  
  /**
    * The type of event that causes the campaign to be sent. Valid values are: SYSTEM, sends the campaign when a system event occurs; and, ENDPOINT, sends the campaign when an endpoint event (Events resource) occurs.
    */
  var FilterType: typingsJapgolly.awsSdk.clientsPinpointMod.FilterType
}
object CampaignEventFilter {
  
  inline def apply(Dimensions: EventDimensions, FilterType: FilterType): CampaignEventFilter = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignEventFilter]
  }
  
  extension [Self <: CampaignEventFilter](x: Self) {
    
    inline def setDimensions(value: EventDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setFilterType(value: FilterType): Self = StObject.set(x, "FilterType", value.asInstanceOf[js.Any])
  }
}
