package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IArrayStore
  extends StObject
     with IStore {
  
  /** [Method] Loads an array of data straight into the Store
    * @param data Object
    * @param append Object
    */
  @JSName("loadData")
  var loadData_IArrayStore: js.UndefOr[js.Function2[/* data */ js.UndefOr[Any], /* append */ js.UndefOr[Any], Unit]] = js.undefined
}
object IArrayStore {
  
  inline def apply(): IArrayStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayStore]
  }
  
  extension [Self <: IArrayStore](x: Self) {
    
    inline def setLoadData(value: (/* data */ js.UndefOr[Any], /* append */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "loadData", js.Any.fromFunction2((t0: /* data */ js.UndefOr[Any], t1: /* append */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
  }
}
