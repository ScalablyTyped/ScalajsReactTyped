package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded audience configured for search campaigns. */
trait SearchCampaignExcludedAudience extends StObject {
  
  /** Returns the audience ID of the excluded audience. */
  def getAudienceId(): Double
  
  /** Returns the base campaign to which this excluded audience belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded audience belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the ID of the excluded audience. */
  def getId(): Double
  
  /** Returns the name of the audience. */
  def getName(): String
  
  /** Removes the excluded audience. */
  def remove(): Unit
}
object SearchCampaignExcludedAudience {
  
  inline def apply(
    getAudienceId: CallbackTo[Double],
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    remove: Callback
  ): SearchCampaignExcludedAudience = {
    val __obj = js.Dynamic.literal(getAudienceId = getAudienceId.toJsFn, getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[SearchCampaignExcludedAudience]
  }
  
  extension [Self <: SearchCampaignExcludedAudience](x: Self) {
    
    inline def setGetAudienceId(value: CallbackTo[Double]): Self = StObject.set(x, "getAudienceId", value.toJsFn)
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
