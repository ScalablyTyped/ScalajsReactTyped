package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAdGroupExcludedAudience
  extends StObject
     with isAdGroupChild {
  
  def getAudienceId(): Double
  
  def getId(): Double
  
  def getName(): String
  
  def remove(): Unit
}
object SearchAdGroupExcludedAudience {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getAudienceId: CallbackTo[Double],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    remove: Callback
  ): SearchAdGroupExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getAudienceId = getAudienceId.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[SearchAdGroupExcludedAudience]
  }
  
  extension [Self <: SearchAdGroupExcludedAudience](x: Self) {
    
    inline def setGetAudienceId(value: CallbackTo[Double]): Self = StObject.set(x, "getAudienceId", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
