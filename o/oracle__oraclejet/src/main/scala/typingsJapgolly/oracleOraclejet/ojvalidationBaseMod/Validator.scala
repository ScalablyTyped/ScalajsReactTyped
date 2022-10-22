package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validator[V] extends StObject {
  
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.undefined
  
  def validate(value: V): Unit
}
object Validator {
  
  inline def apply[V](validate: V => Callback): Validator[V] = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1((t0: V) => validate(t0).runNow()))
    __obj.asInstanceOf[Validator[V]]
  }
  
  extension [Self <: Validator[?], V](x: Self & Validator[V]) {
    
    inline def setGetHint(value: CallbackTo[String | Null]): Self = StObject.set(x, "getHint", value.toJsFn)
    
    inline def setGetHintUndefined: Self = StObject.set(x, "getHint", js.undefined)
    
    inline def setValidate(value: V => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: V) => value(t0).runNow()))
  }
}
