package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the items of a list box and makes it possible to register item and action event listeners. */
trait XListBox
  extends StObject
     with XInterface {
  
  /** returns the number of visible lines in drop down mode. */
  var DropDownLineCount: Double
  
  /** returns the number of items in the listbox. */
  val ItemCount: Double
  
  /** returns all items of the list box. */
  val Items: SafeArray[String]
  
  /**
    * returns the currently selected item. When multiple items are selected, the first one is returned. When nothing is selected, an empty string is
    * returned.
    */
  val SelectedItem: String
  
  /**
    * returns the position of the currently selected item. When multiple items are selected, the position of the first one is returned. When nothing is
    * selected, -1 is returned.
    */
  val SelectedItemPos: Double
  
  /** returns all currently selected items. */
  val SelectedItems: SafeArray[String]
  
  /** returns the positions of all currently selected items. */
  val SelectedItemsPos: SafeArray[Double]
  
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit
  
  /** adds an item at the specified position. */
  def addItem(aItem: String, nPos: Double): Unit
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  
  /** adds multiple items at the specified position. */
  def addItems(aItems: SeqEquiv[String], nPos: Double): Unit
  
  /** returns the number of visible lines in drop down mode. */
  def getDropDownLineCount(): Double
  
  /** returns the item at the specified position. */
  def getItem(nPos: Double): String
  
  /** returns the number of items in the listbox. */
  def getItemCount(): Double
  
  /** returns all items of the list box. */
  def getItems(): SafeArray[String]
  
  /**
    * returns the currently selected item. When multiple items are selected, the first one is returned. When nothing is selected, an empty string is
    * returned.
    */
  def getSelectedItem(): String
  
  /**
    * returns the position of the currently selected item. When multiple items are selected, the position of the first one is returned. When nothing is
    * selected, -1 is returned.
    */
  def getSelectedItemPos(): Double
  
  /** returns all currently selected items. */
  def getSelectedItems(): SafeArray[String]
  
  /** returns the positions of all currently selected items. */
  def getSelectedItemsPos(): SafeArray[Double]
  
  /** returns `TRUE` if multiple items can be selected, `FALSE` if only one item can be selected. */
  def isMutipleMode(): Boolean
  
  /** makes the item at the specified position visible by scrolling. */
  def makeVisible(nEntry: Double): Unit
  
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
  
  /** removes a number of items at the specified position. */
  def removeItems(nPos: Double, nCount: Double): Unit
  
  /** selects/deselects the specified item. */
  def selectItem(aItem: String, bSelect: Boolean): Unit
  
  /** selects/deselects the item at the specified position. */
  def selectItemPos(nPos: Double, bSelect: Boolean): Unit
  
  /** selects/deselects multiple items at the specified positions. */
  def selectItemsPos(aPositions: SeqEquiv[Double], bSelect: Boolean): Unit
  
  /** sets the number of visible lines for drop down mode. */
  def setDropDownLineCount(nLines: Double): Unit
  
  /** determines if only a single item or multiple items can be selected. */
  def setMultipleMode(bMulti: Boolean): Unit
}
object XListBox {
  
