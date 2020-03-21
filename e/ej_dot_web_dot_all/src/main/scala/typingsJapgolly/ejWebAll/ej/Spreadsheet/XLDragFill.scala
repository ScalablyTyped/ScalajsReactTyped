package typingsJapgolly.ejWebAll.ej.Spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLDragFill extends js.Object {
  /** This method is used to perform auto fill in Spreadsheet.
    * @param {Spreadsheet.AutoFillObject} Pass Object AutoFillObject.
    * @returns {void}
    */
  def autoFill(options: AutoFillObject): Unit
  /** This method is used to hide the auto fill element in the Spreadsheet.
    * @returns {void}
    */
  def hideAutoFillElement(): Unit
  /** This method is used to hide the auto fill options in the Spreadsheet.
    * @returns {void}
    */
  def hideAutoFillOptions(): Unit
  /** This method is used to set position of the auto fill element in the Spreadsheet.
    * @param {boolean} Pass the isDragFill option as {{'`boolean`' | markdownify}} value to show auto fill options in Spreadsheet.
    * @returns {void}
    */
  def positionAutoFillElement(isDragFill: Boolean): Unit
}

object XLDragFill {
  @scala.inline
  def apply(
    autoFill: AutoFillObject => Callback,
    hideAutoFillElement: Callback,
    hideAutoFillOptions: Callback,
    positionAutoFillElement: Boolean => Callback
  ): XLDragFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoFill")(js.Any.fromFunction1((t0: typingsJapgolly.ejWebAll.ej.Spreadsheet.AutoFillObject) => autoFill(t0).runNow()))
    __obj.updateDynamic("hideAutoFillElement")(hideAutoFillElement.toJsFn)
    __obj.updateDynamic("hideAutoFillOptions")(hideAutoFillOptions.toJsFn)
    __obj.updateDynamic("positionAutoFillElement")(js.Any.fromFunction1((t0: scala.Boolean) => positionAutoFillElement(t0).runNow()))
    __obj.asInstanceOf[XLDragFill]
  }
}

