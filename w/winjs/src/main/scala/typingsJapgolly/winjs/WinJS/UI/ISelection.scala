package typingsJapgolly.winjs.WinJS.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a selection of ListView items.
  **/
trait ISelection[T] extends StObject {
  
  //#region Methods
  /**
    * Adds one or more items to the selection.
    * @param items The indexes or keys of the items to add. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def add(items: Any): Promise[Any]
  
  /**
    * Clears the selection.
    * @returns A Promise that is fulfilled when the clear operation completes.
    **/
  def clear(): Promise[Any]
  
  /**
    * Returns the number of items in the selection.
    * @returns The number of items in the selection.
    **/
  def count(): Double
  
  /**
    * Returns a list of the indexes for the items in the selection.
    * @returns The list of indexes for the items in the selection as an array of Number objects.
    **/
  def getIndices(): js.Array[Double]
  
  /**
    * Returns an array that contains the items in the selection.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def getItems(): Promise[js.Array[IItem[T]]]
  
  /**
    * Gets an array of the index ranges for the selected items.
    * @returns An array that contains an ISelectionRange object for each index range in the selection.
    **/
  def getRanges(): js.Array[ISelectionRange]
  
  /**
    * Returns a value that indicates whether the selection contains every item in the data source.
    * @returns true if the selection contains every item in the data source; otherwise, false.
    **/
  def isEverything(): Boolean
  
  /**
    * Removes the specified items from the selection.
    * @param items The indexes or keys of the items to remove. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def remove(items: Any): Promise[Any]
  
  /**
    * Adds all the items in the ListView to the selection.
    **/
  def selectAll(): Unit
  
  /**
    * Clears the current selection and replaces it with the specified items.
    * @param items The indexes or keys of the items that make up the selection. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def set(items: Any): Promise[Any]
}
object ISelection {
  
  inline def apply[T](
    add: Any => Promise[Any],
    clear: CallbackTo[Promise[Any]],
    count: CallbackTo[Double],
    getIndices: CallbackTo[js.Array[Double]],
    getItems: CallbackTo[Promise[js.Array[IItem[T]]]],
    getRanges: CallbackTo[js.Array[ISelectionRange]],
    isEverything: CallbackTo[Boolean],
    remove: Any => Promise[Any],
    selectAll: Callback,
    set: Any => Promise[Any]
  ): ISelection[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = clear.toJsFn, count = count.toJsFn, getIndices = getIndices.toJsFn, getItems = getItems.toJsFn, getRanges = getRanges.toJsFn, isEverything = isEverything.toJsFn, remove = js.Any.fromFunction1(remove), selectAll = selectAll.toJsFn, set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ISelection[T]]
  }
  
  extension [Self <: ISelection[?], T](x: Self & ISelection[T]) {
    
    inline def setAdd(value: Any => Promise[Any]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setClear(value: CallbackTo[Promise[Any]]): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setGetIndices(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getIndices", value.toJsFn)
    
    inline def setGetItems(value: CallbackTo[Promise[js.Array[IItem[T]]]]): Self = StObject.set(x, "getItems", value.toJsFn)
    
    inline def setGetRanges(value: CallbackTo[js.Array[ISelectionRange]]): Self = StObject.set(x, "getRanges", value.toJsFn)
    
    inline def setIsEverything(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEverything", value.toJsFn)
    
    inline def setRemove(value: Any => Promise[Any]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSelectAll(value: Callback): Self = StObject.set(x, "selectAll", value.toJsFn)
    
    inline def setSet(value: Any => Promise[Any]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
