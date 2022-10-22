package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded YouTube Video in a Video Campaign. */
trait ExcludedVideoYouTubeVideo extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoYouTubeVideo". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video YouTube video. */
  def getId(): Double
  
  /** Returns the ad group to which this excluded video YouTube video belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video YouTube video belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Returns the YouTube video ID. */
  def getVideoId(): String
  
  /** Removes the excluded video YouTube video. */
  def remove(): Unit
}
object ExcludedVideoYouTubeVideo {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    getVideoId: CallbackTo[String],
    remove: Callback
  ): ExcludedVideoYouTubeVideo = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, getVideoId = getVideoId.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedVideoYouTubeVideo]
  }
  
  extension [Self <: ExcludedVideoYouTubeVideo](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setGetVideoId(value: CallbackTo[String]): Self = StObject.set(x, "getVideoId", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
