package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedContentLabel
  extends StObject
     with AdWordsEntity
     with isCampaignChild {
  
  def getCampaignType(): CampaignType
  
  def getContentLabelType(): String
  
  // TODO: ContentLabelType
  def getId(): Double
  
  def getVideoCampaign(): Campaign
  
  // TODO: VideoCampaign
  def remove(): Unit
}
object ExcludedContentLabel {
  
  inline def apply(
    getCampaign: CallbackTo[Campaign],
    getCampaignType: CallbackTo[CampaignType],
    getContentLabelType: CallbackTo[String],
    getId: CallbackTo[Double],
    getVideoCampaign: CallbackTo[Campaign],
    remove: Callback
  ): ExcludedContentLabel = {
    val __obj = js.Dynamic.literal(getCampaign = getCampaign.toJsFn, getCampaignType = getCampaignType.toJsFn, getContentLabelType = getContentLabelType.toJsFn, getId = getId.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedContentLabel]
  }
  
  extension [Self <: ExcludedContentLabel](x: Self) {
    
    inline def setGetCampaignType(value: CallbackTo[CampaignType]): Self = StObject.set(x, "getCampaignType", value.toJsFn)
    
    inline def setGetContentLabelType(value: CallbackTo[String]): Self = StObject.set(x, "getContentLabelType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
