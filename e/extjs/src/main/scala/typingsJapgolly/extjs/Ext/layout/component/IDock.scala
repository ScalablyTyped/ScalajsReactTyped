package typingsJapgolly.extjs.Ext.layout.component

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDock
  extends StObject
     with IComponent {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Retrieve an ordered and or filtered array of all docked Components
    * @param order String The desired ordering of the items ('render' or 'visual').
    * @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
    * @returns Ext.Component[] An array of components.
    */
  var getDockedItems: js.UndefOr[
    js.Function2[/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean], Array]
  ] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IDock: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any], ISizePolicy]
  ] = js.undefined
  
  /** [Method] Returns an array containing all the visible docked items inside this layout s owner Panel
    * @returns Array An array containing all the visible docked items of the Panel
    */
  @JSName("getLayoutItems")
  var getLayoutItems_IDock: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] The default weighting of docked items produces this arrangement
    * @param ownerContext Object
    * @param horz Object
    * @param vert Object
    */
  var invalidateAxes: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[Any], 
      /* horz */ js.UndefOr[Any], 
      /* vert */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
}
object IDock {
  
  inline def apply(): IDock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDock]
  }
  
  extension [Self <: IDock](x: Self) {
    
    inline def setBeginLayout(value: /* ownerContext */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    inline def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "calculate", js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setGetDockedItems(value: (/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean]) => Array): Self = StObject.set(x, "getDockedItems", js.Any.fromFunction2(value))
    
    inline def setGetDockedItemsUndefined: Self = StObject.set(x, "getDockedItems", js.undefined)
    
    inline def setGetItemSizePolicy(value: (/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any]) => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction2(value))
    
    inline def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    inline def setGetLayoutItems(value: CallbackTo[Array]): Self = StObject.set(x, "getLayoutItems", value.toJsFn)
    
    inline def setGetLayoutItemsUndefined: Self = StObject.set(x, "getLayoutItems", js.undefined)
    
    inline def setInvalidateAxes(
      value: (/* ownerContext */ js.UndefOr[Any], /* horz */ js.UndefOr[Any], /* vert */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "invalidateAxes", js.Any.fromFunction3((t0: /* ownerContext */ js.UndefOr[Any], t1: /* horz */ js.UndefOr[Any], t2: /* vert */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setInvalidateAxesUndefined: Self = StObject.set(x, "invalidateAxes", js.undefined)
  }
}
