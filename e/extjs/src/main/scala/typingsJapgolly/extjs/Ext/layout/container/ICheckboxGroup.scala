package typingsJapgolly.extjs.Ext.layout.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICheckboxGroup
  extends StObject
     with IContainer {
  
  /** [Config Option] (Boolean) */
  var autoFlex: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Just wait for the child items to all lay themselves out in the width we are configured to make available to them
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_ICheckboxGroup: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], ISizePolicy]] = js.undefined
  
  /** [Method] Always valid  */
  @JSName("isValidParent")
  var isValidParent_ICheckboxGroup: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Iterates over all passed items ensuring they are rendered
    * @param items Object
    */
  @JSName("renderItems")
  var renderItems_ICheckboxGroup: js.UndefOr[js.Function1[/* items */ js.UndefOr[Any], Unit]] = js.undefined
}
object ICheckboxGroup {
  
  inline def apply(): ICheckboxGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxGroup]
  }
  
  extension [Self <: ICheckboxGroup](x: Self) {
    
    inline def setAutoFlex(value: Boolean): Self = StObject.set(x, "autoFlex", value.asInstanceOf[js.Any])
    
    inline def setAutoFlexUndefined: Self = StObject.set(x, "autoFlex", js.undefined)
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "calculate", js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setGetItemSizePolicy(value: /* item */ js.UndefOr[Any] => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction1(value))
    
    inline def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    inline def setIsValidParent(value: Callback): Self = StObject.set(x, "isValidParent", value.toJsFn)
    
    inline def setIsValidParentUndefined: Self = StObject.set(x, "isValidParent", js.undefined)
    
    inline def setRenderItems(value: /* items */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "renderItems", js.Any.fromFunction1((t0: /* items */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setRenderItemsUndefined: Self = StObject.set(x, "renderItems", js.undefined)
  }
}
