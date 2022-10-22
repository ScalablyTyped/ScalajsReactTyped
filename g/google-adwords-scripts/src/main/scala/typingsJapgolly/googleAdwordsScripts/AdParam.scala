package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Ad Param
trait AdParam
  extends StObject
     with AdWordsEntity {
  
  def getAdGroup(): AdGroup
  
  def getInde(): Double
  
  def getInsertionText(): String
  
  def getKeyword(): Keyword
  
  def remove(): Unit
  
  def setInsertionText(insertionText: String): Unit
}
object AdParam {
  
  inline def apply(
    getAdGroup: CallbackTo[AdGroup],
    getInde: CallbackTo[Double],
    getInsertionText: CallbackTo[String],
    getKeyword: CallbackTo[Keyword],
    remove: Callback,
    setInsertionText: String => Callback
  ): AdParam = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getInde = getInde.toJsFn, getInsertionText = getInsertionText.toJsFn, getKeyword = getKeyword.toJsFn, remove = remove.toJsFn, setInsertionText = js.Any.fromFunction1((t0: String) => setInsertionText(t0).runNow()))
    __obj.asInstanceOf[AdParam]
  }
  
  extension [Self <: AdParam](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
    
    inline def setGetInde(value: CallbackTo[Double]): Self = StObject.set(x, "getInde", value.toJsFn)
    
    inline def setGetInsertionText(value: CallbackTo[String]): Self = StObject.set(x, "getInsertionText", value.toJsFn)
    
    inline def setGetKeyword(value: CallbackTo[Keyword]): Self = StObject.set(x, "getKeyword", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetInsertionText(value: String => Callback): Self = StObject.set(x, "setInsertionText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
