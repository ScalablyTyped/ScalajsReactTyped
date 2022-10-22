package typingsJapgolly.extjs.Ext.layout.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumn
  extends StObject
     with IAuto {
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IColumn: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any], ISizePolicy]
  ] = js.undefined
  
  /** [Method] This method sets the height and or width of the outerCt innerCt to adjust for the following browser specific issues
    * @param ownerContext Object
    * @param containerSize Object
    */
  @JSName("setCtSizeIfNeeded")
  var setCtSizeIfNeeded_IColumn: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[Any], /* containerSize */ js.UndefOr[Any], Unit]
  ] = js.undefined
}
object IColumn {
  
  inline def apply(): IColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumn]
  }
  
  extension [Self <: IColumn](x: Self) {
    
    inline def setGetItemSizePolicy(value: (/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any]) => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction2(value))
    
    inline def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    inline def setSetCtSizeIfNeeded(value: (/* ownerContext */ js.UndefOr[Any], /* containerSize */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "setCtSizeIfNeeded", js.Any.fromFunction2((t0: /* ownerContext */ js.UndefOr[Any], t1: /* containerSize */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setSetCtSizeIfNeededUndefined: Self = StObject.set(x, "setCtSizeIfNeeded", js.undefined)
  }
}
