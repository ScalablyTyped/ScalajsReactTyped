package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedPlacement
  extends StObject
     with isAdGroupChild {
  
  def getId(): Double
  
  def getUrl(): String
  
  def remove(): Unit
}
object ExcludedPlacement {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getUrl: CallbackTo[String],
    remove: Callback
  ): ExcludedPlacement = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getUrl = getUrl.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedPlacement]
  }
  
  extension [Self <: ExcludedPlacement](x: Self) {
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
