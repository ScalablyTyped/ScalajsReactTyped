package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridSummariesMethods extends StObject {
  
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
  def calculateSummaryColumn(ck: String, columnMethods: js.Array[Any], data: js.Object, dataType: js.Object): Unit
  
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
  
  inline def apply(
    calculateSummaries: Callback,
    calculateSummaryColumn: (String, js.Array[Any], js.Object, js.Object) => Callback,
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
    val __obj = js.Dynamic.literal(calculateSummaries = calculateSummaries.toJsFn, calculateSummaryColumn = js.Any.fromFunction4((t0: String, t1: js.Array[Any], t2: js.Object, t3: js.Object) => (calculateSummaryColumn(t0, t1, t2, t3)).runNow()), changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = changeLocale.toJsFn, changeRegional = changeRegional.toJsFn, clearAllFooterIcons = clearAllFooterIcons.toJsFn, destroy = destroy.toJsFn, isSummariesRowsHidden = isSummariesRowsHidden.toJsFn, selectCheckBox = js.Any.fromFunction2((t0: js.Object, t1: Boolean) => (selectCheckBox(t0, t1)).runNow()), showHideDialog = js.Any.fromFunction1((t0: js.Object) => showHideDialog(t0).runNow()), summariesFor = js.Any.fromFunction1((t0: js.Object) => summariesFor(t0).runNow()), summaryCollection = summaryCollection.toJsFn, toggleCheckstate = js.Any.fromFunction1((t0: js.Object) => toggleCheckstate(t0).runNow()), toggleDropDown = js.Any.fromFunction2((t0: String, t1: js.Object) => (toggleDropDown(t0, t1)).runNow()), toggleSummariesRows = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (toggleSummariesRows(t0, t1)).runNow()))
    __obj.asInstanceOf[IgGridSummariesMethods]
  }
  
  extension [Self <: IgGridSummariesMethods](x: Self) {
    
    inline def setCalculateSummaries(value: Callback): Self = StObject.set(x, "calculateSummaries", value.toJsFn)
    
    inline def setCalculateSummaryColumn(value: (String, js.Array[Any], js.Object, js.Object) => Callback): Self = StObject.set(x, "calculateSummaryColumn", js.Any.fromFunction4((t0: String, t1: js.Array[Any], t2: js.Object, t3: js.Object) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: Callback): Self = StObject.set(x, "changeLocale", value.toJsFn)
    
    inline def setChangeRegional(value: Callback): Self = StObject.set(x, "changeRegional", value.toJsFn)
    
    inline def setClearAllFooterIcons(value: Callback): Self = StObject.set(x, "clearAllFooterIcons", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setIsSummariesRowsHidden(value: Callback): Self = StObject.set(x, "isSummariesRowsHidden", value.toJsFn)
    
    inline def setSelectCheckBox(value: (js.Object, Boolean) => Callback): Self = StObject.set(x, "selectCheckBox", js.Any.fromFunction2((t0: js.Object, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setShowHideDialog(value: js.Object => Callback): Self = StObject.set(x, "showHideDialog", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSummariesFor(value: js.Object => Callback): Self = StObject.set(x, "summariesFor", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSummaryCollection(value: Callback): Self = StObject.set(x, "summaryCollection", value.toJsFn)
    
    inline def setToggleCheckstate(value: js.Object => Callback): Self = StObject.set(x, "toggleCheckstate", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setToggleDropDown(value: (String, js.Object) => Callback): Self = StObject.set(x, "toggleDropDown", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setToggleSummariesRows(value: (Boolean, Boolean) => Callback): Self = StObject.set(x, "toggleSummariesRows", js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
