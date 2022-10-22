package typingsJapgolly.jqueryHandsontable

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.jqueryHandsontable.jqueryHandsontableStrings.insert_col
import typingsJapgolly.jqueryHandsontable.jqueryHandsontableStrings.insert_row
import typingsJapgolly.jqueryHandsontable.jqueryHandsontableStrings.remove_col
import typingsJapgolly.jqueryHandsontable.jqueryHandsontableStrings.remove_row
import typingsJapgolly.std.HTMLTableDataCellElement
import typingsJapgolly.std.HTMLTableHeaderCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handsontable {
  
  trait CellPosition extends StObject {
    
    var col: Double
    
    var row: Double
  }
  object CellPosition {
    
    inline def apply(col: Double, row: Double): CellPosition = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellPosition]
    }
    
    extension [Self <: CellPosition](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    def alter(`type`: String, index: Double): Unit = js.native
    def alter(`type`: String, index: Double, amount: Double): Unit = js.native
    def alter(`type`: String, index: Double, amount: Double, source: String): Unit = js.native
    def alter(`type`: String, index: Double, amount: Unit, source: String): Unit = js.native
    /**
      * Insert new column(s) before the column at given index. If index is null or undefined, the new column will be added after the current last column. Default amount equals 1.
      */
    @JSName("alter")
    def alter_insertcol(`type`: insert_col, index: Double): Unit = js.native
    @JSName("alter")
    def alter_insertcol(`type`: insert_col, index: Double, amount: Double): Unit = js.native
    @JSName("alter")
    def alter_insertcol(`type`: insert_col, index: Double, amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_insertcol(`type`: insert_col, index: Double, amount: Unit, source: String): Unit = js.native
    /**
      * Insert new row(s) above the row at given index. If index is null or undefined, the new row will be added after the current last row. Default amount equals 1.
      */
    @JSName("alter")
    def alter_insertrow(`type`: insert_row, index: Double): Unit = js.native
    @JSName("alter")
    def alter_insertrow(`type`: insert_row, index: Double, amount: Double): Unit = js.native
    @JSName("alter")
    def alter_insertrow(`type`: insert_row, index: Double, amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_insertrow(`type`: insert_row, index: Double, amount: Unit, source: String): Unit = js.native
    /**
      * Remove the column(s) at given index. Default amount equals 1.
      */
    @JSName("alter")
    def alter_removecol(`type`: remove_col, index: Double): Unit = js.native
    @JSName("alter")
    def alter_removecol(`type`: remove_col, index: Double, amount: Double): Unit = js.native
    @JSName("alter")
    def alter_removecol(`type`: remove_col, index: Double, amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_removecol(`type`: remove_col, index: Double, amount: Unit, source: String): Unit = js.native
    /**
      * Remove the row(s) at given index. Default amount equals 1.
      */
    @JSName("alter")
    def alter_removerow(`type`: remove_row, index: Double): Unit = js.native
    @JSName("alter")
    def alter_removerow(`type`: remove_row, index: Double, amount: Double): Unit = js.native
    @JSName("alter")
    def alter_removerow(`type`: remove_row, index: Double, amount: Double, source: String): Unit = js.native
    @JSName("alter")
    def alter_removerow(`type`: remove_row, index: Double, amount: Unit, source: String): Unit = js.native
    
    /**
      * Clears grid.
      */
    def clear(): Unit = js.native
    
    /**
      * Clear undo history.
      */
    def clearUndo(): Unit = js.native
    
    /**
      * Returns index of first visible column.
      */
    def colOffset(): Double = js.native
    
    /**
      * Returns property name that corresponds with the given column index.
      */
    def colToProp(column: Double): String = js.native
    
    /**
      * Returns total number of columns in the grid.
      */
    def countCols(): Double = js.native
    
    /**
      * Returns number of empty columns.If the optional ending parameter is true, returns number of empty columns at right hand edge of the table.
      */
    def countEmptyCols(): Double = js.native
    def countEmptyCols(ending: Boolean): Double = js.native
    
    /**
      * Returns number of empty rows. If the optional ending parameter is true, returns number of empty rows at the bottom of the table.
      */
    def countEmptyRows(): Double = js.native
    def countEmptyRows(ending: Boolean): Double = js.native
    
    /**
      * Returns total number of rows in the grid.
      */
    def countRows(): Double = js.native
    
    /**
      * Returns number of visible columns.
      */
    def countVisibleCols(): Double = js.native
    
    /**
      * Returns number of visible rows.
      */
    def countVisibleRows(): Double = js.native
    
    /**
      * Deselect current selection.
      */
    def deselectCell(): Unit = js.native
    
    /**
      * Remove grid from DOM.
      */
    def destroy(): Unit = js.native
    
    /**
      * Destroys current editor, renders and selects current cell. If revertOriginal == false, edited data is saved. Otherwise previous value is restored.
      */
    def destroyEditor(): Unit = js.native
    def destroyEditor(revertOriginal: Boolean): Unit = js.native
    
    /**
      * Returns TD element for given row, col if it is rendered on screen.
      * Returns null if the TD is not rendered on screen (probably because that part of table is not visible).
      */
    def getCell(row: Double, col: Double): Any = js.native
    
    /**
      * Return cell properties for given row, col coordinates.
      */
    def getCellMeta(row: Double, col: Double): Any = js.native
    
    /**
      * Returns rederer type/
      */
    def getCellRenderer(row: Double, col: Double): String = js.native
    
    /**
      * Returns array of col headers (if they are enabled). If param col given, return header at given col as string.
      */
    def getColHeader(col: Double): Any = js.native
    
    /**
      * Return column width.
      */
    def getColWidth(col: Double): Double = js.native
    
    /**
      * Get value of selected range. Each column is separated by tab, each row is separated by new line character.
      */
    def getCopyableData(startRow: Double, startCol: Double, endRow: Double, endCol: Double): Any = js.native
    
    /**
      * Return the current data object (the same that was passed by data configuration option or loadData method). Optionally you can provide cell range row, col, row2, col2 to get only a fragment of grid data
      */
    def getData(): Any = js.native
    /**
      * Return the current data object (the same that was passed by data configuration option or loadData method). Optionally you can provide cell range row, col, row2, col2 to get only a fragment of grid data
      */
    def getData(row: Double, col: Double, row2: Double, col2: Double): Any = js.native
    
    /**
      * Return cell value at row, col. row and col are the visible indexes (note that if columns were reordered or sorted, the current order will be used).
      */
    def getDataAtCell(row: Double, col: Double): Any = js.native
    
    /**
      * Returns array of column values from the data source. col is the visible index of the column.
      */
    def getDataAtCol(col: Double): js.Array[Any] = js.native
    
    /**
      * Given the object property name (e.g. 'first.name'), returns array of column values from the data source.
      */
    def getDataAtProp(prop: String): js.Array[Any] = js.native
    
    /**
      * Returns a single row of the data (array or object, depending on what you have). row is the visible index of the row
      */
    def getDataAtRow(row: Double): Any = js.native
    
    /**
      * Same as getDataAtCell, except instead of col, you provide name of the object property (e.g. 'first.name').
      */
    def getDataAtRowProp(row: Double, prop: String): Any = js.native
    
    /**
      * Returns array of row headers (if they are enabled). If param row given, return header at given row as string.
      */
    def getRowHeader(row: Double): Any = js.native
    
    /**
      * Return row height.
      */
    def getRowHeight(row: Double): Double = js.native
    
    /**
      * Return index of the currently selected cells as an array [startRow, startCol, endRow, endCol]. Start row and start col are the coordinates of the active cell (where the selection was started).
      */
    def getSelected(): js.Array[Double] = js.native
    
    /**
      * Returns current selection as a WalkontableCellRange object. Returns undefined if there is no selection.
      */
    def getSelectedRange(): Unit = js.native
    
    /**
      * Returns an object containing the current grid settings.
      */
    def getSettings(): Options = js.native
    
    /**
      * Returns array of column values from the data source. col is the index of the row in the data source.
      */
    def getSourceDataAtCol(col: Double): js.Array[Any] = js.native
    
    /**
      * Returns a single row of the data (array or object, depending on what you have). row is the index of the row in the data source.
      */
    def getSourceDataAtRow(row: Double): Any = js.native
    
    /**
      * Returns value of selected cell.
      */
    def getValue(): Any = js.native
    
    /**
      * Returns information of this table is configured to display column headers.
      */
    def hasColHeaders(): Boolean = js.native
    
    /**
      * Returns information of this table is configured to display row headers.
      */
    def hasRowHeaders(): Boolean = js.native
    
    /**
      * Returns true if the column at the given index is empty, false otherwise.
      */
    def isEmptyCol(col: Double): Boolean = js.native
    
    /**
      * Returns true if the row at the given index is empty, false otherwise.
      */
    def isEmptyRow(row: Double): Boolean = js.native
    
    /**
      * Returns true if current Handsontable instance is listening to keyboard input on document body.
      */
    def isListening(): Boolean = js.native
    
    /**
      * Return true if redo can be performed, false otherwise.
      */
    def isRedoAvailable(): Boolean = js.native
    
    /**
      * Return true if undo can be performed, false otherwise.
      */
    def isUndoAvailable(): Boolean = js.native
    
    /**
      * Listen to keyboard input on document body.
      */
    def listen(): Unit = js.native
    
    /**
      * Reset all cells in the grid to contain data from the data array.
      */
    def loadData(data: js.Array[Any]): Unit = js.native
    
    /**
      * Populate cells at position with 2D input array (e.g. [ [1, 2], [3, 4] ]).
      * Use endRow, endCol when you want to cut input when certain row is reached.
      * @param source (default value "populateFromArray") is used to identify this call in the resulting events (beforeChange, afterChange).
      * @param populateMethod (default value "overwrite", possible values "shift_down" and "shift_right") has the same effect as pasteMethod option (see Options page).
      */
    def populateFromArray(row: Double, col: Double, input: js.Array[Any], endRow: Double, endCol: Double): Unit = js.native
    def populateFromArray(row: Double, col: Double, input: js.Array[Any], endRow: Double, endCol: Double, source: String): Unit = js.native
    def populateFromArray(
      row: Double,
      col: Double,
      input: js.Array[Any],
      endRow: Double,
      endCol: Double,
      source: String,
      populateMethod: String
    ): Unit = js.native
    def populateFromArray(
      row: Double,
      col: Double,
      input: js.Array[Any],
      endRow: Double,
      endCol: Double,
      source: Unit,
      populateMethod: String
    ): Unit = js.native
    
    /**
      * Returns column index that corresponds with the given property.
      */
    def propToCol(property: String): Double = js.native
    
    /**
      * Redo edit (used to reverse an undo).
      */
    def redo(): Unit = js.native
    
    /**
      * Rerender the table.
      */
    def render(): Unit = js.native
    
    /**
      * Returns index of first visible row.
      */
    def rowOffset(): Double = js.native
    
    /**
      * Select cell row, col or range finishing at row2, col2. By default, viewport will be scrolled to selection.
      */
    def selectCell(row: Double, col: Double, row2: Double, col2: Double): Unit = js.native
    def selectCell(row: Double, col: Double, row2: Double, col2: Double, scrollToSelection: Boolean): Unit = js.native
    
    /**
      * Sets cell meta data object key corresponding to params row, col.
      */
    def setCellMeta(row: Double, col: Double, key: String, `val`: String): Unit = js.native
    
    /**
      * Set new value to a cell. To change many cells at once, pass an array of changes in format [ [row, col, value], ... ] as the only parameter. col is the index of visible column (note that if columns were reordered, the current order will be used). source is a flag for before/afterChange events. If you pass only array of changes then source could be set as second parameter.
      */
    def setDataAtCell(changes: js.Array[Any]): Unit = js.native
    def setDataAtCell(changes: js.Array[Any], source: String): Unit = js.native
    /**
      * Set new value to a cell. To change many cells at once, pass an array of changes in format [ [row, col, value], ... ] as the only parameter. col is the index of visible column (note that if columns were reordered, the current order will be used). source is a flag for before/afterChange events. If you pass only array of changes then source could be set as second parameter.
      */
    def setDataAtCell(row: Double, col: Double, value: Any): Unit = js.native
    def setDataAtCell(row: Double, col: Double, value: Any, source: String): Unit = js.native
    
    /**
      * Same as above, except instead of col, you provide name of the object property (e.g. [0, 'first.name', 'Jennifer']).
      */
    def setDataAtRowProp(changes: js.Array[Any]): Unit = js.native
    def setDataAtRowProp(changes: js.Array[Any], source: String): Unit = js.native
    /**
      * Same as above, except instead of col, you provide name of the object property (e.g. [0, 'first.name', 'Jennifer']).
      */
    def setDataAtRowProp(row: Double, prop: String, value: Any): Unit = js.native
    def setDataAtRowProp(row: Double, prop: String, value: Any, source: String): Unit = js.native
    
    /**
      * Sorts table content by cell values in given column, using order. column is a zero-based column index. Order of sorting can be either ascending (order = true) or descending (order = false).
      * Note I: This method is only available when coulmnSorting plugin is enabled. See column sorting demo for details.
      * Note II: Running this method will not alter the table data. Sorting takes place only in view layer.
      */
    def sort(column: Double, order: Boolean): Unit = js.native
    
    /**
      * Adds/removes data from the column. This function works is modelled after Array.splice. Parameter col is the index of column in which do you want to do splice. Parameter index is the row index at which to start changing the array. If negative, will begin that many elements from the end. Parameter amount, is the number of old array elements to remove. If the amount is 0, no elements are removed. Fourth and further parameters are the elements to add to the array. If you don't specify any elements, spliceCol simply removes elements from the array.
      */
    def spliceCol(col: Double, index: Double, amount: Double, elements: Any*): Unit = js.native
    
    /**
      * Adds/removes data from the row. This function works is modelled after Array.splice. Parameter row is the index of row in which do you want to do splice. Parameter index is the column index at which to start changing the array. If negative, will begin that many elements from the end. Parameter amount, is the number of old array elements to remove. If the amount is 0, no elements are removed. Fourth and further parameters are the elements to add to the array. If you don't specify any elements, spliceCol simply removes elements from the array.
      */
    def spliceRow(row: Double, index: Double, amount: Double, elements: Any*): Unit = js.native
    
    /**
      * Undo last edit.
      */
    def undo(): Unit = js.native
    
    /**
      * Stop listening to keyboard input on document body.
      */
    def unlisten(): Unit = js.native
    
    /**
      * Use it if you need to change configuration after initialization.
      */
    def updateSettings(options: Options): Unit = js.native
    
    /**
      * Validates all cells using their validator functions and calls callback when finished. Does not render the view.
      */
    def validateCells(callback: js.Function): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Callback fired after reset cell's meta.
      */
    var afterCellMetaReset: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired after one or more cells is changed. Its main use case is to save the input. Parameters:
      *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
      *   - source is one of the strings: "alter", "empty", "edit", "populateFromArray", "loadData", "autofill", "paste".
      * Note: for performance reasons, the changes array is null for "loadData" source.
      */
    var afterChange: js.UndefOr[js.Function2[/* changes */ js.Array[Any], /* source */ String, Unit]] = js.undefined
    
    /**
      * Callback is fired after changing column placement.
      */
    var afterColumnMove: js.UndefOr[js.Function2[/* oldIndex */ Double, /* newIndex */ Double, Unit]] = js.undefined
    
    /**
      * Callback is fired after changing column size.
      */
    var afterColumnResize: js.UndefOr[js.Function2[/* col */ Double, /* size */ Double, Unit]] = js.undefined
    
    /**
      * Callback fired after sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
      */
    var afterColumnSort: js.UndefOr[js.Function2[/* column */ Double, /* order */ Boolean, Unit]] = js.undefined
    
    /**
      * Callback fired if copyRowsLimit or copyColumnsLimit was reached.
      */
    var afterCopyLimit: js.UndefOr[
        js.Function4[
          /* selectedRowsCount */ Double, 
          /* selectedColsCount */ Double, 
          /* copyRowsLimit */ Double, 
          /* copyColsLimit */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback is fired when a new column is created. Parameters:
      *   - index represents the index of first newly created column in the data source array.
      *   - amount number of newly created columns in the data source array.
      */
    var afterCreateCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
    
    /**
      * Callback is fired when a new row is created. Parameters:
      *   - index represents the index of first newly created row in the data source array.
      *   - amount number of newly created rows in the data source array.
      */
    var afterCreateRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
    
    /**
      * Event called when current cell is deselected.
      */
    var afterDeselect: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired after destroing Handsontable instance.
      */
    var afterDestroy: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired after getting cell settings.
      */
    var afterGetCellMeta: js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ js.Object, Unit]
      ] = js.undefined
    
    /**
      * Callback fired after getting info about column header.
      */
    var afterGetColHeader: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.undefined
    
    /**
      * Callback fired after calculating column width.
      */
    var afterGetColWidth: js.UndefOr[js.Function2[/* col */ Double, /* response */ js.Object, Unit]] = js.undefined
    
    /**
      * Callback fired after Handsontable instance is initiated.
      */
    var afterInit: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired after new data is loaded (by loadData method) into the data source array.
      */
    var afterLoadData: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired after.
      */
    var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    /**
      * Callback fired after clicking on a cell or row/column header.
      * In case the row/column header was clicked, the index is negative. For example clicking on the row header of cell (0, 0) results with afterOnCellMouseDown called with coords {row: 0, col: -1}.
      */
    var afterOnCellMouseDown: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ CellPosition, 
          /* TD */ HTMLTableDataCellElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback fired after hovering a cell or row/column header with the mouse cursor.
      * In case the row/column header was hovered, the index is negative. For example clicking on the row header of cell (0, 0) results with afterOnCellMouseOver called with coords {row: 0, col: -1}.
      */
    var afterOnCellMouseOver: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ CellPosition, 
          /* TD */ HTMLTableDataCellElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback is fired when one or more columns are removed. Parameters:
      *   - index is an index of starter column.
      *   - amount is an anount of removed columns.
      */
    var afterRemoveCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
    
    /**
      * Callback is fired when one or more rows are removed. Parameters:
      *   - index is an index of starter row.
      *   - amount is an anount of removed rows.
      */
    var afterRemoveRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
    
    /**
      * Callback fired after Handsontable table is rendered. Parameters:
      *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
      */
    var afterRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.undefined
    
    var afterRenderer: js.UndefOr[
        js.Function6[
          /* TD */ HTMLTableDataCellElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String, 
          /* value */ String, 
          /* cellProperties */ js.Object, 
          Unit
        ]
      ] = js.undefined
    
    var afterScrollHorizontally: js.UndefOr[js.Function] = js.undefined
    
    var afterScrollVertically: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired while one or more cells are being selected (on mouse move). Parameters:
      *   - r selection start row
      *   - c selection start column
      *   - r2 selection end row
      *   - c2 selection end column
      */
    var afterSelection: js.UndefOr[
        js.Function4[/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double, Unit]
      ] = js.undefined
    
    /**
      * The same as above, but data source object property name is used instead of the column number.
      */
    var afterSelectionByProp: js.UndefOr[
        js.Function4[/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String, Unit]
      ] = js.undefined
    
    /**
      * Callback fired while one or more cells are being selected (on mouse up). Parameters:
      *   - r selection start row
      *   - c selection start column
      *   - r2 selection end row
      *   - c2 selection end column
      */
    var afterSelectionEnd: js.UndefOr[
        js.Function4[/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double, Unit]
      ] = js.undefined
    
    /**
      * The same as above, but data source object property name is used instead of the column number.
      */
    var afterSelectionEndByProp: js.UndefOr[
        js.Function4[/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String, Unit]
      ] = js.undefined
    
    var afterSetCellMeta: js.UndefOr[js.Function] = js.undefined
    
    var afterUpdateSettings: js.UndefOr[js.Function] = js.undefined
    
    /**
      * A plugin hook executed after validator function, only if validator function is defined. Validation result is the first parameter. This can be used to determinate if validation passed successfully or not. You can cancel current change by returning false.
      */
    var afterValidate: js.UndefOr[
        js.Function5[
          /* isValid */ Boolean, 
          /* value */ Any, 
          /* row */ Double, 
          /* prop */ String, 
          /* source */ String, 
          Boolean
        ]
      ] = js.undefined
    
    /**
      * Setting to true enables the autoColumnSize plugin, which makes sure each column gets enough space to show its content.
      */
    var autoColumnSize: js.UndefOr[Boolean | js.Object] = js.undefined
    
    /**
      * Autocomplete definitions.
      * @see demo/autocomplete.html for examples and definitions.
      */
    var autoComplete: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * If true, pressing ENTER or down arrow in the last row will move to first row in next column.
      */
    var autoWrapCol: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, pressing TAB or right arrow in the last column will move to first column in next row.
      */
    var autoWrapRow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Parameters:
      *   - start is an object containing information about first filled cell: { row : 2, col : 0 }.
      *   - end is an object containing information about last filled cell: { row : 4, col : 1 }.
      *   - data is an 2D array containing information about fill pattern: [ ["1", "Ted"], ["1", "John"] ].
      */
    var beforeAutofill: js.UndefOr[
        js.Function3[
          /* start */ CellPosition, 
          /* end */ CellPosition, 
          /* data */ js.Array[js.Array[String]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback fired before one or more cells is changed. Its main purpose is to alter changes silently before input. Parameters:
      *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
      *     - To disregard a single change, set changes[i] to null or remove it from array using changes.splice(i, 1).
      *     - To alter a single change, overwrite the desired value to changes[i][3].
      *     - To cancel all edit, return false from the callback or set array length to 0 (changes.length = 0).
      *   - source is the name of a source of changes.
      */
    var beforeChange: js.UndefOr[js.Function2[/* changes */ js.Array[js.Array[Any]], /* source */ String, Unit]] = js.undefined
    
    var beforeChangeRender: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired before sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
      */
    var beforeColumnSort: js.UndefOr[js.Function2[/* column */ Double, /* order */ Boolean, Unit]] = js.undefined
    
    /**
      * Callback fired before getting cell settings.
      */
    var beforeGetCellMeta: js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ js.Object, Unit]
      ] = js.undefined
    
    /**
      * Callback fired before Handsontable instance is initiated.
      * Note: this can be set only by global PluginHooks instance.
      */
    var beforeInit: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired before Walkontable instance is initiated.
      */
    var beforeInitWalkontable: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired before keydown event is handled. It can be used to overwrite default key bindings. Caution - in your beforeKeyDown handler you need to call event.stopImmediatePropagation() to prevent default key behavior.
      */
    var beforeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
    
    /**
      * Callback is fired when one or more columns are about to be removed. Parameters:
      *   - index is an index of starter column.
      *   - amount is an anount of columns to be removed.
      */
    var beforeRemoveCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
    
    /**
      * Callback is fired when one or more rows are about to be removed. Parameters:
      *   - index is an index of starter row.
      *   - amount is an anount of rows to be removed.
      */
    var beforeRemoveRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
    
    /**
      * Callback fired before Handsontable table is rendered. Parameters:
      *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
      */
    var beforeRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.undefined
    
    /**
      * Callback fired before setting single value from the data source array.
      */
    var beforeSet: js.UndefOr[js.Function1[/* v */ js.Object, Unit]] = js.undefined
    
    /**
      * Callback fired before setting range is ended. Parameters:
      *   - coords is WalkontableCellCoords array
      */
    var beforeSetRangeEnd: js.UndefOr[js.Function1[/* coords */ js.Array[Any], Unit]] = js.undefined
    
    /**
      * A plugin hook executed before validator function, only if validator function is defined. This can be used to manipulate value of changed cell before it is applied to the validator function. NOTICE: this will not affect values of changes. This will change value ONLY for validation!
      */
    var beforeValidate: js.UndefOr[
        js.Function4[/* value */ Any, /* row */ Double, /* prop */ String, /* source */ String, Unit]
      ] = js.undefined
    
    /**
      * Defines the cell properties for given row, col, prop coordinates.
      * See Cells section below for more detailed explanation.
      */
    var cells: js.UndefOr[js.Function3[/* row */ Double, /* col */ Double, /* prop */ String, Unit]] = js.undefined
    
    /**
      * Setting true or false will enable or disable the default column headers (A, B, C). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the column is passed as a parameter.
      */
    var colHeaders: js.UndefOr[Any] = js.undefined
    
    /**
      * Defines column widths in pixels. Accepts number, string (that will be converted to number), array of numbers (if you want to define column width separately for each column) or a function (if you want to set column width dynamically on each render).
      */
    var colWidths: js.UndefOr[Any] = js.undefined
    
    /**
      * Turn on Column sorting.
      */
    var columnSorting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the cell properties and data binding for certain columns. Notice: Using this option sets a fixed number of columns (options startCols, minCols, maxCols will be ignored).
      * @see https://github.com/handsontable/jquery-handsontable/wiki/Options below for more detailed explanation.
      * @see http://handsontable.com/demo/datasources.html for examples
      */
    var columns: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Defines if the right-click context menu should be enabled. Context menu allows to create new row or column at any place in the grid.
      * Possible values: true (to enable basic options), false (to disable completely) or array of any available strings: ["row_above", "row_below", "col_left", "col_right", "remove_row", "remove_col", "undo", "redo", "sep1", "sep2", "sep3"].
      * @see http://handsontable.com/demo/contextmenu.html for examples.
      */
    var contextMenu: js.UndefOr[Any] = js.undefined
    
    /**
      * Maximum number of columns than can be copied to clipboard using CTRL+C.
      */
    var copyColsLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Setting to true enables the copyPaste plugin, which enables the copying and pasting to the clipboard.
      */
    var copyPaste: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of rows than can be copied to clipboard using CTRL+C.
      */
    var copyRowsLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Class name for all visible columns in current selection.
      */
    var currentColClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Class name for all visible rows in current selection.
      */
    var currentRowClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Initial data source that will be bound to the data grid by reference (editing data grid alters the data source. See Understanding binding as reference.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * Defines the structure of a new row when data source is an object.
      * @see http://handsontable.com/demo/datasources.html for examples.
      */
    var dataSchema: js.UndefOr[Any] = js.undefined
    
    /**
      * Setting to true enables the debug mode, currently used to test the correctness of the row and column header fixed positioning on a layer above the master table.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, ENTER begins editing mode (like Google Docs). If false, ENTER moves to next row (like Excel) and adds new row if necessary. TAB adds new column if necessary.
      */
    var enterBeginsEditing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines cursor move after ENTER is pressed (SHIFT+ENTER uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a ENTER key has been pressed. This event object can be used to check whether user pressed ENTER or SHIFT + ENTER.
      */
    var enterMoves: js.UndefOr[Any] = js.undefined
    
    /**
      * Enables the fill handle (drag-down and copy-down) functionality, which shows the small rectangle in bottom right corner of the selected area, that let's you expand values to the adjacent cells.
      * Possible values: true (to enable in all directions), "vertical" or "horizontal" (to enable in one direction), false (to disable completely). Setting to true enables the fillHandle plugin, which,
      */
    var fillHandle: js.UndefOr[Any] = js.undefined
    
    /**
      * Allows to specify the number of columns fixed (aka freezed) on the left side of the table.
      */
    var fixedColumnsLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Allows to specify the number of rows fixed (aka freezed) on the top of the table.
      */
    var fixedRowsTop: js.UndefOr[Double] = js.undefined
    
    /**
      * Setting to true enables selecting just a fragment of the text within a single cell or between adjacent cells.
      */
    var fragmentSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Height of the grid. Can be a number or a function that returns a number.
      */
    var height: js.UndefOr[Any] = js.undefined
    
    /**
      * CSS class name for cells that did not pass validation.
      */
    var invalidCellClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Lets you overwrite the default isEmptyCol method.
      */
    var isEmptyCol: js.UndefOr[js.Function1[/* col */ Double, Boolean]] = js.undefined
    
    /**
      * Lets you overwrite the default isEmptyRow method.
      */
    var isEmptyRow: js.UndefOr[js.Function1[/* row */ Double, Boolean]] = js.undefined
    
    /**
      * Turn on Manual column move, if set to a boolean or define initial column order, if set to an array of column indexes.
      */
    var manualColumnMove: js.UndefOr[Any] = js.undefined
    
    /**
      * Turn on Manual column resize, if set to a boolean or define initial column resized widths, if set to an array of numbers.
      */
    var manualColumnResize: js.UndefOr[Any] = js.undefined
    
    /**
      * Turns on Manual row move, if set to a boolean or define initial row order, if set to an array of row indexes.
      */
    var manualRowMove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting to true enables the manualRowResize plugin, which allows to resize the row height with your mouse.
      */
    var manualRowResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of columns.
      */
    var maxCols: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of rows.
      */
    var maxRows: js.UndefOr[Double] = js.undefined
    
    /**
      * Setting to true or array enables the mergeCells plugin, which enables the merging of the cells. (see demo). You can provide the merged cells on the pageload if you feed the mergeCells option with an array.
      */
    var mergeCells: js.UndefOr[Any] = js.undefined
    
    /**
      * Minimum number of columns. At least that many of columns will be created during initialization.
      */
    var minCols: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum number of rows. At least that many of rows will be created during initialization.
      */
    var minRows: js.UndefOr[Double] = js.undefined
    
    /**
      * When set to 1 (or more), Handsontable will add a new column at the end of grid if there are no more empty columns.
      */
    var minSpareCols: js.UndefOr[Double] = js.undefined
    
    /**
      * When set to 1 (or more), Handsontable will add a new row at the end of grid if there are no more empty rows.
      */
    var minSpareRows: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback fired after column modify.
      */
    var modifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.undefined
    
    /**
      * Callback fired after modify column's width.
      */
    var modifyColWidth: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]] = js.undefined
    
    /**
      * Callback fired after row modify.
      */
    var modifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    /**
      * Callback fired after modify hight of row.
      */
    var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.undefined
    
    /**
      * If true, selection of multiple cells using keyboard or mouse is allowed.
      */
    var multiSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name cells configured with wordWrap: false.
      */
    var noWordWrapClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Setting to true enables the observeChanges plugin, which automatically renders the table when a change in the data source is observed.
      */
    var observeChanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to true, the table is rerendered when it is detected that it was made visible in DOM.
      */
    var observeDOMVisibility: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Deprecated! Now event is called beforeChange.
      */
    var onBeforeChange: js.UndefOr[js.Function2[/* changes */ js.Array[Any], /* source */ String, Unit]] = js.undefined
    
    /**
      * Deprecated! Now event is called afterChange.
      */
    var onChange: js.UndefOr[js.Function2[/* changes */ js.Array[Any], /* source */ String, Unit]] = js.undefined
    
    /**
      * Deprecated! Now event is called afterCopyLimit.
      */
    var onCopyLimit: js.UndefOr[
        js.Function4[
          /* selectedRowsCount */ Double, 
          /* selectedColsCount */ Double, 
          /* copyRowsLimit */ Double, 
          /* copyColsLimit */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Deprecated! Now event is called afterSelection.
      */
    var onSelection: js.UndefOr[
        js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
      ] = js.undefined
    
    /**
      * Deprecated! Now event is called afterSelectionByProp.
      */
    var onSelectionByProp: js.UndefOr[
        js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
      ] = js.undefined
    
    /**
      * Deprecated! Now event is called afterSelectionEnd.
      */
    var onSelectionEnd: js.UndefOr[
        js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
      ] = js.undefined
    
    /**
      * Deprecated! Now event is called afterSelectionEndByProp.
      */
    var onSelectionEndByProp: js.UndefOr[
        js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
      ] = js.undefined
    
    /**
      * If true, mouse click outside the grid will deselect the current selection.
      */
    var outsideClickDeselects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines paste (CTRL+V) behavior. Default value "overwrite" will paste clipboard value over current selection.
      * When set to "shift_down", clipboard data will be pasted in place of current selection, while all selected cells are moved down.
      * When set to "shift_right", clipboard data will be pasted in place of current selection, while all selected cells are moved right.
      */
    var pasteMode: js.UndefOr[String] = js.undefined
    
    /**
      * Turn on saving the state of column sorting, columns positions and columns sizes in local storage. For more information see How to save data localy.
      */
    var persistentState: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to an non-empty string, displayed as the cell content for empty cells.
      */
    var placeholder: js.UndefOr[Any] = js.undefined
    
    /**
      * CSS class name for cells that have a placeholder in use.
      */
    var placeholderCellClassName: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name for read-only cells.
      */
    var readOnlyCellClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Setting true or false will enable or disable the default row headers (1, 2, 3). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the rowis passed as a parameter.
      */
    var rowHeaders: js.UndefOr[Any] = js.undefined
    
    /**
      * Setting to true enables the search plugin (see demo).
      */
    var search: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
      */
    var startCols: js.UndefOr[Double] = js.undefined
    
    /**
      * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
      */
    var startRows: js.UndefOr[Double] = js.undefined
    
    /**
      * Column stretching mode. Possible values: "none", "last", "all".
      */
    var stretchH: js.UndefOr[String] = js.undefined
    
    /**
      * Defines cursor move after TAB is pressed (SHIFT+TAB uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a TAB key has been pressed. This event object can be used to check whether user pressed TAB or SHIFT + TAB.
      */
    var tabMoves: js.UndefOr[Any] = js.undefined
    
    /**
      * If true, undo/redo functionality is enabled.
      */
    var undo: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width of the grid. Can be a number or a function that returns a number.
      */
    var width: js.UndefOr[Any] = js.undefined
    
    /**
      * Setting to true word wrapping of the cell text content that does not fit in the fixed column width.
      */
    var wordWrap: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAfterCellMetaReset(value: js.Function): Self = StObject.set(x, "afterCellMetaReset", value.asInstanceOf[js.Any])
      
      inline def setAfterCellMetaResetUndefined: Self = StObject.set(x, "afterCellMetaReset", js.undefined)
      
      inline def setAfterChange(value: (/* changes */ js.Array[Any], /* source */ String) => Callback): Self = StObject.set(x, "afterChange", js.Any.fromFunction2((t0: /* changes */ js.Array[Any], t1: /* source */ String) => (value(t0, t1)).runNow()))
      
      inline def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      inline def setAfterColumnMove(value: (/* oldIndex */ Double, /* newIndex */ Double) => Callback): Self = StObject.set(x, "afterColumnMove", js.Any.fromFunction2((t0: /* oldIndex */ Double, t1: /* newIndex */ Double) => (value(t0, t1)).runNow()))
      
      inline def setAfterColumnMoveUndefined: Self = StObject.set(x, "afterColumnMove", js.undefined)
      
      inline def setAfterColumnResize(value: (/* col */ Double, /* size */ Double) => Callback): Self = StObject.set(x, "afterColumnResize", js.Any.fromFunction2((t0: /* col */ Double, t1: /* size */ Double) => (value(t0, t1)).runNow()))
      
      inline def setAfterColumnResizeUndefined: Self = StObject.set(x, "afterColumnResize", js.undefined)
      
      inline def setAfterColumnSort(value: (/* column */ Double, /* order */ Boolean) => Callback): Self = StObject.set(x, "afterColumnSort", js.Any.fromFunction2((t0: /* column */ Double, t1: /* order */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setAfterColumnSortUndefined: Self = StObject.set(x, "afterColumnSort", js.undefined)
      
      inline def setAfterCopyLimit(
        value: (/* selectedRowsCount */ Double, /* selectedColsCount */ Double, /* copyRowsLimit */ Double, /* copyColsLimit */ Double) => Callback
      ): Self = StObject.set(x, "afterCopyLimit", js.Any.fromFunction4((t0: /* selectedRowsCount */ Double, t1: /* selectedColsCount */ Double, t2: /* copyRowsLimit */ Double, t3: /* copyColsLimit */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAfterCopyLimitUndefined: Self = StObject.set(x, "afterCopyLimit", js.undefined)
      
      inline def setAfterCreateCol(value: (/* index */ Double, /* amount */ Double) => Callback): Self = StObject.set(x, "afterCreateCol", js.Any.fromFunction2((t0: /* index */ Double, t1: /* amount */ Double) => (value(t0, t1)).runNow()))
      
      inline def setAfterCreateColUndefined: Self = StObject.set(x, "afterCreateCol", js.undefined)
      
      inline def setAfterCreateRow(value: (/* index */ Double, /* amount */ Double) => Callback): Self = StObject.set(x, "afterCreateRow", js.Any.fromFunction2((t0: /* index */ Double, t1: /* amount */ Double) => (value(t0, t1)).runNow()))
      
      inline def setAfterCreateRowUndefined: Self = StObject.set(x, "afterCreateRow", js.undefined)
      
      inline def setAfterDeselect(value: js.Function): Self = StObject.set(x, "afterDeselect", value.asInstanceOf[js.Any])
      
      inline def setAfterDeselectUndefined: Self = StObject.set(x, "afterDeselect", js.undefined)
      
      inline def setAfterDestroy(value: js.Function): Self = StObject.set(x, "afterDestroy", value.asInstanceOf[js.Any])
      
      inline def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
      
      inline def setAfterGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ js.Object) => Callback): Self = StObject.set(x, "afterGetCellMeta", js.Any.fromFunction3((t0: /* row */ Double, t1: /* col */ Double, t2: /* cellProperties */ js.Object) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterGetCellMetaUndefined: Self = StObject.set(x, "afterGetCellMeta", js.undefined)
      
      inline def setAfterGetColHeader(value: (/* col */ Double, /* TH */ HTMLTableHeaderCellElement) => Callback): Self = StObject.set(x, "afterGetColHeader", js.Any.fromFunction2((t0: /* col */ Double, t1: /* TH */ HTMLTableHeaderCellElement) => (value(t0, t1)).runNow()))
      
      inline def setAfterGetColHeaderUndefined: Self = StObject.set(x, "afterGetColHeader", js.undefined)
      
      inline def setAfterGetColWidth(value: (/* col */ Double, /* response */ js.Object) => Callback): Self = StObject.set(x, "afterGetColWidth", js.Any.fromFunction2((t0: /* col */ Double, t1: /* response */ js.Object) => (value(t0, t1)).runNow()))
      
      inline def setAfterGetColWidthUndefined: Self = StObject.set(x, "afterGetColWidth", js.undefined)
      
      inline def setAfterInit(value: js.Function): Self = StObject.set(x, "afterInit", value.asInstanceOf[js.Any])
      
      inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      inline def setAfterLoadData(value: js.Function): Self = StObject.set(x, "afterLoadData", value.asInstanceOf[js.Any])
      
      inline def setAfterLoadDataUndefined: Self = StObject.set(x, "afterLoadData", js.undefined)
      
      inline def setAfterOnCellCornerMouseDown(value: /* event */ MouseEvent => Callback): Self = StObject.set(x, "afterOnCellCornerMouseDown", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
      
      inline def setAfterOnCellCornerMouseDownUndefined: Self = StObject.set(x, "afterOnCellCornerMouseDown", js.undefined)
      
      inline def setAfterOnCellMouseDown(
        value: (/* event */ MouseEvent, /* coords */ CellPosition, /* TD */ HTMLTableDataCellElement) => Callback
      ): Self = StObject.set(x, "afterOnCellMouseDown", js.Any.fromFunction3((t0: /* event */ MouseEvent, t1: /* coords */ CellPosition, t2: /* TD */ HTMLTableDataCellElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterOnCellMouseDownUndefined: Self = StObject.set(x, "afterOnCellMouseDown", js.undefined)
      
      inline def setAfterOnCellMouseOver(
        value: (/* event */ MouseEvent, /* coords */ CellPosition, /* TD */ HTMLTableDataCellElement) => Callback
      ): Self = StObject.set(x, "afterOnCellMouseOver", js.Any.fromFunction3((t0: /* event */ MouseEvent, t1: /* coords */ CellPosition, t2: /* TD */ HTMLTableDataCellElement) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterOnCellMouseOverUndefined: Self = StObject.set(x, "afterOnCellMouseOver", js.undefined)
      
      inline def setAfterRemoveCol(value: (/* index */ Double, /* amount */ Double) => Callback): Self = StObject.set(x, "afterRemoveCol", js.Any.fromFunction2((t0: /* index */ Double, t1: /* amount */ Double) => (value(t0, t1)).runNow()))
      
      inline def setAfterRemoveColUndefined: Self = StObject.set(x, "afterRemoveCol", js.undefined)
      
      inline def setAfterRemoveRow(value: (/* index */ Double, /* amount */ Double) => Callback): Self = StObject.set(x, "afterRemoveRow", js.Any.fromFunction2((t0: /* index */ Double, t1: /* amount */ Double) => (value(t0, t1)).runNow()))
      
      inline def setAfterRemoveRowUndefined: Self = StObject.set(x, "afterRemoveRow", js.undefined)
      
      inline def setAfterRender(value: /* isForced */ Boolean => Callback): Self = StObject.set(x, "afterRender", js.Any.fromFunction1((t0: /* isForced */ Boolean) => value(t0).runNow()))
      
      inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
      
      inline def setAfterRenderer(
        value: (/* TD */ HTMLTableDataCellElement, /* row */ Double, /* col */ Double, /* prop */ String, /* value */ String, /* cellProperties */ js.Object) => Callback
      ): Self = StObject.set(x, "afterRenderer", js.Any.fromFunction6((t0: /* TD */ HTMLTableDataCellElement, t1: /* row */ Double, t2: /* col */ Double, t3: /* prop */ String, t4: /* value */ String, t5: /* cellProperties */ js.Object) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setAfterRendererUndefined: Self = StObject.set(x, "afterRenderer", js.undefined)
      
      inline def setAfterScrollHorizontally(value: js.Function): Self = StObject.set(x, "afterScrollHorizontally", value.asInstanceOf[js.Any])
      
      inline def setAfterScrollHorizontallyUndefined: Self = StObject.set(x, "afterScrollHorizontally", js.undefined)
      
      inline def setAfterScrollVertically(value: js.Function): Self = StObject.set(x, "afterScrollVertically", value.asInstanceOf[js.Any])
      
      inline def setAfterScrollVerticallyUndefined: Self = StObject.set(x, "afterScrollVertically", js.undefined)
      
      inline def setAfterSelection(value: (/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double) => Callback): Self = StObject.set(x, "afterSelection", js.Any.fromFunction4((t0: /* r */ Double, t1: /* c */ Double, t2: /* r2 */ Double, t3: /* c2 */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAfterSelectionByProp(value: (/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String) => Callback): Self = StObject.set(x, "afterSelectionByProp", js.Any.fromFunction4((t0: /* r */ Double, t1: /* p */ String, t2: /* r2 */ Double, t3: /* p2 */ String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAfterSelectionByPropUndefined: Self = StObject.set(x, "afterSelectionByProp", js.undefined)
      
      inline def setAfterSelectionEnd(value: (/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double) => Callback): Self = StObject.set(x, "afterSelectionEnd", js.Any.fromFunction4((t0: /* r */ Double, t1: /* c */ Double, t2: /* r2 */ Double, t3: /* c2 */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAfterSelectionEndByProp(value: (/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String) => Callback): Self = StObject.set(x, "afterSelectionEndByProp", js.Any.fromFunction4((t0: /* r */ Double, t1: /* p */ String, t2: /* r2 */ Double, t3: /* p2 */ String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAfterSelectionEndByPropUndefined: Self = StObject.set(x, "afterSelectionEndByProp", js.undefined)
      
      inline def setAfterSelectionEndUndefined: Self = StObject.set(x, "afterSelectionEnd", js.undefined)
      
      inline def setAfterSelectionUndefined: Self = StObject.set(x, "afterSelection", js.undefined)
      
      inline def setAfterSetCellMeta(value: js.Function): Self = StObject.set(x, "afterSetCellMeta", value.asInstanceOf[js.Any])
      
      inline def setAfterSetCellMetaUndefined: Self = StObject.set(x, "afterSetCellMeta", js.undefined)
      
      inline def setAfterUpdateSettings(value: js.Function): Self = StObject.set(x, "afterUpdateSettings", value.asInstanceOf[js.Any])
      
      inline def setAfterUpdateSettingsUndefined: Self = StObject.set(x, "afterUpdateSettings", js.undefined)
      
      inline def setAfterValidate(
        value: (/* isValid */ Boolean, /* value */ Any, /* row */ Double, /* prop */ String, /* source */ String) => Boolean
      ): Self = StObject.set(x, "afterValidate", js.Any.fromFunction5(value))
      
      inline def setAfterValidateUndefined: Self = StObject.set(x, "afterValidate", js.undefined)
      
      inline def setAutoColumnSize(value: Boolean | js.Object): Self = StObject.set(x, "autoColumnSize", value.asInstanceOf[js.Any])
      
      inline def setAutoColumnSizeUndefined: Self = StObject.set(x, "autoColumnSize", js.undefined)
      
      inline def setAutoComplete(value: js.Array[Any]): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoCompleteVarargs(value: Any*): Self = StObject.set(x, "autoComplete", js.Array(value*))
      
      inline def setAutoWrapCol(value: Boolean): Self = StObject.set(x, "autoWrapCol", value.asInstanceOf[js.Any])
      
      inline def setAutoWrapColUndefined: Self = StObject.set(x, "autoWrapCol", js.undefined)
      
      inline def setAutoWrapRow(value: Boolean): Self = StObject.set(x, "autoWrapRow", value.asInstanceOf[js.Any])
      
      inline def setAutoWrapRowUndefined: Self = StObject.set(x, "autoWrapRow", js.undefined)
      
      inline def setBeforeAutofill(
        value: (/* start */ CellPosition, /* end */ CellPosition, /* data */ js.Array[js.Array[String]]) => Callback
      ): Self = StObject.set(x, "beforeAutofill", js.Any.fromFunction3((t0: /* start */ CellPosition, t1: /* end */ CellPosition, t2: /* data */ js.Array[js.Array[String]]) => (value(t0, t1, t2)).runNow()))
      
      inline def setBeforeAutofillUndefined: Self = StObject.set(x, "beforeAutofill", js.undefined)
      
      inline def setBeforeChange(value: (/* changes */ js.Array[js.Array[Any]], /* source */ String) => Callback): Self = StObject.set(x, "beforeChange", js.Any.fromFunction2((t0: /* changes */ js.Array[js.Array[Any]], t1: /* source */ String) => (value(t0, t1)).runNow()))
      
      inline def setBeforeChangeRender(value: js.Function): Self = StObject.set(x, "beforeChangeRender", value.asInstanceOf[js.Any])
      
      inline def setBeforeChangeRenderUndefined: Self = StObject.set(x, "beforeChangeRender", js.undefined)
      
      inline def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      inline def setBeforeColumnSort(value: (/* column */ Double, /* order */ Boolean) => Callback): Self = StObject.set(x, "beforeColumnSort", js.Any.fromFunction2((t0: /* column */ Double, t1: /* order */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setBeforeColumnSortUndefined: Self = StObject.set(x, "beforeColumnSort", js.undefined)
      
      inline def setBeforeGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ js.Object) => Callback): Self = StObject.set(x, "beforeGetCellMeta", js.Any.fromFunction3((t0: /* row */ Double, t1: /* col */ Double, t2: /* cellProperties */ js.Object) => (value(t0, t1, t2)).runNow()))
      
      inline def setBeforeGetCellMetaUndefined: Self = StObject.set(x, "beforeGetCellMeta", js.undefined)
      
      inline def setBeforeInit(value: js.Function): Self = StObject.set(x, "beforeInit", value.asInstanceOf[js.Any])
      
      inline def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
      
      inline def setBeforeInitWalkontable(value: js.Function): Self = StObject.set(x, "beforeInitWalkontable", value.asInstanceOf[js.Any])
      
      inline def setBeforeInitWalkontableUndefined: Self = StObject.set(x, "beforeInitWalkontable", js.undefined)
      
      inline def setBeforeKeyDown(value: /* event */ KeyboardEvent => Callback): Self = StObject.set(x, "beforeKeyDown", js.Any.fromFunction1((t0: /* event */ KeyboardEvent) => value(t0).runNow()))
      
      inline def setBeforeKeyDownUndefined: Self = StObject.set(x, "beforeKeyDown", js.undefined)
      
      inline def setBeforeRemoveCol(value: (/* index */ Double, /* amount */ Double) => Callback): Self = StObject.set(x, "beforeRemoveCol", js.Any.fromFunction2((t0: /* index */ Double, t1: /* amount */ Double) => (value(t0, t1)).runNow()))
      
      inline def setBeforeRemoveColUndefined: Self = StObject.set(x, "beforeRemoveCol", js.undefined)
      
      inline def setBeforeRemoveRow(value: (/* index */ Double, /* amount */ Double) => Callback): Self = StObject.set(x, "beforeRemoveRow", js.Any.fromFunction2((t0: /* index */ Double, t1: /* amount */ Double) => (value(t0, t1)).runNow()))
      
      inline def setBeforeRemoveRowUndefined: Self = StObject.set(x, "beforeRemoveRow", js.undefined)
      
      inline def setBeforeRender(value: /* isForced */ Boolean => Callback): Self = StObject.set(x, "beforeRender", js.Any.fromFunction1((t0: /* isForced */ Boolean) => value(t0).runNow()))
      
      inline def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
      
      inline def setBeforeSet(value: /* v */ js.Object => Callback): Self = StObject.set(x, "beforeSet", js.Any.fromFunction1((t0: /* v */ js.Object) => value(t0).runNow()))
      
      inline def setBeforeSetRangeEnd(value: /* coords */ js.Array[Any] => Callback): Self = StObject.set(x, "beforeSetRangeEnd", js.Any.fromFunction1((t0: /* coords */ js.Array[Any]) => value(t0).runNow()))
      
      inline def setBeforeSetRangeEndUndefined: Self = StObject.set(x, "beforeSetRangeEnd", js.undefined)
      
      inline def setBeforeSetUndefined: Self = StObject.set(x, "beforeSet", js.undefined)
      
      inline def setBeforeValidate(value: (/* value */ Any, /* row */ Double, /* prop */ String, /* source */ String) => Callback): Self = StObject.set(x, "beforeValidate", js.Any.fromFunction4((t0: /* value */ Any, t1: /* row */ Double, t2: /* prop */ String, t3: /* source */ String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setBeforeValidateUndefined: Self = StObject.set(x, "beforeValidate", js.undefined)
      
      inline def setCells(value: (/* row */ Double, /* col */ Double, /* prop */ String) => Callback): Self = StObject.set(x, "cells", js.Any.fromFunction3((t0: /* row */ Double, t1: /* col */ Double, t2: /* prop */ String) => (value(t0, t1, t2)).runNow()))
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setColHeaders(value: Any): Self = StObject.set(x, "colHeaders", value.asInstanceOf[js.Any])
      
      inline def setColHeadersUndefined: Self = StObject.set(x, "colHeaders", js.undefined)
      
      inline def setColWidths(value: Any): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsUndefined: Self = StObject.set(x, "colWidths", js.undefined)
      
      inline def setColumnSorting(value: Boolean): Self = StObject.set(x, "columnSorting", value.asInstanceOf[js.Any])
      
      inline def setColumnSortingUndefined: Self = StObject.set(x, "columnSorting", js.undefined)
      
      inline def setColumns(value: js.Array[Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: Any*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setContextMenu(value: Any): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCopyColsLimit(value: Double): Self = StObject.set(x, "copyColsLimit", value.asInstanceOf[js.Any])
      
      inline def setCopyColsLimitUndefined: Self = StObject.set(x, "copyColsLimit", js.undefined)
      
      inline def setCopyPaste(value: Boolean): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
      
      inline def setCopyPasteUndefined: Self = StObject.set(x, "copyPaste", js.undefined)
      
      inline def setCopyRowsLimit(value: Double): Self = StObject.set(x, "copyRowsLimit", value.asInstanceOf[js.Any])
      
      inline def setCopyRowsLimitUndefined: Self = StObject.set(x, "copyRowsLimit", js.undefined)
      
      inline def setCurrentColClassName(value: String): Self = StObject.set(x, "currentColClassName", value.asInstanceOf[js.Any])
      
      inline def setCurrentColClassNameUndefined: Self = StObject.set(x, "currentColClassName", js.undefined)
      
      inline def setCurrentRowClassName(value: String): Self = StObject.set(x, "currentRowClassName", value.asInstanceOf[js.Any])
      
      inline def setCurrentRowClassNameUndefined: Self = StObject.set(x, "currentRowClassName", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataSchema(value: Any): Self = StObject.set(x, "dataSchema", value.asInstanceOf[js.Any])
      
      inline def setDataSchemaUndefined: Self = StObject.set(x, "dataSchema", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEnterBeginsEditing(value: Boolean): Self = StObject.set(x, "enterBeginsEditing", value.asInstanceOf[js.Any])
      
      inline def setEnterBeginsEditingUndefined: Self = StObject.set(x, "enterBeginsEditing", js.undefined)
      
      inline def setEnterMoves(value: Any): Self = StObject.set(x, "enterMoves", value.asInstanceOf[js.Any])
      
      inline def setEnterMovesUndefined: Self = StObject.set(x, "enterMoves", js.undefined)
      
      inline def setFillHandle(value: Any): Self = StObject.set(x, "fillHandle", value.asInstanceOf[js.Any])
      
      inline def setFillHandleUndefined: Self = StObject.set(x, "fillHandle", js.undefined)
      
      inline def setFixedColumnsLeft(value: Double): Self = StObject.set(x, "fixedColumnsLeft", value.asInstanceOf[js.Any])
      
      inline def setFixedColumnsLeftUndefined: Self = StObject.set(x, "fixedColumnsLeft", js.undefined)
      
      inline def setFixedRowsTop(value: Double): Self = StObject.set(x, "fixedRowsTop", value.asInstanceOf[js.Any])
      
      inline def setFixedRowsTopUndefined: Self = StObject.set(x, "fixedRowsTop", js.undefined)
      
      inline def setFragmentSelection(value: Boolean): Self = StObject.set(x, "fragmentSelection", value.asInstanceOf[js.Any])
      
      inline def setFragmentSelectionUndefined: Self = StObject.set(x, "fragmentSelection", js.undefined)
      
      inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInvalidCellClassName(value: String): Self = StObject.set(x, "invalidCellClassName", value.asInstanceOf[js.Any])
      
      inline def setInvalidCellClassNameUndefined: Self = StObject.set(x, "invalidCellClassName", js.undefined)
      
      inline def setIsEmptyCol(value: /* col */ Double => Boolean): Self = StObject.set(x, "isEmptyCol", js.Any.fromFunction1(value))
      
      inline def setIsEmptyColUndefined: Self = StObject.set(x, "isEmptyCol", js.undefined)
      
      inline def setIsEmptyRow(value: /* row */ Double => Boolean): Self = StObject.set(x, "isEmptyRow", js.Any.fromFunction1(value))
      
      inline def setIsEmptyRowUndefined: Self = StObject.set(x, "isEmptyRow", js.undefined)
      
      inline def setManualColumnMove(value: Any): Self = StObject.set(x, "manualColumnMove", value.asInstanceOf[js.Any])
      
      inline def setManualColumnMoveUndefined: Self = StObject.set(x, "manualColumnMove", js.undefined)
      
      inline def setManualColumnResize(value: Any): Self = StObject.set(x, "manualColumnResize", value.asInstanceOf[js.Any])
      
      inline def setManualColumnResizeUndefined: Self = StObject.set(x, "manualColumnResize", js.undefined)
      
      inline def setManualRowMove(value: Boolean): Self = StObject.set(x, "manualRowMove", value.asInstanceOf[js.Any])
      
      inline def setManualRowMoveUndefined: Self = StObject.set(x, "manualRowMove", js.undefined)
      
      inline def setManualRowResize(value: Boolean): Self = StObject.set(x, "manualRowResize", value.asInstanceOf[js.Any])
      
      inline def setManualRowResizeUndefined: Self = StObject.set(x, "manualRowResize", js.undefined)
      
      inline def setMaxCols(value: Double): Self = StObject.set(x, "maxCols", value.asInstanceOf[js.Any])
      
      inline def setMaxColsUndefined: Self = StObject.set(x, "maxCols", js.undefined)
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      inline def setMergeCells(value: Any): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
      
      inline def setMergeCellsUndefined: Self = StObject.set(x, "mergeCells", js.undefined)
      
      inline def setMinCols(value: Double): Self = StObject.set(x, "minCols", value.asInstanceOf[js.Any])
      
      inline def setMinColsUndefined: Self = StObject.set(x, "minCols", js.undefined)
      
      inline def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
      
      inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
      
      inline def setMinSpareCols(value: Double): Self = StObject.set(x, "minSpareCols", value.asInstanceOf[js.Any])
      
      inline def setMinSpareColsUndefined: Self = StObject.set(x, "minSpareCols", js.undefined)
      
      inline def setMinSpareRows(value: Double): Self = StObject.set(x, "minSpareRows", value.asInstanceOf[js.Any])
      
      inline def setMinSpareRowsUndefined: Self = StObject.set(x, "minSpareRows", js.undefined)
      
      inline def setModifyCol(value: /* col */ Double => Callback): Self = StObject.set(x, "modifyCol", js.Any.fromFunction1((t0: /* col */ Double) => value(t0).runNow()))
      
      inline def setModifyColUndefined: Self = StObject.set(x, "modifyCol", js.undefined)
      
      inline def setModifyColWidth(value: (/* width */ Double, /* col */ Double) => Callback): Self = StObject.set(x, "modifyColWidth", js.Any.fromFunction2((t0: /* width */ Double, t1: /* col */ Double) => (value(t0, t1)).runNow()))
      
      inline def setModifyColWidthUndefined: Self = StObject.set(x, "modifyColWidth", js.undefined)
      
      inline def setModifyRow(value: /* row */ Double => Callback): Self = StObject.set(x, "modifyRow", js.Any.fromFunction1((t0: /* row */ Double) => value(t0).runNow()))
      
      inline def setModifyRowHeight(value: (/* height */ Double, /* row */ Double) => Callback): Self = StObject.set(x, "modifyRowHeight", js.Any.fromFunction2((t0: /* height */ Double, t1: /* row */ Double) => (value(t0, t1)).runNow()))
      
      inline def setModifyRowHeightUndefined: Self = StObject.set(x, "modifyRowHeight", js.undefined)
      
      inline def setModifyRowUndefined: Self = StObject.set(x, "modifyRow", js.undefined)
      
      inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setNoWordWrapClassName(value: String): Self = StObject.set(x, "noWordWrapClassName", value.asInstanceOf[js.Any])
      
      inline def setNoWordWrapClassNameUndefined: Self = StObject.set(x, "noWordWrapClassName", js.undefined)
      
      inline def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
      
      inline def setObserveChangesUndefined: Self = StObject.set(x, "observeChanges", js.undefined)
      
      inline def setObserveDOMVisibility(value: Boolean): Self = StObject.set(x, "observeDOMVisibility", value.asInstanceOf[js.Any])
      
      inline def setObserveDOMVisibilityUndefined: Self = StObject.set(x, "observeDOMVisibility", js.undefined)
      
      inline def setOnBeforeChange(value: (/* changes */ js.Array[Any], /* source */ String) => Callback): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction2((t0: /* changes */ js.Array[Any], t1: /* source */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      inline def setOnChange(value: (/* changes */ js.Array[Any], /* source */ String) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* changes */ js.Array[Any], t1: /* source */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCopyLimit(
        value: (/* selectedRowsCount */ Double, /* selectedColsCount */ Double, /* copyRowsLimit */ Double, /* copyColsLimit */ Double) => Callback
      ): Self = StObject.set(x, "onCopyLimit", js.Any.fromFunction4((t0: /* selectedRowsCount */ Double, t1: /* selectedColsCount */ Double, t2: /* copyRowsLimit */ Double, t3: /* copyColsLimit */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnCopyLimitUndefined: Self = StObject.set(x, "onCopyLimit", js.undefined)
      
      inline def setOnSelection(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Callback): Self = StObject.set(x, "onSelection", js.Any.fromFunction4((t0: /* r */ Double, t1: /* p */ Double, t2: /* r2 */ Double, t3: /* p2 */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnSelectionByProp(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Callback): Self = StObject.set(x, "onSelectionByProp", js.Any.fromFunction4((t0: /* r */ Double, t1: /* p */ Double, t2: /* r2 */ Double, t3: /* p2 */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnSelectionByPropUndefined: Self = StObject.set(x, "onSelectionByProp", js.undefined)
      
      inline def setOnSelectionEnd(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Callback): Self = StObject.set(x, "onSelectionEnd", js.Any.fromFunction4((t0: /* r */ Double, t1: /* p */ Double, t2: /* r2 */ Double, t3: /* p2 */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnSelectionEndByProp(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Callback): Self = StObject.set(x, "onSelectionEndByProp", js.Any.fromFunction4((t0: /* r */ Double, t1: /* p */ Double, t2: /* r2 */ Double, t3: /* p2 */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnSelectionEndByPropUndefined: Self = StObject.set(x, "onSelectionEndByProp", js.undefined)
      
      inline def setOnSelectionEndUndefined: Self = StObject.set(x, "onSelectionEnd", js.undefined)
      
      inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
      inline def setOutsideClickDeselects(value: Boolean): Self = StObject.set(x, "outsideClickDeselects", value.asInstanceOf[js.Any])
      
      inline def setOutsideClickDeselectsUndefined: Self = StObject.set(x, "outsideClickDeselects", js.undefined)
      
      inline def setPasteMode(value: String): Self = StObject.set(x, "pasteMode", value.asInstanceOf[js.Any])
      
      inline def setPasteModeUndefined: Self = StObject.set(x, "pasteMode", js.undefined)
      
      inline def setPersistentState(value: Boolean): Self = StObject.set(x, "persistentState", value.asInstanceOf[js.Any])
      
      inline def setPersistentStateUndefined: Self = StObject.set(x, "persistentState", js.undefined)
      
      inline def setPlaceholder(value: Any): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCellClassName(value: String): Self = StObject.set(x, "placeholderCellClassName", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCellClassNameUndefined: Self = StObject.set(x, "placeholderCellClassName", js.undefined)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnlyCellClassName(value: String): Self = StObject.set(x, "readOnlyCellClassName", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyCellClassNameUndefined: Self = StObject.set(x, "readOnlyCellClassName", js.undefined)
      
      inline def setRowHeaders(value: Any): Self = StObject.set(x, "rowHeaders", value.asInstanceOf[js.Any])
      
      inline def setRowHeadersUndefined: Self = StObject.set(x, "rowHeaders", js.undefined)
      
      inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setStartCols(value: Double): Self = StObject.set(x, "startCols", value.asInstanceOf[js.Any])
      
      inline def setStartColsUndefined: Self = StObject.set(x, "startCols", js.undefined)
      
      inline def setStartRows(value: Double): Self = StObject.set(x, "startRows", value.asInstanceOf[js.Any])
      
      inline def setStartRowsUndefined: Self = StObject.set(x, "startRows", js.undefined)
      
      inline def setStretchH(value: String): Self = StObject.set(x, "stretchH", value.asInstanceOf[js.Any])
      
      inline def setStretchHUndefined: Self = StObject.set(x, "stretchH", js.undefined)
      
      inline def setTabMoves(value: Any): Self = StObject.set(x, "tabMoves", value.asInstanceOf[js.Any])
      
      inline def setTabMovesUndefined: Self = StObject.set(x, "tabMoves", js.undefined)
      
      inline def setUndo(value: Boolean): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
      
      inline def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
      
      inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    }
  }
}
