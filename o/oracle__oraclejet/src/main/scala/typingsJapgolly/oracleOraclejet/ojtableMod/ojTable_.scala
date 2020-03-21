package typingsJapgolly.oracleOraclejet.ojtableMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.Anon19
import typingsJapgolly.oracleOraclejet.AnonColumnIndexKey
import typingsJapgolly.oracleOraclejet.AnonColumnKey
import typingsJapgolly.oracleOraclejet.AnonDataIndex
import typingsJapgolly.oracleOraclejet.AnonDropReorder
import typingsJapgolly.oracleOraclejet.AnonField
import typingsJapgolly.oracleOraclejet.AnonFooterClassName
import typingsJapgolly.oracleOraclejet.AnonIndexSubId
import typingsJapgolly.oracleOraclejet.AnonLabelAccSelectionAffordanceBottom
import typingsJapgolly.oracleOraclejet.AnonMaxCount
import typingsJapgolly.oracleOraclejet.AnonRowHeader
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionEnd
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.ColumnSelectionStart
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.RowRendererContext
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.RowSelectionEnd
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.RowSelectionStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.accessibility
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.accessibilityChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.as
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.columns
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.columnsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.columnsDefault
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.columnsDefaultChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentRow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentRowChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.data
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.display
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.displayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.editMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.editModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.firstSelectedRowChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.grid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontalGridVisible
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontalGridVisibleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.list
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentRow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEdit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeRowEditEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojSort
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowEdit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowRendererChanged
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
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionRequired
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionRequiredChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.verticalGridVisible
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.verticalGridVisibleChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTable_[K, D] extends baseComponent[ojTableSettableProperties[K, D]] {
  var accessibility: AnonRowHeader = js.native
  var as: String = js.native
  var columns: (js.Array[AnonField[K, D]]) | Null = js.native
  var columnsDefault: AnonFooterClassName[K, D] = js.native
  var currentRow: CurrentRow[K] | Null = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var display: list | grid = js.native
  var dnd: AnonDropReorder[K, D] = js.native
  var editMode: none | rowEdit = js.native
  val firstSelectedRow: js.Object = js.native
  var horizontalGridVisible: auto | enabled | disabled = js.native
  var onAccessibilityChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColumnsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColumnsDefaultChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCurrentRowChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEditModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onFirstSelectedRowChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHorizontalGridVisibleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCurrentRow: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeRowEdit: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeRowEditEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjSort: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRowRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onVerticalGridVisibleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var rowRenderer: (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll = js.native
  var scrollPolicyOptions: AnonMaxCount = js.native
  var scrollPosition: AnonColumnKey = js.native
  var selection: js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  var selectionMode: Anon19 = js.native
  var selectionRequired: Boolean = js.native
  @JSName("translations")
  var translations_ojTable_ : AnonLabelAccSelectionAffordanceBottom = js.native
  var verticalGridVisible: auto | enabled | disabled = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[list | grid], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[list | grid], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[none | rowEdit], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[none | rowEdit], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: firstSelectedRowChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: horizontalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: verticalGridVisibleChanged,
    listener: js.ThisFunction1[
      /* this */ typingsJapgolly.std.HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | enabled | disabled], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(`type`: accessibilityChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accessibilityChanged(
    `type`: accessibilityChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(`type`: columnsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(`type`: columnsDefaultChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsDefaultChanged(
    `type`: columnsDefaultChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(`type`: currentRowChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentRowChanged(
    `type`: currentRowChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(`type`: dataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(`type`: dndChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(`type`: ojAnimateEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(`type`: ojAnimateStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentRow(`type`: ojBeforeCurrentRow, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentRow(
    `type`: ojBeforeCurrentRow,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(`type`: ojBeforeRowEdit, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEdit(
    `type`: ojBeforeRowEdit,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(`type`: ojBeforeRowEditEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeRowEditEnd(
    `type`: ojBeforeRowEditEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(`type`: ojSort, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: ojSort,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowRendererChanged(`type`: rowRendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowRendererChanged(
    `type`: rowRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(`type`: scrollPositionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(`type`: selectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRequiredChanged(
    `type`: selectionRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): AnonColumnIndexKey | AnonIndexSubId = js.native
  def getDataForVisibleRow(rowIndex: Double): (AnonDataIndex[D, K]) | Null = js.native
  @JSName("getProperty")
  def getProperty_accessibility(property: accessibility): AnonRowHeader = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_columns(property: columns): (js.Array[AnonField[K, D]]) | Null = js.native
  @JSName("getProperty")
  def getProperty_columnsDefault(property: columnsDefault): AnonFooterClassName[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentRow(property: currentRow): CurrentRow[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): list | grid = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): AnonDropReorder[K, D] = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: editMode): none | rowEdit = js.native
  @JSName("getProperty")
  def getProperty_firstSelectedRow(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.firstSelectedRow): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojtable.ojTable<K, D>['firstSelectedRow'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_horizontalGridVisible(property: horizontalGridVisible): auto | enabled | disabled = js.native
  @JSName("getProperty")
  def getProperty_rowRenderer(property: rowRenderer): (js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): AnonMaxCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): AnonColumnKey = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[
    (RowSelectionStart[K] with RowSelectionEnd[K]) | (ColumnSelectionStart[K] with ColumnSelectionEnd[K])
  ] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): Anon19 = js.native
  @JSName("getProperty")
  def getProperty_selectionRequired(property: selectionRequired): Boolean = js.native
  @JSName("getProperty")
  def getProperty_verticalGridVisible(property: verticalGridVisible): auto | enabled | disabled = js.native
  def refreshRow(rowIdx: Double): js.Promise[Boolean] = js.native
  def setProperties(properties: ojTableSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: display, value: grid): Unit = js.native
  def setProperty(property: display, value: list): Unit = js.native
  def setProperty(property: editMode, value: none): Unit = js.native
  def setProperty(property: editMode, value: rowEdit): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: auto): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: disabled): Unit = js.native
  def setProperty(property: horizontalGridVisible, value: enabled): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: verticalGridVisible, value: auto): Unit = js.native
  def setProperty(property: verticalGridVisible, value: disabled): Unit = js.native
  def setProperty(property: verticalGridVisible, value: enabled): Unit = js.native
  @JSName("setProperty")
  def setProperty_accessibility(property: accessibility, value: AnonRowHeader): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Array[AnonField[K, D]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnsDefault(property: columnsDefault, value: AnonFooterClassName[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentRow(property: currentRow, value: CurrentRow[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: AnonDropReorder[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstSelectedRow(
    property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.firstSelectedRow,
    value: js.Object
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(property: rowRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowRenderer(
    property: rowRenderer,
    value: js.Function1[/* context */ RowRendererContext[K, D], String | HTMLElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: AnonMaxCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: AnonColumnKey): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(
    property: selection,
    value: js.Array[
      RowSelectionStart[K] with RowSelectionEnd[K] with ColumnSelectionStart[K] with ColumnSelectionEnd[K]
    ]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: Anon19): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRequired(property: selectionRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelAccSelectionAffordanceBottom): Unit = js.native
}

