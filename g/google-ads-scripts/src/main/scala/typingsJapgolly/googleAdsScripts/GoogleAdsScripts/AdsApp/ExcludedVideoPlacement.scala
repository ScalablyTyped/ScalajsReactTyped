package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Placement in a Video Campaign. */
trait ExcludedVideoPlacement extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoPlacement". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video placement. */
  def getId(): Double
  
  /** Returns the URL of the excluded placement. */
  def getUrl(): String
  
  /** Returns the ad group to which this excluded video placement belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video placement belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video placement. */
  def remove(): Unit
}
object ExcludedVideoPlacement {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getUrl: CallbackTo[String],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    remove: Callback
  ): ExcludedVideoPlacement = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getUrl = getUrl.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedVideoPlacement]
  }
  
  extension [Self <: ExcludedVideoPlacement](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
