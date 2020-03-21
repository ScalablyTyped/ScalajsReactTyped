package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLCMenu extends js.Object {
  /** This method is used to dynamically add items in the context menu.
    * @param {ej.Spreadsheet.ContextMenuType} Specifies the context menu type in which the item to be inserted.
    * @param {any[]} Pass the items to be inserted
    * @param {string} Specifies the type of operation to be performed
    * @param {number} Specifies the item index
    * @returns {void}
    */
  def addItem(target: ContextMenuType, itemColl: js.Array[_], operation: String, itemIdx: Double): Unit
  /** This method is used to change data source in the context menu.
    * @param {string} Specifies the context menu type to bind the data source.
    * @param {any[]} Pass the data source to be binded
    * @returns {void}
    */
  def changeDataSource(target: String, data: js.Array[_]): Unit
  /** This method is used to disable the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be disabled.
    * @param {any[]} Specifies the Menu Item id collection to be disabled
    * @returns {void}
    */
  def disableItem(target: String, idxColl: js.Array[_]): Unit
  /** This method is used to enable the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be enabled.
    * @param {any[]} Specifies the Menu Item id collection to be enabled
    * @returns {void}
    */
  def enableItem(target: String, idxColl: js.Array[_]): Unit
  /** This method is used to hide the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be hides.
    * @param {any[]} Specifies the Menu Item id collection to be hides
    * @returns {void}
    */
  def hideItem(cMenuType: String, idxColl: js.Array[_]): Unit
  /** This method is used to remove the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be removed.
    * @param {any[]} Specifies the Menu Item id collection to be removed
    * @returns {void}
    */
  def removeItem(target: String, idxColl: js.Array[_]): Unit
  /** This method is used to show the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be shown.
    * @param {any[]} Specifies the Menu Item id collection to be shown
    * @returns {void}
    */
  def showItem(cMenuType: String, idxColl: js.Array[_]): Unit
}

object XLCMenu {
  @scala.inline
  def apply(
    addItem: (ContextMenuType, js.Array[js.Any], String, Double) => Callback,
    changeDataSource: (String, js.Array[js.Any]) => Callback,
    disableItem: (String, js.Array[js.Any]) => Callback,
    enableItem: (String, js.Array[js.Any]) => Callback,
    hideItem: (String, js.Array[js.Any]) => Callback,
    removeItem: (String, js.Array[js.Any]) => Callback,
    showItem: (String, js.Array[js.Any]) => Callback
  ): XLCMenu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItem")(js.Any.fromFunction4((t0: typingsJapgolly.ejWebAll.ej.Spreadsheet.ContextMenuType, t1: js.Array[js.Any], t2: java.lang.String, t3: scala.Double) => addItem(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("changeDataSource")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => changeDataSource(t0, t1).runNow()))
    __obj.updateDynamic("disableItem")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => disableItem(t0, t1).runNow()))
    __obj.updateDynamic("enableItem")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => enableItem(t0, t1).runNow()))
    __obj.updateDynamic("hideItem")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => hideItem(t0, t1).runNow()))
    __obj.updateDynamic("removeItem")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => removeItem(t0, t1).runNow()))
    __obj.updateDynamic("showItem")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[js.Any]) => showItem(t0, t1).runNow()))
    __obj.asInstanceOf[XLCMenu]
  }
}

