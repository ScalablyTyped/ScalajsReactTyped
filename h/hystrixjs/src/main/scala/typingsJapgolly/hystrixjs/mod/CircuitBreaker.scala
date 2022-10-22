package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircuitBreaker extends StObject {
  
  def allowRequest(): Boolean
  
  def allowSingleTest(): Boolean
  
  def isOpen(): Boolean
  
  def markSuccess(): Unit
}
object CircuitBreaker {
  
  inline def apply(
    allowRequest: CallbackTo[Boolean],
    allowSingleTest: CallbackTo[Boolean],
    isOpen: CallbackTo[Boolean],
    markSuccess: Callback
  ): CircuitBreaker = {
    val __obj = js.Dynamic.literal(allowRequest = allowRequest.toJsFn, allowSingleTest = allowSingleTest.toJsFn, isOpen = isOpen.toJsFn, markSuccess = markSuccess.toJsFn)
    __obj.asInstanceOf[CircuitBreaker]
  }
  
  extension [Self <: CircuitBreaker](x: Self) {
    
    inline def setAllowRequest(value: CallbackTo[Boolean]): Self = StObject.set(x, "allowRequest", value.toJsFn)
    
    inline def setAllowSingleTest(value: CallbackTo[Boolean]): Self = StObject.set(x, "allowSingleTest", value.toJsFn)
    
    inline def setIsOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpen", value.toJsFn)
    
    inline def setMarkSuccess(value: Callback): Self = StObject.set(x, "markSuccess", value.toJsFn)
  }
}
