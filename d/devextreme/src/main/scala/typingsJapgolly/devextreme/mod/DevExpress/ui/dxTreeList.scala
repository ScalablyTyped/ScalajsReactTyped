package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.anon.ComponentDxTreeList
import typingsJapgolly.devextreme.mod.DevExpress.common.ScrollMode
import typingsJapgolly.devextreme.mod.DevExpress.common.grids.DataChange
import typingsJapgolly.devextreme.mod.DevExpress.core.DeepPartial
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.events.Cancelable
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.DxEvent
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.AdaptiveDetailRowPreparingInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.DataChangeInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.DataErrorOccurredInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.DragDropInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.DragReorderInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.DragStartEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.EditingBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.EditingTextsBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.KeyDownInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.NewRowInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.PagingBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingTemplateDataModel
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowInsertedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowInsertingInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowKeyInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowRemovedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowRemovingInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowUpdatedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowUpdatingInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.RowValidatingInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.SavingInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.ScrollingBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.SelectionBase
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.SelectionChangedInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid.ToolbarPreparingInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Column
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Node
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Row
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeList[TRowData, TKey]
  extends StObject
     with Widget[dxTreeListOptions[TRowData, TKey]]
     with GridBase[TRowData, TKey] {
  
  def addColumn(columnOptions: String): Unit = js.native
  /**
    * Adds a new column.
    */
  def addColumn(columnOptions: Column[TRowData, TKey]): Unit = js.native
  
  /**
    * Adds an empty data row to the highest hierarchical level and switches it to the editing state.
    */
  def addRow(): DxPromise[Unit] = js.native
  /**
    * Adds an empty data row to a specified parent row.
    */
  def addRow(parentId: TKey): DxPromise[Unit] = js.native
  
  /**
    * Collapses a row with a specific key.
    */
  def collapseRow(key: TKey): DxPromise[Unit] = js.native
  
  /**
    * Expands a row with a specific key.
    */
  def expandRow(key: TKey): DxPromise[Unit] = js.native
  
  /**
    * Sets focus on the UI component.
    */
  /* InferMemberOverrides */
  override def focus(): Unit = js.native
  
  /**
    * Performs a pre-order tree traversal, executing a function on each visited node. Starts traversing from the top level nodes.
    */
  def forEachNode(callback: js.Function): Unit = js.native
  /**
    * Performs a pre-order tree traversal, executing a function on each visited node. Starts traversing from the specified nodes.
    */
  def forEachNode(nodes: js.Array[Node[TRowData, TKey]], callback: js.Function): Unit = js.native
  
  /**
    * Gets a node with a specific key.
    */
  def getNodeByKey(key: TKey): Node[TRowData, TKey] = js.native
  
  /**
    * Gets the root node.
    */
  def getRootNode(): Node[TRowData, TKey] = js.native
  
  /**
    * Gets the keys of the rows selected explicitly via the API or via a click or tap.
    */
  def getSelectedRowKeys(): js.Array[TKey] = js.native
  /**
    * Gets the selected rows&apos; keys.
    */
  def getSelectedRowKeys(mode: String): js.Array[TKey] = js.native
  
  /**
    * Gets the data objects of the rows selected explicitly via the API or via a click or tap.
    */
  def getSelectedRowsData(): js.Array[TRowData] = js.native
  /**
    * Gets the selected rows&apos; data objects.
    */
  def getSelectedRowsData(mode: String): js.Array[TRowData] = js.native
  
  /**
    * Gets all visible columns.
    */
  def getVisibleColumns(): js.Array[Column[TRowData, TKey]] = js.native
  /**
    * Gets all visible columns at a specific hierarchical level of column headers. Use it to access banded columns.
    */
  def getVisibleColumns(headerLevel: Double): js.Array[Column[TRowData, TKey]] = js.native
  
  /**
    * Gets currently rendered rows.
    */
  def getVisibleRows(): js.Array[Row[TRowData, TKey]] = js.native
  
  /**
    * Checks whether a row is expanded or collapsed.
    */
  def isRowExpanded(key: TKey): Boolean = js.native
  
  /**
    * Loads all root node descendants (all data items). Takes effect only if data has the plain structure and remoteOperations.filtering is true.
    */
  def loadDescendants(): DxPromise[Unit] = js.native
  /**
    * Loads a specific node&apos;s descendants. Takes effect only if data has the plain structure and remoteOperations.filtering is true.
    */
  def loadDescendants(keys: js.Array[TKey]): DxPromise[Unit] = js.native
  /**
    * Loads all or only direct descendants of specific nodes. Takes effect only if data has the plain structure and remoteOperations.filtering is true.
    */
  def loadDescendants(keys: js.Array[TKey], childrenOnly: Boolean): DxPromise[Unit] = js.native
}
object dxTreeList {
  
