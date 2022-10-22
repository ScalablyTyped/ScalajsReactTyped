package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSpreadsheetMethods extends StObject {
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  
  def changeLocale($container: js.Object): Unit
  
  /**
    * Destroys the widget.
    */
  def destroy(): Unit
  
  /**
    * Executes the action associated with the specified id.
    *
    * @param action An [enumeration](ig.spreadsheet.SpreadsheetAction) or string that identifies the action to execute.
    */
  def executeAction(action: js.Object): Boolean
  
  /**
    * Exports visual data from the spreadsheet to aid in unit testing
    */
  def exportVisualData(): Unit
  
  /**
    * Forces any pending deferred work to render on the spreadsheet before continuing
    */
  def flush(): Unit
  
  /**
    * Returns an object that represents the pane with the focus.
    */
  def getActivePane(): js.Object
  
  /**
    * Returns an object that represents the current selection of the active pane.
    */
  def getActiveSelection(): js.Object
  
  /**
    * Returns an object used to get the formatting of the activeCell and where modifications are applied to the entire active selection.
    *         Any changes made to this object will affect all the objects in the selection. So for example, the
    *         Font.Name may return "Arial" because the active cell has that as its resolved font name even though the other
    *         cells are using a different font but if you set the Font.Name of this object to "Arial" then all the objects
    *         affected by the selection will have their Font.Name updated to that value.
    */
  def getActiveSelectionCellRangeFormat(): js.Object
  
  /**
    * Returns an object that represents the pane with the focus.
    */
  def getActiveTable(): js.Object
  
  /**
    * Returns an enumeration used to indicate the current edit mode state.
    */
  def getCellEditMode(): js.Object
  
  /**
    * Returns a boolean indicating if the control is currently editing the value of the activeCell.
    */
  def getIsInEditMode(): Boolean
  
  /**
    * Returns a boolean indicating if the user is currently editing the name of the active worksheet.
    */
  def getIsRenamingWorksheet(): Boolean
  
  /**
    * Returns an array of the panes for the activeWorksheet.
    *
    *     returnType="ig.spreadsheet.SpreadsheetPane[]"
    */
  def getPanes(): Unit
  
  /**
    * Shows the filter dialog for the specified relative column of the [filterSettings](ig.excel.Worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
    *
    * @param worksheetTableColumn A [region](ig.excel.WorksheetTableColumn) whose filter is to be viewed or changed.
    * @param spreadsheetFilterDialogOption Optional enumeration that specifies the initial display of the filter dialog.
    */
  def showFilterDialogForTable(worksheetTableColumn: js.Object, spreadsheetFilterDialogOption: js.Object): Unit
  
  /**
    * Shows the filter dialog for the specified relative column of the [filterSettings](ig.excel.worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
    *
    * @param relativeColumnIndex A zero based column index relative to the [region](ig.excel.worksheetFilterSettings#methods:region) of the active worksheet.
    * @param spreadsheetFilterDialogOption Optional enumeration that specifies the initial display of the filter dialog.
    */
  def showFilterDialogForWorksheet(relativeColumnIndex: Double, spreadsheetFilterDialogOption: js.Object): Unit
  
  /**
    * Shows the top or bottom dialog for the specified relative column of the [filterSettings](ig.excel.Worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
    *
    * @param worksheetTableColumn A [region](ig.excel.WorksheetTableColumn) whose filter is to be viewed or changed.
    */
  def showTopOrBottomDialogForTable(worksheetTableColumn: js.Object): Unit
  
  /**
    * Shows the top or bottom dialog for the specified relative column of the [filterSettings](ig.excel.worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
    *
    * @param relativeColumnIndex A zero based column index relative to the [region](ig.excel.worksheetFilterSettings#methods:region) of the active worksheet.
    */
  def showTopOrBottomDialogForWorksheet(relativeColumnIndex: Double): Unit
  
  /**
    * Notify the spreadsheet that style information used for rendering the spreadsheet may have been updated.
    */
  def styleUpdated(): Unit
}
object IgSpreadsheetMethods {
  
