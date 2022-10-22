package typingsJapgolly.extjs.Ext.layout.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFit
  extends StObject
     with IContainer {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IFit: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultMargins: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IFit: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any], ISizePolicy]
  ] = js.undefined
}
object IFit {
  
  inline def apply(): IFit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFit]
  }
  
  extension [Self <: IFit](x: Self) {
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "calculate", js.Any.fromFunction1((t0: /* ownerContext */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setDefaultMargins(value: Any): Self = StObject.set(x, "defaultMargins", value.asInstanceOf[js.Any])
    
    inline def setDefaultMarginsUndefined: Self = StObject.set(x, "defaultMargins", js.undefined)
    
    inline def setGetItemSizePolicy(value: (/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any]) => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction2(value))
    
    inline def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
  }
}
