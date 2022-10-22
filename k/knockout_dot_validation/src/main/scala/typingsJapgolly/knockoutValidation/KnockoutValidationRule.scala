package typingsJapgolly.knockoutValidation

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationRule extends StObject {
  
  var condition: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var message: js.UndefOr[String | KnockoutValidationMessageFunction] = js.undefined
  
  var params: Any
  
  var rule: String
}
object KnockoutValidationRule {
  
  inline def apply(params: Any, rule: String): KnockoutValidationRule = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationRule]
  }
  
  extension [Self <: KnockoutValidationRule](x: Self) {
    
    inline def setCondition(value: CallbackTo[Boolean]): Self = StObject.set(x, "condition", value.toJsFn)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setMessage(value: String | KnockoutValidationMessageFunction): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction2(value: (/* params */ Any, /* observable */ Any) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
