package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyDescriptor extends StObject {
  
  /* standard es5 */
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard es5 */
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard es5 */
  var get: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /* standard es5 */
  var set: js.UndefOr[js.Function1[/* v */ Any, Unit]] = js.undefined
  
  /* standard es5 */
  var value: js.UndefOr[Any] = js.undefined
  
  /* standard es5 */
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}
object PropertyDescriptor {
  
  inline def apply(): PropertyDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyDescriptor]
  }
  
  extension [Self <: PropertyDescriptor](x: Self) {
    
    inline def setConfigurable(value: scala.Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    inline def setEnumerable(value: scala.Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    inline def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
    
    inline def setGet(value: CallbackTo[Any]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setSet(value: /* v */ Any => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: /* v */ Any) => value(t0).runNow()))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWritable(value: scala.Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
