package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedVideoTopic extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoTopic". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video topic. */
  def getId(): Double
  
  /** Returns the topic ID of the excluded topic. */
  def getTopicId(): Double
  
  /** Returns the ad group to which this excluded video topic belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video topic belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video topic. */
  def remove(): Unit
}
object ExcludedVideoTopic {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getTopicId: CallbackTo[Double],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    remove: Callback
  ): ExcludedVideoTopic = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getTopicId = getTopicId.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedVideoTopic]
  }
  
  extension [Self <: ExcludedVideoTopic](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetTopicId(value: CallbackTo[Double]): Self = StObject.set(x, "getTopicId", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
