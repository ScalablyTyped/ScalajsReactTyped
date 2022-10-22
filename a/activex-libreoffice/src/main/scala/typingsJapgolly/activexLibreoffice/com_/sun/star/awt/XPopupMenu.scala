package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.graphic.XGraphic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** controls a pop-up menu. */
trait XPopupMenu
  extends StObject
     with XMenu {
  
  /**
    * returns the menu default item.
    * @returns the ID of the default item.
    */
  var DefaultItem: Double
  
  /**
    * sets the state of the item to be checked or unchecked.
    * @param nItemId specifies the menu item identifier.
    * @param bCheck specifies if the item is checked ( `TRUE` ) or unchecked ( `FALSE` ).
    */
  def checkItem(nItemId: Double, bCheck: Boolean): Unit
  
  /**
    * ends the execution of the {@link PopupMenu} .
    *
    * {@link com.sun.star.awt.XPopupMenu.execute()} will then return 0.
    * @see com.sun.star.awt.XPopupMenu.execute()
    */
  def endExecute(): Unit
  
  /**
    * executes the popup menu and returns the selected item or `0` , if cancelled.
    * @param Parent the parent window.
    * @param Position a {@link Rectangle} representing the coordinates system where the popup menu should be executed.
    * @param Direction the direction in which a popup menu will grow, as specified by one of the {@link PopupMenuDirection} constants.
    * @returns returns the selected item or `0` , if cancelled.
    */
  def execute(Parent: XWindowPeer, Position: Rectangle, Direction: Double): Double
  
  /**
    * retrieves the {@link KeyEvent} for the menu item.
    *
    * The {@link KeyEvent} is **only** used as a container to transport the shortcut information, so that in this case {@link
    * com.sun.star.lang.EventObject.Source} is NULL.
    * @param nItemId specifies the menu item identifier for which the {@link KeyEvent} should be retrieved.
    * @returns the {@link KeyEvent} struct assigned to the requested menu item.
    */
  def getAcceleratorKeyEvent(nItemId: Double): KeyEvent
  
  /**
    * returns the menu default item.
    * @returns the ID of the default item.
    */
  def getDefaultItem(): Double
  
  /**
    * retrieves the image for the menu item.
    * @param nItemId specifies the menu item identifier for which the image should be retrieved.
    * @returns a XGraphic reference to the current image for the requested menu item.
    */
  def getItemImage(nItemId: Double): XGraphic
  
  /**
    * inserts a separator at the specified position.
    * @param nItemPos specifies the position where the menu separator will be inserted.
    */
  def insertSeparator(nItemPos: Double): Unit
  
  /**
    * queries if the {@link PopupMenu} is being.
    *
    * Returns `TRUE` only if the {@link PopupMenu} is being executed as a result of invoking {@link XPopupMenu.execute()} ; that is, for a {@link PopupMenu}
    * activated by a {@link MenuBar} item, this methods returns `FALSE` .
    * @returns `TRUE` if the {@link PopupMenu} is being executed, `FALSE` otherwise.
    * @see XPopupMenu.execute()
    */
  def isInExecute(): Boolean
  
  /**
    * returns whether the item is checked or unchecked.
    * @param nItemId specifies the menu item identifier.
    * @returns `TRUE` if the item is checked, `FALSE` otherwise.
    */
  def isItemChecked(nItemId: Double): Boolean
  
  /**
    * sets the {@link KeyEvent} for the menu item.
    *
    * The {@link KeyEvent} is **only** used as a container to transport the shortcut information, this methods only draws the text corresponding to this
    * keyboard shortcut. The client code is responsible for listening to keyboard events (typically done via {@link XUserInputInterception} ), and dispatch
    * the respective command.
    * @param nItemId specifies the menu item identifier for which the {@link KeyEvent} should be set.
    * @param aKeyEvent specifies the {@link KeyEvent} for the menu item.
    */
  def setAcceleratorKeyEvent(nItemId: Double, aKeyEvent: KeyEvent): Unit
  
  /**
    * sets the menu default item.
    * @param nItemId specifies the menu item identifier.
    */
  def setDefaultItem(nItemId: Double): Unit
  
  /**
    * sets the image for the menu item.
    * @param nItemId specifies the menu item identifier for which the image should be set.
    * @param xGraphic specifies the image for the menu item.
    * @param bScale if `TRUE` , the image will be scaled to the standard size used internally by the implementation.
    */
  def setItemImage(nItemId: Double, xGraphic: XGraphic, bScale: Boolean): Unit
}
object XPopupMenu {
  
