package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSummariesMethods extends js.Object {
  /**
  	 * Calculate summaries
  	 */
  def calculateSummaries(): Unit
  /**
  	 * Summary calculate the whole data for the specified column key, columnMethods and dataType (used when datasource is remote and dataType is date or time)
  	 *
  	 * @param ck ColumnKey
  	 * @param columnMethods Array of column methods objects
  	 * @param data Object which represents result
  	 * represents dataType for the current column
  	 * @param dataType
  	 */
  def calculateSummaryColumn(ck: String, columnMethods: js.Array[_], data: js.Object, dataType: js.Object): Unit
  def changeGlobalLanguage(): Unit
  def changeGlobalRegional(): Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridsummaries#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridsummaries#options:language) or [locale](ui.iggridsummaries#options:locale) option setter
  	 */
  def changeLocale(): Unit
  /**
  	 * Changes the the regional settings of widget element to the language specified in [options.regional](ui.iggridsummaries#options:regional)
  	 * Note that this method is for rare scenarios, use [regional](ui.iggridsummaries#options:regional) option setter
  	 */
  def changeRegional(): Unit
  /**
  	 * Remove all summaries dropdown buttons.
  	 */
  def clearAllFooterIcons(): Unit
  def destroy(): Unit
  /**
  	 * Returns whether summaries rows are hidden
  	 */
  def isSummariesRowsHidden(): Unit
  /**
  	 * Select/Unselect specified checkbox
  	 *
  	 * @param $checkbox Specifies the jQuery object for checkbox
  	 * @param isToSelect Specify whether to select or not checkbox
  	 */
  def selectCheckBox($checkbox: js.Object, isToSelect: Boolean): Unit
  /**
  	 * Show/Hide dialog
  	 *
  	 * @param $dialog jQuery object representation of dropdown div element
  	 */
  def showHideDialog($dialog: js.Object): Unit
  /**
  	 * Return a JQUERY object which holds all summaries for column with the specified column key
  	 *
  	 * @param columnKey
  	 */
  def summariesFor(columnKey: js.Object): Unit
  /**
  	 * Return a JQUERY object which holds all summaries for all columns
  	 */
  def summaryCollection(): Unit
  /**
  	 * Toggles the checkstate of a checkbox if checkboxMode is not set to off, otherwise does nothing.
  	 *
  	 * @param $checkbox Specifies the jQuery object of the checkbox.
  	 */
  def toggleCheckstate($checkbox: js.Object): Unit
  /**
  	 * Toggle drop down
  	 *
  	 * @param columnKey toggle drop down for the column with the specified key
  	 * @param event event object. Its data should contain current columnKey, isAnimating, buttonId
  	 */
  def toggleDropDown(columnKey: String, event: js.Object): Unit
  /**
  	 * Toggle summaries rows
  	 *
  	 * @param isToShow Specifies whether to show or not summaries
  	 * @param isInternalCall Optional parameter.Specifies whether this function is called internally by the widget.
  	 */
  def toggleSummariesRows(isToShow: Boolean, isInternalCall: Boolean): Unit
}

object IgGridSummariesMethods {
  @scala.inline
  def apply(
    calculateSummaries: Callback,
    calculateSummaryColumn: (String, js.Array[js.Any], js.Object, js.Object) => Callback,
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: Callback,
    changeRegional: Callback,
    clearAllFooterIcons: Callback,
    destroy: Callback,
    isSummariesRowsHidden: Callback,
    selectCheckBox: (js.Object, Boolean) => Callback,
    showHideDialog: js.Object => Callback,
    summariesFor: js.Object => Callback,
    summaryCollection: Callback,
    toggleCheckstate: js.Object => Callback,
    toggleDropDown: (String, js.Object) => Callback,
    toggleSummariesRows: (Boolean, Boolean) => Callback
  ): IgGridSummariesMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calculateSummaries")(calculateSummaries.toJsFn)
    __obj.updateDynamic("calculateSummaryColumn")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Array[js.Any], t2: js.Object, t3: js.Object) => calculateSummaryColumn(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage.toJsFn)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional.toJsFn)
    __obj.updateDynamic("changeLocale")(changeLocale.toJsFn)
    __obj.updateDynamic("changeRegional")(changeRegional.toJsFn)
    __obj.updateDynamic("clearAllFooterIcons")(clearAllFooterIcons.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("isSummariesRowsHidden")(isSummariesRowsHidden.toJsFn)
    __obj.updateDynamic("selectCheckBox")(js.Any.fromFunction2((t0: js.Object, t1: scala.Boolean) => selectCheckBox(t0, t1).runNow()))
    __obj.updateDynamic("showHideDialog")(js.Any.fromFunction1((t0: js.Object) => showHideDialog(t0).runNow()))
    __obj.updateDynamic("summariesFor")(js.Any.fromFunction1((t0: js.Object) => summariesFor(t0).runNow()))
    __obj.updateDynamic("summaryCollection")(summaryCollection.toJsFn)
    __obj.updateDynamic("toggleCheckstate")(js.Any.fromFunction1((t0: js.Object) => toggleCheckstate(t0).runNow()))
    __obj.updateDynamic("toggleDropDown")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => toggleDropDown(t0, t1).runNow()))
    __obj.updateDynamic("toggleSummariesRows")(js.Any.fromFunction2((t0: scala.Boolean, t1: scala.Boolean) => toggleSummariesRows(t0, t1).runNow()))
    __obj.asInstanceOf[IgGridSummariesMethods]
  }
}

