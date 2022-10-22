package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a simple menu. */
trait XMenu
  extends StObject
     with XInterface {
  
  /**
    * returns the number of items in the menu.
    * @returns the number of items in this {@link XMenu} .
    */
  val ItemCount: Double
  
  /**
    * adds the specified menu listener to receive events from this menu.
    * @param xListener the {@link XMenuListener} to be added.
    */
  def addMenuListener(xListener: XMenuListener): Unit
  
  /** removes all items from the menu. */
  def clear(): Unit
  
  /**
    * specifies whether mnemonics are automatically assigned to menu items, or not.
    * @param bEnable if `TRUE` , mnemonics are automatically assigned to menu items.
    */
  def enableAutoMnemonics(bEnable: Boolean): Unit
  
  /**
    * enables or disables the menu item.
    * @param nItemId specifies the menu item ID.
    * @param bEnable specifies whether the menu item should be enabled ( `TRUE` ) or disabled ( `FALSE` ).
    */
  def enableItem(nItemId: Double, bEnable: Boolean): Unit
  
  /**
    * retrieves the command string for the menu item.
    * @param nItemId specifies the menu item ID for which the command URL should be set.
    * @returns the command of the menu item.
    */
  def getCommand(nItemId: Double): String
  
  /**
    * retrieves the help command string for the menu item.
    * @param nItemId specifies the menu item ID for which the help command should be set.
    * @returns the help command of the menu item.
    */
  def getHelpCommand(nItemId: Double): String
  
  /**
    * retrieves the help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the help text should be retrieved.
    * @returns a string with the help text.
    */
  def getHelpText(nItemId: Double): String
  
  /**
    * returns the number of items in the menu.
    * @returns the number of items in this {@link XMenu} .
    */
  def getItemCount(): Double
  
  /**
    * returns the ID of the item at the specified position.
    * @param nItemPos specifies the position of the menu item for which the item ID is queried.
    * @returns the ID of the menu item at the given position.
    */
  def getItemId(nItemPos: Double): Double
  
  /**
    * returns the position of the item with the specified ID.
    * @param nItemId specifies the ID of the menu item for which the item position is queried.
    * @returns the position of the menu item with the specified ID.
    */
  def getItemPos(nItemId: Double): Double
  
  /**
    * returns the string for the given item id.
    * @param nItemId specifies the ID of the menu item.
    * @returns the label of the menu item.
    */
  def getItemText(nItemId: Double): String
  
  /**
    * retrieves the type of the menu item.
    * @param nItemPos specifies the position of the menu item for which the item type is queried.
    * @returns a MenuItemType indicating the item type.
    */
  def getItemType(nItemPos: Double): MenuItemType
  
  /**
    * returns the popup menu from the menu item.
    * @param nItemId specifies the menu item ID for which the {@link XPopupMenu} should be retrieved.
    * @returns a {@link XPopupMenu} .
    */
  def getPopupMenu(nItemId: Double): XPopupMenu
  
  /**
    * retrieves the tip help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the tip help text should be retrieved.
    * @returns a string with the tip help text.
    */
  def getTipHelpText(nItemId: Double): String
  
  /**
    * specifies whether disabled menu entries should be hidden, or not.
    * @param bHide if `TRUE` , disabled menu entries are hidden.
    */
  def hideDisabledEntries(bHide: Boolean): Unit
  
  /**
    * inserts an item into the menu.
    *
    * The item is appended if the position is greater than or equal to {@link getItemCount()} or if it is negative.
    * @param nItemId specifies the ID of the menu item to be inserted.
    * @param aText specifies the label of the menu item.
    * @param nItemStyle specifies the style of the menu item, as defined in {@link MenuItemStyle} .
    * @param nItemPos specifies the position where the menu item will be inserted.
    */
  def insertItem(nItemId: Double, aText: String, nItemStyle: Double, nItemPos: Double): Unit
  
  /**
    * returns the state of the menu item.
    * @param nItemId specifies the menu item ID.
    * @returns `TRUE` if the item is enabled, `FALSE` otherwise.
    */
  def isItemEnabled(nItemId: Double): Boolean
  
  /**
    * checks whether an {@link XMenu} is an {@link XPopupMenu} .
    * @returns `TRUE` if the menu is a {@link PopupMenu} , `FALSE` if it is a {@link MenuBar} .
    */
  def isPopupMenu(): Boolean
  
  /**
    * removes one or more items from the menu.
    * @param nItemPos specifies the position of the (first) menu item to be removed.
    * @param nCount specifies the number of menu items to remove.
    */
  def removeItem(nItemPos: Double, nCount: Double): Unit
  
  /**
    * removes the specified menu listener so that it no longer receives events from this menu.
    * @param xListener the {@link XMenuListener} to be removed.
    */
  def removeMenuListener(xListener: XMenuListener): Unit
  
  /**
    * sets the command string for the menu item.
    * @param nItemId specifies the menu item ID for which the command should be set.
    * @param aCommand specifies the command for the menu item.
    */
  def setCommand(nItemId: Double, aCommand: String): Unit
  
  /**
    * sets the help command string for the menu item.
    * @param nItemId specifies the menu item ID for which the help command URL be set.
    * @param aCommand specifies the help command for the menu item.
    */
  def setHelpCommand(nItemId: Double, aCommand: String): Unit
  
  /**
    * sets the help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the help text should be set.
    * @param sHelpText specifies the help text for the menu item.
    */
  def setHelpText(nItemId: Double, sHelpText: String): Unit
  
  /**
    * sets the text for the menu item.
    * @param nItemId specifies the ID of the menu item.
    * @param aText specifies the label of the menu item.
    */
  def setItemText(nItemId: Double, aText: String): Unit
  
  /**
    * sets the popup menu for a specified menu item.
    * @param nItemId specifies the menu item ID for which the {@link XPopupMenu} should be set.
    * @param aPopupMenu specifies a {@link XPopupMenu} .
    */
  def setPopupMenu(nItemId: Double, aPopupMenu: XPopupMenu): Unit
  
  /**
    * sets the tip help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the tip help text should be set.
    * @param sTipHelpText specifies the tip help text for the menu item.
    */
  def setTipHelpText(nItemId: Double, sTipHelpText: String): Unit
}
object XMenu {
  
