package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded YouTube Channel in a Video Campaign. */
trait ExcludedVideoYouTubeChannel extends StObject {
  
  /** Returns the YouTube channel ID. */
  def getChannelId(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoYouTubeChannel". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video YouTube channel. */
  def getId(): Double
  
  /** Returns the ad group to which this excluded video YouTube channel belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video YouTube channel belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video YouTube channel. */
  def remove(): Unit
}
object ExcludedVideoYouTubeChannel {
  
  inline def apply(
    getChannelId: CallbackTo[String],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    remove: Callback
  ): ExcludedVideoYouTubeChannel = {
    val __obj = js.Dynamic.literal(getChannelId = getChannelId.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedVideoYouTubeChannel]
  }
  
  extension [Self <: ExcludedVideoYouTubeChannel](x: Self) {
    
    inline def setGetChannelId(value: CallbackTo[String]): Self = StObject.set(x, "getChannelId", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
