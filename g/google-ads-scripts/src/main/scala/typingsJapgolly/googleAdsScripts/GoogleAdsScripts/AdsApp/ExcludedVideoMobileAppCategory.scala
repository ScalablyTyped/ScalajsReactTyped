package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Mobile App Category in a Video Campaign. */
trait ExcludedVideoMobileAppCategory extends StObject {
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoMobileAppCategory". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video mobile application category. */
  def getId(): Double
  
  /** Returns the ID of the excluded mobile application category. */
  def getMobileAppCategoryId(): Double
  
  /** Returns the ad group to which this excluded video mobile application category belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video mobile application category belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video mobile application category. */
  def remove(): Unit
}
object ExcludedVideoMobileAppCategory {
  
  inline def apply(
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getMobileAppCategoryId: CallbackTo[Double],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    remove: Callback
  ): ExcludedVideoMobileAppCategory = {
    val __obj = js.Dynamic.literal(getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getMobileAppCategoryId = getMobileAppCategoryId.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedVideoMobileAppCategory]
  }
  
  extension [Self <: ExcludedVideoMobileAppCategory](x: Self) {
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetMobileAppCategoryId(value: CallbackTo[Double]): Self = StObject.set(x, "getMobileAppCategoryId", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
