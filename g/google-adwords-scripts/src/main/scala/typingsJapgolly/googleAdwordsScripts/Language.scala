package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language
  extends StObject
     with AdWordsEntity
     with isCampaignChild {
  
  def getCampaignType(): CampaignType
  
  def getId(): Double
  
  def getName(): String
  
  def getVideoCampaign(): Campaign
  
  // TODO: VideoCampaign
  def remove(): Unit
}
object Language {
  
  inline def apply(
    getCampaign: CallbackTo[Campaign],
    getCampaignType: CallbackTo[CampaignType],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getVideoCampaign: CallbackTo[Campaign],
    remove: Callback
  ): Language = {
    val __obj = js.Dynamic.literal(getCampaign = getCampaign.toJsFn, getCampaignType = getCampaignType.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, getVideoCampaign = getVideoCampaign.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setGetCampaignType(value: CallbackTo[CampaignType]): Self = StObject.set(x, "getCampaignType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetVideoCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getVideoCampaign", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
