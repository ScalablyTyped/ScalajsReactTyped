package typingsJapgolly.reactDataGrid.AdazzleReactDataGrid

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Text
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactDataGrid.anon.Width
import typingsJapgolly.reactDataGrid.reactDataGridStrings.cellDrag
import typingsJapgolly.reactDataGrid.reactDataGridStrings.cellUpdate
import typingsJapgolly.reactDataGrid.reactDataGridStrings.columnFill
import typingsJapgolly.reactDataGrid.reactDataGridStrings.copyPaste
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactDataGrid[T]
  extends Component[GridProps[T], js.Object, Any] {
  
  /**
    * Opens the editor for the cell (idx) in the given row (rowIdx). If the column is not editable then nothing will happen.
    */
  def openCellEditor(rowIdx: Double, idx: Double): Unit = js.native
}
object ReactDataGrid {
  
  type Cell = japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]
  
  /**
    * Information about a copy paste
    */
  trait CellCopyPasteEvent extends StObject {
    
    /**
      * The key of the column where the copy paste occurred.
      */
    var cellKey: String
    
    /**
      * The row that was copied from.
      */
    var fromRow: Double
    
    /**
      * The row that was pasted to.
      */
    var rowIdx: Double
    
    /**
      * The row that was pasted to.
      */
    var toRow: Double
    
    /**
      * The value that was pasted.
      */
    var value: Any
  }
  object CellCopyPasteEvent {
    
    inline def apply(cellKey: String, fromRow: Double, rowIdx: Double, toRow: Double, value: Any): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellCopyPasteEvent = {
      val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellCopyPasteEvent]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellCopyPasteEvent](x: Self) {
      
      inline def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
      
      inline def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
      
      inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
      
      inline def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Information about a cell drag
    */
  trait CellDragEvent extends StObject {
    
    /**
      * The name of the column that was dragged.
      */
    var cellKey: String
    
    /**
      * The row where the drag began.
      */
    var fromRow: Double
    
    /**
      * The row where the drag ended.
      */
    var toRow: Double
    
    /**
      * The value of the cell that was dragged.
      */
    var value: Any
  }
  object CellDragEvent {
    
    inline def apply(cellKey: String, fromRow: Double, toRow: Double, value: Any): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellDragEvent = {
      val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellDragEvent]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellDragEvent](x: Self) {
      
      inline def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
      
      inline def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
      
      inline def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *   Information about a cell expanded.
    */
  trait CellExpandEvent[T] extends StObject {
    
    /**
      * Expand data.
      */
    var expandArgs: Any
    
    /**
      * The column index where the cell is being expanded.
      */
    var idx: Double
    
    /**
      * The values of the row.
      */
    var rowData: T
    
    /**
      * The row index where the cell is being expanded.
      */
    var rowIdx: Double
  }
  object CellExpandEvent {
    
    inline def apply[T](expandArgs: Any, idx: Double, rowData: T, rowIdx: Double): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellExpandEvent[T] = {
      val __obj = js.Dynamic.literal(expandArgs = expandArgs.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellExpandEvent[T]]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellExpandEvent[?], T](x: Self & typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.CellExpandEvent[T]) {
      
      inline def setExpandArgs(value: Any): Self = StObject.set(x, "expandArgs", value.asInstanceOf[js.Any])
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: T): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Information about a specific column to be rendered.
    */
  trait Column[T] extends StObject {
    
    /**
      * A class name to be applied to the cells in the column
      */
    var cellClass: js.UndefOr[String] = js.undefined
    
    /**
      * Whether this column can be dragged (re-arranged).
      * @default false
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this column can be edited.
      * @default false
      */
    var editable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The editor for this column. Several editors are available in "react-data-grid/addons".
      * @default A simple text editor
      */
    var editor: js.UndefOr[
        Element | (ComponentClassP[EditorBaseProps & js.Object]) | FunctionComponent[EditorBaseProps]
      ] = js.undefined
    
    /**
      * Events to be bound to the cells in this specific column.
      * Each event must respect this standard in order to work correctly:
      * @example
      * function onXxx(ev :SyntheticEvent, (rowIdx, idx, name): args)
      */
    var events: js.UndefOr[StringDictionary[ColumnEventCallback]] = js.undefined
    
    /**
      * A custom formatter for this column's filter.
      */
    var filterRenderer: js.UndefOr[Element | (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]] = js.undefined
    
    /**
      * Whether the rows in the grid can be filtered by this column.
      * @default false
      */
    var filterable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A custom read-only formatter for this column. An image formatter is available in "react-data-grid/addons".
      */
    var formatter: js.UndefOr[Element | (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]] = js.undefined
    
    /**
      * Retrieve meta data about the row, optionally provide column as a second argument
      */
    var getRowMetaData: js.UndefOr[
        js.Function2[
          /* rowdata */ T, 
          /* column */ js.UndefOr[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.Column[T]], 
          Any
        ]
      ] = js.undefined
    
    /**
      * A custom formatter for this column's header.
      */
    var headerRenderer: js.UndefOr[Element | (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]] = js.undefined
    
    /**
      * A unique key for this column. Required.
      * Each row should have a property with this name, which contains this column's value.
      */
    var key: String
    
    /**
      * Whether this column should stay fixed on the left as the user scrolls horizontally.
      * @default false
      */
    var locked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This column's display name. Required.
      */
    var name: String
    
    /**
      * Whether this column can be resized by the user.
      * @default false
      */
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the rows in the grid can be sorted by this column.
      * @default false
      */
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A custom width for this specific column.
      * @default minColumnWidth from the ReactDataGrid
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Column {
    
    inline def apply[T](key: String, name: String): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Column[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Column[T]]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Column[?], T](x: Self & typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Column[T]) {
      
      inline def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
      
      inline def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEditor(
        value: Element | (ComponentClassP[EditorBaseProps & js.Object]) | FunctionComponent[EditorBaseProps]
      ): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def setEditorVdomElement(value: VdomElement): Self = StObject.set(x, "editor", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEvents(value: StringDictionary[ColumnEventCallback]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFilterRenderer(value: Element | (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]): Self = StObject.set(x, "filterRenderer", value.asInstanceOf[js.Any])
      
      inline def setFilterRendererUndefined: Self = StObject.set(x, "filterRenderer", js.undefined)
      
      inline def setFilterRendererVdomElement(value: VdomElement): Self = StObject.set(x, "filterRenderer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
      
      inline def setFormatter(value: Element | (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setFormatterVdomElement(value: VdomElement): Self = StObject.set(x, "formatter", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGetRowMetaData(
        value: (/* rowdata */ T, /* column */ js.UndefOr[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.Column[T]]) => Any
      ): Self = StObject.set(x, "getRowMetaData", js.Any.fromFunction2(value))
      
      inline def setGetRowMetaDataUndefined: Self = StObject.set(x, "getRowMetaData", js.undefined)
      
      inline def setHeaderRenderer(value: Element | (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]): Self = StObject.set(x, "headerRenderer", value.asInstanceOf[js.Any])
      
      inline def setHeaderRendererUndefined: Self = StObject.set(x, "headerRenderer", js.undefined)
      
      inline def setHeaderRendererVdomElement(value: VdomElement): Self = StObject.set(x, "headerRenderer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Information about a drag handle double click. Generic event type returns untyped row, use parameterized type with the row type as the parameter
    * @default T = any
    */
  trait DragHandleDoubleClickEvent[T] extends StObject {
    
    /**
      * The double click event.
      */
    var e: ReactEventFrom[Any & org.scalajs.dom.Element]
    
    /**
      * The column where the double click occurred.
      */
    var idx: Double
    
    /**
      * The values of the row.
      */
    var rowData: T
    
    /**
      * The row where the double click occurred.
      */
    var rowIdx: Double
  }
  object DragHandleDoubleClickEvent {
    
    inline def apply[T](e: ReactEventFrom[Any & org.scalajs.dom.Element], idx: Double, rowData: T, rowIdx: Double): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.DragHandleDoubleClickEvent[T] = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.DragHandleDoubleClickEvent[T]]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.DragHandleDoubleClickEvent[?], T](x: Self & typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.DragHandleDoubleClickEvent[T]) {
      
      inline def setE(value: ReactEventFrom[Any & org.scalajs.dom.Element]): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: T): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Some filter to be applied to the grid's contents
    */
  trait Filter extends StObject {
    
    /**
      * The key of the column being filtered.
      */
    var columnKey: String
    
    /**
      * The term to filter by.
      */
    var filterTerm: String
  }
  object Filter {
    
    inline def apply(columnKey: String, filterTerm: String): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Filter = {
      val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], filterTerm = filterTerm.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Filter]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.Filter](x: Self) {
      
      inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setFilterTerm(value: String): Self = StObject.set(x, "filterTerm", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Information about some update to the grid's contents. Generic event type returns untyped row, use parameterized type with the row type as the parameter
    * @default T = any
    */
  trait GridRowsUpdatedEvent[T] extends StObject {
    
    /**
      * The action that occurred to trigger this event.
      * One of 'cellUpdate', 'cellDrag', 'columnFill', or 'copyPaste'.
      */
    var action: cellUpdate | cellDrag | columnFill | copyPaste
    
    /**
      * The key of the column where the event occurred.
      */
    var cellKey: String
    
    /**
      * The top row affected by the event.
      */
    var fromRow: Double
    
    /**
      * The bottom row affected by the event.
      */
    var toRow: Double
    
    /**
      * The columns that were updated and their values.
      */
    var updated: T
  }
  object GridRowsUpdatedEvent {
    
    inline def apply[T](
      action: cellUpdate | cellDrag | columnFill | copyPaste,
      cellKey: String,
      fromRow: Double,
      toRow: Double,
      updated: T
    ): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.GridRowsUpdatedEvent[T] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.GridRowsUpdatedEvent[T]]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.GridRowsUpdatedEvent[?], T](x: Self & typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.GridRowsUpdatedEvent[T]) {
      
      inline def setAction(value: cellUpdate | cellDrag | columnFill | copyPaste): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
      
      inline def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
      
      inline def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: T): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Information about the row toggler
    */
  trait OnRowExpandToggle extends StObject {
    
    /**
      * The name of the column group the row is in
      */
    var columnGroupName: String
    
    /**
      * The name of the expanded row
      */
    var name: String
    
    /**
      * If it should expand or not
      */
    var shouldExpand: Boolean
  }
  object OnRowExpandToggle {
    
    inline def apply(columnGroupName: String, name: String, shouldExpand: Boolean): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.OnRowExpandToggle = {
      val __obj = js.Dynamic.literal(columnGroupName = columnGroupName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shouldExpand = shouldExpand.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.OnRowExpandToggle]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.OnRowExpandToggle](x: Self) {
      
      inline def setColumnGroupName(value: String): Self = StObject.set(x, "columnGroupName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShouldExpand(value: Boolean): Self = StObject.set(x, "shouldExpand", value.asInstanceOf[js.Any])
    }
  }
  
  type Row = japgolly.scalajs.react.facade.React.Component[Any & js.Object, js.Object]
  
  /**
    * Information about a row update. Generic event type returns untyped row, use parameterized type with the row type as the parameter
    * @default T = any
    */
  trait RowUpdateEvent[T] extends StObject {
    
    /**
      * The name of the column that was updated.
      */
    var cellKey: String
    
    /**
      * The name of the key pressed to trigger the event ('Tab', 'Enter', etc.).
      */
    var key: String
    
    /**
      * The index of the updated row.
      */
    var rowIdx: Double
    
    /**
      * The columns that were updated and their values.
      */
    var updated: T
  }
  object RowUpdateEvent {
    
    inline def apply[T](cellKey: String, key: String, rowIdx: Double, updated: T): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.RowUpdateEvent[T] = {
      val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.RowUpdateEvent[T]]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.RowUpdateEvent[?], T](x: Self & typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.RowUpdateEvent[T]) {
      
      inline def setCellKey(value: String): Self = StObject.set(x, "cellKey", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: T): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionParams[T] extends StObject {
    
    var row: T
    
    var rowIdx: Double
  }
  object SelectionParams {
    
    inline def apply[T](row: T, rowIdx: Double): typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.SelectionParams[T] = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.SelectionParams[T]]
    }
    
    extension [Self <: typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.SelectionParams[?], T](x: Self & typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.SelectionParams[T]) {
      
      inline def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  object editors {
    
    @js.native
    trait EditorBase[P, S] extends Component[P & EditorBaseProps, S, Any] {
      
      def getInputNode(): org.scalajs.dom.Element | Null | Text = js.native
      
      def getStyle(): Width = js.native
      
      def getValue(): Any = js.native
      
      def inheritContainerStyles(): Boolean = js.native
    }
  }
}
