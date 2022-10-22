package typingsJapgolly.extjs.Ext.layout

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.layout.container.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITableLayout
  extends StObject
     with IContainer {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_ITableLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.undefined
  
  /** [Method] This method if implemented is called after all layouts have completed  */
  @JSName("finalizeLayout")
  var finalizeLayout_ITableLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Validates item is in the proper place in the dom
    * @param item Object
    * @param target Object
    * @param rowIdx Object
    * @param cellIdx Object
    */
  @JSName("isValidParent")
  var isValidParent_ITableLayout: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[Any], 
      /* target */ js.UndefOr[Any], 
      /* rowIdx */ js.UndefOr[Any], 
      /* cellIdx */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Object) */
  var tableAttrs: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var tdAttrs: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var trAttrs: js.UndefOr[Any] = js.undefined
}
object ITableLayout {
  
  inline def apply(): ITableLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableLayout]
  }
  
  extension [Self <: ITableLayout](x: Self) {
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "calculate", js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setFinalizeLayout(value: Callback): Self = StObject.set(x, "finalizeLayout", value.toJsFn)
    
    inline def setFinalizeLayoutUndefined: Self = StObject.set(x, "finalizeLayout", js.undefined)
    
    inline def setIsValidParent(
      value: (/* item */ js.UndefOr[Any], /* target */ js.UndefOr[Any], /* rowIdx */ js.UndefOr[Any], /* cellIdx */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "isValidParent", js.Any.fromFunction4((t0: /* item */ js.UndefOr[Any], t1: /* target */ js.UndefOr[Any], t2: /* rowIdx */ js.UndefOr[Any], t3: /* cellIdx */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setIsValidParentUndefined: Self = StObject.set(x, "isValidParent", js.undefined)
    
    inline def setTableAttrs(value: Any): Self = StObject.set(x, "tableAttrs", value.asInstanceOf[js.Any])
    
    inline def setTableAttrsUndefined: Self = StObject.set(x, "tableAttrs", js.undefined)
    
    inline def setTdAttrs(value: Any): Self = StObject.set(x, "tdAttrs", value.asInstanceOf[js.Any])
    
    inline def setTdAttrsUndefined: Self = StObject.set(x, "tdAttrs", js.undefined)
    
    inline def setTrAttrs(value: Any): Self = StObject.set(x, "trAttrs", value.asInstanceOf[js.Any])
    
    inline def setTrAttrsUndefined: Self = StObject.set(x, "trAttrs", js.undefined)
  }
}
