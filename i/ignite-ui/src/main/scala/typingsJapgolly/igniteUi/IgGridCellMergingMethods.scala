package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridCellMergingMethods extends js.Object {
  def changeGlobalLanguage(): Unit
  def changeGlobalRegional(): Unit
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): Unit
  /**
  	 * Removes all igGridCellMerging UI changes and destroys the widget
  	 */
  def destroy(): Unit
  /**
  	 * Returns the merge state of a column.
  	 *
  	 * @param column The column index or column key to get the state for.
  	 */
  def isMerged(column: js.Object): Boolean
  /**
  	 * Merges the specified column unless it is already merged.
  	 *
  	 * @param column The column index or column key to merge.
  	 * @param raiseEvents Specifies if the operation should raise merging-related events.
  	 */
  def mergeColumn(column: js.Object, raiseEvents: Boolean): String
  def mergeRow(id: js.Object, fireEvents: js.Object): Unit
  /**
  	 * Restores the column to its unmerged state. Does nothing if the column is not merged.
  	 *
  	 * @param column The column index or column key to unmerge.
  	 */
  def unmergeColumn(column: js.Object): String
  def unmergeRow(id: js.Object, index: js.Object): Unit
}

object IgGridCellMergingMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    destroy: Callback,
    isMerged: js.Object => CallbackTo[Boolean],
    mergeColumn: (js.Object, Boolean) => CallbackTo[String],
    mergeRow: (js.Object, js.Object) => Callback,
    unmergeColumn: js.Object => CallbackTo[String],
    unmergeRow: (js.Object, js.Object) => Callback
  ): IgGridCellMergingMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("isMerged")(js.Any.fromFunction1((t0: js.Object) => isMerged(t0).runNow()))
    __obj.updateDynamic("mergeColumn")(js.Any.fromFunction2((t0: js.Object, t1: scala.Boolean) => mergeColumn(t0, t1).runNow()))
    __obj.updateDynamic("mergeRow")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => mergeRow(t0, t1).runNow()))
    __obj.updateDynamic("unmergeColumn")(js.Any.fromFunction1((t0: js.Object) => unmergeColumn(t0).runNow()))
    __obj.updateDynamic("unmergeRow")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => unmergeRow(t0, t1).runNow()))
    __obj.asInstanceOf[IgGridCellMergingMethods]
  }
}