  inline def apply(
    DropDownLineCount: Double,
    ItemCount: Double,
    Items: SafeArray[String],
    SelectedItem: String,
    SelectedItemPos: Double,
    SelectedItems: SafeArray[String],
    SelectedItemsPos: SafeArray[Double],
    acquire: Callback,
    addActionListener: XActionListener => Callback,
    addItem: (String, Double) => Callback,
    addItemListener: XItemListener => Callback,
    addItems: (SeqEquiv[String], Double) => Callback,
    getDropDownLineCount: CallbackTo[Double],
    getItem: Double => String,
    getItemCount: CallbackTo[Double],
    getItems: CallbackTo[SafeArray[String]],
    getSelectedItem: CallbackTo[String],
    getSelectedItemPos: CallbackTo[Double],
    getSelectedItems: CallbackTo[SafeArray[String]],
    getSelectedItemsPos: CallbackTo[SafeArray[Double]],
    isMutipleMode: CallbackTo[Boolean],
    makeVisible: Double => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeActionListener: XActionListener => Callback,
    removeItemListener: XItemListener => Callback,
    removeItems: (Double, Double) => Callback,
    selectItem: (String, Boolean) => Callback,
    selectItemPos: (Double, Boolean) => Callback,
    selectItemsPos: (SeqEquiv[Double], Boolean) => Callback,
    setDropDownLineCount: Double => Callback,
    setMultipleMode: Boolean => Callback
  ): XListBox = {
    val __obj = js.Dynamic.literal(DropDownLineCount = DropDownLineCount.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], SelectedItem = SelectedItem.asInstanceOf[js.Any], SelectedItemPos = SelectedItemPos.asInstanceOf[js.Any], SelectedItems = SelectedItems.asInstanceOf[js.Any], SelectedItemsPos = SelectedItemsPos.asInstanceOf[js.Any], acquire = acquire.toJsFn, addActionListener = js.Any.fromFunction1((t0: XActionListener) => addActionListener(t0).runNow()), addItem = js.Any.fromFunction2((t0: String, t1: Double) => (addItem(t0, t1)).runNow()), addItemListener = js.Any.fromFunction1((t0: XItemListener) => addItemListener(t0).runNow()), addItems = js.Any.fromFunction2((t0: SeqEquiv[String], t1: Double) => (addItems(t0, t1)).runNow()), getDropDownLineCount = getDropDownLineCount.toJsFn, getItem = js.Any.fromFunction1(getItem), getItemCount = getItemCount.toJsFn, getItems = getItems.toJsFn, getSelectedItem = getSelectedItem.toJsFn, getSelectedItemPos = getSelectedItemPos.toJsFn, getSelectedItems = getSelectedItems.toJsFn, getSelectedItemsPos = getSelectedItemsPos.toJsFn, isMutipleMode = isMutipleMode.toJsFn, makeVisible = js.Any.fromFunction1((t0: Double) => makeVisible(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActionListener = js.Any.fromFunction1((t0: XActionListener) => removeActionListener(t0).runNow()), removeItemListener = js.Any.fromFunction1((t0: XItemListener) => removeItemListener(t0).runNow()), removeItems = js.Any.fromFunction2((t0: Double, t1: Double) => (removeItems(t0, t1)).runNow()), selectItem = js.Any.fromFunction2((t0: String, t1: Boolean) => (selectItem(t0, t1)).runNow()), selectItemPos = js.Any.fromFunction2((t0: Double, t1: Boolean) => (selectItemPos(t0, t1)).runNow()), selectItemsPos = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: Boolean) => (selectItemsPos(t0, t1)).runNow()), setDropDownLineCount = js.Any.fromFunction1((t0: Double) => setDropDownLineCount(t0).runNow()), setMultipleMode = js.Any.fromFunction1((t0: Boolean) => setMultipleMode(t0).runNow()))
    __obj.asInstanceOf[XListBox]
  }
  
  extension [Self <: XListBox](x: Self) {
    
    inline def setAddActionListener(value: XActionListener => Callback): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setAddItem(value: (String, Double) => Callback): Self = StObject.set(x, "addItem", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setAddItemListener(value: XItemListener => Callback): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
    
    inline def setAddItems(value: (SeqEquiv[String], Double) => Callback): Self = StObject.set(x, "addItems", js.Any.fromFunction2((t0: SeqEquiv[String], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setDropDownLineCount(value: Double): Self = StObject.set(x, "DropDownLineCount", value.asInstanceOf[js.Any])
    
    inline def setGetDropDownLineCount(value: CallbackTo[Double]): Self = StObject.set(x, "getDropDownLineCount", value.toJsFn)
    
    inline def setGetItem(value: Double => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "getItemCount", value.toJsFn)
    
    inline def setGetItems(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getItems", value.toJsFn)
    
    inline def setGetSelectedItem(value: CallbackTo[String]): Self = StObject.set(x, "getSelectedItem", value.toJsFn)
    
    inline def setGetSelectedItemPos(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectedItemPos", value.toJsFn)
    
    inline def setGetSelectedItems(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSelectedItems", value.toJsFn)
    
    inline def setGetSelectedItemsPos(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getSelectedItemsPos", value.toJsFn)
    
    inline def setIsMutipleMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMutipleMode", value.toJsFn)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItems(value: SafeArray[String]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setMakeVisible(value: Double => Callback): Self = StObject.set(x, "makeVisible", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRemoveActionListener(value: XActionListener => Callback): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setRemoveItemListener(value: XItemListener => Callback): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
    
    inline def setRemoveItems(value: (Double, Double) => Callback): Self = StObject.set(x, "removeItems", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSelectItem(value: (String, Boolean) => Callback): Self = StObject.set(x, "selectItem", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSelectItemPos(value: (Double, Boolean) => Callback): Self = StObject.set(x, "selectItemPos", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSelectItemsPos(value: (SeqEquiv[Double], Boolean) => Callback): Self = StObject.set(x, "selectItemsPos", js.Any.fromFunction2((t0: SeqEquiv[Double], t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSelectedItem(value: String): Self = StObject.set(x, "SelectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemPos(value: Double): Self = StObject.set(x, "SelectedItemPos", value.asInstanceOf[js.Any])
    
    inline def setSelectedItems(value: SafeArray[String]): Self = StObject.set(x, "SelectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsPos(value: SafeArray[Double]): Self = StObject.set(x, "SelectedItemsPos", value.asInstanceOf[js.Any])
    
    inline def setSetDropDownLineCount(value: Double => Callback): Self = StObject.set(x, "setDropDownLineCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMultipleMode(value: Boolean => Callback): Self = StObject.set(x, "setMultipleMode", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
