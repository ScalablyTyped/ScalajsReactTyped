package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads excluded location.
  *
  * Excluded locations are used to restrict your ads from showing in specific geographic areas.
  * For instance, a campaign could show ads in all parts of a country except for a specific city by having a TargetedLocation
  * for the entire country and an ExcludedLocation for that specific city.
  */
trait ExcludedLocation extends StObject {
  
  /** Returns the base campaign to which this excluded location belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded location belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the campaign type. */
  def getCampaignType(): String
  
  /** Returns the country code of this location. */
  def getCountryCode(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedLocation". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded location. */
  def getId(): Double
  
  /** Returns the name of this location. */
  def getName(): String
  
  /** Returns the shopping campaign to which this excluded location belongs or null if it does not belong to a shopping campaign. */
  def getShoppingCampaign(): ShoppingCampaign
  
  /** Returns the target type of this location. */
  def getTargetType(): String
  
  /** Returns the targeting status of this location. */
  def getTargetingStatus(): String
  
  /** Returns the video campaign to which this excluded location belongs or null if it does not belong to a video campaign. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded location. */
  def remove(): Unit
}
object ExcludedLocation {
  
  inline def apply(
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getCampaignType: CallbackTo[String],
    getCountryCode: CallbackTo[String],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getShoppingCampaign: CallbackTo[ShoppingCampaign],
    getTargetType: CallbackTo[String],
    getTargetingStatus: CallbackTo[String],
    getVideoCampaign: CallbackTo[VideoCampaign],
    remove: Callback
  ): ExcludedLocation = {
    val __obj = js.Dynamic.literal(getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getCampaignType = getCampaignType.toJsFn, getCountryCode = getCountryCode.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, getShoppingCampaign = getShoppingCampaign.toJsFn, getTargetType = getTargetType.toJsFn, getTargetingStatus = getTargetingStatus.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedLocation]
  }
  
  extension [Self <: ExcludedLocation](x: Self) {
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetCampaignType(value: CallbackTo[String]): Self = StObject.set(x, "getCampaignType", value.toJsFn)
    
    inline def setGetCountryCode(value: CallbackTo[String]): Self = StObject.set(x, "getCountryCode", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetShoppingCampaign(value: CallbackTo[ShoppingCampaign]): Self = StObject.set(x, "getShoppingCampaign", value.toJsFn)
    
    inline def setGetTargetType(value: CallbackTo[String]): Self = StObject.set(x, "getTargetType", value.toJsFn)
    
    inline def setGetTargetingStatus(value: CallbackTo[String]): Self = StObject.set(x, "getTargetingStatus", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
