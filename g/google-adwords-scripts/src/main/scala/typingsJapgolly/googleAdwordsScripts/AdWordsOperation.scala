package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsOperation[E] extends StObject {
  
  def getErrors(): js.Array[String]
  
  def getResult(): E
  
  def isSuccessful(): Boolean
}
object AdWordsOperation {
  
  inline def apply[E](
    getErrors: CallbackTo[js.Array[String]],
    getResult: CallbackTo[E],
    isSuccessful: CallbackTo[Boolean]
  ): AdWordsOperation[E] = {
    val __obj = js.Dynamic.literal(getErrors = getErrors.toJsFn, getResult = getResult.toJsFn, isSuccessful = isSuccessful.toJsFn)
    __obj.asInstanceOf[AdWordsOperation[E]]
  }
  
  extension [Self <: AdWordsOperation[?], E](x: Self & AdWordsOperation[E]) {
    
    inline def setGetErrors(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getErrors", value.toJsFn)
    
    inline def setGetResult(value: CallbackTo[E]): Self = StObject.set(x, "getResult", value.toJsFn)
    
    inline def setIsSuccessful(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSuccessful", value.toJsFn)
  }
}
