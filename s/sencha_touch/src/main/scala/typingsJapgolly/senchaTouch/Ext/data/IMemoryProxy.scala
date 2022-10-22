package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.data.proxy.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMemoryProxy
  extends StObject
     with IClient {
  
  /** [Config Option] (Object) */
  var data: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the value of data
    * @returns Object
    */
  var getData: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], Unit]] = js.undefined
}
object IMemoryProxy {
  
  inline def apply(): IMemoryProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemoryProxy]
  }
  
  extension [Self <: IMemoryProxy](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGetData(value: CallbackTo[Any]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setSetData(value: /* data */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: /* data */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
  }
}
