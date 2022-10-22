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

/** gives access to the items of a combo box and makes it possible to register item and action event listeners. */
trait XComboBox
  extends StObject
     with XInterface {
  
  /** returns the number of visible lines in the drop down mode. */
  var DropDownLineCount: Double
  
  /** returns the number of items in the combo box. */
  val ItemCount: Double
  
  /** returns all items of the combo box. */
  val Items: SafeArray[String]
  
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit
  
  /** adds an item at the specified position. */
  def addItem(aItem: String, nPos: Double): Unit
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  
  /** adds multiple items at the specified position. */
  def addItems(aItems: SeqEquiv[String], nPos: Double): Unit
  
  /** returns the number of visible lines in the drop down mode. */
  def getDropDownLineCount(): Double
  
  /** returns the item at the specified position. */
  def getItem(nPos: Double): String
  
  /** returns the number of items in the combo box. */
  def getItemCount(): Double
  
  /** returns all items of the combo box. */
  def getItems(): SafeArray[String]
  
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
  
  /** removes a number of items at the specified position. */
  def removeItems(nPos: Double, nCount: Double): Unit
  
  /** sets the number of visible lines for drop down mode. */
  def setDropDownLineCount(nLines: Double): Unit
}
object XComboBox {
  
  inline def apply(
    DropDownLineCount: Double,
    ItemCount: Double,
    Items: SafeArray[String],
    acquire: Callback,
    addActionListener: XActionListener => Callback,
    addItem: (String, Double) => Callback,
    addItemListener: XItemListener => Callback,
    addItems: (SeqEquiv[String], Double) => Callback,
    getDropDownLineCount: CallbackTo[Double],
    getItem: Double => String,
    getItemCount: CallbackTo[Double],
    getItems: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback,
    removeActionListener: XActionListener => Callback,
    removeItemListener: XItemListener => Callback,
    removeItems: (Double, Double) => Callback,
    setDropDownLineCount: Double => Callback
  ): XComboBox = {
    val __obj = js.Dynamic.literal(DropDownLineCount = DropDownLineCount.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], acquire = acquire.toJsFn, addActionListener = js.Any.fromFunction1((t0: XActionListener) => addActionListener(t0).runNow()), addItem = js.Any.fromFunction2((t0: String, t1: Double) => (addItem(t0, t1)).runNow()), addItemListener = js.Any.fromFunction1((t0: XItemListener) => addItemListener(t0).runNow()), addItems = js.Any.fromFunction2((t0: SeqEquiv[String], t1: Double) => (addItems(t0, t1)).runNow()), getDropDownLineCount = getDropDownLineCount.toJsFn, getItem = js.Any.fromFunction1(getItem), getItemCount = getItemCount.toJsFn, getItems = getItems.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActionListener = js.Any.fromFunction1((t0: XActionListener) => removeActionListener(t0).runNow()), removeItemListener = js.Any.fromFunction1((t0: XItemListener) => removeItemListener(t0).runNow()), removeItems = js.Any.fromFunction2((t0: Double, t1: Double) => (removeItems(t0, t1)).runNow()), setDropDownLineCount = js.Any.fromFunction1((t0: Double) => setDropDownLineCount(t0).runNow()))
    __obj.asInstanceOf[XComboBox]
  }
  
  extension [Self <: XComboBox](x: Self) {
    
    inline def setAddActionListener(value: XActionListener => Callback): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setAddItem(value: (String, Double) => Callback): Self = StObject.set(x, "addItem", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setAddItemListener(value: XItemListener => Callback): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
    
    inline def setAddItems(value: (SeqEquiv[String], Double) => Callback): Self = StObject.set(x, "addItems", js.Any.fromFunction2((t0: SeqEquiv[String], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setDropDownLineCount(value: Double): Self = StObject.set(x, "DropDownLineCount", value.asInstanceOf[js.Any])
    
    inline def setGetDropDownLineCount(value: CallbackTo[Double]): Self = StObject.set(x, "getDropDownLineCount", value.toJsFn)
    
    inline def setGetItem(value: Double => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "getItemCount", value.toJsFn)
    
    inline def setGetItems(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getItems", value.toJsFn)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItems(value: SafeArray[String]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setRemoveActionListener(value: XActionListener => Callback): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setRemoveItemListener(value: XItemListener => Callback): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1((t0: XItemListener) => value(t0).runNow()))
    
    inline def setRemoveItems(value: (Double, Double) => Callback): Self = StObject.set(x, "removeItems", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetDropDownLineCount(value: Double => Callback): Self = StObject.set(x, "setDropDownLineCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
