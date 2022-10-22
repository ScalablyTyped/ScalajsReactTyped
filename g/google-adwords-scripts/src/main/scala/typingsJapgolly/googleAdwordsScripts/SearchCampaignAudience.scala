package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCampaignAudience
  extends StObject
     with SearchCampaignExcludedAudience {
  
  def bidding(): SearchAudienceBidding
  
  def isEnabled(): Boolean
  
  def isPaused(): Boolean
}
object SearchCampaignAudience {
  
  inline def apply(
    bidding: CallbackTo[SearchAudienceBidding],
    getAudienceId: CallbackTo[Double],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    isEnabled: CallbackTo[Boolean],
    isPaused: CallbackTo[Boolean],
    remove: Callback
  ): SearchCampaignAudience = {
    val __obj = js.Dynamic.literal(bidding = bidding.toJsFn, getAudienceId = getAudienceId.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, isEnabled = isEnabled.toJsFn, isPaused = isPaused.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[SearchCampaignAudience]
  }
  
  extension [Self <: SearchCampaignAudience](x: Self) {
    
    inline def setBidding(value: CallbackTo[SearchAudienceBidding]): Self = StObject.set(x, "bidding", value.toJsFn)
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
    
    inline def setIsPaused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPaused", value.toJsFn)
  }
}
