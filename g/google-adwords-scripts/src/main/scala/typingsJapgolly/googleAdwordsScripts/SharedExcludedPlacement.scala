package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedExcludedPlacement
  extends StObject
     with AdWordsEntity {
  
  def getExcludedPlacementList(): ExcludedPlacementList
  
  def getUrl(): String
  
  def remove(): Unit
}
object SharedExcludedPlacement {
  
  inline def apply(
    getExcludedPlacementList: CallbackTo[ExcludedPlacementList],
    getUrl: CallbackTo[String],
    remove: Callback
  ): SharedExcludedPlacement = {
    val __obj = js.Dynamic.literal(getExcludedPlacementList = getExcludedPlacementList.toJsFn, getUrl = getUrl.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[SharedExcludedPlacement]
  }
  
  extension [Self <: SharedExcludedPlacement](x: Self) {
    
    inline def setGetExcludedPlacementList(value: CallbackTo[ExcludedPlacementList]): Self = StObject.set(x, "getExcludedPlacementList", value.toJsFn)
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
