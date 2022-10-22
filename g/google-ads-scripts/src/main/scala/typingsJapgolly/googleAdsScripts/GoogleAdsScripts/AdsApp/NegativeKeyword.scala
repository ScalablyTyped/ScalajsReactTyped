package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads negative keyword.
  *
  * Negative keywords can exist either at the ad group level or the campaign level.
  */
trait NegativeKeyword extends StObject {
  
  /** Returns the AdGroup to which the negative keyword belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the base AdGroup to which the negative keyword belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this negative keyword belongs or null if it does not belong to a search or display campaign. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this negative keyword belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the campaign type. */
  def getCampaignType(): String
  
  /** Returns the type of this entity as a String, in this case, "NegativeKeyword". */
  def getEntityType(): String
  
  /** Returns the match type of the negative keyword. */
  def getMatchType(): String
  
  /** Returns the ShoppingAdGroup to which the negative keyword belongs. */
  def getShoppingAdGroup(): ShoppingAdGroup
  
  /** Returns the shopping campaign to which this negative keyword belongs or null if it does not belong to a shopping campaign. */
  def getShoppingCampaign(): ShoppingCampaign
  
  /** Returns the text of the negative keyword. */
  def getText(): String
  
  /** Removes the negative keyword. */
  def remove(): Unit
}
object NegativeKeyword {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getBaseAdGroup: CallbackTo[AdGroup],
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getCampaignType: CallbackTo[String],
    getEntityType: CallbackTo[String],
    getMatchType: CallbackTo[String],
    getShoppingAdGroup: CallbackTo[ShoppingAdGroup],
    getShoppingCampaign: CallbackTo[ShoppingCampaign],
    getText: CallbackTo[String],
    remove: Callback
  ): NegativeKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getBaseAdGroup = getBaseAdGroup.toJsFn, getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getCampaignType = getCampaignType.toJsFn, getEntityType = getEntityType.toJsFn, getMatchType = getMatchType.toJsFn, getShoppingAdGroup = getShoppingAdGroup.toJsFn, getShoppingCampaign = getShoppingCampaign.toJsFn, getText = getText.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[NegativeKeyword]
  }
  
  extension [Self <: NegativeKeyword](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
    
    inline def setGetBaseAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getBaseAdGroup", value.toJsFn)
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetCampaignType(value: CallbackTo[String]): Self = StObject.set(x, "getCampaignType", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetMatchType(value: CallbackTo[String]): Self = StObject.set(x, "getMatchType", value.toJsFn)
    
    inline def setGetShoppingAdGroup(value: CallbackTo[ShoppingAdGroup]): Self = StObject.set(x, "getShoppingAdGroup", value.toJsFn)
    
    inline def setGetShoppingCampaign(value: CallbackTo[ShoppingCampaign]): Self = StObject.set(x, "getShoppingCampaign", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
