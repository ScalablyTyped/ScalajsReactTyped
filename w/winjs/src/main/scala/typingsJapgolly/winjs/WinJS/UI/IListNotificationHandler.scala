package typingsJapgolly.winjs.WinJS.UI

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by an IListBinding to provide change notifications when items in a IListDataSource change.
  **/
trait IListNotificationHandler[T] extends StObject {
  
  //#region Methods
  /**
    * Indicates the start of a notification batch. Objects that are listening for notifications should defer making updates until endNotifications is called.
    **/
  def beginNotifications(): Unit
  
  /**
    * Indicates that an item changed.
    * @param newItem The updated item.
    * @param oldItem The original item.
    **/
  def changed(newItem: IItem[T], oldItem: IItem[T]): Unit
  
  /**
    * Indicates that the number of items in the IListDataSource has changed.
    * @param newCount The updated count.
    * @param oldCount The original count.
    **/
  def countChanged(newCount: Double, oldCount: Double): Unit
  
  /**
    * Indicates the end of a notification batch. When the beginNotifications method is called, objects listening for notifications should defer making updates until endNotifications is called.
    **/
  def endNotifications(): Unit
  
  /**
    * Indicates that the index of an item changed.
    * @param handle The temporary ID of the item.
    * @param newIndex The new index.
    * @param oldIndex The original index.
    **/
  def indexChanged(handle: String, newIndex: Double, oldIndex: Double): Unit
  
  /**
    * Indicates that an item was added to the IListDataSource.
    * @param itemPromise A promise for the new IItem.
    * @param previousHandle The temporary ID of the item that precedes the new item.
    * @param nextHandle The temporary ID of the item that follows the new item.
    **/
  def inserted(itemPromise: IItemPromise[T], previousHandle: String, nextHandle: String): Unit
  
  /**
    * Indicates that an IItemPromise was fulfilled and that the item is now available.
    * @param item The fulfilled item.
    **/
  def itemAvailable(item: IItem[T]): Unit
  
  /**
    * Indicates that an item was moved.
    * @param item A promise for the IItem that was moved.
    * @param previousHandle The temporary ID of the item that now precedes the moved item.
    * @param nextHandle The temporary ID of the item that now follows the moved item.
    **/
  def moved(item: IItemPromise[T], previousHandle: String, nextHandle: String): Unit
  
  /**
    * Indicates that an item was removed.
    * @param handle The temporary ID of the item that was removed.
    * @param mirage true if the item never actually existed; false if the item was actually present in the IListDataSource.
    **/
  def removed(handle: String, mirage: Boolean): Unit
}
object IListNotificationHandler {
  
  inline def apply[T](
    beginNotifications: Callback,
    changed: (IItem[T], IItem[T]) => Callback,
    countChanged: (Double, Double) => Callback,
    endNotifications: Callback,
    indexChanged: (String, Double, Double) => Callback,
    inserted: (IItemPromise[T], String, String) => Callback,
    itemAvailable: IItem[T] => Callback,
    moved: (IItemPromise[T], String, String) => Callback,
    removed: (String, Boolean) => Callback
  ): IListNotificationHandler[T] = {
    val __obj = js.Dynamic.literal(beginNotifications = beginNotifications.toJsFn, changed = js.Any.fromFunction2((t0: IItem[T], t1: IItem[T]) => (changed(t0, t1)).runNow()), countChanged = js.Any.fromFunction2((t0: Double, t1: Double) => (countChanged(t0, t1)).runNow()), endNotifications = endNotifications.toJsFn, indexChanged = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (indexChanged(t0, t1, t2)).runNow()), inserted = js.Any.fromFunction3((t0: IItemPromise[T], t1: String, t2: String) => (inserted(t0, t1, t2)).runNow()), itemAvailable = js.Any.fromFunction1((t0: IItem[T]) => itemAvailable(t0).runNow()), moved = js.Any.fromFunction3((t0: IItemPromise[T], t1: String, t2: String) => (moved(t0, t1, t2)).runNow()), removed = js.Any.fromFunction2((t0: String, t1: Boolean) => (removed(t0, t1)).runNow()))
    __obj.asInstanceOf[IListNotificationHandler[T]]
  }
  
  extension [Self <: IListNotificationHandler[?], T](x: Self & IListNotificationHandler[T]) {
    
    inline def setBeginNotifications(value: Callback): Self = StObject.set(x, "beginNotifications", value.toJsFn)
    
    inline def setChanged(value: (IItem[T], IItem[T]) => Callback): Self = StObject.set(x, "changed", js.Any.fromFunction2((t0: IItem[T], t1: IItem[T]) => (value(t0, t1)).runNow()))
    
    inline def setCountChanged(value: (Double, Double) => Callback): Self = StObject.set(x, "countChanged", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setEndNotifications(value: Callback): Self = StObject.set(x, "endNotifications", value.toJsFn)
    
    inline def setIndexChanged(value: (String, Double, Double) => Callback): Self = StObject.set(x, "indexChanged", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setInserted(value: (IItemPromise[T], String, String) => Callback): Self = StObject.set(x, "inserted", js.Any.fromFunction3((t0: IItemPromise[T], t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setItemAvailable(value: IItem[T] => Callback): Self = StObject.set(x, "itemAvailable", js.Any.fromFunction1((t0: IItem[T]) => value(t0).runNow()))
    
    inline def setMoved(value: (IItemPromise[T], String, String) => Callback): Self = StObject.set(x, "moved", js.Any.fromFunction3((t0: IItemPromise[T], t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoved(value: (String, Boolean) => Callback): Self = StObject.set(x, "removed", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