  inline def apply(
    DefaultItem: Double,
    ItemCount: Double,
    acquire: Callback,
    addMenuListener: XMenuListener => Callback,
    checkItem: (Double, Boolean) => Callback,
    clear: Callback,
    enableAutoMnemonics: Boolean => Callback,
    enableItem: (Double, Boolean) => Callback,
    endExecute: Callback,
    execute: (XWindowPeer, Rectangle, Double) => Double,
    getAcceleratorKeyEvent: Double => KeyEvent,
    getCommand: Double => String,
    getDefaultItem: CallbackTo[Double],
    getHelpCommand: Double => String,
    getHelpText: Double => String,
    getItemCount: CallbackTo[Double],
    getItemId: Double => Double,
    getItemImage: Double => XGraphic,
    getItemPos: Double => Double,
    getItemText: Double => String,
    getItemType: Double => MenuItemType,
    getPopupMenu: Double => XPopupMenu,
    getTipHelpText: Double => String,
    hideDisabledEntries: Boolean => Callback,
    insertItem: (Double, String, Double, Double) => Callback,
    insertSeparator: Double => Callback,
    isInExecute: CallbackTo[Boolean],
    isItemChecked: Double => Boolean,
    isItemEnabled: Double => Boolean,
    isPopupMenu: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeItem: (Double, Double) => Callback,
    removeMenuListener: XMenuListener => Callback,
    setAcceleratorKeyEvent: (Double, KeyEvent) => Callback,
    setCommand: (Double, String) => Callback,
    setDefaultItem: Double => Callback,
    setHelpCommand: (Double, String) => Callback,
    setHelpText: (Double, String) => Callback,
    setItemImage: (Double, XGraphic, Boolean) => Callback,
    setItemText: (Double, String) => Callback,
    setPopupMenu: (Double, XPopupMenu) => Callback,
    setTipHelpText: (Double, String) => Callback
  ): XPopupMenu = {
    val __obj = js.Dynamic.literal(DefaultItem = DefaultItem.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addMenuListener = js.Any.fromFunction1((t0: XMenuListener) => addMenuListener(t0).runNow()), checkItem = js.Any.fromFunction2((t0: Double, t1: Boolean) => (checkItem(t0, t1)).runNow()), clear = clear.toJsFn, enableAutoMnemonics = js.Any.fromFunction1((t0: Boolean) => enableAutoMnemonics(t0).runNow()), enableItem = js.Any.fromFunction2((t0: Double, t1: Boolean) => (enableItem(t0, t1)).runNow()), endExecute = endExecute.toJsFn, execute = js.Any.fromFunction3(execute), getAcceleratorKeyEvent = js.Any.fromFunction1(getAcceleratorKeyEvent), getCommand = js.Any.fromFunction1(getCommand), getDefaultItem = getDefaultItem.toJsFn, getHelpCommand = js.Any.fromFunction1(getHelpCommand), getHelpText = js.Any.fromFunction1(getHelpText), getItemCount = getItemCount.toJsFn, getItemId = js.Any.fromFunction1(getItemId), getItemImage = js.Any.fromFunction1(getItemImage), getItemPos = js.Any.fromFunction1(getItemPos), getItemText = js.Any.fromFunction1(getItemText), getItemType = js.Any.fromFunction1(getItemType), getPopupMenu = js.Any.fromFunction1(getPopupMenu), getTipHelpText = js.Any.fromFunction1(getTipHelpText), hideDisabledEntries = js.Any.fromFunction1((t0: Boolean) => hideDisabledEntries(t0).runNow()), insertItem = js.Any.fromFunction4((t0: Double, t1: String, t2: Double, t3: Double) => (insertItem(t0, t1, t2, t3)).runNow()), insertSeparator = js.Any.fromFunction1((t0: Double) => insertSeparator(t0).runNow()), isInExecute = isInExecute.toJsFn, isItemChecked = js.Any.fromFunction1(isItemChecked), isItemEnabled = js.Any.fromFunction1(isItemEnabled), isPopupMenu = isPopupMenu.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeItem = js.Any.fromFunction2((t0: Double, t1: Double) => (removeItem(t0, t1)).runNow()), removeMenuListener = js.Any.fromFunction1((t0: XMenuListener) => removeMenuListener(t0).runNow()), setAcceleratorKeyEvent = js.Any.fromFunction2((t0: Double, t1: KeyEvent) => (setAcceleratorKeyEvent(t0, t1)).runNow()), setCommand = js.Any.fromFunction2((t0: Double, t1: String) => (setCommand(t0, t1)).runNow()), setDefaultItem = js.Any.fromFunction1((t0: Double) => setDefaultItem(t0).runNow()), setHelpCommand = js.Any.fromFunction2((t0: Double, t1: String) => (setHelpCommand(t0, t1)).runNow()), setHelpText = js.Any.fromFunction2((t0: Double, t1: String) => (setHelpText(t0, t1)).runNow()), setItemImage = js.Any.fromFunction3((t0: Double, t1: XGraphic, t2: Boolean) => (setItemImage(t0, t1, t2)).runNow()), setItemText = js.Any.fromFunction2((t0: Double, t1: String) => (setItemText(t0, t1)).runNow()), setPopupMenu = js.Any.fromFunction2((t0: Double, t1: XPopupMenu) => (setPopupMenu(t0, t1)).runNow()), setTipHelpText = js.Any.fromFunction2((t0: Double, t1: String) => (setTipHelpText(t0, t1)).runNow()))
    __obj.asInstanceOf[XPopupMenu]
  }
  
