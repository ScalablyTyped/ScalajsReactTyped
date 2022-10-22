package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded YouTube Channel. */
trait ExcludedYouTubeChannel extends StObject {
  
  /** Returns the ad group to which this excluded YouTube channel belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base ad group to which this excluded YouTube channel belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this excluded YouTube channel belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded YouTube channel belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the excluded YouTube channel ID. */
  def getChannelId(): String
  
  /** Returns the ID of the excluded YouTube channel. */
  def getId(): Double
  
  /** Removes the excluded YouTube channel. */
  def remove(): Unit
}
object ExcludedYouTubeChannel {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getBaseAdGroup: CallbackTo[AdGroup],
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getChannelId: CallbackTo[String],
    getId: CallbackTo[Double],
    remove: Callback
  ): ExcludedYouTubeChannel = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getBaseAdGroup = getBaseAdGroup.toJsFn, getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getChannelId = getChannelId.toJsFn, getId = getId.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedYouTubeChannel]
  }
  
  extension [Self <: ExcludedYouTubeChannel](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
    
    inline def setGetBaseAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getBaseAdGroup", value.toJsFn)
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetChannelId(value: CallbackTo[String]): Self = StObject.set(x, "getChannelId", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
