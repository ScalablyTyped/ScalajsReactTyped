package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedAudience
  extends StObject
     with isAdGroupChild {
  
  def getAudienceId(): Double
  
  def getAudienceType(): AudienceType
  
  def getId(): Double
  
  def remove(): Unit
}
object ExcludedAudience {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getAudienceId: CallbackTo[Double],
    getAudienceType: CallbackTo[AudienceType],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    remove: Callback
  ): ExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getAudienceId = getAudienceId.toJsFn, getAudienceType = getAudienceType.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedAudience]
  }
  
  extension [Self <: ExcludedAudience](x: Self) {
    
    inline def setGetAudienceId(value: CallbackTo[Double]): Self = StObject.set(x, "getAudienceId", value.toJsFn)
    
    inline def setGetAudienceType(value: CallbackTo[AudienceType]): Self = StObject.set(x, "getAudienceType", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
