package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedTopic
  extends StObject
     with isAdGroupChild {
  
  def getId(): Double
  
  def getTopicId(): Double
  
  def remove(): Unit
}
object ExcludedTopic {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getTopicId: CallbackTo[Double],
    remove: Callback
  ): ExcludedTopic = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getTopicId = getTopicId.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedTopic]
  }
  
  extension [Self <: ExcludedTopic](x: Self) {
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetTopicId(value: CallbackTo[Double]): Self = StObject.set(x, "getTopicId", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