  inline def apply(
    changeGlobalLanguage: Callback,
    changeGlobalRegional: Callback,
    changeLocale: js.Object => Callback,
    destroy: Callback,
    executeAction: js.Object => Boolean,
    exportVisualData: Callback,
    flush: Callback,
    getActivePane: CallbackTo[js.Object],
    getActiveSelection: CallbackTo[js.Object],
    getActiveSelectionCellRangeFormat: CallbackTo[js.Object],
    getActiveTable: CallbackTo[js.Object],
    getCellEditMode: CallbackTo[js.Object],
    getIsInEditMode: CallbackTo[Boolean],
    getIsRenamingWorksheet: CallbackTo[Boolean],
    getPanes: Callback,
    showFilterDialogForTable: (js.Object, js.Object) => Callback,
    showFilterDialogForWorksheet: (Double, js.Object) => Callback,
    showTopOrBottomDialogForTable: js.Object => Callback,
    showTopOrBottomDialogForWorksheet: Double => Callback,
    styleUpdated: Callback
  ): IgSpreadsheetMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage.toJsFn, changeGlobalRegional = changeGlobalRegional.toJsFn, changeLocale = js.Any.fromFunction1((t0: js.Object) => changeLocale(t0).runNow()), destroy = destroy.toJsFn, executeAction = js.Any.fromFunction1(executeAction), exportVisualData = exportVisualData.toJsFn, flush = flush.toJsFn, getActivePane = getActivePane.toJsFn, getActiveSelection = getActiveSelection.toJsFn, getActiveSelectionCellRangeFormat = getActiveSelectionCellRangeFormat.toJsFn, getActiveTable = getActiveTable.toJsFn, getCellEditMode = getCellEditMode.toJsFn, getIsInEditMode = getIsInEditMode.toJsFn, getIsRenamingWorksheet = getIsRenamingWorksheet.toJsFn, getPanes = getPanes.toJsFn, showFilterDialogForTable = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (showFilterDialogForTable(t0, t1)).runNow()), showFilterDialogForWorksheet = js.Any.fromFunction2((t0: Double, t1: js.Object) => (showFilterDialogForWorksheet(t0, t1)).runNow()), showTopOrBottomDialogForTable = js.Any.fromFunction1((t0: js.Object) => showTopOrBottomDialogForTable(t0).runNow()), showTopOrBottomDialogForWorksheet = js.Any.fromFunction1((t0: Double) => showTopOrBottomDialogForWorksheet(t0).runNow()), styleUpdated = styleUpdated.toJsFn)
    __obj.asInstanceOf[IgSpreadsheetMethods]
  }
  
  extension [Self <: IgSpreadsheetMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: Callback): Self = StObject.set(x, "changeGlobalLanguage", value.toJsFn)
    
    inline def setChangeGlobalRegional(value: Callback): Self = StObject.set(x, "changeGlobalRegional", value.toJsFn)
    
    inline def setChangeLocale(value: js.Object => Callback): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExecuteAction(value: js.Object => Boolean): Self = StObject.set(x, "executeAction", js.Any.fromFunction1(value))
    
    inline def setExportVisualData(value: Callback): Self = StObject.set(x, "exportVisualData", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setGetActivePane(value: CallbackTo[js.Object]): Self = StObject.set(x, "getActivePane", value.toJsFn)
    
    inline def setGetActiveSelection(value: CallbackTo[js.Object]): Self = StObject.set(x, "getActiveSelection", value.toJsFn)
    
    inline def setGetActiveSelectionCellRangeFormat(value: CallbackTo[js.Object]): Self = StObject.set(x, "getActiveSelectionCellRangeFormat", value.toJsFn)
    
    inline def setGetActiveTable(value: CallbackTo[js.Object]): Self = StObject.set(x, "getActiveTable", value.toJsFn)
    
    inline def setGetCellEditMode(value: CallbackTo[js.Object]): Self = StObject.set(x, "getCellEditMode", value.toJsFn)
    
    inline def setGetIsInEditMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsInEditMode", value.toJsFn)
    
    inline def setGetIsRenamingWorksheet(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsRenamingWorksheet", value.toJsFn)
    
    inline def setGetPanes(value: Callback): Self = StObject.set(x, "getPanes", value.toJsFn)
    
    inline def setShowFilterDialogForTable(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "showFilterDialogForTable", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setShowFilterDialogForWorksheet(value: (Double, js.Object) => Callback): Self = StObject.set(x, "showFilterDialogForWorksheet", js.Any.fromFunction2((t0: Double, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setShowTopOrBottomDialogForTable(value: js.Object => Callback): Self = StObject.set(x, "showTopOrBottomDialogForTable", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setShowTopOrBottomDialogForWorksheet(value: Double => Callback): Self = StObject.set(x, "showTopOrBottomDialogForWorksheet", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStyleUpdated(value: Callback): Self = StObject.set(x, "styleUpdated", value.toJsFn)
  }
}
