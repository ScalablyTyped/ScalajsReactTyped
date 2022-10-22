package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.util.ILruCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPageMap
  extends StObject
     with ILruCache {
  
  /** [Method] Returns the first record in this page map which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this PageMap.
    * @returns Object The first record in this page map which returned true from the selection function, or null if none was found.
    */
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Returns the index in the whole dataset of the first record in this page map which elicits a true return value from th
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this PageMap.
    * @returns Number The index first record in this page map which returned true from the selection function, or -1 if none was found.
    */
  var findIndexBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Double]] = js.undefined
  
  /** [Method] Remove an item from the hash
    * @returns Boolean True if the item was successfully removed.
    */
  @JSName("remove")
  var remove_IPageMap: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object IPageMap {
  
  inline def apply(): IPageMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageMap]
  }
  
  extension [Self <: IPageMap](x: Self) {
    
    inline def setFindBy(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "findBy", js.Any.fromFunction2(value))
    
    inline def setFindByUndefined: Self = StObject.set(x, "findBy", js.undefined)
    
    inline def setFindIndexBy(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Double): Self = StObject.set(x, "findIndexBy", js.Any.fromFunction2(value))
    
    inline def setFindIndexByUndefined: Self = StObject.set(x, "findIndexBy", js.undefined)
    
    inline def setRemove(value: CallbackTo[Boolean]): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
