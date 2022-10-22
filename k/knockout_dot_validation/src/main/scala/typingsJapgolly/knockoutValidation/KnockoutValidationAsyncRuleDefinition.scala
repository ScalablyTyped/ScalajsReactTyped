package typingsJapgolly.knockoutValidation

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationAsyncRuleDefinition
  extends StObject
     with KnockoutValidationRuleBase {
  
  var async: Boolean
  
  def validator(value: Any, params: Any, callback: KnockoutValidationAsyncCallback): Unit
}
object KnockoutValidationAsyncRuleDefinition {
  
  inline def apply(
    async: Boolean,
    message: String | KnockoutValidationMessageFunction,
    validator: (Any, Any, KnockoutValidationAsyncCallback) => Callback
  ): KnockoutValidationAsyncRuleDefinition = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction3((t0: Any, t1: Any, t2: KnockoutValidationAsyncCallback) => (validator(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[KnockoutValidationAsyncRuleDefinition]
  }
  
  extension [Self <: KnockoutValidationAsyncRuleDefinition](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setValidator(value: (Any, Any, KnockoutValidationAsyncCallback) => Callback): Self = StObject.set(x, "validator", js.Any.fromFunction3((t0: Any, t1: Any, t2: KnockoutValidationAsyncCallback) => (value(t0, t1, t2)).runNow()))
  }
}
