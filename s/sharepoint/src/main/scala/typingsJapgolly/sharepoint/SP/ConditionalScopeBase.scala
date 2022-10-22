package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalScopeBase extends StObject {
  
  def customFromJson(initValue: Any): Boolean
  
  def fromJson(initValue: Any): Unit
  
  def get_testResult(): Boolean
  
  def startIfFalse(): Any
  
  def startIfTrue(): Any
  
  def startScope(): Any
}
object ConditionalScopeBase {
  
  inline def apply(
    customFromJson: Any => Boolean,
    fromJson: Any => Callback,
    get_testResult: CallbackTo[Boolean],
    startIfFalse: CallbackTo[Any],
    startIfTrue: CallbackTo[Any],
    startScope: CallbackTo[Any]
  ): ConditionalScopeBase = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_testResult = get_testResult.toJsFn, startIfFalse = startIfFalse.toJsFn, startIfTrue = startIfTrue.toJsFn, startScope = startScope.toJsFn)
    __obj.asInstanceOf[ConditionalScopeBase]
  }
  
  extension [Self <: ConditionalScopeBase](x: Self) {
    
    inline def setCustomFromJson(value: Any => Boolean): Self = StObject.set(x, "customFromJson", js.Any.fromFunction1(value))
    
    inline def setFromJson(value: Any => Callback): Self = StObject.set(x, "fromJson", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGet_testResult(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_testResult", value.toJsFn)
    
    inline def setStartIfFalse(value: CallbackTo[Any]): Self = StObject.set(x, "startIfFalse", value.toJsFn)
    
    inline def setStartIfTrue(value: CallbackTo[Any]): Self = StObject.set(x, "startIfTrue", value.toJsFn)
    
    inline def setStartScope(value: CallbackTo[Any]): Self = StObject.set(x, "startScope", value.toJsFn)
  }
}
