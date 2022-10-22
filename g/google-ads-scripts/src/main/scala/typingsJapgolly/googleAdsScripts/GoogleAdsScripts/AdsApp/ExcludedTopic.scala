package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded topic. */
trait ExcludedTopic extends StObject {
  
  /** Returns the ad group to which this audience belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base ad group to which this audience belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this audience belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this audience belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the ID of the audience. */
  def getId(): Double
  
  /** Returns the topic ID of the excluded topic. */
  def getTopicId(): Double
  
  /** Removes the audience. */
  def remove(): Unit
}
object ExcludedTopic {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getBaseAdGroup: CallbackTo[AdGroup],
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getTopicId: CallbackTo[Double],
    remove: Callback
  ): ExcludedTopic = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getBaseAdGroup = getBaseAdGroup.toJsFn, getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getTopicId = getTopicId.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedTopic]
  }
  
  extension [Self <: ExcludedTopic](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
    
    inline def setGetBaseAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getBaseAdGroup", value.toJsFn)
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetTopicId(value: CallbackTo[Double]): Self = StObject.set(x, "getTopicId", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