  trait AdaptiveDetailRowPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with AdaptiveDetailRowPreparingInfo
  object AdaptiveDetailRowPreparingEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], formOptions: Any): AdaptiveDetailRowPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], formOptions = formOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdaptiveDetailRowPreparingEvent[TRowData, TKey]]
    }
  }
  
  trait CellClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent]
       with CellInfo[TRowData, TKey]
  object CellClickEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellClickEvent[TRowData, TKey]]
    }
  }
  
  trait CellDblClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent]
       with CellInfo[TRowData, TKey]
  object CellDblClickEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellDblClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellDblClickEvent[TRowData, TKey]]
    }
  }
  
  trait CellHoverChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with CellInfo[TRowData, TKey] {
    
    val eventType: String
  }
  object CellHoverChangedEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      eventType: String,
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellHoverChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellHoverChangedEvent[TRowData, TKey]]
    }
    
    extension [Self <: CellHoverChangedEvent[?, ?], TRowData, TKey](x: Self & (CellHoverChangedEvent[TRowData, TKey])) {
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait CellInfo[TRowData, TKey] extends StObject {
    
    val cellElement: DxElement_[HTMLElement]
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val data: TRowData
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val key: TKey
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object CellInfo {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      data: TRowData,
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellInfo[TRowData, TKey]]
    }
    
    extension [Self <: CellInfo[?, ?], TRowData, TKey](x: Self & (CellInfo[TRowData, TKey])) {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CellPreparedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with CellInfo[TRowData, TKey] {
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val oldValue: js.UndefOr[Any] = js.undefined
    
    val watch: js.UndefOr[js.Function] = js.undefined
  }
  object CellPreparedEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellPreparedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellPreparedEvent[TRowData, TKey]]
    }
    
    extension [Self <: CellPreparedEvent[?, ?], TRowData, TKey](x: Self & (CellPreparedEvent[TRowData, TKey])) {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type Column[TRowData, TKey] = dxTreeListColumn[TRowData, TKey]
  
  type ColumnButton[TRowData, TKey] = dxTreeListColumnButton[TRowData, TKey]
  
  trait ColumnButtonClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent] {
    
    var column: js.UndefOr[Column[TRowData, TKey]] = js.undefined
    
    var row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
  }
  object ColumnButtonClickEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement]): ColumnButtonClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnButtonClickEvent[TRowData, TKey]]
    }
    
    extension [Self <: ColumnButtonClickEvent[?, ?], TRowData, TKey](x: Self & (ColumnButtonClickEvent[TRowData, TKey])) {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait ColumnButtonTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxTreeList[TRowData, TKey]
    
    val data: TRowData
    
    val key: TKey
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
  }
  object ColumnButtonTemplateData {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String
    ): ColumnButtonTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnButtonTemplateData[TRowData, TKey]]
    }
    
    extension [Self <: ColumnButtonTemplateData[?, ?], TRowData, TKey](x: Self & (ColumnButtonTemplateData[TRowData, TKey])) {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxTreeList[TRowData, TKey]
    
    val data: TRowData
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val oldValue: js.UndefOr[Any] = js.undefined
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
    
    val watch: js.UndefOr[js.Function] = js.undefined
  }
  object ColumnCellTemplateData {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): ColumnCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnCellTemplateData[TRowData, TKey]]
    }
    
    extension [Self <: ColumnCellTemplateData[?, ?], TRowData, TKey](x: Self & (ColumnCellTemplateData[TRowData, TKey])) {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait ColumnEditCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxTreeList[TRowData, TKey]
    
    val data: TRowData
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
    
    val setValue: js.UndefOr[Any] = js.undefined
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
    
    val watch: js.UndefOr[js.Function] = js.undefined
  }
  object ColumnEditCellTemplateData {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): ColumnEditCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnEditCellTemplateData[TRowData, TKey]]
    }
    
    extension [Self <: ColumnEditCellTemplateData[?, ?], TRowData, TKey](x: Self & (ColumnEditCellTemplateData[TRowData, TKey])) {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait ColumnHeaderCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxTreeList[TRowData, TKey]
  }
  object ColumnHeaderCellTemplateData {
    
    inline def apply[TRowData, TKey](column: Column[TRowData, TKey], columnIndex: Double, component: dxTreeList[TRowData, TKey]): ColumnHeaderCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnHeaderCellTemplateData[TRowData, TKey]]
    }
    
    extension [Self <: ColumnHeaderCellTemplateData[?, ?], TRowData, TKey](x: Self & (ColumnHeaderCellTemplateData[TRowData, TKey])) {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentReadyEvent[TRowData, TKey] = EventInfo[dxTreeList[TRowData, TKey]]
  
  trait ContextMenuPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val column: js.UndefOr[Column[TRowData, TKey]] = js.undefined
    
    val columnIndex: Double
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    val row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
    
    val rowIndex: Double
    
    val target: String
    
    val targetElement: DxElement_[HTMLElement]
  }
  object ContextMenuPreparingEvent {
    
    inline def apply[TRowData, TKey](
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      rowIndex: Double,
      target: String,
      targetElement: DxElement_[HTMLElement]
    ): ContextMenuPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuPreparingEvent[TRowData, TKey]]
    }
    
    extension [Self <: ContextMenuPreparingEvent[?, ?], TRowData, TKey](x: Self & (ContextMenuPreparingEvent[TRowData, TKey])) {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataErrorOccurredEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with DataErrorOccurredInfo
  object DataErrorOccurredEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement]): DataErrorOccurredEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataErrorOccurredEvent[TRowData, TKey]]
    }
  }
  
  type DisposingEvent[TRowData, TKey] = EventInfo[dxTreeList[TRowData, TKey]]
  
  trait EditCanceledEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with DataChangeInfo[TRowData, TKey]
  object EditCanceledEvent {
    
    inline def apply[TRowData, TKey](
      changes: js.Array[DataChange[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): EditCanceledEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditCanceledEvent[TRowData, TKey]]
    }
  }
  
  trait EditCancelingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]]
       with DataChangeInfo[TRowData, TKey]
  object EditCancelingEvent {
    
    inline def apply[TRowData, TKey](
      changes: js.Array[DataChange[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): EditCancelingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditCancelingEvent[TRowData, TKey]]
    }
  }
  
  trait Editing[TRowData, TKey]
    extends StObject
       with EditingBase[TRowData, TKey] {
    
    /**
      * Specifies whether a user can add new rows. It is called for each data row when defined as a function.
      */
    var allowAdding: js.UndefOr[
        Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])
      ] = js.undefined
    
    /**
      * Specifies whether a user can delete rows. It is called for each data row when defined as a function.
      */
    var allowDeleting: js.UndefOr[
        Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])
      ] = js.undefined
    
    /**
      * Specifies whether a user can update rows. It is called for each data row when defined as a function
      */
    var allowUpdating: js.UndefOr[
        Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])
      ] = js.undefined
    
    /**
      * Contains properties that specify texts for editing-related UI elements.
      */
    @JSName("texts")
    var texts_Editing: js.UndefOr[EditingTexts] = js.undefined
  }
  object Editing {
    
    inline def apply[TRowData, TKey](): Editing[TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Editing[TRowData, TKey]]
    }
    
    extension [Self <: Editing[?, ?], TRowData, TKey](x: Self & (Editing[TRowData, TKey])) {
      
      inline def setAllowAdding(value: Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])): Self = StObject.set(x, "allowAdding", value.asInstanceOf[js.Any])
      
      inline def setAllowAddingFunction1(value: /* options */ ComponentDxTreeList[TRowData, TKey] => Boolean): Self = StObject.set(x, "allowAdding", js.Any.fromFunction1(value))
      
      inline def setAllowAddingUndefined: Self = StObject.set(x, "allowAdding", js.undefined)
      
      inline def setAllowDeleting(value: Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])): Self = StObject.set(x, "allowDeleting", value.asInstanceOf[js.Any])
      
      inline def setAllowDeletingFunction1(value: /* options */ ComponentDxTreeList[TRowData, TKey] => Boolean): Self = StObject.set(x, "allowDeleting", js.Any.fromFunction1(value))
      
      inline def setAllowDeletingUndefined: Self = StObject.set(x, "allowDeleting", js.undefined)
      
      inline def setAllowUpdating(value: Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])): Self = StObject.set(x, "allowUpdating", value.asInstanceOf[js.Any])
      
      inline def setAllowUpdatingFunction1(value: /* options */ ComponentDxTreeList[TRowData, TKey] => Boolean): Self = StObject.set(x, "allowUpdating", js.Any.fromFunction1(value))
      
      inline def setAllowUpdatingUndefined: Self = StObject.set(x, "allowUpdating", js.undefined)
      
      inline def setTexts(value: EditingTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    }
  }
  
  trait EditingStartEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val column: Column[TRowData, TKey]
    
    val data: TRowData
    
    val key: TKey
  }
  object EditingStartEvent {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey
    ): EditingStartEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditingStartEvent[TRowData, TKey]]
    }
    
    extension [Self <: EditingStartEvent[?, ?], TRowData, TKey](x: Self & (EditingStartEvent[TRowData, TKey])) {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditingTexts
    extends StObject
       with EditingTextsBase {
    
    /**
      * Specifies text for the button that adds a new nested row. Applies if the editing.mode is &apos;batch&apos; or &apos;cell&apos;.
      */
    var addRowToNode: js.UndefOr[String] = js.undefined
  }
  object EditingTexts {
    
    inline def apply(): EditingTexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditingTexts]
    }
    
    extension [Self <: EditingTexts](x: Self) {
      
      inline def setAddRowToNode(value: String): Self = StObject.set(x, "addRowToNode", value.asInstanceOf[js.Any])
      
      inline def setAddRowToNodeUndefined: Self = StObject.set(x, "addRowToNode", js.undefined)
    }
  }
  
  trait EditorPreparedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val disabled: Boolean
    
    val editorElement: DxElement_[HTMLElement]
    
    val parentType: String
    
    val readOnly: Boolean
    
    val row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
    
    val rtlEnabled: Boolean
    
    val setValue: js.UndefOr[Any] = js.undefined
    
    val updateValueTimeout: js.UndefOr[Double] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object EditorPreparedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      disabled: Boolean,
      editorElement: DxElement_[HTMLElement],
      element: DxElement_[HTMLElement],
      parentType: String,
      readOnly: Boolean,
      rtlEnabled: Boolean
    ): EditorPreparedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editorElement = editorElement.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rtlEnabled = rtlEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorPreparedEvent[TRowData, TKey]]
    }
    
    extension [Self <: EditorPreparedEvent[?, ?], TRowData, TKey](x: Self & (EditorPreparedEvent[TRowData, TKey])) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
      
      inline def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait EditorPreparingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val disabled: Boolean
    
    val editorElement: DxElement_[HTMLElement]
    
    var editorName: String
    
    var editorOptions: Any
    
    val parentType: String
    
    val readOnly: Boolean
    
    val row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
    
    val rtlEnabled: Boolean
    
    val setValue: js.UndefOr[Any] = js.undefined
    
    var updateValueTimeout: js.UndefOr[Double] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object EditorPreparingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      disabled: Boolean,
      editorElement: DxElement_[HTMLElement],
      editorName: String,
      editorOptions: Any,
      element: DxElement_[HTMLElement],
      parentType: String,
      readOnly: Boolean,
      rtlEnabled: Boolean
    ): EditorPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editorElement = editorElement.asInstanceOf[js.Any], editorName = editorName.asInstanceOf[js.Any], editorOptions = editorOptions.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rtlEnabled = rtlEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorPreparingEvent[TRowData, TKey]]
    }
    
    extension [Self <: EditorPreparingEvent[?, ?], TRowData, TKey](x: Self & (EditorPreparingEvent[TRowData, TKey])) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
      
      inline def setEditorName(value: String): Self = StObject.set(x, "editorName", value.asInstanceOf[js.Any])
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ExplicitTypes[TRowData, TKey] extends StObject {
    
    var AdaptiveDetailRowPreparingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.AdaptiveDetailRowPreparingEvent[TRowData, TKey]
    
    var CellClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.CellClickEvent[TRowData, TKey]
    
    var CellDblClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.CellDblClickEvent[TRowData, TKey]
    
    var CellHoverChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.CellHoverChangedEvent[TRowData, TKey]
    
    var CellPreparedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.CellPreparedEvent[TRowData, TKey]
    
    var ColumnButtonClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.ColumnButtonClickEvent[TRowData, TKey]
    
    var ColumnButtonTemplateData: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.ColumnButtonTemplateData[TRowData, TKey]
    
    var ColumnCellTemplateData: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.ColumnCellTemplateData[TRowData, TKey]
    
    var ColumnEditCellTemplateData: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.ColumnEditCellTemplateData[TRowData, TKey]
    
    var ContentReadyEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.ContentReadyEvent[TRowData, TKey]
    
    var ContextMenuPreparingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.ContextMenuPreparingEvent[TRowData, TKey]
    
    var DataErrorOccurredEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.DataErrorOccurredEvent[TRowData, TKey]
    
    var DisposingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.DisposingEvent[TRowData, TKey]
    
    var EditCanceledEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.EditCanceledEvent[TRowData, TKey]
    
    var EditCancelingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.EditCancelingEvent[TRowData, TKey]
    
    var Editing: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Editing[TRowData, TKey]
    
    var EditingStartEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.EditingStartEvent[TRowData, TKey]
    
    var EditorPreparedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.EditorPreparedEvent[TRowData, TKey]
    
    var EditorPreparingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.EditorPreparingEvent[TRowData, TKey]
    
    var FocusedCellChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.FocusedCellChangedEvent[TRowData, TKey]
    
    var FocusedCellChangingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.FocusedCellChangingEvent[TRowData, TKey]
    
    var FocusedRowChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.FocusedRowChangedEvent[TRowData, TKey]
    
    var FocusedRowChangingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.FocusedRowChangingEvent[TRowData, TKey]
    
    var InitNewRowEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.InitNewRowEvent[TRowData, TKey]
    
    var InitializedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.InitializedEvent[TRowData, TKey]
    
    var KeyDownEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.KeyDownEvent[TRowData, TKey]
    
    var NodesInitializedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.NodesInitializedEvent[TRowData, TKey]
    
    var OptionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.OptionChangedEvent[TRowData, TKey]
    
    var Properties: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Properties[TRowData, TKey]
    
    var RowClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowClickEvent[TRowData, TKey]
    
    var RowCollapsedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowCollapsedEvent[TRowData, TKey]
    
    var RowCollapsingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowCollapsingEvent[TRowData, TKey]
    
    var RowDblClickEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowDblClickEvent[TRowData, TKey]
    
    var RowDraggingAddEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingAddEvent[TRowData, TKey]
    
    var RowDraggingChangeEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingChangeEvent[TRowData, TKey]
    
    var RowDraggingEndEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingEndEvent[TRowData, TKey]
    
    var RowDraggingMoveEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingMoveEvent[TRowData, TKey]
    
    var RowDraggingRemoveEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingRemoveEvent[TRowData, TKey]
    
    var RowDraggingReorderEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingReorderEvent[TRowData, TKey]
    
    var RowDraggingStartEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingStartEvent[TRowData, TKey]
    
    var RowDraggingTemplateData: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingTemplateData[TRowData]
    
    var RowExpandedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowExpandedEvent[TRowData, TKey]
    
    var RowExpandingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowExpandingEvent[TRowData, TKey]
    
    var RowInsertedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowInsertedEvent[TRowData, TKey]
    
    var RowInsertingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowInsertingEvent[TRowData, TKey]
    
    var RowPreparedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowPreparedEvent[TRowData, TKey]
    
    var RowRemovedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowRemovedEvent[TRowData, TKey]
    
    var RowRemovingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowRemovingEvent[TRowData, TKey]
    
    var RowUpdatedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowUpdatedEvent[TRowData, TKey]
    
    var RowUpdatingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowUpdatingEvent[TRowData, TKey]
    
    var RowValidatingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.RowValidatingEvent[TRowData, TKey]
    
    var SavedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.SavedEvent[TRowData, TKey]
    
    var SavingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.SavingEvent[TRowData, TKey]
    
    var Scrolling: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Scrolling
    
    var Selection: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Selection
    
    var SelectionChangedEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.SelectionChangedEvent[TRowData, TKey]
    
    var Toolbar: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.Toolbar
    
    var ToolbarItem: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.ToolbarItem
    
    var ToolbarPreparingEvent: typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList.ToolbarPreparingEvent[TRowData, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TRowData, TKey](
      AdaptiveDetailRowPreparingEvent: AdaptiveDetailRowPreparingEvent[TRowData, TKey],
      CellClickEvent: CellClickEvent[TRowData, TKey],
      CellDblClickEvent: CellDblClickEvent[TRowData, TKey],
      CellHoverChangedEvent: CellHoverChangedEvent[TRowData, TKey],
      CellPreparedEvent: CellPreparedEvent[TRowData, TKey],
      ColumnButtonClickEvent: ColumnButtonClickEvent[TRowData, TKey],
      ColumnButtonTemplateData: ColumnButtonTemplateData[TRowData, TKey],
      ColumnCellTemplateData: ColumnCellTemplateData[TRowData, TKey],
      ColumnEditCellTemplateData: ColumnEditCellTemplateData[TRowData, TKey],
      ContentReadyEvent: ContentReadyEvent[TRowData, TKey],
      ContextMenuPreparingEvent: ContextMenuPreparingEvent[TRowData, TKey],
      DataErrorOccurredEvent: DataErrorOccurredEvent[TRowData, TKey],
      DisposingEvent: DisposingEvent[TRowData, TKey],
      EditCanceledEvent: EditCanceledEvent[TRowData, TKey],
      EditCancelingEvent: EditCancelingEvent[TRowData, TKey],
      Editing: Editing[TRowData, TKey],
      EditingStartEvent: EditingStartEvent[TRowData, TKey],
      EditorPreparedEvent: EditorPreparedEvent[TRowData, TKey],
      EditorPreparingEvent: EditorPreparingEvent[TRowData, TKey],
      FocusedCellChangedEvent: FocusedCellChangedEvent[TRowData, TKey],
      FocusedCellChangingEvent: FocusedCellChangingEvent[TRowData, TKey],
      FocusedRowChangedEvent: FocusedRowChangedEvent[TRowData, TKey],
      FocusedRowChangingEvent: FocusedRowChangingEvent[TRowData, TKey],
      InitNewRowEvent: InitNewRowEvent[TRowData, TKey],
      InitializedEvent: InitializedEvent[TRowData, TKey],
      KeyDownEvent: KeyDownEvent[TRowData, TKey],
      NodesInitializedEvent: NodesInitializedEvent[TRowData, TKey],
      OptionChangedEvent: OptionChangedEvent[TRowData, TKey],
      Properties: Properties[TRowData, TKey],
      RowClickEvent: RowClickEvent[TRowData, TKey],
      RowCollapsedEvent: RowCollapsedEvent[TRowData, TKey],
      RowCollapsingEvent: RowCollapsingEvent[TRowData, TKey],
      RowDblClickEvent: RowDblClickEvent[TRowData, TKey],
      RowDraggingAddEvent: RowDraggingAddEvent[TRowData, TKey],
      RowDraggingChangeEvent: RowDraggingChangeEvent[TRowData, TKey],
      RowDraggingEndEvent: RowDraggingEndEvent[TRowData, TKey],
      RowDraggingMoveEvent: RowDraggingMoveEvent[TRowData, TKey],
      RowDraggingRemoveEvent: RowDraggingRemoveEvent[TRowData, TKey],
      RowDraggingReorderEvent: RowDraggingReorderEvent[TRowData, TKey],
      RowDraggingStartEvent: RowDraggingStartEvent[TRowData, TKey],
      RowDraggingTemplateData: RowDraggingTemplateData[TRowData],
      RowExpandedEvent: RowExpandedEvent[TRowData, TKey],
      RowExpandingEvent: RowExpandingEvent[TRowData, TKey],
      RowInsertedEvent: RowInsertedEvent[TRowData, TKey],
      RowInsertingEvent: RowInsertingEvent[TRowData, TKey],
      RowPreparedEvent: RowPreparedEvent[TRowData, TKey],
      RowRemovedEvent: RowRemovedEvent[TRowData, TKey],
      RowRemovingEvent: RowRemovingEvent[TRowData, TKey],
      RowUpdatedEvent: RowUpdatedEvent[TRowData, TKey],
      RowUpdatingEvent: RowUpdatingEvent[TRowData, TKey],
      RowValidatingEvent: RowValidatingEvent[TRowData, TKey],
      SavedEvent: SavedEvent[TRowData, TKey],
      SavingEvent: SavingEvent[TRowData, TKey],
      Scrolling: Scrolling,
      Selection: Selection,
      SelectionChangedEvent: SelectionChangedEvent[TRowData, TKey],
      Toolbar: Toolbar,
      ToolbarItem: ToolbarItem,
      ToolbarPreparingEvent: ToolbarPreparingEvent[TRowData, TKey]
    ): ExplicitTypes[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(AdaptiveDetailRowPreparingEvent = AdaptiveDetailRowPreparingEvent.asInstanceOf[js.Any], CellClickEvent = CellClickEvent.asInstanceOf[js.Any], CellDblClickEvent = CellDblClickEvent.asInstanceOf[js.Any], CellHoverChangedEvent = CellHoverChangedEvent.asInstanceOf[js.Any], CellPreparedEvent = CellPreparedEvent.asInstanceOf[js.Any], ColumnButtonClickEvent = ColumnButtonClickEvent.asInstanceOf[js.Any], ColumnButtonTemplateData = ColumnButtonTemplateData.asInstanceOf[js.Any], ColumnCellTemplateData = ColumnCellTemplateData.asInstanceOf[js.Any], ColumnEditCellTemplateData = ColumnEditCellTemplateData.asInstanceOf[js.Any], ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], ContextMenuPreparingEvent = ContextMenuPreparingEvent.asInstanceOf[js.Any], DataErrorOccurredEvent = DataErrorOccurredEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], EditCanceledEvent = EditCanceledEvent.asInstanceOf[js.Any], EditCancelingEvent = EditCancelingEvent.asInstanceOf[js.Any], Editing = Editing.asInstanceOf[js.Any], EditingStartEvent = EditingStartEvent.asInstanceOf[js.Any], EditorPreparedEvent = EditorPreparedEvent.asInstanceOf[js.Any], EditorPreparingEvent = EditorPreparingEvent.asInstanceOf[js.Any], FocusedCellChangedEvent = FocusedCellChangedEvent.asInstanceOf[js.Any], FocusedCellChangingEvent = FocusedCellChangingEvent.asInstanceOf[js.Any], FocusedRowChangedEvent = FocusedRowChangedEvent.asInstanceOf[js.Any], FocusedRowChangingEvent = FocusedRowChangingEvent.asInstanceOf[js.Any], InitNewRowEvent = InitNewRowEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], KeyDownEvent = KeyDownEvent.asInstanceOf[js.Any], NodesInitializedEvent = NodesInitializedEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], RowClickEvent = RowClickEvent.asInstanceOf[js.Any], RowCollapsedEvent = RowCollapsedEvent.asInstanceOf[js.Any], RowCollapsingEvent = RowCollapsingEvent.asInstanceOf[js.Any], RowDblClickEvent = RowDblClickEvent.asInstanceOf[js.Any], RowDraggingAddEvent = RowDraggingAddEvent.asInstanceOf[js.Any], RowDraggingChangeEvent = RowDraggingChangeEvent.asInstanceOf[js.Any], RowDraggingEndEvent = RowDraggingEndEvent.asInstanceOf[js.Any], RowDraggingMoveEvent = RowDraggingMoveEvent.asInstanceOf[js.Any], RowDraggingRemoveEvent = RowDraggingRemoveEvent.asInstanceOf[js.Any], RowDraggingReorderEvent = RowDraggingReorderEvent.asInstanceOf[js.Any], RowDraggingStartEvent = RowDraggingStartEvent.asInstanceOf[js.Any], RowDraggingTemplateData = RowDraggingTemplateData.asInstanceOf[js.Any], RowExpandedEvent = RowExpandedEvent.asInstanceOf[js.Any], RowExpandingEvent = RowExpandingEvent.asInstanceOf[js.Any], RowInsertedEvent = RowInsertedEvent.asInstanceOf[js.Any], RowInsertingEvent = RowInsertingEvent.asInstanceOf[js.Any], RowPreparedEvent = RowPreparedEvent.asInstanceOf[js.Any], RowRemovedEvent = RowRemovedEvent.asInstanceOf[js.Any], RowRemovingEvent = RowRemovingEvent.asInstanceOf[js.Any], RowUpdatedEvent = RowUpdatedEvent.asInstanceOf[js.Any], RowUpdatingEvent = RowUpdatingEvent.asInstanceOf[js.Any], RowValidatingEvent = RowValidatingEvent.asInstanceOf[js.Any], SavedEvent = SavedEvent.asInstanceOf[js.Any], SavingEvent = SavingEvent.asInstanceOf[js.Any], Scrolling = Scrolling.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any], ToolbarItem = ToolbarItem.asInstanceOf[js.Any], ToolbarPreparingEvent = ToolbarPreparingEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TRowData, TKey]]
    }
    
    extension [Self <: ExplicitTypes[?, ?], TRowData, TKey](x: Self & (ExplicitTypes[TRowData, TKey])) {
      
      inline def setAdaptiveDetailRowPreparingEvent(value: AdaptiveDetailRowPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "AdaptiveDetailRowPreparingEvent", value.asInstanceOf[js.Any])
      
      inline def setCellClickEvent(value: CellClickEvent[TRowData, TKey]): Self = StObject.set(x, "CellClickEvent", value.asInstanceOf[js.Any])
      
      inline def setCellDblClickEvent(value: CellDblClickEvent[TRowData, TKey]): Self = StObject.set(x, "CellDblClickEvent", value.asInstanceOf[js.Any])
      
      inline def setCellHoverChangedEvent(value: CellHoverChangedEvent[TRowData, TKey]): Self = StObject.set(x, "CellHoverChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setCellPreparedEvent(value: CellPreparedEvent[TRowData, TKey]): Self = StObject.set(x, "CellPreparedEvent", value.asInstanceOf[js.Any])
      
      inline def setColumnButtonClickEvent(value: ColumnButtonClickEvent[TRowData, TKey]): Self = StObject.set(x, "ColumnButtonClickEvent", value.asInstanceOf[js.Any])
      
      inline def setColumnButtonTemplateData(value: ColumnButtonTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnButtonTemplateData", value.asInstanceOf[js.Any])
      
      inline def setColumnCellTemplateData(value: ColumnCellTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnCellTemplateData", value.asInstanceOf[js.Any])
      
      inline def setColumnEditCellTemplateData(value: ColumnEditCellTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnEditCellTemplateData", value.asInstanceOf[js.Any])
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TRowData, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setContextMenuPreparingEvent(value: ContextMenuPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "ContextMenuPreparingEvent", value.asInstanceOf[js.Any])
      
      inline def setDataErrorOccurredEvent(value: DataErrorOccurredEvent[TRowData, TKey]): Self = StObject.set(x, "DataErrorOccurredEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TRowData, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setEditCanceledEvent(value: EditCanceledEvent[TRowData, TKey]): Self = StObject.set(x, "EditCanceledEvent", value.asInstanceOf[js.Any])
      
      inline def setEditCancelingEvent(value: EditCancelingEvent[TRowData, TKey]): Self = StObject.set(x, "EditCancelingEvent", value.asInstanceOf[js.Any])
      
      inline def setEditing(value: Editing[TRowData, TKey]): Self = StObject.set(x, "Editing", value.asInstanceOf[js.Any])
      
      inline def setEditingStartEvent(value: EditingStartEvent[TRowData, TKey]): Self = StObject.set(x, "EditingStartEvent", value.asInstanceOf[js.Any])
      
      inline def setEditorPreparedEvent(value: EditorPreparedEvent[TRowData, TKey]): Self = StObject.set(x, "EditorPreparedEvent", value.asInstanceOf[js.Any])
      
      inline def setEditorPreparingEvent(value: EditorPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "EditorPreparingEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellChangedEvent(value: FocusedCellChangedEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedCellChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellChangingEvent(value: FocusedCellChangingEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedCellChangingEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedRowChangedEvent(value: FocusedRowChangedEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedRowChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedRowChangingEvent(value: FocusedRowChangingEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedRowChangingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitNewRowEvent(value: InitNewRowEvent[TRowData, TKey]): Self = StObject.set(x, "InitNewRowEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TRowData, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setKeyDownEvent(value: KeyDownEvent[TRowData, TKey]): Self = StObject.set(x, "KeyDownEvent", value.asInstanceOf[js.Any])
      
      inline def setNodesInitializedEvent(value: NodesInitializedEvent[TRowData, TKey]): Self = StObject.set(x, "NodesInitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TRowData, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TRowData, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
      inline def setRowClickEvent(value: RowClickEvent[TRowData, TKey]): Self = StObject.set(x, "RowClickEvent", value.asInstanceOf[js.Any])
      
      inline def setRowCollapsedEvent(value: RowCollapsedEvent[TRowData, TKey]): Self = StObject.set(x, "RowCollapsedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowCollapsingEvent(value: RowCollapsingEvent[TRowData, TKey]): Self = StObject.set(x, "RowCollapsingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDblClickEvent(value: RowDblClickEvent[TRowData, TKey]): Self = StObject.set(x, "RowDblClickEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingAddEvent(value: RowDraggingAddEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingAddEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingChangeEvent(value: RowDraggingChangeEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingChangeEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingEndEvent(value: RowDraggingEndEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingEndEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingMoveEvent(value: RowDraggingMoveEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingMoveEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingRemoveEvent(value: RowDraggingRemoveEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingRemoveEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingReorderEvent(value: RowDraggingReorderEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingReorderEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingStartEvent(value: RowDraggingStartEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingStartEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingTemplateData(value: RowDraggingTemplateData[TRowData]): Self = StObject.set(x, "RowDraggingTemplateData", value.asInstanceOf[js.Any])
      
      inline def setRowExpandedEvent(value: RowExpandedEvent[TRowData, TKey]): Self = StObject.set(x, "RowExpandedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowExpandingEvent(value: RowExpandingEvent[TRowData, TKey]): Self = StObject.set(x, "RowExpandingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowInsertedEvent(value: RowInsertedEvent[TRowData, TKey]): Self = StObject.set(x, "RowInsertedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowInsertingEvent(value: RowInsertingEvent[TRowData, TKey]): Self = StObject.set(x, "RowInsertingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowPreparedEvent(value: RowPreparedEvent[TRowData, TKey]): Self = StObject.set(x, "RowPreparedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowRemovedEvent(value: RowRemovedEvent[TRowData, TKey]): Self = StObject.set(x, "RowRemovedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowRemovingEvent(value: RowRemovingEvent[TRowData, TKey]): Self = StObject.set(x, "RowRemovingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowUpdatedEvent(value: RowUpdatedEvent[TRowData, TKey]): Self = StObject.set(x, "RowUpdatedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowUpdatingEvent(value: RowUpdatingEvent[TRowData, TKey]): Self = StObject.set(x, "RowUpdatingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowValidatingEvent(value: RowValidatingEvent[TRowData, TKey]): Self = StObject.set(x, "RowValidatingEvent", value.asInstanceOf[js.Any])
      
      inline def setSavedEvent(value: SavedEvent[TRowData, TKey]): Self = StObject.set(x, "SavedEvent", value.asInstanceOf[js.Any])
      
      inline def setSavingEvent(value: SavingEvent[TRowData, TKey]): Self = StObject.set(x, "SavingEvent", value.asInstanceOf[js.Any])
      
      inline def setScrolling(value: Scrolling): Self = StObject.set(x, "Scrolling", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TRowData, TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: Toolbar): Self = StObject.set(x, "Toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarItem(value: ToolbarItem): Self = StObject.set(x, "ToolbarItem", value.asInstanceOf[js.Any])
      
      inline def setToolbarPreparingEvent(value: ToolbarPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "ToolbarPreparingEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusedCellChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val cellElement: DxElement_[HTMLElement]
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
  }
  object FocusedCellChangedEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      row: Row[TRowData, TKey],
      rowIndex: Double
    ): FocusedCellChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedCellChangedEvent[TRowData, TKey]]
    }
    
    extension [Self <: FocusedCellChangedEvent[?, ?], TRowData, TKey](x: Self & (FocusedCellChangedEvent[TRowData, TKey])) {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusedCellChangingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with NativeEventInfo[dxTreeList[TRowData, TKey], KeyboardEvent | PointerEvent | MouseEvent | TouchEvent] {
    
    val cellElement: DxElement_[HTMLElement]
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    var isHighlighted: Boolean
    
    var newColumnIndex: Double
    
    var newRowIndex: Double
    
    val prevColumnIndex: Double
    
    val prevRowIndex: Double
    
    val rows: js.Array[Row[TRowData, TKey]]
  }
  object FocusedCellChangingEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      columns: js.Array[Column[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      isHighlighted: Boolean,
      newColumnIndex: Double,
      newRowIndex: Double,
      prevColumnIndex: Double,
      prevRowIndex: Double,
      rows: js.Array[Row[TRowData, TKey]]
    ): FocusedCellChangingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], isHighlighted = isHighlighted.asInstanceOf[js.Any], newColumnIndex = newColumnIndex.asInstanceOf[js.Any], newRowIndex = newRowIndex.asInstanceOf[js.Any], prevColumnIndex = prevColumnIndex.asInstanceOf[js.Any], prevRowIndex = prevRowIndex.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedCellChangingEvent[TRowData, TKey]]
    }
    
    extension [Self <: FocusedCellChangingEvent[?, ?], TRowData, TKey](x: Self & (FocusedCellChangingEvent[TRowData, TKey])) {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
      
      inline def setNewColumnIndex(value: Double): Self = StObject.set(x, "newColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setNewRowIndex(value: Double): Self = StObject.set(x, "newRowIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevColumnIndex(value: Double): Self = StObject.set(x, "prevColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevRowIndex(value: Double): Self = StObject.set(x, "prevRowIndex", value.asInstanceOf[js.Any])
      
      inline def setRows(value: js.Array[Row[TRowData, TKey]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: (Row[TRowData, TKey])*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  trait FocusedRowChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val row: Row[TRowData, TKey]
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
  }
  object FocusedRowChangedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      row: Row[TRowData, TKey],
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double
    ): FocusedRowChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedRowChangedEvent[TRowData, TKey]]
    }
    
    extension [Self <: FocusedRowChangedEvent[?, ?], TRowData, TKey](x: Self & (FocusedRowChangedEvent[TRowData, TKey])) {
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusedRowChangingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with NativeEventInfo[dxTreeList[TRowData, TKey], KeyboardEvent | PointerEvent | MouseEvent | TouchEvent] {
    
    var newRowIndex: Double
    
    val prevRowIndex: Double
    
    val rowElement: DxElement_[HTMLElement]
    
    val rows: js.Array[Row[TRowData, TKey]]
  }
  object FocusedRowChangingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      newRowIndex: Double,
      prevRowIndex: Double,
      rowElement: DxElement_[HTMLElement],
      rows: js.Array[Row[TRowData, TKey]]
    ): FocusedRowChangingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], newRowIndex = newRowIndex.asInstanceOf[js.Any], prevRowIndex = prevRowIndex.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedRowChangingEvent[TRowData, TKey]]
    }
    
    extension [Self <: FocusedRowChangingEvent[?, ?], TRowData, TKey](x: Self & (FocusedRowChangingEvent[TRowData, TKey])) {
      
      inline def setNewRowIndex(value: Double): Self = StObject.set(x, "newRowIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevRowIndex(value: Double): Self = StObject.set(x, "prevRowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRows(value: js.Array[Row[TRowData, TKey]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: (Row[TRowData, TKey])*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  trait InitNewRowEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with NewRowInfo[TRowData]
  object InitNewRowEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], data: TRowData, element: DxElement_[HTMLElement]): InitNewRowEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitNewRowEvent[TRowData, TKey]]
    }
  }
  
  type InitializedEvent[TRowData, TKey] = InitializedEventInfo[dxTreeList[TRowData, TKey]]
  
  trait KeyDownEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], KeyboardEvent]
       with KeyDownInfo
  object KeyDownEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], handled: Boolean): KeyDownEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDownEvent[TRowData, TKey]]
    }
  }
  
  trait Node[TRowData, TKey] extends StObject {
    
    /**
      * Contains all child nodes.
      */
    var children: js.UndefOr[js.Array[Node[TRowData, TKey]]] = js.undefined
    
    /**
      * The node&apos;s data object.
      */
    var data: js.UndefOr[TRowData] = js.undefined
    
    /**
      * Indicates whether the node has child nodes.
      */
    var hasChildren: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The node&apos;s key.
      */
    var key: TKey
    
    /**
      * The node&apos;s hierarchical level.
      */
    var level: Double
    
    /**
      * The parent node.
      */
    var parent: js.UndefOr[Node[TRowData, TKey]] = js.undefined
    
    /**
      * Indicates whether the node is visualized as a row.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Node {
    
    inline def apply[TRowData, TKey](key: TKey, level: Double): Node[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[TRowData, TKey]]
    }
    
    extension [Self <: Node[?, ?], TRowData, TKey](x: Self & (Node[TRowData, TKey])) {
      
      inline def setChildren(value: js.Array[Node[TRowData, TKey]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Node[TRowData, TKey])*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Node[TRowData, TKey]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait NodesInitializedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val root: Node[TRowData, TKey]
  }
  object NodesInitializedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      root: Node[TRowData, TKey]
    ): NodesInitializedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodesInitializedEvent[TRowData, TKey]]
    }
    
    extension [Self <: NodesInitializedEvent[?, ?], TRowData, TKey](x: Self & (NodesInitializedEvent[TRowData, TKey])) {
      
      inline def setRoot(value: Node[TRowData, TKey]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TRowData, TKey]]
    }
  }
  
  trait Paging
    extends StObject
       with PagingBase
  object Paging {
    
    inline def apply(): Paging = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Paging]
    }
  }
  
  type Properties[TRowData, TKey] = dxTreeListOptions[TRowData, TKey]
  
  trait Row[TRowData, TKey] extends StObject {
    
    /**
      * A data object that the row visualizes.
      */
    val data: TRowData
    
    /**
      * Indicates whether the row is in the editing state.
      */
    val isEditing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether the row is expanded or collapsed. Available if rowType is &apos;data&apos;.
      */
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates that the row is added, but not yet saved. Available if rowType is &apos;data&apos;.
      */
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether the row is selected. Available if rowType is &apos;data&apos; or &apos;detail&apos;.
      */
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The row&apos;s key. Available if rowType is &apos;data&apos;, &apos;detail&apos; or &apos;detailAdaptive&apos;.
      */
    val key: TKey
    
    /**
      * The row&apos;s hierarchical level. Available if rowType is &apos;data&apos; or &apos;detail&apos;.
      */
    val level: Double
    
    /**
      * The row&apos;s node. Available if rowType is &apos;data&apos; or &apos;detail&apos;.
      */
    val node: Node[TRowData, TKey]
    
    /**
      * The row&apos;s visible index. This index is zero-based and available if rowType is &apos;data&apos;, &apos;detail&apos; or &apos;detailAdaptive&apos;.
      */
    val rowIndex: Double
    
    /**
      * The row&apos;s type.
      */
    val rowType: String
    
    /**
      * Values displayed in the row&apos;s cells.
      */
    val values: js.Array[Any]
  }
  object Row {
    
    inline def apply[TRowData, TKey](
      data: TRowData,
      key: TKey,
      level: Double,
      node: Node[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): Row[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Row[TRowData, TKey]]
    }
    
    extension [Self <: Row[?, ?], TRowData, TKey](x: Self & (Row[TRowData, TKey])) {
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node[TRowData, TKey]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent] {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val data: TRowData
    
    val handled: Boolean
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val level: Double
    
    val node: Node[TRowData, TKey]
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
    
    val rowType: String
    
    val values: js.Array[Any]
  }
  object RowClickEvent {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      handled: Boolean,
      key: TKey,
      level: Double,
      node: Node[TRowData, TKey],
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): RowClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowClickEvent[TRowData, TKey]]
    }
    
    extension [Self <: RowClickEvent[?, ?], TRowData, TKey](x: Self & (RowClickEvent[TRowData, TKey])) {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node[TRowData, TKey]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowCollapsedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowCollapsedEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowCollapsedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowCollapsedEvent[TRowData, TKey]]
    }
  }
  
  trait RowCollapsingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowCollapsingEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowCollapsingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowCollapsingEvent[TRowData, TKey]]
    }
  }
  
  trait RowDblClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent] {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val data: TRowData
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
    
    val rowType: String
    
    val values: js.Array[Any]
  }
  object RowDblClickEvent {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): RowDblClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDblClickEvent[TRowData, TKey]]
    }
    
    extension [Self <: RowDblClickEvent[?, ?], TRowData, TKey](x: Self & (RowDblClickEvent[TRowData, TKey])) {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowDraggingAddEvent[TRowData, TKey]
    extends StObject
       with RowDraggingEventInfo[dxTreeList[TRowData, TKey], TRowData, TKey]
       with DragDropInfo
  object RowDraggingAddEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingAddEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingAddEvent[TRowData, TKey]]
    }
  }
  
  trait RowDraggingChangeEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with RowDraggingEventInfo[dxTreeList[TRowData, TKey], TRowData, TKey]
       with DragDropInfo
  object RowDraggingChangeEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingChangeEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingChangeEvent[TRowData, TKey]]
    }
  }
  
  trait RowDraggingEndEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with RowDraggingEventInfo[dxTreeList[TRowData, TKey], TRowData, TKey]
       with DragDropInfo
  object RowDraggingEndEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingEndEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingEndEvent[TRowData, TKey]]
    }
  }
  
  trait RowDraggingMoveEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with RowDraggingEventInfo[dxTreeList[TRowData, TKey], TRowData, TKey]
       with DragDropInfo
  object RowDraggingMoveEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingMoveEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingMoveEvent[TRowData, TKey]]
    }
  }
  
  type RowDraggingRemoveEvent[TRowData, TKey] = RowDraggingEventInfo[dxTreeList[TRowData, TKey], TRowData, TKey]
  
  trait RowDraggingReorderEvent[TRowData, TKey]
    extends StObject
       with RowDraggingEventInfo[dxTreeList[TRowData, TKey], TRowData, TKey]
       with DragReorderInfo
  object RowDraggingReorderEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingReorderEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingReorderEvent[TRowData, TKey]]
    }
  }
  
  trait RowDraggingStartEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with DragStartEventInfo[dxTreeList[TRowData, TKey], TRowData, TKey]
  object RowDraggingStartEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement]
    ): RowDraggingStartEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingStartEvent[TRowData, TKey]]
    }
  }
  
  type RowDraggingTemplateData[TRowData] = RowDraggingTemplateDataModel[TRowData]
  
  trait RowExpandedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowExpandedEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowExpandedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowExpandedEvent[TRowData, TKey]]
    }
  }
  
  trait RowExpandingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowExpandingEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowExpandingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowExpandingEvent[TRowData, TKey]]
    }
  }
  
  trait RowInsertedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowInsertedInfo[TRowData, TKey]
  object RowInsertedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      error: js.Error,
      key: TKey
    ): RowInsertedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowInsertedEvent[TRowData, TKey]]
    }
  }
  
  trait RowInsertingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowInsertingInfo[TRowData]
  object RowInsertingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean | PromiseLike[Unit],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement]
    ): RowInsertingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowInsertingEvent[TRowData, TKey]]
    }
  }
  
  trait RowPreparedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val data: TRowData
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val level: Double
    
    val node: Node[TRowData, TKey]
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
    
    val rowType: String
    
    val values: js.Array[Any]
  }
  object RowPreparedEvent {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      level: Double,
      node: Node[TRowData, TKey],
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): RowPreparedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowPreparedEvent[TRowData, TKey]]
    }
    
    extension [Self <: RowPreparedEvent[?, ?], TRowData, TKey](x: Self & (RowPreparedEvent[TRowData, TKey])) {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node[TRowData, TKey]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowRemovedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowRemovedInfo[TRowData, TKey]
  object RowRemovedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      error: js.Error,
      key: TKey
    ): RowRemovedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowRemovedEvent[TRowData, TKey]]
    }
  }
  
  trait RowRemovingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowRemovingInfo[TRowData, TKey]
  object RowRemovingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean | PromiseLike[Unit],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey
    ): RowRemovingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowRemovingEvent[TRowData, TKey]]
    }
  }
  
  trait RowUpdatedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowUpdatedInfo[TRowData, TKey]
  object RowUpdatedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      error: js.Error,
      key: TKey
    ): RowUpdatedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowUpdatedEvent[TRowData, TKey]]
    }
  }
  
  trait RowUpdatingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowUpdatingInfo[TRowData, TKey]
  object RowUpdatingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean | PromiseLike[Unit],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      key: TKey,
      newData: DeepPartial[TRowData],
      oldData: TRowData
    ): RowUpdatingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowUpdatingEvent[TRowData, TKey]]
    }
  }
  
  trait RowValidatingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowValidatingInfo[TRowData, TKey]
  object RowValidatingEvent {
    
    inline def apply[TRowData, TKey](
      brokenRules: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      errorText: String,
      isValid: Boolean,
      key: TKey,
      newData: DeepPartial[TRowData],
      oldData: TRowData
    ): RowValidatingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(brokenRules = brokenRules.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowValidatingEvent[TRowData, TKey]]
    }
  }
  
  trait SavedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with DataChangeInfo[TRowData, TKey]
  object SavedEvent {
    
    inline def apply[TRowData, TKey](
      changes: js.Array[DataChange[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): SavedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavedEvent[TRowData, TKey]]
    }
  }
  
  trait SavingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with SavingInfo[TRowData, TKey]
  object SavingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean,
      changes: js.Array[DataChange[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): SavingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavingEvent[TRowData, TKey]]
    }
  }
  
  /* Inlined devextreme.devextreme.DevExpress.core.Skip<devextreme.devextreme.DevExpress.ui.dxScrollable<devextreme.devextreme.DevExpress.ui.dxScrollable.Properties>, '_templateManager' | '_cancelOptionChange' | '_getTemplate' | '_invalidate' | '_refresh' | '_notifyOptionChanged' | '_createElement'> */
  trait Scrollable extends StObject {
    
    @JSName("$element")
    def $element(): UserDefinedElement[Element]
    @JSName("$element")
    var $element_Original: js.Function0[UserDefinedElement[Element]]
    
    def beginUpdate(): Unit
    @JSName("beginUpdate")
    var beginUpdate_Original: js.Function0[Unit]
    
    def clientHeight(): Double
    @JSName("clientHeight")
    var clientHeight_Original: js.Function0[Double]
    
    def clientWidth(): Double
    @JSName("clientWidth")
    var clientWidth_Original: js.Function0[Double]
    
    def content(): DxElement_[HTMLElement]
    @JSName("content")
    var content_Original: js.Function0[DxElement_[HTMLElement]]
    
    def dispose(): Unit
    @JSName("dispose")
    var dispose_Original: js.Function0[Unit]
    
    def element(): DxElement_[HTMLElement]
    @JSName("element")
    var element_Original: js.Function0[DxElement_[HTMLElement]]
    
    def endUpdate(): Unit
    @JSName("endUpdate")
    var endUpdate_Original: js.Function0[Unit]
    
    def instance(): this.type
    @JSName("instance")
    var instance_Original: js.Function0[this.type]
    
    def off(eventName: String): this.type
    @JSName("off")
    var off_Original: js.Function1[/* eventName */ String, this.type]
    
    def on(eventName: String, eventHandler: js.Function): this.type
    @JSName("on")
    var on_Original: js.Function2[/* eventName */ String, /* eventHandler */ js.Function, this.type]
    
    def option(): typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollable.Properties
    @JSName("option")
    var option_Original: js.Function0[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollable.Properties]
    
    def resetOption(optionName: String): Unit
    @JSName("resetOption")
    var resetOption_Original: js.Function1[/* optionName */ String, Unit]
    
    def scrollBy(distance: Any): Unit
    def scrollBy(distance: Double): Unit
    @JSName("scrollBy")
    var scrollBy_Original: js.Function1[/* distance */ Double | Any, Unit]
    
    def scrollHeight(): Double
    @JSName("scrollHeight")
    var scrollHeight_Original: js.Function0[Double]
    
    def scrollLeft(): Double
    @JSName("scrollLeft")
    var scrollLeft_Original: js.Function0[Double]
    
    def scrollOffset(): Any
    @JSName("scrollOffset")
    var scrollOffset_Original: js.Function0[Any]
    
    def scrollTo(targetLocation: Any): Unit
    def scrollTo(targetLocation: Double): Unit
    
    def scrollToElement(element: UserDefinedElement[Element]): Unit
    @JSName("scrollToElement")
    var scrollToElement_Original: js.Function1[/* element */ UserDefinedElement[Element], Unit]
    
    @JSName("scrollTo")
    var scrollTo_Original: js.Function1[/* targetLocation */ Double | Any, Unit]
    
    def scrollTop(): Double
    @JSName("scrollTop")
    var scrollTop_Original: js.Function0[Double]
    
    def scrollWidth(): Double
    @JSName("scrollWidth")
    var scrollWidth_Original: js.Function0[Double]
    
    def update(): DxPromise[Unit]
    @JSName("update")
    var update_Original: js.Function0[DxPromise[Unit]]
  }
  object Scrollable {
    
    inline def apply(
      $element: CallbackTo[UserDefinedElement[Element]],
      beginUpdate: Callback,
      clientHeight: CallbackTo[Double],
      clientWidth: CallbackTo[Double],
      content: CallbackTo[DxElement_[HTMLElement]],
      dispose: Callback,
      element: CallbackTo[DxElement_[HTMLElement]],
      endUpdate: Callback,
      instance: CallbackTo[Scrollable],
      off: /* eventName */ String => Scrollable,
      on: (/* eventName */ String, /* eventHandler */ js.Function) => Scrollable,
      option: CallbackTo[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollable.Properties],
      resetOption: /* optionName */ String => Callback,
      scrollBy: /* distance */ Double | Any => Callback,
      scrollHeight: CallbackTo[Double],
      scrollLeft: CallbackTo[Double],
      scrollOffset: CallbackTo[Any],
      scrollTo: /* targetLocation */ Double | Any => Callback,
      scrollToElement: /* element */ UserDefinedElement[Element] => Callback,
      scrollTop: CallbackTo[Double],
      scrollWidth: CallbackTo[Double],
      update: CallbackTo[DxPromise[Unit]]
    ): Scrollable = {
      val __obj = js.Dynamic.literal($element = $element.toJsFn, beginUpdate = beginUpdate.toJsFn, clientHeight = clientHeight.toJsFn, clientWidth = clientWidth.toJsFn, content = content.toJsFn, dispose = dispose.toJsFn, element = element.toJsFn, endUpdate = endUpdate.toJsFn, instance = instance.toJsFn, off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), option = option.toJsFn, resetOption = js.Any.fromFunction1((t0: /* optionName */ String) => resetOption(t0).runNow()), scrollBy = js.Any.fromFunction1((t0: /* distance */ Double | Any) => scrollBy(t0).runNow()), scrollHeight = scrollHeight.toJsFn, scrollLeft = scrollLeft.toJsFn, scrollOffset = scrollOffset.toJsFn, scrollTo = js.Any.fromFunction1((t0: /* targetLocation */ Double | Any) => scrollTo(t0).runNow()), scrollToElement = js.Any.fromFunction1((t0: /* element */ UserDefinedElement[Element]) => scrollToElement(t0).runNow()), scrollTop = scrollTop.toJsFn, scrollWidth = scrollWidth.toJsFn, update = update.toJsFn)
      __obj.asInstanceOf[Scrollable]
    }
    
    extension [Self <: Scrollable](x: Self) {
      
      inline def set$element(value: CallbackTo[UserDefinedElement[Element]]): Self = StObject.set(x, "$element", value.toJsFn)
      
      inline def setBeginUpdate(value: Callback): Self = StObject.set(x, "beginUpdate", value.toJsFn)
      
      inline def setClientHeight(value: CallbackTo[Double]): Self = StObject.set(x, "clientHeight", value.toJsFn)
      
      inline def setClientWidth(value: CallbackTo[Double]): Self = StObject.set(x, "clientWidth", value.toJsFn)
      
      inline def setContent(value: CallbackTo[DxElement_[HTMLElement]]): Self = StObject.set(x, "content", value.toJsFn)
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setElement(value: CallbackTo[DxElement_[HTMLElement]]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setEndUpdate(value: Callback): Self = StObject.set(x, "endUpdate", value.toJsFn)
      
      inline def setInstance(value: CallbackTo[Scrollable]): Self = StObject.set(x, "instance", value.toJsFn)
      
      inline def setOff(value: /* eventName */ String => Scrollable): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
      
      inline def setOn(value: (/* eventName */ String, /* eventHandler */ js.Function) => Scrollable): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOption(value: CallbackTo[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollable.Properties]): Self = StObject.set(x, "option", value.toJsFn)
      
      inline def setResetOption(value: /* optionName */ String => Callback): Self = StObject.set(x, "resetOption", js.Any.fromFunction1((t0: /* optionName */ String) => value(t0).runNow()))
      
      inline def setScrollBy(value: /* distance */ Double | Any => Callback): Self = StObject.set(x, "scrollBy", js.Any.fromFunction1((t0: /* distance */ Double | Any) => value(t0).runNow()))
      
      inline def setScrollHeight(value: CallbackTo[Double]): Self = StObject.set(x, "scrollHeight", value.toJsFn)
      
      inline def setScrollLeft(value: CallbackTo[Double]): Self = StObject.set(x, "scrollLeft", value.toJsFn)
      
      inline def setScrollOffset(value: CallbackTo[Any]): Self = StObject.set(x, "scrollOffset", value.toJsFn)
      
      inline def setScrollTo(value: /* targetLocation */ Double | Any => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1((t0: /* targetLocation */ Double | Any) => value(t0).runNow()))
      
      inline def setScrollToElement(value: /* element */ UserDefinedElement[Element] => Callback): Self = StObject.set(x, "scrollToElement", js.Any.fromFunction1((t0: /* element */ UserDefinedElement[Element]) => value(t0).runNow()))
      
      inline def setScrollTop(value: CallbackTo[Double]): Self = StObject.set(x, "scrollTop", value.toJsFn)
      
      inline def setScrollWidth(value: CallbackTo[Double]): Self = StObject.set(x, "scrollWidth", value.toJsFn)
      
      inline def setUpdate(value: CallbackTo[DxPromise[Unit]]): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
  
  trait Scrolling
    extends StObject
       with ScrollingBase {
    
    /**
      * Specifies the scrolling mode.
      */
    var mode: js.UndefOr[ScrollMode] = js.undefined
  }
  object Scrolling {
    
    inline def apply(): Scrolling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scrolling]
    }
    
    extension [Self <: Scrolling](x: Self) {
      
      inline def setMode(value: ScrollMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Selection
    extends StObject
       with SelectionBase {
    
    /**
      * Specifies whether selection is recursive.
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Selection {
    
    inline def apply(): Selection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selection]
    }
    
    extension [Self <: Selection](x: Self) {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait SelectionChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with SelectionChangedInfo[TRowData, TKey]
  object SelectionChangedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      currentDeselectedRowKeys: js.Array[TKey],
      currentSelectedRowKeys: js.Array[TKey],
      element: DxElement_[HTMLElement],
      selectedRowKeys: js.Array[TKey],
      selectedRowsData: js.Array[TRowData]
    ): SelectionChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], currentDeselectedRowKeys = currentDeselectedRowKeys.asInstanceOf[js.Any], currentSelectedRowKeys = currentSelectedRowKeys.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], selectedRowKeys = selectedRowKeys.asInstanceOf[js.Any], selectedRowsData = selectedRowsData.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent[TRowData, TKey]]
    }
  }
  
  trait Toolbar extends StObject {
    
    /**
      * Specifies whether the toolbar responds to user interaction.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures toolbar items.
      */
    var items: js.UndefOr[js.Array[TreeListPredefinedToolbarItem | ToolbarItem]] = js.undefined
    
    /**
      * Specifies whether the toolbar is visible.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Toolbar {
    
    inline def apply(): Toolbar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Toolbar]
    }
    
    extension [Self <: Toolbar](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItems(value: js.Array[TreeListPredefinedToolbarItem | ToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (TreeListPredefinedToolbarItem | ToolbarItem)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait ToolbarItem
    extends StObject
       with dxToolbarItem {
    
    /**
      * A name used to identify the toolbar item.
      */
    var name: js.UndefOr[TreeListPredefinedToolbarItem | String] = js.undefined
  }
  object ToolbarItem {
    
    inline def apply(): ToolbarItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarItem]
    }
    
    extension [Self <: ToolbarItem](x: Self) {
      
      inline def setName(value: TreeListPredefinedToolbarItem | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ToolbarPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with ToolbarPreparingInfo
  object ToolbarPreparingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      toolbarOptions: dxToolbarOptions[Any, Any]
    ): ToolbarPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], toolbarOptions = toolbarOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarPreparingEvent[TRowData, TKey]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.adaptive
    - typingsJapgolly.devextreme.devextremeStrings.buttons
    - typingsJapgolly.devextreme.devextremeStrings.drag
  */
  trait TreeListCommandColumnType extends StObject
  object TreeListCommandColumnType {
    
    inline def adaptive: typingsJapgolly.devextreme.devextremeStrings.adaptive = "adaptive".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.adaptive]
    
    inline def buttons: typingsJapgolly.devextreme.devextremeStrings.buttons = "buttons".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.buttons]
    
    inline def drag: typingsJapgolly.devextreme.devextremeStrings.drag = "drag".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.drag]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.fullBranch
    - typingsJapgolly.devextreme.devextremeStrings.withAncestors
    - typingsJapgolly.devextreme.devextremeStrings.matchOnly
  */
  trait TreeListFilterMode extends StObject
  object TreeListFilterMode {
    
    inline def fullBranch: typingsJapgolly.devextreme.devextremeStrings.fullBranch = "fullBranch".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.fullBranch]
    
    inline def matchOnly: typingsJapgolly.devextreme.devextremeStrings.matchOnly = "matchOnly".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.matchOnly]
    
    inline def withAncestors: typingsJapgolly.devextreme.devextremeStrings.withAncestors = "withAncestors".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.withAncestors]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.add
    - typingsJapgolly.devextreme.devextremeStrings.cancel
    - typingsJapgolly.devextreme.devextremeStrings.delete
    - typingsJapgolly.devextreme.devextremeStrings.edit
    - typingsJapgolly.devextreme.devextremeStrings.save
    - typingsJapgolly.devextreme.devextremeStrings.undelete
  */
  trait TreeListPredefinedColumnButton extends StObject
  object TreeListPredefinedColumnButton {
    
    inline def add: typingsJapgolly.devextreme.devextremeStrings.add = "add".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.add]
    
    inline def cancel: typingsJapgolly.devextreme.devextremeStrings.cancel = "cancel".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.cancel]
    
    inline def delete: typingsJapgolly.devextreme.devextremeStrings.delete = "delete".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.delete]
    
    inline def edit: typingsJapgolly.devextreme.devextremeStrings.edit = "edit".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.edit]
    
    inline def save: typingsJapgolly.devextreme.devextremeStrings.save = "save".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.save]
    
    inline def undelete: typingsJapgolly.devextreme.devextremeStrings.undelete = "undelete".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.undelete]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.addRowButton
    - typingsJapgolly.devextreme.devextremeStrings.applyFilterButton
    - typingsJapgolly.devextreme.devextremeStrings.columnChooserButton
    - typingsJapgolly.devextreme.devextremeStrings.revertButton
    - typingsJapgolly.devextreme.devextremeStrings.saveButton
    - typingsJapgolly.devextreme.devextremeStrings.searchPanel
  */
  trait TreeListPredefinedToolbarItem extends StObject
  object TreeListPredefinedToolbarItem {
    
    inline def addRowButton: typingsJapgolly.devextreme.devextremeStrings.addRowButton = "addRowButton".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.addRowButton]
    
    inline def applyFilterButton: typingsJapgolly.devextreme.devextremeStrings.applyFilterButton = "applyFilterButton".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.applyFilterButton]
    
    inline def columnChooserButton: typingsJapgolly.devextreme.devextremeStrings.columnChooserButton = "columnChooserButton".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.columnChooserButton]
    
    inline def revertButton: typingsJapgolly.devextreme.devextremeStrings.revertButton = "revertButton".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.revertButton]
    
    inline def saveButton: typingsJapgolly.devextreme.devextremeStrings.saveButton = "saveButton".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.saveButton]
    
    inline def searchPanel: typingsJapgolly.devextreme.devextremeStrings.searchPanel = "searchPanel".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.searchPanel]
  }
  
  type dxTreeListToolbar = Toolbar
  
  type dxTreeListToolbarItem = ToolbarItem
}
