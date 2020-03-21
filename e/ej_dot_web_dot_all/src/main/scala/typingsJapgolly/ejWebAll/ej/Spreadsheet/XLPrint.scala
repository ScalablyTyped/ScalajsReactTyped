package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLPrint extends js.Object {
  /** This method is used to print the selected contents in the Spreadsheet.
    * @returns {void}
    */
  def printSelection(): Unit
  /** This method is used to print the entire contents in the active sheet.
    * @returns {void}
    */
  def printSheet(): Unit
}

object XLPrint {
  @scala.inline
  def apply(printSelection: Callback, printSheet: Callback): XLPrint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printSelection")(printSelection.toJsFn)
    __obj.updateDynamic("printSheet")(printSheet.toJsFn)
    __obj.asInstanceOf[XLPrint]
  }
}

