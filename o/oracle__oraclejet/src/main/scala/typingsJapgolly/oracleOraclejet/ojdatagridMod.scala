package typingsJapgolly.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.oracleOraclejet.anon.AccessibleActionableMode
import typingsJapgolly.oracleOraclejet.anon.Cell
import typingsJapgolly.oracleOraclejet.anon.ClassName
import typingsJapgolly.oracleOraclejet.anon.Column
import typingsJapgolly.oracleOraclejet.anon.ColumnEnd
import typingsJapgolly.oracleOraclejet.anon.ColumnIndex
import typingsJapgolly.oracleOraclejet.anon.ColumnK
import typingsJapgolly.oracleOraclejet.anon.ColumnRow
import typingsJapgolly.oracleOraclejet.anon.Horizontal
import typingsJapgolly.oracleOraclejet.anon.MaxColumnCount
import typingsJapgolly.oracleOraclejet.anon.Reorder
import typingsJapgolly.oracleOraclejet.anon.RowK
import typingsJapgolly.oracleOraclejet.anon.RowNumber
import typingsJapgolly.oracleOraclejet.anon.SubId
import typingsJapgolly.oracleOraclejet.anon.`2`
import typingsJapgolly.oracleOraclejet.anon.`3`
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.mod.baseComponentEventMap
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.LabelContext
import typingsJapgolly.oracleOraclejet.ojdatagridMod.ojDataGrid.Selection
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bandingInterval
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bandingIntervalChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cell
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cellChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cellEdit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cellNavigation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.column
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.columnEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentCell
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentCellChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.data
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.edit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.editMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.editModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.gridlines
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.gridlinesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.header
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.headerChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.label
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.navigation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentCell
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeEdit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeEditEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojScroll
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojSort
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.row
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scroll
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scrollPolicy
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scrollPolicyChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scrollPolicyOptions
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scrollPolicyOptionsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scrollPosition
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scrollPositionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selection
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojdatagridMod {
  
  @js.native
  trait ojDataGrid[K, D]
    extends StObject
       with baseComponent[ojDataGridSettableProperties[K, D]] {
    
    def addEventListener(`type`: editModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    def addEventListener(
      `type`: editModeChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(`type`: scrollPolicyChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    def addEventListener(
      `type`: scrollPolicyChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_bandingIntervalChanged(
      `type`: bandingIntervalChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_bandingIntervalChanged(
      `type`: bandingIntervalChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cellChanged(`type`: cellChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cellChanged(
      `type`: cellChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_currentCellChanged(`type`: currentCellChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_currentCellChanged(
      `type`: currentCellChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dataChanged(`type`: dataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dataChanged(
      `type`: dataChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dndChanged(`type`: dndChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dndChanged(
      `type`: dndChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gridlinesChanged(`type`: gridlinesChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gridlinesChanged(
      `type`: gridlinesChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_headerChanged(`type`: headerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_headerChanged(
      `type`: headerChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCurrentCell(`type`: ojBeforeCurrentCell, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeCurrentCell(
      `type`: ojBeforeCurrentCell,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeEdit(`type`: ojBeforeEdit, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeEdit(
      `type`: ojBeforeEdit,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeEditEnd(`type`: ojBeforeEditEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeEditEnd(
      `type`: ojBeforeEditEnd,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(`type`: ojResize, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(
      `type`: ojResize,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojScroll(`type`: ojScroll, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojScroll(
      `type`: ojScroll,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojSort(`type`: ojSort, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojSort(
      `type`: ojSort,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollPolicyOptionsChanged(
      `type`: scrollPolicyOptionsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollPolicyOptionsChanged(
      `type`: scrollPolicyOptionsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollPositionChanged(
      `type`: scrollPositionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scrollPositionChanged(
      `type`: scrollPositionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionChanged(`type`: selectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionChanged(
      `type`: selectionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionModeChanged(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionModeChanged(
      `type`: selectionModeChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var bandingInterval: Column = js.native
    
    var cell: ClassName[K, D] = js.native
    
    var currentCell: CurrentCell[K] | Null = js.native
    
    var data: DataProvider[K, D] = js.native
    
    var dnd: Reorder = js.native
    
    var editMode: none | cellNavigation | cellEdit = js.native
    
    def getContextByNode(node: Element): ((CellContext[K, D]) & SubId) | ((HeaderContext[K, D]) & `2`) | ((LabelContext[K, D]) & `3`) = js.native
    
    @JSName("getProperty")
    def getProperty_bandingInterval(property: bandingInterval): Column = js.native
    @JSName("getProperty")
    def getProperty_cell(property: cell): ClassName[K, D] = js.native
    @JSName("getProperty")
    def getProperty_currentCell(property: currentCell): CurrentCell[K] | Null = js.native
    @JSName("getProperty")
    def getProperty_data(property: data): DataProvider[K, D] = js.native
    @JSName("getProperty")
    def getProperty_dnd(property: dnd): Reorder = js.native
    @JSName("getProperty")
    def getProperty_editMode(property: editMode): none | cellNavigation | cellEdit = js.native
    @JSName("getProperty")
    def getProperty_gridlines(property: gridlines): Horizontal = js.native
    @JSName("getProperty")
    def getProperty_header(property: header): ColumnEnd[K, D] = js.native
    @JSName("getProperty")
    def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll | scroll = js.native
    @JSName("getProperty")
    def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): MaxColumnCount = js.native
    @JSName("getProperty")
    def getProperty_scrollPosition(property: scrollPosition): ColumnIndex[K] = js.native
    @JSName("getProperty")
    def getProperty_selection(property: selection): js.Array[Selection[K]] = js.native
    @JSName("getProperty")
    def getProperty_selectionMode(property: selectionMode): Cell = js.native
    
    var gridlines: Horizontal = js.native
    
    var header: ColumnEnd[K, D] = js.native
    
    var onBandingIntervalChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onCellChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onCurrentCellChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onDataChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onDndChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onEditModeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onGridlinesChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onHeaderChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeCurrentCell: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeEdit: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeEditEnd: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjResize: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjScroll: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjSort: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onScrollPolicyChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onScrollPolicyOptionsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onScrollPositionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onSelectionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onSelectionModeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var scrollPolicy: auto | loadMoreOnScroll | scroll = js.native
    
    var scrollPolicyOptions: MaxColumnCount = js.native
    
    var scrollPosition: ColumnIndex[K] = js.native
    
    var selection: js.Array[Selection[K]] = js.native
    
    var selectionMode: Cell = js.native
    
    def setProperties(properties: ojDataGridSettablePropertiesLenient[K, D]): Unit = js.native
    
    def setProperty(property: editMode, value: none | cellNavigation | cellEdit): Unit = js.native
    def setProperty(property: scrollPolicy, value: auto | loadMoreOnScroll | scroll): Unit = js.native
    @JSName("setProperty")
    def setProperty_bandingInterval(property: bandingInterval, value: Column): Unit = js.native
    @JSName("setProperty")
    def setProperty_cell(property: cell, value: ClassName[K, D]): Unit = js.native
    @JSName("setProperty")
    def setProperty_currentCell(property: currentCell): Unit = js.native
    @JSName("setProperty")
    def setProperty_currentCell(property: currentCell, value: CurrentCell[K]): Unit = js.native
    @JSName("setProperty")
    def setProperty_data(property: data): Unit = js.native
    @JSName("setProperty")
    def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
    @JSName("setProperty")
    def setProperty_dnd(property: dnd, value: Reorder): Unit = js.native
    @JSName("setProperty")
    def setProperty_gridlines(property: gridlines, value: Horizontal): Unit = js.native
    @JSName("setProperty")
    def setProperty_header(property: header, value: ColumnEnd[K, D]): Unit = js.native
    @JSName("setProperty")
    def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: MaxColumnCount): Unit = js.native
    @JSName("setProperty")
    def setProperty_scrollPosition(property: scrollPosition, value: ColumnIndex[K]): Unit = js.native
    @JSName("setProperty")
    def setProperty_selection(property: selection, value: js.Array[Selection[K]]): Unit = js.native
    @JSName("setProperty")
    def setProperty_selectionMode(property: selectionMode, value: Cell): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: AccessibleActionableMode): Unit = js.native
    
    @JSName("translations")
    var translations_ojDataGrid: AccessibleActionableMode = js.native
  }
  object ojDataGrid {
    
    // tslint:disable-next-line interface-over-type-literal
    trait CellContext[K, D] extends StObject {
      
      var cell: D
      
      var componentElement: Element
      
      var data: D
      
      var datasource: (DataProvider[K, D]) | Null
      
      var extents: ColumnRow
      
      var indexes: ColumnRow
      
      var keys: ColumnK[K]
      
      var mode: edit | navigation
      
      var parentElement: Element
    }
    object CellContext {
      
      inline def apply[K, D](
        cell: D,
        componentElement: Element,
        data: D,
        extents: ColumnRow,
        indexes: ColumnRow,
        keys: ColumnK[K],
        mode: edit | navigation,
        parentElement: Element
      ): CellContext[K, D] = {
        val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], datasource = null)
        __obj.asInstanceOf[CellContext[K, D]]
      }
      
      extension [Self <: CellContext[?, ?], K, D](x: Self & (CellContext[K, D])) {
        
        inline def setCell(value: D): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
        
        inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
        
        inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
        
        inline def setDatasourceNull: Self = StObject.set(x, "datasource", null)
        
        inline def setExtents(value: ColumnRow): Self = StObject.set(x, "extents", value.asInstanceOf[js.Any])
        
        inline def setIndexes(value: ColumnRow): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
        
        inline def setKeys(value: ColumnK[K]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        inline def setMode(value: edit | navigation): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait CurrentCell[K] extends StObject {
      
      var axis: js.UndefOr[column | columnEnd | row | rowEnd] = js.undefined
      
      var index: js.UndefOr[Double] = js.undefined
      
      var indexes: js.UndefOr[ColumnRow] = js.undefined
      
      var key: js.UndefOr[Any] = js.undefined
      
      var keys: js.UndefOr[ColumnK[K]] = js.undefined
      
      var level: js.UndefOr[Double] = js.undefined
      
      var `type`: cell | header | label
    }
    object CurrentCell {
      
      inline def apply[K](`type`: cell | header | label): CurrentCell[K] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CurrentCell[K]]
      }
      
      extension [Self <: CurrentCell[?], K](x: Self & CurrentCell[K]) {
        
        inline def setAxis(value: column | columnEnd | row | rowEnd): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        inline def setIndexes(value: ColumnRow): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
        
        inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
        
        inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setKeys(value: ColumnK[K]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
        
        inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
        
        inline def setType(value: cell | header | label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait HeaderContext[K, D] extends StObject {
      
      var axis: column | columnEnd | row | rowEnd
      
      var componentElement: Element
      
      var data: D
      
      var datasource: (DataProvider[K, D]) | Null
      
      var depth: Double
      
      var extent: Double
      
      var index: Double
      
      var key: K
      
      var level: Double
      
      var parentElement: Element
    }
    object HeaderContext {
      
      inline def apply[K, D](
        axis: column | columnEnd | row | rowEnd,
        componentElement: Element,
        data: D,
        depth: Double,
        extent: Double,
        index: Double,
        key: K,
        level: Double,
        parentElement: Element
      ): HeaderContext[K, D] = {
        val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], datasource = null)
        __obj.asInstanceOf[HeaderContext[K, D]]
      }
      
      extension [Self <: HeaderContext[?, ?], K, D](x: Self & (HeaderContext[K, D])) {
        
        inline def setAxis(value: column | columnEnd | row | rowEnd): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
        
        inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
        
        inline def setDatasourceNull: Self = StObject.set(x, "datasource", null)
        
        inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
        
        inline def setExtent(value: Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait LabelContext[K, D] extends StObject {
      
      var axis: column | columnEnd | row | rowEnd
      
      var componentElement: Element
      
      var datasource: (DataProvider[K, D]) | Null
      
      var key: K
      
      var level: Double
      
      var parentElement: Element
    }
    object LabelContext {
      
      inline def apply[K, D](
        axis: column | columnEnd | row | rowEnd,
        componentElement: Element,
        key: K,
        level: Double,
        parentElement: Element
      ): LabelContext[K, D] = {
        val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], datasource = null)
        __obj.asInstanceOf[LabelContext[K, D]]
      }
      
      extension [Self <: LabelContext[?, ?], K, D](x: Self & (LabelContext[K, D])) {
        
        inline def setAxis(value: column | columnEnd | row | rowEnd): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
        
        inline def setDatasource(value: DataProvider[K, D]): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
        
        inline def setDatasourceNull: Self = StObject.set(x, "datasource", null)
        
        inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait Selection[K] extends StObject {
      
      var endIndex: js.UndefOr[RowNumber] = js.undefined
      
      var endKey: js.UndefOr[RowK[K]] = js.undefined
      
      var startIndex: js.UndefOr[RowNumber] = js.undefined
      
      var startKey: js.UndefOr[RowK[K]] = js.undefined
    }
    object Selection {
      
      inline def apply[K](): Selection[K] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Selection[K]]
      }
      
      extension [Self <: Selection[?], K](x: Self & Selection[K]) {
        
        inline def setEndIndex(value: RowNumber): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
        
        inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
        
        inline def setEndKey(value: RowK[K]): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
        
        inline def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
        
        inline def setStartIndex(value: RowNumber): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
        
        inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
        
        inline def setStartKey(value: RowK[K]): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
        
        inline def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
      }
    }
    
    type ojBeforeCurrentCell[K] = CustomEvent
    
    type ojBeforeEdit[K, D] = CustomEvent
    
    type ojBeforeEditEnd[K, D] = CustomEvent
    
    type ojResize = CustomEvent
    
    type ojScroll = CustomEvent
    
    type ojSort = CustomEvent
  }
  
  trait ojDataGridEventMap[K, D]
    extends StObject
       with baseComponentEventMap[ojDataGridSettableProperties[K, D]] {
    
    var bandingIntervalChanged: CustomEvent
    
    var cellChanged: CustomEvent
    
    var currentCellChanged: CustomEvent
    
    var dataChanged: CustomEvent
    
    var dndChanged: CustomEvent
    
    var editModeChanged: CustomEvent
    
    var gridlinesChanged: CustomEvent
    
    var headerChanged: CustomEvent
    
    var ojBeforeCurrentCell: CustomEvent
    
    var ojBeforeEdit: CustomEvent
    
    var ojBeforeEditEnd: CustomEvent
    
    var ojResize: CustomEvent
    
    var ojScroll: CustomEvent
    
    var ojSort: CustomEvent
    
    var scrollPolicyChanged: CustomEvent
    
    var scrollPolicyOptionsChanged: CustomEvent
    
    var scrollPositionChanged: CustomEvent
    
    var selectionChanged: CustomEvent
    
    var selectionModeChanged: CustomEvent
  }
  object ojDataGridEventMap {
    
    inline def apply[K, D](
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      bandingIntervalChanged: CustomEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      canplay: Event,
      canplaythrough: Event,
      cellChanged: CustomEvent,
      change: Event,
      click: MouseEvent,
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      currentCellChanged: CustomEvent,
      cut: ClipboardEvent,
      dataChanged: CustomEvent,
      dblclick: MouseEvent,
      dndChanged: CustomEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      editModeChanged: CustomEvent,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      gridlinesChanged: CustomEvent,
      headerChanged: CustomEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojBeforeCurrentCell: CustomEvent,
      ojBeforeEdit: CustomEvent,
      ojBeforeEditEnd: CustomEvent,
      ojResize: CustomEvent,
      ojScroll: CustomEvent,
      ojSort: CustomEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent,
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      scrollPolicyChanged: CustomEvent,
      scrollPolicyOptionsChanged: CustomEvent,
      scrollPositionChanged: CustomEvent,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionChanged: CustomEvent,
      selectionModeChanged: CustomEvent,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ojDataGridEventMap[K, D] = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], bandingIntervalChanged = bandingIntervalChanged.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], cellChanged = cellChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], currentCellChanged = currentCellChanged.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], editModeChanged = editModeChanged.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], gridlinesChanged = gridlinesChanged.asInstanceOf[js.Any], headerChanged = headerChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojBeforeCurrentCell = ojBeforeCurrentCell.asInstanceOf[js.Any], ojBeforeEdit = ojBeforeEdit.asInstanceOf[js.Any], ojBeforeEditEnd = ojBeforeEditEnd.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], ojScroll = ojScroll.asInstanceOf[js.Any], ojSort = ojSort.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPolicyChanged = scrollPolicyChanged.asInstanceOf[js.Any], scrollPolicyOptionsChanged = scrollPolicyOptionsChanged.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojDataGridEventMap[K, D]]
    }
    
    extension [Self <: ojDataGridEventMap[?, ?], K, D](x: Self & (ojDataGridEventMap[K, D])) {
      
      inline def setBandingIntervalChanged(value: CustomEvent): Self = StObject.set(x, "bandingIntervalChanged", value.asInstanceOf[js.Any])
      
      inline def setCellChanged(value: CustomEvent): Self = StObject.set(x, "cellChanged", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellChanged(value: CustomEvent): Self = StObject.set(x, "currentCellChanged", value.asInstanceOf[js.Any])
      
      inline def setDataChanged(value: CustomEvent): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
      
      inline def setDndChanged(value: CustomEvent): Self = StObject.set(x, "dndChanged", value.asInstanceOf[js.Any])
      
      inline def setEditModeChanged(value: CustomEvent): Self = StObject.set(x, "editModeChanged", value.asInstanceOf[js.Any])
      
      inline def setGridlinesChanged(value: CustomEvent): Self = StObject.set(x, "gridlinesChanged", value.asInstanceOf[js.Any])
      
      inline def setHeaderChanged(value: CustomEvent): Self = StObject.set(x, "headerChanged", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeCurrentCell(value: CustomEvent): Self = StObject.set(x, "ojBeforeCurrentCell", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeEdit(value: CustomEvent): Self = StObject.set(x, "ojBeforeEdit", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeEditEnd(value: CustomEvent): Self = StObject.set(x, "ojBeforeEditEnd", value.asInstanceOf[js.Any])
      
      inline def setOjResize(value: CustomEvent): Self = StObject.set(x, "ojResize", value.asInstanceOf[js.Any])
      
      inline def setOjScroll(value: CustomEvent): Self = StObject.set(x, "ojScroll", value.asInstanceOf[js.Any])
      
      inline def setOjSort(value: CustomEvent): Self = StObject.set(x, "ojSort", value.asInstanceOf[js.Any])
      
      inline def setScrollPolicyChanged(value: CustomEvent): Self = StObject.set(x, "scrollPolicyChanged", value.asInstanceOf[js.Any])
      
      inline def setScrollPolicyOptionsChanged(value: CustomEvent): Self = StObject.set(x, "scrollPolicyOptionsChanged", value.asInstanceOf[js.Any])
      
      inline def setScrollPositionChanged(value: CustomEvent): Self = StObject.set(x, "scrollPositionChanged", value.asInstanceOf[js.Any])
      
      inline def setSelectionChanged(value: CustomEvent): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeChanged(value: CustomEvent): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojDataGridSettableProperties[K, D]
    extends StObject
       with baseComponentSettableProperties {
    
    var bandingInterval: Column
    
    var cell: ClassName[K, D]
    
    var currentCell: CurrentCell[K] | Null
    
    var data: (DataProvider[K, D]) | Null
    
    var dnd: Reorder
    
    var editMode: none | cellNavigation | cellEdit
    
    var gridlines: Horizontal
    
    var header: ColumnEnd[K, D]
    
    var scrollPolicy: auto | loadMoreOnScroll | scroll
    
    var scrollPolicyOptions: MaxColumnCount
    
    var scrollPosition: ColumnIndex[K]
    
    var selection: js.Array[Selection[K]]
    
    var selectionMode: Cell
    
    @JSName("translations")
    var translations_ojDataGridSettableProperties: AccessibleActionableMode
  }
  object ojDataGridSettableProperties {
    
    inline def apply[K, D](
      bandingInterval: Column,
      cell: ClassName[K, D],
      dnd: Reorder,
      editMode: none | cellNavigation | cellEdit,
      gridlines: Horizontal,
      header: ColumnEnd[K, D],
      scrollPolicy: auto | loadMoreOnScroll | scroll,
      scrollPolicyOptions: MaxColumnCount,
      scrollPosition: ColumnIndex[K],
      selection: js.Array[Selection[K]],
      selectionMode: Cell,
      translations: AccessibleActionableMode
    ): ojDataGridSettableProperties[K, D] = {
      val __obj = js.Dynamic.literal(bandingInterval = bandingInterval.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], editMode = editMode.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], scrollPolicy = scrollPolicy.asInstanceOf[js.Any], scrollPolicyOptions = scrollPolicyOptions.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], currentCell = null, data = null)
      __obj.asInstanceOf[ojDataGridSettableProperties[K, D]]
    }
    
    extension [Self <: ojDataGridSettableProperties[?, ?], K, D](x: Self & (ojDataGridSettableProperties[K, D])) {
      
      inline def setBandingInterval(value: Column): Self = StObject.set(x, "bandingInterval", value.asInstanceOf[js.Any])
      
      inline def setCell(value: ClassName[K, D]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCell(value: CurrentCell[K]): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellNull: Self = StObject.set(x, "currentCell", null)
      
      inline def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDnd(value: Reorder): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
      
      inline def setEditMode(value: none | cellNavigation | cellEdit): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      inline def setGridlines(value: Horizontal): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: ColumnEnd[K, D]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setScrollPolicy(value: auto | loadMoreOnScroll | scroll): Self = StObject.set(x, "scrollPolicy", value.asInstanceOf[js.Any])
      
      inline def setScrollPolicyOptions(value: MaxColumnCount): Self = StObject.set(x, "scrollPolicyOptions", value.asInstanceOf[js.Any])
      
      inline def setScrollPosition(value: ColumnIndex[K]): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: js.Array[Selection[K]]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionMode(value: Cell): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionVarargs(value: Selection[K]*): Self = StObject.set(x, "selection", js.Array(value*))
      
      inline def setTranslations(value: AccessibleActionableMode): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdatagrid.ojDataGridSettableProperties<K, D>> */
  trait ojDataGridSettablePropertiesLenient[K, D]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var bandingInterval: js.UndefOr[Column] = js.undefined
    
    var cell: js.UndefOr[ClassName[K, D]] = js.undefined
    
    var currentCell: js.UndefOr[CurrentCell[K] | Null] = js.undefined
    
    var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.undefined
    
    var dnd: js.UndefOr[Reorder] = js.undefined
    
    var editMode: js.UndefOr[none | cellNavigation | cellEdit] = js.undefined
    
    var gridlines: js.UndefOr[Horizontal] = js.undefined
    
    var header: js.UndefOr[ColumnEnd[K, D]] = js.undefined
    
    var scrollPolicy: js.UndefOr[auto | loadMoreOnScroll | scroll] = js.undefined
    
    var scrollPolicyOptions: js.UndefOr[MaxColumnCount] = js.undefined
    
    var scrollPosition: js.UndefOr[ColumnIndex[K]] = js.undefined
    
    var selection: js.UndefOr[js.Array[Selection[K]]] = js.undefined
    
    var selectionMode: js.UndefOr[Cell] = js.undefined
    
    var translations: js.UndefOr[AccessibleActionableMode] = js.undefined
  }
  object ojDataGridSettablePropertiesLenient {
    
    inline def apply[K, D](): ojDataGridSettablePropertiesLenient[K, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojDataGridSettablePropertiesLenient[K, D]]
    }
    
    extension [Self <: ojDataGridSettablePropertiesLenient[?, ?], K, D](x: Self & (ojDataGridSettablePropertiesLenient[K, D])) {
      
      inline def setBandingInterval(value: Column): Self = StObject.set(x, "bandingInterval", value.asInstanceOf[js.Any])
      
      inline def setBandingIntervalUndefined: Self = StObject.set(x, "bandingInterval", js.undefined)
      
      inline def setCell(value: ClassName[K, D]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCurrentCell(value: CurrentCell[K]): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellNull: Self = StObject.set(x, "currentCell", null)
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDnd(value: Reorder): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
      
      inline def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
      
      inline def setEditMode(value: none | cellNavigation | cellEdit): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      inline def setGridlines(value: Horizontal): Self = StObject.set(x, "gridlines", value.asInstanceOf[js.Any])
      
      inline def setGridlinesUndefined: Self = StObject.set(x, "gridlines", js.undefined)
      
      inline def setHeader(value: ColumnEnd[K, D]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setScrollPolicy(value: auto | loadMoreOnScroll | scroll): Self = StObject.set(x, "scrollPolicy", value.asInstanceOf[js.Any])
      
      inline def setScrollPolicyOptions(value: MaxColumnCount): Self = StObject.set(x, "scrollPolicyOptions", value.asInstanceOf[js.Any])
      
      inline def setScrollPolicyOptionsUndefined: Self = StObject.set(x, "scrollPolicyOptions", js.undefined)
      
      inline def setScrollPolicyUndefined: Self = StObject.set(x, "scrollPolicy", js.undefined)
      
      inline def setScrollPosition(value: ColumnIndex[K]): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
      
      inline def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
      
      inline def setSelection(value: js.Array[Selection[K]]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionMode(value: Cell): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setSelectionVarargs(value: Selection[K]*): Self = StObject.set(x, "selection", js.Array(value*))
      
      inline def setTranslations(value: AccessibleActionableMode): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
