package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The context menu item collection.
  */
trait ASPxClientGanttContextMenuItemCollection extends StObject {
  
  /**
    * Adds a context menu item.
    * @param item The context menu item.
    */
  def Add(item: ASPxClientGanttContextMenuItem): Unit
  
  /**
    * Removes predefined items from the context menu.
    */
  def Clear(): Unit
  
  /**
    * Returns a context menu item with the specified index. The context menu item.
    * @param index The index.
    */
  def Get(index: Double): ASPxClientGanttContextMenuItem
  
  /**
    * Returns a context menu item with the specified name. The context menu item.
    * @param name The name.
    */
  def GetByName(name: String): ASPxClientGanttContextMenuItem
  
  /**
    * Returns the number of context menu items.
    */
  def GetCount(): Double
  
  /**
    * Inserts a context menu item at the specified position in the collection.
    * @param index The context menu item's index.
    * @param item The context menu item.
    */
  def Insert(index: Double, item: ASPxClientGanttContextMenuItem): Unit
  
  /**
    * Removes a context menu item with the specified index from the item collection.
    * @param index The context menu item's index.
    */
  def Remove(index: Double): Unit
  
  /**
    * Removes a context menu item with the specified name from the item collection.
    * @param name The context menu item's name.
    */
  def RemoveByName(name: String): Unit
}
object ASPxClientGanttContextMenuItemCollection {
  
  inline def apply(
    Add: ASPxClientGanttContextMenuItem => Callback,
    Clear: Callback,
    Get: Double => ASPxClientGanttContextMenuItem,
    GetByName: String => ASPxClientGanttContextMenuItem,
    GetCount: CallbackTo[Double],
    Insert: (Double, ASPxClientGanttContextMenuItem) => Callback,
    Remove: Double => Callback,
    RemoveByName: String => Callback
  ): ASPxClientGanttContextMenuItemCollection = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1((t0: ASPxClientGanttContextMenuItem) => Add(t0).runNow()), Clear = Clear.toJsFn, Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetCount = GetCount.toJsFn, Insert = js.Any.fromFunction2((t0: Double, t1: ASPxClientGanttContextMenuItem) => (Insert(t0, t1)).runNow()), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()), RemoveByName = js.Any.fromFunction1((t0: String) => RemoveByName(t0).runNow()))
    __obj.asInstanceOf[ASPxClientGanttContextMenuItemCollection]
  }
  
  extension [Self <: ASPxClientGanttContextMenuItemCollection](x: Self) {
    
    inline def setAdd(value: ASPxClientGanttContextMenuItem => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction1((t0: ASPxClientGanttContextMenuItem) => value(t0).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setGet(value: Double => ASPxClientGanttContextMenuItem): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
    
    inline def setGetByName(value: String => ASPxClientGanttContextMenuItem): Self = StObject.set(x, "GetByName", js.Any.fromFunction1(value))
    
    inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetCount", value.toJsFn)
    
    inline def setInsert(value: (Double, ASPxClientGanttContextMenuItem) => Callback): Self = StObject.set(x, "Insert", js.Any.fromFunction2((t0: Double, t1: ASPxClientGanttContextMenuItem) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRemoveByName(value: String => Callback): Self = StObject.set(x, "RemoveByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
