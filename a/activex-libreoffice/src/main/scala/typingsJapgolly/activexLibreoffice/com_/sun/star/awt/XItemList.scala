package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Pair
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides convenient access to the list of items in a list box */
trait XItemList extends StObject {
  
  /** retrieves the texts and images of all items in the list */
  val AllItems: SafeArray[Pair[String, String]]
  
  /** is the number of items in the list */
  var ItemCount: Double
  
  /** registers a listener which is notified about changes in the item list. */
  def addItemListListener(Listener: XItemListListener): Unit
  
  /** retrieves the texts and images of all items in the list */
  def getAllItems(): SafeArray[Pair[String, String]]
  
  /**
    * retrieves the implementation dependent value associated with the given list item.
    * @param Position the position of the item whose data value should be retrieved. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @see setItemData
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def getItemData(Position: Double): Any
  
  /**
    * retrieves the URL of the image of an existing item
    * @param Position the position of the item whose image should be retrieved. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def getItemImage(Position: Double): String
  
  /**
    * retrieves the text of an existing item
    * @param Position the position of the item whose text should be retrieved. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def getItemText(Position: Double): String
  
  /**
    * retrieves both the text and the image URL of an existing item
    * @param Position the position of the item whose text and image should be retrieved. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def getItemTextAndImage(Position: Double): Pair[String, String]
  
  /**
    * inserts a new item into the list
    * @param Position the position at which the item should be inserted. Must be greater or equal to 0, and lesser than or equal to {@link ItemCount} .
    * @param ItemText the text of the item to be inserted.
    * @param ItemImageURL the URL of the image to display for the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def insertItem(Position: Double, ItemText: String, ItemImageURL: String): Unit
  
  /**
    * inserts an item which has only an image, but no text
    * @param Position the position at which the item should be inserted. Must be greater or equal to 0, and lesser than or equal to {@link ItemCount} .
    * @param ItemImageURL the URL of the image to display for the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def insertItemImage(Position: Double, ItemImageURL: String): Unit
  
  /**
    * inserts an item which has only a text, but no image
    * @param Position the position at which the item should be inserted. Must be greater or equal to 0, and lesser than or equal to {@link ItemCount} .
    * @param ItemText the text of the item to be inserted.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def insertItemText(Position: Double, ItemText: String): Unit
  
  /** removes all items from the list */
  def removeAllItems(): Unit
  
  /**
    * removes an item from the list
    * @param Position the position of the item which should be removed. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def removeItem(Position: Double): Unit
  
  /** revokes a listener which is notified about changes in the item list. */
  def removeItemListListener(Listener: XItemListListener): Unit
  
