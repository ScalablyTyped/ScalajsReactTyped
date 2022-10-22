package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a listener for changes in a item list
  * @see XListItems
  */
trait XItemListListener
  extends StObject
     with XEventListener {
  
  /** is called when the list has been completely cleared, i.e. after an invocation of {@link XItemList.removeAllItems()} */
  def allItemsRemoved(Event: EventObject): Unit
  
  /**
    * is called when the changes to the item list which occurred are too complex to be notified in single events.
    *
    * Consumers of this event should discard their cached information about the current item list, and completely refresh it from the {@link XItemList} 's
    * current state.
    */
  def itemListChanged(Event: EventObject): Unit
  
  /** is called when an item is inserted into the list */
  def listItemInserted(Event: ItemListEvent): Unit
  
  /** is called when an item in the list is modified, i.e. its text or image changed */
  def listItemModified(Event: ItemListEvent): Unit
  
  /** is called when an item is removed from the list */
  def listItemRemoved(Event: ItemListEvent): Unit
}
object XItemListListener {
  
  inline def apply(
    acquire: Callback,
    allItemsRemoved: EventObject => Callback,
    disposing: EventObject => Callback,
    itemListChanged: EventObject => Callback,
    listItemInserted: ItemListEvent => Callback,
    listItemModified: ItemListEvent => Callback,
    listItemRemoved: ItemListEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XItemListListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, allItemsRemoved = js.Any.fromFunction1((t0: EventObject) => allItemsRemoved(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), itemListChanged = js.Any.fromFunction1((t0: EventObject) => itemListChanged(t0).runNow()), listItemInserted = js.Any.fromFunction1((t0: ItemListEvent) => listItemInserted(t0).runNow()), listItemModified = js.Any.fromFunction1((t0: ItemListEvent) => listItemModified(t0).runNow()), listItemRemoved = js.Any.fromFunction1((t0: ItemListEvent) => listItemRemoved(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XItemListListener]
  }
  
  extension [Self <: XItemListListener](x: Self) {
    
    inline def setAllItemsRemoved(value: EventObject => Callback): Self = StObject.set(x, "allItemsRemoved", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setItemListChanged(value: EventObject => Callback): Self = StObject.set(x, "itemListChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setListItemInserted(value: ItemListEvent => Callback): Self = StObject.set(x, "listItemInserted", js.Any.fromFunction1((t0: ItemListEvent) => value(t0).runNow()))
    
    inline def setListItemModified(value: ItemListEvent => Callback): Self = StObject.set(x, "listItemModified", js.Any.fromFunction1((t0: ItemListEvent) => value(t0).runNow()))
    
    inline def setListItemRemoved(value: ItemListEvent => Callback): Self = StObject.set(x, "listItemRemoved", js.Any.fromFunction1((t0: ItemListEvent) => value(t0).runNow()))
  }
}
