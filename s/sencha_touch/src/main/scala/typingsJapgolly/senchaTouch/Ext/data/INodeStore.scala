package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INodeStore
  extends StObject
     with IStore {
  
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the value of filters
    * @returns Object
    */
  var getFilters: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of folderSort
    * @returns Boolean
    */
  var getFolderSort: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of node
    * @returns Ext.data.Model
    */
  var getNode: js.UndefOr[js.Function0[IModel]] = js.undefined
  
  /** [Method] Returns the value of recursive
    * @returns Boolean
    */
  var getRecursive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of rootVisible
    * @returns Boolean
    */
  var getRootVisible: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of sorters
    * @returns Object
    */
  var getSorters: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method]
    * @param node Object
    * @returns Boolean
    */
  var isVisible: js.UndefOr[js.Function1[/* node */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Config Option] (Ext.data.Model) */
  var node: js.UndefOr[IModel] = js.undefined
  
  /** [Config Option] (Boolean) */
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the value of filters
    * @param filters Object The new value.
    */
  @JSName("setFilters")
  var setFilters_INodeStore: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of folderSort
    * @param folderSort Boolean The new value.
    */
  var setFolderSort: js.UndefOr[js.Function1[/* folderSort */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of node
    * @param node Ext.data.Model The new value.
    */
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[IModel], Unit]] = js.undefined
  
  /** [Method] Sets the value of recursive
    * @param recursive Boolean The new value.
    */
  var setRecursive: js.UndefOr[js.Function1[/* recursive */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of rootVisible
    * @param rootVisible Boolean The new value.
    */
  var setRootVisible: js.UndefOr[js.Function1[/* rootVisible */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of sorters
    * @param sorters Object The new value.
    */
  @JSName("setSorters")
  var setSorters_INodeStore: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Any], Unit]] = js.undefined
}
object INodeStore {
  
  inline def apply(): INodeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeStore]
  }
  
  extension [Self <: INodeStore](x: Self) {
    
    inline def setFolderSort(value: Boolean): Self = StObject.set(x, "folderSort", value.asInstanceOf[js.Any])
    
    inline def setFolderSortUndefined: Self = StObject.set(x, "folderSort", js.undefined)
    
    inline def setGetFilters(value: CallbackTo[Any]): Self = StObject.set(x, "getFilters", value.toJsFn)
    
    inline def setGetFiltersUndefined: Self = StObject.set(x, "getFilters", js.undefined)
    
    inline def setGetFolderSort(value: CallbackTo[Boolean]): Self = StObject.set(x, "getFolderSort", value.toJsFn)
    
    inline def setGetFolderSortUndefined: Self = StObject.set(x, "getFolderSort", js.undefined)
    
    inline def setGetNode(value: CallbackTo[IModel]): Self = StObject.set(x, "getNode", value.toJsFn)
    
    inline def setGetNodeUndefined: Self = StObject.set(x, "getNode", js.undefined)
    
    inline def setGetRecursive(value: CallbackTo[Boolean]): Self = StObject.set(x, "getRecursive", value.toJsFn)
    
    inline def setGetRecursiveUndefined: Self = StObject.set(x, "getRecursive", js.undefined)
    
    inline def setGetRootVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getRootVisible", value.toJsFn)
    
    inline def setGetRootVisibleUndefined: Self = StObject.set(x, "getRootVisible", js.undefined)
    
    inline def setGetSorters(value: CallbackTo[Any]): Self = StObject.set(x, "getSorters", value.toJsFn)
    
    inline def setGetSortersUndefined: Self = StObject.set(x, "getSorters", js.undefined)
    
    inline def setIsVisible(value: /* node */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction1(value))
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setNode(value: IModel): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setRootVisible(value: Boolean): Self = StObject.set(x, "rootVisible", value.asInstanceOf[js.Any])
    
    inline def setRootVisibleUndefined: Self = StObject.set(x, "rootVisible", js.undefined)
    
    inline def setSetFilters(value: /* filters */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setFilters", js.Any.fromFunction1((t0: /* filters */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetFiltersUndefined: Self = StObject.set(x, "setFilters", js.undefined)
    
    inline def setSetFolderSort(value: /* folderSort */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setFolderSort", js.Any.fromFunction1((t0: /* folderSort */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetFolderSortUndefined: Self = StObject.set(x, "setFolderSort", js.undefined)
    
    inline def setSetNode(value: /* node */ js.UndefOr[IModel] => Callback): Self = StObject.set(x, "setNode", js.Any.fromFunction1((t0: /* node */ js.UndefOr[IModel]) => value(t0).runNow()))
    
    inline def setSetNodeUndefined: Self = StObject.set(x, "setNode", js.undefined)
    
    inline def setSetRecursive(value: /* recursive */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setRecursive", js.Any.fromFunction1((t0: /* recursive */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetRecursiveUndefined: Self = StObject.set(x, "setRecursive", js.undefined)
    
    inline def setSetRootVisible(value: /* rootVisible */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setRootVisible", js.Any.fromFunction1((t0: /* rootVisible */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetRootVisibleUndefined: Self = StObject.set(x, "setRootVisible", js.undefined)
    
    inline def setSetSorters(value: /* sorters */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setSorters", js.Any.fromFunction1((t0: /* sorters */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetSortersUndefined: Self = StObject.set(x, "setSorters", js.undefined)
  }
}