  /**
    * associates an implementation dependent value with the given list item.
    *
    * You can use this to store data for an item which does not interfere with the displayed text and image, but can be used by the client of the list box
    * for an arbitrary purpose.
    * @param Position the position of the item whose data value should be set. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @param ItemData the data to associate with the list item
    * @see getItemData
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def setItemData(Position: Double, ItemData: Any): Unit
  
  /**
    * sets a new image for an existing item
    * @param Position the position of the item whose image is to be changed. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @param ItemImageURL the new URL of the image to display for the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def setItemImage(Position: Double, ItemImageURL: String): Unit
  
  /**
    * sets a new text for an existing item
    * @param Position the position of the item whose text is to be changed. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @param ItemText the new text of the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def setItemText(Position: Double, ItemText: String): Unit
  
  /**
    * sets both a new position and text for an existing item
    * @param Position the position of the item whose text and image is to be changed. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @param ItemText the new text of the item
    * @param ItemImageURL the new URL of the image to display for the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def setItemTextAndImage(Position: Double, ItemText: String, ItemImageURL: String): Unit
}
object XItemList {
  
  inline def apply(
    AllItems: SafeArray[Pair[String, String]],
    ItemCount: Double,
    addItemListListener: XItemListListener => Callback,
    getAllItems: CallbackTo[SafeArray[Pair[String, String]]],
    getItemData: Double => Any,
    getItemImage: Double => String,
    getItemText: Double => String,
    getItemTextAndImage: Double => Pair[String, String],
    insertItem: (Double, String, String) => Callback,
    insertItemImage: (Double, String) => Callback,
    insertItemText: (Double, String) => Callback,
    removeAllItems: Callback,
    removeItem: Double => Callback,
    removeItemListListener: XItemListListener => Callback,
    setItemData: (Double, Any) => Callback,
    setItemImage: (Double, String) => Callback,
    setItemText: (Double, String) => Callback,
    setItemTextAndImage: (Double, String, String) => Callback
  ): XItemList = {
    val __obj = js.Dynamic.literal(AllItems = AllItems.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], addItemListListener = js.Any.fromFunction1((t0: XItemListListener) => addItemListListener(t0).runNow()), getAllItems = getAllItems.toJsFn, getItemData = js.Any.fromFunction1(getItemData), getItemImage = js.Any.fromFunction1(getItemImage), getItemText = js.Any.fromFunction1(getItemText), getItemTextAndImage = js.Any.fromFunction1(getItemTextAndImage), insertItem = js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (insertItem(t0, t1, t2)).runNow()), insertItemImage = js.Any.fromFunction2((t0: Double, t1: String) => (insertItemImage(t0, t1)).runNow()), insertItemText = js.Any.fromFunction2((t0: Double, t1: String) => (insertItemText(t0, t1)).runNow()), removeAllItems = removeAllItems.toJsFn, removeItem = js.Any.fromFunction1((t0: Double) => removeItem(t0).runNow()), removeItemListListener = js.Any.fromFunction1((t0: XItemListListener) => removeItemListListener(t0).runNow()), setItemData = js.Any.fromFunction2((t0: Double, t1: Any) => (setItemData(t0, t1)).runNow()), setItemImage = js.Any.fromFunction2((t0: Double, t1: String) => (setItemImage(t0, t1)).runNow()), setItemText = js.Any.fromFunction2((t0: Double, t1: String) => (setItemText(t0, t1)).runNow()), setItemTextAndImage = js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (setItemTextAndImage(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XItemList]
  }
  
  extension [Self <: XItemList](x: Self) {
    
    inline def setAddItemListListener(value: XItemListListener => Callback): Self = StObject.set(x, "addItemListListener", js.Any.fromFunction1((t0: XItemListListener) => value(t0).runNow()))
    
    inline def setAllItems(value: SafeArray[Pair[String, String]]): Self = StObject.set(x, "AllItems", value.asInstanceOf[js.Any])
    
    inline def setGetAllItems(value: CallbackTo[SafeArray[Pair[String, String]]]): Self = StObject.set(x, "getAllItems", value.toJsFn)
    
    inline def setGetItemData(value: Double => Any): Self = StObject.set(x, "getItemData", js.Any.fromFunction1(value))
    
    inline def setGetItemImage(value: Double => String): Self = StObject.set(x, "getItemImage", js.Any.fromFunction1(value))
    
    inline def setGetItemText(value: Double => String): Self = StObject.set(x, "getItemText", js.Any.fromFunction1(value))
    
    inline def setGetItemTextAndImage(value: Double => Pair[String, String]): Self = StObject.set(x, "getItemTextAndImage", js.Any.fromFunction1(value))
    
    inline def setInsertItem(value: (Double, String, String) => Callback): Self = StObject.set(x, "insertItem", js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setInsertItemImage(value: (Double, String) => Callback): Self = StObject.set(x, "insertItemImage", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setInsertItemText(value: (Double, String) => Callback): Self = StObject.set(x, "insertItemText", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllItems(value: Callback): Self = StObject.set(x, "removeAllItems", value.toJsFn)
    
    inline def setRemoveItem(value: Double => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRemoveItemListListener(value: XItemListListener => Callback): Self = StObject.set(x, "removeItemListListener", js.Any.fromFunction1((t0: XItemListListener) => value(t0).runNow()))
    
    inline def setSetItemData(value: (Double, Any) => Callback): Self = StObject.set(x, "setItemData", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetItemImage(value: (Double, String) => Callback): Self = StObject.set(x, "setItemImage", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetItemText(value: (Double, String) => Callback): Self = StObject.set(x, "setItemText", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetItemTextAndImage(value: (Double, String, String) => Callback): Self = StObject.set(x, "setItemTextAndImage", js.Any.fromFunction3((t0: Double, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
  }
}
