package typingsJapgolly.reactBootstrapTable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseInsertModal extends js.Object {
  /**
  		 * Callback to close the insert row modal window.
  		 */
  def closeInsertModal(): Unit
  /**
  		 * Callback to delete selected row(s) from the table.
  		 */
  def dropRow(): Unit
  /**
  		 * Callback to export the table to a CSV file.
  		 */
  def exportCSV(): Unit
  /**
  		 * Callback to activate the insert row modal window.
  		 */
  def openInsertModal(): Unit
  /**
  		 * Callback to apply a search.
  		 */
  def search(): Unit
  /**
  		 * Callback to toggle between showing all rows and showing only selected rows.
  		 */
  def showOnlyToogle(): Unit
}

object AnonCloseInsertModal {
  @scala.inline
  def apply(
    closeInsertModal: Callback,
    dropRow: Callback,
    exportCSV: Callback,
    openInsertModal: Callback,
    search: Callback,
    showOnlyToogle: Callback
  ): AnonCloseInsertModal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeInsertModal")(closeInsertModal.toJsFn)
    __obj.updateDynamic("dropRow")(dropRow.toJsFn)
    __obj.updateDynamic("exportCSV")(exportCSV.toJsFn)
    __obj.updateDynamic("openInsertModal")(openInsertModal.toJsFn)
    __obj.updateDynamic("search")(search.toJsFn)
    __obj.updateDynamic("showOnlyToogle")(showOnlyToogle.toJsFn)
    __obj.asInstanceOf[AnonCloseInsertModal]
  }
}

