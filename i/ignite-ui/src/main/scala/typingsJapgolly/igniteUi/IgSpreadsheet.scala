package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSpreadsheet
  extends /**
	 * Option for igSpreadsheet
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Invoked when an action is executed on the Spreadsheet.
  	 */
  var actionExecuted: js.UndefOr[ActionExecutedEvent] = js.undefined
  /**
  	 * Invoked when an action is about to be executed by the Spreadsheet.
  	 */
  var actionExecuting: js.UndefOr[ActionExecutingEvent] = js.undefined
  /**
  	 * Returns or sets the A1 format address of the current active cell within the selected worksheet.
  	 *
  	 */
  var activeCell: js.UndefOr[String] = js.undefined
  /**
  	 * Invoked when the activeCell of the Spreadsheet has changed.
  	 */
  var activeCellChanged: js.UndefOr[ActiveCellChangedEvent] = js.undefined
  /**
  	 * Invoked when the activePane of the Spreadsheet has changed.
  	 */
  var activePaneChanged: js.UndefOr[ActivePaneChangedEvent] = js.undefined
  /**
  	 * Invoked when the activeTable of the Spreadsheet has changed.
  	 */
  var activeTableChanged: js.UndefOr[ActiveTableChangedEvent] = js.undefined
  /**
  	 * Returns or sets the Worksheet from the workbook whose content should be displayed within the control.
  	 *
  	 */
  var activeWorksheet: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Invoked when the activeWorksheet of the Spreadsheet has changed.
  	 */
  var activeWorksheetChanged: js.UndefOr[ActiveWorksheetChangedEvent] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the spreadsheet allows adding worksheets.
  	 *
  	 */
  var allowAddWorksheet: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the spreadsheet allows deleting worksheets.
  	 *
  	 */
  var allowDeleteWorksheet: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the grid lines are displayed in the selected worksheets.
  	 *
  	 */
  var areGridlinesVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the row and column headers are displayed for the selected worksheets.
  	 *
  	 */
  var areHeadersVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets an object with brushes for areas of the spreadsheet. The property name should be an item in the [SpreadsheetResourceId enumeration](ig.spreadsheet.SpreadsheetResourceId) and the property value a string representing a brush. These brushes override any css styling for the associated object.
  	 *
  	 */
  var brushes: js.UndefOr[IgSpreadsheetBrushes] = js.undefined
  /**
  	 * Invoked when a contextmenu is being opened for the Spreadsheet.
  	 */
  var contextMenuOpening: js.UndefOr[ContextMenuOpeningEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet has started in-place editing of the activeCell.
  	 */
  var editModeEntered: js.UndefOr[EditModeEnteredEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet is about to start in-place editing of the activeCell.
  	 */
  var editModeEntering: js.UndefOr[EditModeEnteringEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet has ended the in-place editing of the activeCell.
  	 */
  var editModeExited: js.UndefOr[EditModeExitedEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet is about to end the in-place editing of the activeCell.
  	 */
  var editModeExiting: js.UndefOr[EditModeExitingEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet is exiting edit mode and the new value for the activeCell is not valid based on the criteria of that cell's ig.excel.DataValidationRule.
  	 * The EditModeValidationError is raised while exiting edit mode if the new value for the activeCell is not valid based on the criteria of that cell's ig.excel.DataValidationRule.
  	 * Since the rule needs to evaluate the value of the cell and potentially other cell's in the Worksheet, the value is first applied to the cell(s) and then is validated. By default if the event is not handled and the
  	 * showErrorMessageForInvalidValue is true, a message box will be displayed to the end user to determine what action to take. One can handle this event and specify the action that should
  	 * be taken using the action.Note: The validation rule will not be evaluated if edit mode is being cancelled such as when the user presses Escape to cancel edit.Note: The action will default to AcceptChange if the ShowErrorMessageForInvalidValue of the validationRule is false; otherwise it will default to ShowPrompt.Note: Like Microsoft Excel, only the validation rule of the active cell is considered even if the update is affecting other cells in the selection.
  	 */
  var editModeValidationError: js.UndefOr[EditModeValidationErrorEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet is performing an operation on a protected Worksheet and there is a single range that may be unlocked to allow the operation to be performed.
  	 */
  var editRangePasswordNeeded: js.UndefOr[EditRangePasswordNeededEvent] = js.undefined
  /**
  	 * Returns or sets an enumeration indicating the direction of the cell adjacent to the activeCell that should be activated when the enter key is pressed.
  	 * This property is only used if the isEnterKeyNavigationEnabled is set to true. Also, the reverse direction is
  	 * navigated when Shift + Enter are pressed.
  	 * down  The cell below should be activated.
  	 * right  The cell to the right should be activated
  	 * up  The cell above should be activated.
  	 * left  The cell to the left should be activated
  	 *
  	 */
  var enterKeyNavigationDirection: js.UndefOr[String] = js.undefined
  /**
  	 * Returns or sets the number of decimal places by which a whole number typed in during edit mode should be adjusted when isFixedDecimalEnabled is true
  	 *
  	 */
  var fixedDecimalPlaceCount: js.UndefOr[Double] = js.undefined
  /**
  	 * The height of the spreadsheet. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Invoked when a hyperlink is being followed in the Spreadsheet.
  	 */
  var hyperlinkExecuting: js.UndefOr[HyperlinkExecutingEvent] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the adjacent cell indicated by the enterKeyNavigationDirection should be navigated to when the enter key is pressed.
  	 *
  	 */
  var isEnterKeyNavigationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether a fixed decimal place is automatically added when a whole number is entered while in edit mode.
  	 *
  	 */
  var isFixedDecimalEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the formula bar is displayed within the Spreadsheet.
  	 *
  	 */
  var isFormulaBarVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the control is in "End mode".
  	 * End mode is a mode that affects certain keyboard navigation such as navigating with the arrow keys. For example when in
  	 * end mode and one presses the right arrow, the activeCell will be changed to be the first cell to the right of the current ActiveCell
  	 * that has a value (even if the value is ""). If there were no cells to the right with a value then it would activate the right most cell in that row. End
  	 * mode will end automatically such as when one presses an arrow key.
  	 *
  	 */
  var isInEndMode: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the scroll lock key is toggled.
  	 * This property is used when certain keys are pressed while the control has focus. For example
  	 * if an arrow key is pressed while the scroll lock is enabled the cell area will be scrolled rather than changing
  	 * the active cell. Note: This property is not maintained/changed by the control. It is just queried when
  	 * performing actions that consider whether the scroll lock is enabled.
  	 *
  	 */
  var isScrollLocked: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether undo is enabled for the control.
  	 *
  	 */
  var isUndoEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the width of the name box within the formula bar.
  	 *
  	 */
  var nameBoxWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Type="ig.excel.Worksheet[]" Returns or sets an array of the Worksheets whose tabs are selected.
  	 *
  	 */
  var selectedWorksheets: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Invoked when the selection for a ig.spreadsheet.SpreadsheetPane of the Spreadsheet is changed.
  	 */
  var selectionChanged: js.UndefOr[IgSpreadsheetSelectionChangedEvent] = js.undefined
  /**
  	 * Returns or sets a value indicating how the selection is updated when interacting with the cells via the mouse or keyboard.
  	 * normal  The selection is replaced when dragging the mouse to select a cell or range of cells. Similarly when navigating via the keyboard a new selection is created. One may add a new range by holding the Ctrl key and using the mouse and one may alter the selection range containing the active cell by holding the Shift key down while clicking with the mouse or navigating with the keyboard such as with the arrow keys.
  	 * extendSelection  The selection range in the cellRanges representing the active cell is updated as one uses the mouse to select a cell or navigating via the keyboard.
  	 * addToSelection  New cell ranges are added to the cellRanges without needing to hold down the ctrl key when dragging via the mouse and a range is added with the first arrow key navigation after entering the mode. One can enter the mode by pressing Shift+F8.
  	 *
  	 */
  var selectionMode: js.UndefOr[String] = js.undefined
  /**
  	 * Invoked when the user will be prompted with a message regarding an operation that is being performed.
  	 */
  var userPromptDisplaying: js.UndefOr[UserPromptDisplayingEvent] = js.undefined
  /**
  	 * Returns or sets the position of the screen tip used to display the input message for the data validation rule associated with the active cell.
  	 *
  	 * The provided object should have numeric properties called x and y.
  	 */
  var validationInputMessagePosition: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The width of the spreadsheet. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "number" The widget width can be set as a number
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Returns or sets the workbook whose information is displayed in the control.
  	 *
  	 */
  var workbook: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Invoked when a change has been made to the workbook that might require a save.
  	 * Note: This event is invoked asynchronously with regards to the change(s) that
  	 * have occurred. Also some changes alone are not considered to dirty the Workbook even though it
  	 * does change state on the Workbook or one of its subobjects. An example of that would be a zoom
  	 * type operation (e.g. changing the magnificationInNormalView).
  	 */
  var workbookDirtied: js.UndefOr[WorkbookDirtiedEvent] = js.undefined
  /**
  	 * Returns or sets the magnification of the selected worksheets.
  	 *
  	 */
  var zoomLevel: js.UndefOr[Double] = js.undefined
}

object IgSpreadsheet {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igSpreadsheet
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    actionExecuted: (/* event */ Event_, /* ui */ ActionExecutedEventUIParam) => Callback = null,
    actionExecuting: (/* event */ Event_, /* ui */ ActionExecutingEventUIParam) => Callback = null,
    activeCell: String = null,
    activeCellChanged: (/* event */ Event_, /* ui */ ActiveCellChangedEventUIParam) => Callback = null,
    activePaneChanged: (/* event */ Event_, /* ui */ ActivePaneChangedEventUIParam) => Callback = null,
    activeTableChanged: (/* event */ Event_, /* ui */ ActiveTableChangedEventUIParam) => Callback = null,
    activeWorksheet: js.Any = null,
    activeWorksheetChanged: (/* event */ Event_, /* ui */ ActiveWorksheetChangedEventUIParam) => Callback = null,
    allowAddWorksheet: js.UndefOr[Boolean] = js.undefined,
    allowDeleteWorksheet: js.UndefOr[Boolean] = js.undefined,
    areGridlinesVisible: js.UndefOr[Boolean] = js.undefined,
    areHeadersVisible: js.UndefOr[Boolean] = js.undefined,
    brushes: IgSpreadsheetBrushes = null,
    contextMenuOpening: (/* event */ Event_, /* ui */ ContextMenuOpeningEventUIParam) => Callback = null,
    editModeEntered: (/* event */ Event_, /* ui */ EditModeEnteredEventUIParam) => Callback = null,
    editModeEntering: (/* event */ Event_, /* ui */ EditModeEnteringEventUIParam) => Callback = null,
    editModeExited: (/* event */ Event_, /* ui */ EditModeExitedEventUIParam) => Callback = null,
    editModeExiting: (/* event */ Event_, /* ui */ EditModeExitingEventUIParam) => Callback = null,
    editModeValidationError: (/* event */ Event_, /* ui */ EditModeValidationErrorEventUIParam) => Callback = null,
    editRangePasswordNeeded: (/* event */ Event_, /* ui */ EditRangePasswordNeededEventUIParam) => Callback = null,
    enterKeyNavigationDirection: String = null,
    fixedDecimalPlaceCount: Int | Double = null,
    height: String | Double = null,
    hyperlinkExecuting: (/* event */ Event_, /* ui */ HyperlinkExecutingEventUIParam) => Callback = null,
    isEnterKeyNavigationEnabled: js.UndefOr[Boolean] = js.undefined,
    isFixedDecimalEnabled: js.UndefOr[Boolean] = js.undefined,
    isFormulaBarVisible: js.UndefOr[Boolean] = js.undefined,
    isInEndMode: js.UndefOr[Boolean] = js.undefined,
    isScrollLocked: js.UndefOr[Boolean] = js.undefined,
    isUndoEnabled: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    locale: js.Any = null,
    nameBoxWidth: Int | Double = null,
    regional: String | js.Object = null,
    selectedWorksheets: js.Any = null,
    selectionChanged: (/* event */ Event_, /* ui */ IgSpreadsheetSelectionChangedEventUIParam) => Callback = null,
    selectionMode: String = null,
    userPromptDisplaying: (/* event */ Event_, /* ui */ UserPromptDisplayingEventUIParam) => Callback = null,
    validationInputMessagePosition: js.Any = null,
    width: String | Double = null,
    workbook: js.Any = null,
    workbookDirtied: (/* event */ Event_, /* ui */ WorkbookDirtiedEventUIParam) => Callback = null,
    zoomLevel: Int | Double = null
  ): IgSpreadsheet = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actionExecuted != null) __obj.updateDynamic("actionExecuted")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActionExecutedEventUIParam) => actionExecuted(t0, t1).runNow()))
    if (actionExecuting != null) __obj.updateDynamic("actionExecuting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActionExecutingEventUIParam) => actionExecuting(t0, t1).runNow()))
    if (activeCell != null) __obj.updateDynamic("activeCell")(activeCell.asInstanceOf[js.Any])
    if (activeCellChanged != null) __obj.updateDynamic("activeCellChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActiveCellChangedEventUIParam) => activeCellChanged(t0, t1).runNow()))
    if (activePaneChanged != null) __obj.updateDynamic("activePaneChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActivePaneChangedEventUIParam) => activePaneChanged(t0, t1).runNow()))
    if (activeTableChanged != null) __obj.updateDynamic("activeTableChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActiveTableChangedEventUIParam) => activeTableChanged(t0, t1).runNow()))
    if (activeWorksheet != null) __obj.updateDynamic("activeWorksheet")(activeWorksheet.asInstanceOf[js.Any])
    if (activeWorksheetChanged != null) __obj.updateDynamic("activeWorksheetChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActiveWorksheetChangedEventUIParam) => activeWorksheetChanged(t0, t1).runNow()))
    if (!js.isUndefined(allowAddWorksheet)) __obj.updateDynamic("allowAddWorksheet")(allowAddWorksheet.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteWorksheet)) __obj.updateDynamic("allowDeleteWorksheet")(allowDeleteWorksheet.asInstanceOf[js.Any])
    if (!js.isUndefined(areGridlinesVisible)) __obj.updateDynamic("areGridlinesVisible")(areGridlinesVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(areHeadersVisible)) __obj.updateDynamic("areHeadersVisible")(areHeadersVisible.asInstanceOf[js.Any])
    if (brushes != null) __obj.updateDynamic("brushes")(brushes.asInstanceOf[js.Any])
    if (contextMenuOpening != null) __obj.updateDynamic("contextMenuOpening")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ContextMenuOpeningEventUIParam) => contextMenuOpening(t0, t1).runNow()))
    if (editModeEntered != null) __obj.updateDynamic("editModeEntered")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.EditModeEnteredEventUIParam) => editModeEntered(t0, t1).runNow()))
    if (editModeEntering != null) __obj.updateDynamic("editModeEntering")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.EditModeEnteringEventUIParam) => editModeEntering(t0, t1).runNow()))
    if (editModeExited != null) __obj.updateDynamic("editModeExited")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.EditModeExitedEventUIParam) => editModeExited(t0, t1).runNow()))
    if (editModeExiting != null) __obj.updateDynamic("editModeExiting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.EditModeExitingEventUIParam) => editModeExiting(t0, t1).runNow()))
    if (editModeValidationError != null) __obj.updateDynamic("editModeValidationError")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.EditModeValidationErrorEventUIParam) => editModeValidationError(t0, t1).runNow()))
    if (editRangePasswordNeeded != null) __obj.updateDynamic("editRangePasswordNeeded")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.EditRangePasswordNeededEventUIParam) => editRangePasswordNeeded(t0, t1).runNow()))
    if (enterKeyNavigationDirection != null) __obj.updateDynamic("enterKeyNavigationDirection")(enterKeyNavigationDirection.asInstanceOf[js.Any])
    if (fixedDecimalPlaceCount != null) __obj.updateDynamic("fixedDecimalPlaceCount")(fixedDecimalPlaceCount.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hyperlinkExecuting != null) __obj.updateDynamic("hyperlinkExecuting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.HyperlinkExecutingEventUIParam) => hyperlinkExecuting(t0, t1).runNow()))
    if (!js.isUndefined(isEnterKeyNavigationEnabled)) __obj.updateDynamic("isEnterKeyNavigationEnabled")(isEnterKeyNavigationEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isFixedDecimalEnabled)) __obj.updateDynamic("isFixedDecimalEnabled")(isFixedDecimalEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isFormulaBarVisible)) __obj.updateDynamic("isFormulaBarVisible")(isFormulaBarVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isInEndMode)) __obj.updateDynamic("isInEndMode")(isInEndMode.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrollLocked)) __obj.updateDynamic("isScrollLocked")(isScrollLocked.asInstanceOf[js.Any])
    if (!js.isUndefined(isUndoEnabled)) __obj.updateDynamic("isUndoEnabled")(isUndoEnabled.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (nameBoxWidth != null) __obj.updateDynamic("nameBoxWidth")(nameBoxWidth.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (selectedWorksheets != null) __obj.updateDynamic("selectedWorksheets")(selectedWorksheets.asInstanceOf[js.Any])
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.IgSpreadsheetSelectionChangedEventUIParam) => selectionChanged(t0, t1).runNow()))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (userPromptDisplaying != null) __obj.updateDynamic("userPromptDisplaying")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.UserPromptDisplayingEventUIParam) => userPromptDisplaying(t0, t1).runNow()))
    if (validationInputMessagePosition != null) __obj.updateDynamic("validationInputMessagePosition")(validationInputMessagePosition.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (workbook != null) __obj.updateDynamic("workbook")(workbook.asInstanceOf[js.Any])
    if (workbookDirtied != null) __obj.updateDynamic("workbookDirtied")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.WorkbookDirtiedEventUIParam) => workbookDirtied(t0, t1).runNow()))
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSpreadsheet]
  }
}