  extension [Self <: XPopupMenu](x: Self) {
    
    inline def setCheckItem(value: (Double, Boolean) => Callback): Self = StObject.set(x, "checkItem", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setDefaultItem(value: Double): Self = StObject.set(x, "DefaultItem", value.asInstanceOf[js.Any])
    
    inline def setEndExecute(value: Callback): Self = StObject.set(x, "endExecute", value.toJsFn)
    
    inline def setExecute(value: (XWindowPeer, Rectangle, Double) => Double): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
    
    inline def setGetAcceleratorKeyEvent(value: Double => KeyEvent): Self = StObject.set(x, "getAcceleratorKeyEvent", js.Any.fromFunction1(value))
    
    inline def setGetDefaultItem(value: CallbackTo[Double]): Self = StObject.set(x, "getDefaultItem", value.toJsFn)
    
    inline def setGetItemImage(value: Double => XGraphic): Self = StObject.set(x, "getItemImage", js.Any.fromFunction1(value))
    
    inline def setInsertSeparator(value: Double => Callback): Self = StObject.set(x, "insertSeparator", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setIsInExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInExecute", value.toJsFn)
    
    inline def setIsItemChecked(value: Double => Boolean): Self = StObject.set(x, "isItemChecked", js.Any.fromFunction1(value))
    
    inline def setSetAcceleratorKeyEvent(value: (Double, KeyEvent) => Callback): Self = StObject.set(x, "setAcceleratorKeyEvent", js.Any.fromFunction2((t0: Double, t1: KeyEvent) => (value(t0, t1)).runNow()))
    
    inline def setSetDefaultItem(value: Double => Callback): Self = StObject.set(x, "setDefaultItem", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetItemImage(value: (Double, XGraphic, Boolean) => Callback): Self = StObject.set(x, "setItemImage", js.Any.fromFunction3((t0: Double, t1: XGraphic, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
