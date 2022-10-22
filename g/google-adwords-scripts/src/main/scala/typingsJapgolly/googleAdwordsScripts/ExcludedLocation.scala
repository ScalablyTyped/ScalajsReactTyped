package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedLocation
  extends StObject
     with AdWordsEntity
     with isCampaignChild {
  
  def getCampaignType(): CampaignType
  
  def getCountryCode(): String
  
  def getId(): Double
  
  def getName(): String
  
  def getTargetType(): TargetType
  
  def getTargetingStatus(): TargetingStatus
  
  def getVideoCampaign(): Campaign
  
  // TODO: VideoCampaign
  def remove(): Unit
}
object ExcludedLocation {
  
  inline def apply(
    getCampaign: CallbackTo[Campaign],
    getCampaignType: CallbackTo[CampaignType],
    getCountryCode: CallbackTo[String],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getTargetType: CallbackTo[TargetType],
    getTargetingStatus: CallbackTo[TargetingStatus],
    getVideoCampaign: CallbackTo[Campaign],
    remove: Callback
  ): ExcludedLocation = {
    val __obj = js.Dynamic.literal(getCampaign = getCampaign.toJsFn, getCampaignType = getCampaignType.toJsFn, getCountryCode = getCountryCode.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, getTargetType = getTargetType.toJsFn, getTargetingStatus = getTargetingStatus.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedLocation]
  }
  
  extension [Self <: ExcludedLocation](x: Self) {
    
    inline def setGetCampaignType(value: CallbackTo[CampaignType]): Self = StObject.set(x, "getCampaignType", value.toJsFn)
    
    inline def setGetCountryCode(value: CallbackTo[String]): Self = StObject.set(x, "getCountryCode", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetTargetType(value: CallbackTo[TargetType]): Self = StObject.set(x, "getTargetType", value.toJsFn)
    
    inline def setGetTargetingStatus(value: CallbackTo[TargetingStatus]): Self = StObject.set(x, "getTargetingStatus", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
