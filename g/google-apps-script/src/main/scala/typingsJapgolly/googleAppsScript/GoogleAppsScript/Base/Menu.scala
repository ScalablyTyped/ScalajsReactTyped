package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Menu extends js.Object {
  def addItem(caption: String, functionName: String): Menu
  def addSeparator(): Menu
  def addSubMenu(menu: Menu): Menu
  def addToUi(): Unit
}

object Menu {
  @scala.inline
  def apply(
    addItem: (String, String) => CallbackTo[Menu],
    addSeparator: CallbackTo[Menu],
    addSubMenu: Menu => CallbackTo[Menu],
    addToUi: Callback
  ): Menu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addItem(t0, t1).runNow()))
    __obj.updateDynamic("addSeparator")(addSeparator.toJsFn)
    __obj.updateDynamic("addSubMenu")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Menu) => addSubMenu(t0).runNow()))
    __obj.updateDynamic("addToUi")(addToUi.toJsFn)
    __obj.asInstanceOf[Menu]
  }
}