  inline def apply(
    ItemCount: Double,
    acquire: Callback,
    addMenuListener: XMenuListener => Callback,
    clear: Callback,
    enableAutoMnemonics: Boolean => Callback,
    enableItem: (Double, Boolean) => Callback,
    getCommand: Double => String,
    getHelpCommand: Double => String,
    getHelpText: Double => String,
    getItemCount: CallbackTo[Double],
    getItemId: Double => Double,
    getItemPos: Double => Double,
    getItemText: Double => String,
    getItemType: Double => MenuItemType,
    getPopupMenu: Double => XPopupMenu,
    getTipHelpText: Double => String,
    hideDisabledEntries: Boolean => Callback,
    insertItem: (Double, String, Double, Double) => Callback,
    isItemEnabled: Double => Boolean,
    isPopupMenu: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeItem: (Double, Double) => Callback,
    removeMenuListener: XMenuListener => Callback,
    setCommand: (Double, String) => Callback,
    setHelpCommand: (Double, String) => Callback,
    setHelpText: (Double, String) => Callback,
    setItemText: (Double, String) => Callback,
    setPopupMenu: (Double, XPopupMenu) => Callback,
    setTipHelpText: (Double, String) => Callback
  ): XMenu = {
    val __obj = js.Dynamic.literal(ItemCount = ItemCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addMenuListener = js.Any.fromFunction1((t0: XMenuListener) => addMenuListener(t0).runNow()), clear = clear.toJsFn, enableAutoMnemonics = js.Any.fromFunction1((t0: Boolean) => enableAutoMnemonics(t0).runNow()), enableItem = js.Any.fromFunction2((t0: Double, t1: Boolean) => (enableItem(t0, t1)).runNow()), getCommand = js.Any.fromFunction1(getCommand), getHelpCommand = js.Any.fromFunction1(getHelpCommand), getHelpText = js.Any.fromFunction1(getHelpText), getItemCount = getItemCount.toJsFn, getItemId = js.Any.fromFunction1(getItemId), getItemPos = js.Any.fromFunction1(getItemPos), getItemText = js.Any.fromFunction1(getItemText), getItemType = js.Any.fromFunction1(getItemType), getPopupMenu = js.Any.fromFunction1(getPopupMenu), getTipHelpText = js.Any.fromFunction1(getTipHelpText), hideDisabledEntries = js.Any.fromFunction1((t0: Boolean) => hideDisabledEntries(t0).runNow()), insertItem = js.Any.fromFunction4((t0: Double, t1: String, t2: Double, t3: Double) => (insertItem(t0, t1, t2, t3)).runNow()), isItemEnabled = js.Any.fromFunction1(isItemEnabled), isPopupMenu = isPopupMenu.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeItem = js.Any.fromFunction2((t0: Double, t1: Double) => (removeItem(t0, t1)).runNow()), removeMenuListener = js.Any.fromFunction1((t0: XMenuListener) => removeMenuListener(t0).runNow()), setCommand = js.Any.fromFunction2((t0: Double, t1: String) => (setCommand(t0, t1)).runNow()), setHelpCommand = js.Any.fromFunction2((t0: Double, t1: String) => (setHelpCommand(t0, t1)).runNow()), setHelpText = js.Any.fromFunction2((t0: Double, t1: String) => (setHelpText(t0, t1)).runNow()), setItemText = js.Any.fromFunction2((t0: Double, t1: String) => (setItemText(t0, t1)).runNow()), setPopupMenu = js.Any.fromFunction2((t0: Double, t1: XPopupMenu) => (setPopupMenu(t0, t1)).runNow()), setTipHelpText = js.Any.fromFunction2((t0: Double, t1: String) => (setTipHelpText(t0, t1)).runNow()))
    __obj.asInstanceOf[XMenu]
  }
  
