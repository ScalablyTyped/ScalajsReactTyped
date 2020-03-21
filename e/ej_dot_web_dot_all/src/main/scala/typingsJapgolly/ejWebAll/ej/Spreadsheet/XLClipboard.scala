package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLClipboard extends js.Object {
  /** This method is used to copy the selected cells in the Spreadsheet.
    * @returns {void}
    */
  def copy(): Unit
  /** This method is used to cut the selected cells in the Spreadsheet.
    * @returns {void}
    */
  def cut(): Unit
  /** This method is used to paste the cut or copied cells data in the Spreadsheet.
    * @returns {void}
    */
  def paste(): Unit
}

object XLClipboard {
  @scala.inline
  def apply(copy: Callback, cut: Callback, paste: Callback): XLClipboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("cut")(cut.toJsFn)
    __obj.updateDynamic("paste")(paste.toJsFn)
    __obj.asInstanceOf[XLClipboard]
  }
}

