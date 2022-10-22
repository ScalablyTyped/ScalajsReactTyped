package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGrouper
  extends StObject
     with ISorter {
  
  /** [Method] Returns the value of groupFn
    * @returns Function
    */
  var getGroupFn: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of sortProperty
    * @returns String
    */
  var getSortProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (Function) */
  var groupFn: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the value of groupFn
    * @param groupFn Function The new value.
    */
  var setGroupFn: js.UndefOr[js.Function1[/* groupFn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of sortProperty
    * @param sortProperty String The new value.
    */
  var setSortProperty: js.UndefOr[js.Function1[/* sortProperty */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var sortProperty: js.UndefOr[String] = js.undefined
}
object IGrouper {
  
  inline def apply(): IGrouper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrouper]
  }
  
  extension [Self <: IGrouper](x: Self) {
    
    inline def setGetGroupFn(value: CallbackTo[Any]): Self = StObject.set(x, "getGroupFn", value.toJsFn)
    
    inline def setGetGroupFnUndefined: Self = StObject.set(x, "getGroupFn", js.undefined)
    
    inline def setGetSortProperty(value: CallbackTo[String]): Self = StObject.set(x, "getSortProperty", value.toJsFn)
    
    inline def setGetSortPropertyUndefined: Self = StObject.set(x, "getSortProperty", js.undefined)
    
    inline def setGroupFn(value: Any): Self = StObject.set(x, "groupFn", value.asInstanceOf[js.Any])
    
    inline def setGroupFnUndefined: Self = StObject.set(x, "groupFn", js.undefined)
    
    inline def setSetGroupFn(value: /* groupFn */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setGroupFn", js.Any.fromFunction1((t0: /* groupFn */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetGroupFnUndefined: Self = StObject.set(x, "setGroupFn", js.undefined)
    
    inline def setSetSortProperty(value: /* sortProperty */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setSortProperty", js.Any.fromFunction1((t0: /* sortProperty */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetSortPropertyUndefined: Self = StObject.set(x, "setSortProperty", js.undefined)
    
    inline def setSortProperty(value: String): Self = StObject.set(x, "sortProperty", value.asInstanceOf[js.Any])
    
    inline def setSortPropertyUndefined: Self = StObject.set(x, "sortProperty", js.undefined)
  }
}
