package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLScroll extends js.Object {
  /** This method is used to scroll the sheet content to the specified cell address in the Spreadsheet.
    * @param {string} Pass the cell address that you want to scroll to it.
    * @returns {void}
    */
  def scrollToCell(range: String): Unit
}

object XLScroll {
  @scala.inline
  def apply(scrollToCell: String => Callback): XLScroll = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scrollToCell")(js.Any.fromFunction1((t0: java.lang.String) => scrollToCell(t0).runNow()))
    __obj.asInstanceOf[XLScroll]
  }
}

