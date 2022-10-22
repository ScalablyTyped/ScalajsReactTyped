package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded Mobile Application criterion in a Video Campaign. */
trait ExcludedVideoMobileApplication extends StObject {
  
  /** Returns the ID of the excluded mobile application. */
  def getAppId(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedVideoMobileApplication". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded video mobile application. */
  def getId(): Double
  
  /** Returns the mobile application name. */
  def getName(): String
  
  /** Returns the ad group to which this excluded video mobile application belongs. */
  def getVideoAdGroup(): VideoAdGroup
  
  /** Returns the campaign to which this excluded video mobile application belongs. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded video mobile application. */
  def remove(): Unit
}
object ExcludedVideoMobileApplication {
  
  inline def apply(
    getAppId: CallbackTo[String],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getVideoAdGroup: CallbackTo[VideoAdGroup],
    getVideoCampaign: CallbackTo[VideoCampaign],
    remove: Callback
  ): ExcludedVideoMobileApplication = {
    val __obj = js.Dynamic.literal(getAppId = getAppId.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, getVideoAdGroup = getVideoAdGroup.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedVideoMobileApplication]
  }
  
  extension [Self <: ExcludedVideoMobileApplication](x: Self) {
    
    inline def setGetAppId(value: CallbackTo[String]): Self = StObject.set(x, "getAppId", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetVideoAdGroup(value: CallbackTo[VideoAdGroup]): Self = StObject.set(x, "getVideoAdGroup", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
