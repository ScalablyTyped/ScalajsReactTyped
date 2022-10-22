package typingsJapgolly.knockoutEs5

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutDefinePropertyOptions extends StObject {
  
  def get(): Any
  
  var set: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
}
object KnockoutDefinePropertyOptions {
  
  inline def apply(get: CallbackTo[Any]): KnockoutDefinePropertyOptions = {
    val __obj = js.Dynamic.literal(get = get.toJsFn)
    __obj.asInstanceOf[KnockoutDefinePropertyOptions]
  }
  
  extension [Self <: KnockoutDefinePropertyOptions](x: Self) {
    
    inline def setGet(value: CallbackTo[Any]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setSet(value: /* value */ Any => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
