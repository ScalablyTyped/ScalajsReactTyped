package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded audience configured for search ad groups. */
trait SearchAdGroupExcludedAudience extends StObject {
  
  /** Returns the ad group to which this excluded audience belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the audience ID of the excluded audience. */
  def getAudienceId(): Double
  
  /** Returns the base ad group to which this excluded audience belongs. */
  def getBaseAdGroup(): AdGroup
  
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
object SearchAdGroupExcludedAudience {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getAudienceId: CallbackTo[Double],
    getBaseAdGroup: CallbackTo[AdGroup],
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    remove: Callback
  ): SearchAdGroupExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getAudienceId = getAudienceId.toJsFn, getBaseAdGroup = getBaseAdGroup.toJsFn, getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[SearchAdGroupExcludedAudience]
  }
  
  extension [Self <: SearchAdGroupExcludedAudience](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
    
    inline def setGetAudienceId(value: CallbackTo[Double]): Self = StObject.set(x, "getAudienceId", value.toJsFn)
    
    inline def setGetBaseAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getBaseAdGroup", value.toJsFn)
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
