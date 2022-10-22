package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Audience in a Video Campaign. */
trait ExcludedVideoAudience extends StObject {
  
  /** Returns the ID of the excluded audience. */
  def getAudienceId(): Double
  
  /** Returns the type of the excluded audience. */
  def getAudienceType(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoAudience". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video audience. */
  def getId(): Double
  
  /** Returns the name of the excluded audience. */
  def getName(): String
  
  /** Returns the ad group to which this excluded video audience belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video audience belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video audience. */
  def remove(): Unit
}
object ExcludedVideoAudience {
  
  inline def apply(
    getAudienceId: CallbackTo[Double],
    getAudienceType: CallbackTo[String],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    remove: Callback
  ): ExcludedVideoAudience = {
    val __obj = js.Dynamic.literal(getAudienceId = getAudienceId.toJsFn, getAudienceType = getAudienceType.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedVideoAudience]
  }
  
  extension [Self <: ExcludedVideoAudience](x: Self) {
    
    inline def setGetAudienceId(value: CallbackTo[Double]): Self = StObject.set(x, "getAudienceId", value.toJsFn)
    
    inline def setGetAudienceType(value: CallbackTo[String]): Self = StObject.set(x, "getAudienceType", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
