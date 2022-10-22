package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A custom menu in an instance of the user interface for a Google App. A script can only interact
  * with the UI for the current instance of an open document or form, and only if the script is container-bound to the document or form. For more
  * information, see the guide to menus.
  *
  *     // Add a custom menu to the active spreadsheet, including a separator and a sub-menu.
  *     function onOpen(e) {
  *       SpreadsheetApp.getUi()
  *           .createMenu('My Menu')
  *           .addItem('My Menu Item', 'myFunction')
  *           .addSeparator()
  *           .addSubMenu(SpreadsheetApp.getUi().createMenu('My Submenu')
  *               .addItem('One Submenu Item', 'mySecondFunction')
  *               .addItem('Another Submenu Item', 'myThirdFunction'))
  *           .addToUi();
  *     }
  */
trait Menu extends StObject {
  
  def addItem(caption: String, functionName: String): Menu
  
  def addSeparator(): Menu
  
  def addSubMenu(menu: Menu): Menu
  
  def addToUi(): Unit
}
object Menu {
  
  inline def apply(
    addItem: (String, String) => Menu,
    addSeparator: CallbackTo[Menu],
    addSubMenu: Menu => Menu,
    addToUi: Callback
  ): Menu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem), addSeparator = addSeparator.toJsFn, addSubMenu = js.Any.fromFunction1(addSubMenu), addToUi = addToUi.toJsFn)
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setAddItem(value: (String, String) => Menu): Self = StObject.set(x, "addItem", js.Any.fromFunction2(value))
    
    inline def setAddSeparator(value: CallbackTo[Menu]): Self = StObject.set(x, "addSeparator", value.toJsFn)
    
    inline def setAddSubMenu(value: Menu => Menu): Self = StObject.set(x, "addSubMenu", js.Any.fromFunction1(value))
    
    inline def setAddToUi(value: Callback): Self = StObject.set(x, "addToUi", value.toJsFn)
  }
}
