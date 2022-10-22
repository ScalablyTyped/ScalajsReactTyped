package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.util.translatable.IAbstract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITranslatableList
  extends StObject
     with IAbstract {
  
  /** [Method] Returns the value of items
    * @returns Array
    */
  var getItems: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Sets the value of items
    * @param items Array The new value.
    */
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.undefined
}
object ITranslatableList {
  
  inline def apply(): ITranslatableList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITranslatableList]
  }
  
  extension [Self <: ITranslatableList](x: Self) {
    
    inline def setGetItems(value: CallbackTo[Array]): Self = StObject.set(x, "getItems", value.toJsFn)
    
    inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
    
    inline def setSetItems(value: /* items */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setItems", js.Any.fromFunction1((t0: /* items */ js.UndefOr[Array]) => value(t0).runNow()))
    
    inline def setSetItemsUndefined: Self = StObject.set(x, "setItems", js.undefined)
  }
}
