package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedDisplayKeyword
  extends StObject
     with isAdGroupChild {
  
  def getId(): Double
  
  def getText(): String
  
  def remove(): Unit
}
object ExcludedDisplayKeyword {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getText: CallbackTo[String],
    remove: Callback
  ): ExcludedDisplayKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getCampaign = getCampaign.toJsFn, getId = getId.toJsFn, getText = getText.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[ExcludedDisplayKeyword]
  }
  
  extension [Self <: ExcludedDisplayKeyword](x: Self) {
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
