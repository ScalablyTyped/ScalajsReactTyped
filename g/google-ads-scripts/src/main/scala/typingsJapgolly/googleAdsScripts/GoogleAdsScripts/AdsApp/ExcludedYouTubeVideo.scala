package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded YouTube Video. */
trait ExcludedYouTubeVideo extends StObject {
  
  /** Returns the ad group to which this excluded YouTube video belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base ad group to which this excluded YouTube video belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this excluded YouTube video belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded YouTube video belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the ID of the excluded YouTube video. */
  def getId(): Double
  
  /** Returns the YouTube video ID. */
  def getVideoId(): String
  
  /** Removes the excluded YouTube video. */
  def remove(): Unit
}
object ExcludedYouTubeVideo {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getBaseAdGroup: CallbackTo[AdGroup],
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getVideoId: CallbackTo[String],
    remove: Callback
  ): ExcludedYouTubeVideo = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getBaseAdGroup = getBaseAdGroup.toJsFn, getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getVideoId = getVideoId.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedYouTubeVideo]
  }
  
  extension [Self <: ExcludedYouTubeVideo](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
    
    inline def setGetBaseAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getBaseAdGroup", value.toJsFn)
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetVideoId(value: CallbackTo[String]): Self = StObject.set(x, "getVideoId", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
