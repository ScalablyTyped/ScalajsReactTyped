package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excluded display keyword. */
trait ExcludedDisplayKeyword extends StObject {
  
  /** Returns the ad group to which this audience belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base ad group to which this audience belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this audience belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this audience belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the ID of the audience. */
  def getId(): Double
  
  /** Returns the text of the excluded display keyword. */
  def getText(): String
  
  /** Removes the audience. */
  def remove(): Unit
}
object ExcludedDisplayKeyword {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getBaseAdGroup: CallbackTo[AdGroup],
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getText: CallbackTo[String],
    remove: Callback
  ): ExcludedDisplayKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getBaseAdGroup = getBaseAdGroup.toJsFn, getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getText = getText.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedDisplayKeyword]
  }
  
  extension [Self <: ExcludedDisplayKeyword](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
    
    inline def setGetBaseAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getBaseAdGroup", value.toJsFn)
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
