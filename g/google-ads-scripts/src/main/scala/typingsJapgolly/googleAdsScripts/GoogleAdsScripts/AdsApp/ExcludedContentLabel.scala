package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded content label target. */
trait ExcludedContentLabel extends StObject {
  
  /** Returns the base campaign to which this excluded content label belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excluded content label belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the campaign type. */
  def getCampaignType(): String
  
  /** Returns the content label type. */
  def getContentLabelType(): String
  
  /** Returns the type of this entity as a String, in this case, "ExcludedContentLabel". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded content label. */
  def getId(): Double
  
  /** Returns the video campaign to which this excluded content label belongs or null if it does not belong to a video campaign. */
  def getVideoCampaign(): VideoCampaign
  
  /** Removes the excluded content label. */
  def remove(): Unit
}
object ExcludedContentLabel {
  
  inline def apply(
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getCampaignType: CallbackTo[String],
    getContentLabelType: CallbackTo[String],
    getEntityType: CallbackTo[String],
    getId: CallbackTo[Double],
    getVideoCampaign: CallbackTo[VideoCampaign],
    remove: Callback
  ): ExcludedContentLabel = {
    val __obj = js.Dynamic.literal(getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getCampaignType = getCampaignType.toJsFn, getContentLabelType = getContentLabelType.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedContentLabel]
  }
  
  extension [Self <: ExcludedContentLabel](x: Self) {
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetCampaignType(value: CallbackTo[String]): Self = StObject.set(x, "getCampaignType", value.toJsFn)
    
    inline def setGetContentLabelType(value: CallbackTo[String]): Self = StObject.set(x, "getContentLabelType", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[VideoCampaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
