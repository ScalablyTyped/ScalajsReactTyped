package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridRowSelectorsMethods extends js.Object {
  /**
  	 * Changes the check state of a row by index to specified value
  	 *
  	 * @param index Row index
  	 * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
  	 */
  def changeCheckState(index: Double, toCheck: Boolean): Unit
  /**
  	 * Change the check state of a row by row id
  	 *
  	 * @param rowId Row Id
  	 * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
  	 */
  def changeCheckStateById(rowId: js.Object, toCheck: Boolean): Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igtreegridrowselectors#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igtreegridrowselectors#options:language) or [locale](ui.igtreegridrowselectors#options:locale) option setter
  	 */
  def changeLocale(): Unit
  /**
  	 * Returns the check state of the row by id.
  	 *
  	 * @param rowId
  	 */
  def checkStateById(rowId: js.Object): String
  /**
  	 * Gets an array of all the checked rows. Every object from the array has the following format { element: , id: , index: }
  	 */
  def checkedRows(): js.Array[_]
  def destroy(): Unit
  /**
  	 * Gets an array of all the partially checked rows. Every object from the array has the following format { element: , id: , index: }
  	 */
  def partiallyCheckedRows(): js.Array[_]
  def rsRenderColgroup(): Unit
  /**
  	 * Toggles the check state of a row by index
  	 *
  	 * @param index Row index
  	 */
  def toggleCheckState(index: Double): Unit
  /**
  	 * Toggles the check state of a row by row id
  	 *
  	 * @param rowId Row Id
  	 */
  def toggleCheckStateById(rowId: js.Object): Unit
  /**
  	 * Gets an array of all the unchecked rows. Every object from the array has the following format { element: , id: , index: }
  	 */
  def uncheckedRows(): js.Array[_]
}

object IgTreeGridRowSelectorsMethods {
  @scala.inline
  def apply(
    changeCheckState: (Double, Boolean) => Callback,
    changeCheckStateById: (js.Object, Boolean) => Callback,
    changeLocale: Callback,
    checkStateById: js.Object => CallbackTo[String],
    checkedRows: CallbackTo[js.Array[js.Any]],
    destroy: Callback,
    partiallyCheckedRows: CallbackTo[js.Array[js.Any]],
    rsRenderColgroup: Callback,
    toggleCheckState: Double => Callback,
    toggleCheckStateById: js.Object => Callback,
    uncheckedRows: CallbackTo[js.Array[js.Any]]
  ): IgTreeGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeCheckState")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => changeCheckState(t0, t1).runNow()))
    __obj.updateDynamic("changeCheckStateById")(js.Any.fromFunction2((t0: js.Object, t1: scala.Boolean) => changeCheckStateById(t0, t1).runNow()))
    __obj.updateDynamic("changeLocale")(changeLocale.toJsFn)
    __obj.updateDynamic("checkStateById")(js.Any.fromFunction1((t0: js.Object) => checkStateById(t0).runNow()))
    __obj.updateDynamic("checkedRows")(checkedRows.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("partiallyCheckedRows")(partiallyCheckedRows.toJsFn)
    __obj.updateDynamic("rsRenderColgroup")(rsRenderColgroup.toJsFn)
    __obj.updateDynamic("toggleCheckState")(js.Any.fromFunction1((t0: scala.Double) => toggleCheckState(t0).runNow()))
    __obj.updateDynamic("toggleCheckStateById")(js.Any.fromFunction1((t0: js.Object) => toggleCheckStateById(t0).runNow()))
    __obj.updateDynamic("uncheckedRows")(uncheckedRows.toJsFn)
    __obj.asInstanceOf[IgTreeGridRowSelectorsMethods]
  }
}

