package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.util.translatable.IAbstract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITranslatableGroup
  extends StObject
     with IAbstract {
  
  /** [Method] Returns the value of activeIndex
    * @returns Number
    */
  var getActiveIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of itemLength
    * @returns Object
    */
  var getItemLength: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of items
    * @returns Array
    */
  var getItems: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Sets the value of activeIndex
    * @param activeIndex Number The new value.
    */
  var setActiveIndex: js.UndefOr[js.Function1[/* activeIndex */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of itemLength
    * @param itemLength Object The new value.
    */
  var setItemLength: js.UndefOr[js.Function1[/* itemLength */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of items
    * @param items Array The new value.
    */
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.undefined
}
object ITranslatableGroup {
  
  inline def apply(): ITranslatableGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITranslatableGroup]
  }
  
  extension [Self <: ITranslatableGroup](x: Self) {
    
    inline def setGetActiveIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getActiveIndex", value.toJsFn)
    
    inline def setGetActiveIndexUndefined: Self = StObject.set(x, "getActiveIndex", js.undefined)
    
    inline def setGetItemLength(value: CallbackTo[Any]): Self = StObject.set(x, "getItemLength", value.toJsFn)
    
    inline def setGetItemLengthUndefined: Self = StObject.set(x, "getItemLength", js.undefined)
    
    inline def setGetItems(value: CallbackTo[Array]): Self = StObject.set(x, "getItems", value.toJsFn)
    
    inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
    
    inline def setSetActiveIndex(value: /* activeIndex */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setActiveIndex", js.Any.fromFunction1((t0: /* activeIndex */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetActiveIndexUndefined: Self = StObject.set(x, "setActiveIndex", js.undefined)
    
    inline def setSetItemLength(value: /* itemLength */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setItemLength", js.Any.fromFunction1((t0: /* itemLength */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetItemLengthUndefined: Self = StObject.set(x, "setItemLength", js.undefined)
    
    inline def setSetItems(value: /* items */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setItems", js.Any.fromFunction1((t0: /* items */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetItemsUndefined: Self = StObject.set(x, "setItems", js.undefined)
  }
}
