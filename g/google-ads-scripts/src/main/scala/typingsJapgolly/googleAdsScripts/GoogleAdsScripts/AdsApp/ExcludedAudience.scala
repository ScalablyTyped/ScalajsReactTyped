package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads excludedAudience. */
trait ExcludedAudience extends StObject {
  
  /** Returns the ad group to which this excludedAudience belongs. */
  def getAdGroup(): AdGroup
  
  /** Returns the excludedAudience ID of the excludedAudience. */
  def getAudienceId(): Double
  
  /** Returns the type of the excludedAudience, either USER_INTEREST or USER_LIST. */
  def getAudienceType(): AudienceTypeType
  
  /** Returns the base ad group to which this excludedAudience belongs. */
  def getBaseAdGroup(): AdGroup
  
  /** Returns the base campaign to which this excludedAudience belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the campaign to which this excludedAudience belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign
  
  /** Returns the ID of the excludedAudience. */
  def getId(): Double
  
  /** Removes the excludedAudience. */
  def remove(): Unit
}
object ExcludedAudience {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getAudienceId: CallbackTo[Double],
    getAudienceType: CallbackTo[AudienceTypeType],
    getBaseAdGroup: CallbackTo[AdGroup],
    getBaseCampaign: CallbackTo[Campaign],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    remove: Callback
  ): ExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getAudienceId = getAudienceId.toJsFn, getAudienceType = getAudienceType.toJsFn, getBaseAdGroup = getBaseAdGroup.toJsFn, getBaseCampaign = getBaseCampaign.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedAudience]
  }
  
  extension [Self <: ExcludedAudience](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
    
    inline def setGetAudienceId(value: CallbackTo[Double]): Self = StObject.set(x, "getAudienceId", value.toJsFn)
    
    inline def setGetAudienceType(value: CallbackTo[AudienceTypeType]): Self = StObject.set(x, "getAudienceType", value.toJsFn)
    
    inline def setGetBaseAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getBaseAdGroup", value.toJsFn)
    
    inline def setGetBaseCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getBaseCampaign", value.toJsFn)
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