  extension [Self <: XMenu](x: Self) {
    
    inline def setAddMenuListener(value: XMenuListener => Callback): Self = StObject.set(x, "addMenuListener", js.Any.fromFunction1((t0: XMenuListener) => value(t0).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setEnableAutoMnemonics(value: Boolean => Callback): Self = StObject.set(x, "enableAutoMnemonics", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setEnableItem(value: (Double, Boolean) => Callback): Self = StObject.set(x, "enableItem", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setGetCommand(value: Double => String): Self = StObject.set(x, "getCommand", js.Any.fromFunction1(value))
    
    inline def setGetHelpCommand(value: Double => String): Self = StObject.set(x, "getHelpCommand", js.Any.fromFunction1(value))
    
    inline def setGetHelpText(value: Double => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "getItemCount", value.toJsFn)
    
    inline def setGetItemId(value: Double => Double): Self = StObject.set(x, "getItemId", js.Any.fromFunction1(value))
    
    inline def setGetItemPos(value: Double => Double): Self = StObject.set(x, "getItemPos", js.Any.fromFunction1(value))
    
    inline def setGetItemText(value: Double => String): Self = StObject.set(x, "getItemText", js.Any.fromFunction1(value))
    
    inline def setGetItemType(value: Double => MenuItemType): Self = StObject.set(x, "getItemType", js.Any.fromFunction1(value))
    
    inline def setGetPopupMenu(value: Double => XPopupMenu): Self = StObject.set(x, "getPopupMenu", js.Any.fromFunction1(value))
    
    inline def setGetTipHelpText(value: Double => String): Self = StObject.set(x, "getTipHelpText", js.Any.fromFunction1(value))
    
    inline def setHideDisabledEntries(value: Boolean => Callback): Self = StObject.set(x, "hideDisabledEntries", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setInsertItem(value: (Double, String, Double, Double) => Callback): Self = StObject.set(x, "insertItem", js.Any.fromFunction4((t0: Double, t1: String, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setIsItemEnabled(value: Double => Boolean): Self = StObject.set(x, "isItemEnabled", js.Any.fromFunction1(value))
    
    inline def setIsPopupMenu(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPopupMenu", value.toJsFn)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: (Double, Double) => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRemoveMenuListener(value: XMenuListener => Callback): Self = StObject.set(x, "removeMenuListener", js.Any.fromFunction1((t0: XMenuListener) => value(t0).runNow()))
    
    inline def setSetCommand(value: (Double, String) => Callback): Self = StObject.set(x, "setCommand", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetHelpCommand(value: (Double, String) => Callback): Self = StObject.set(x, "setHelpCommand", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetHelpText(value: (Double, String) => Callback): Self = StObject.set(x, "setHelpText", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetItemText(value: (Double, String) => Callback): Self = StObject.set(x, "setItemText", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetPopupMenu(value: (Double, XPopupMenu) => Callback): Self = StObject.set(x, "setPopupMenu", js.Any.fromFunction2((t0: Double, t1: XPopupMenu) => (value(t0, t1)).runNow()))
    
    inline def setSetTipHelpText(value: (Double, String) => Callback): Self = StObject.set(x, "setTipHelpText", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
  }
}
