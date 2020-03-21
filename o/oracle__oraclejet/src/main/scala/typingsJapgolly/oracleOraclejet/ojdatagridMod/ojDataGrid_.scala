package typingsJapgolly.oracleOraclejet.ojdatagridMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.Anon2
import typingsJapgolly.oracleOraclejet.Anon3
import typingsJapgolly.oracleOraclejet.AnonAccessibleActionableMode
import typingsJapgolly.oracleOraclejet.AnonCell
import typingsJapgolly.oracleOraclejet.AnonClassName
import typingsJapgolly.oracleOraclejet.AnonColumn
import typingsJapgolly.oracleOraclejet.AnonColumnEnd
import typingsJapgolly.oracleOraclejet.AnonColumnIndex
import typingsJapgolly.oracleOraclejet.AnonHorizontal
import typingsJapgolly.oracleOraclejet.AnonMaxColumnCount
import typingsJapgolly.oracleOraclejet.AnonReorder
import typingsJapgolly.oracleOraclejet.AnonSubId
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.mod.baseComponent
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
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentCell
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.currentCellChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.data
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.editMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.editModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.gridlines
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.gridlinesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.header
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.headerChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadMoreOnScroll
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeCurrentCell
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeEdit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeEditEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojScroll
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojSort
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
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDataGrid_[K, D] extends baseComponent[ojDataGridSettableProperties[K, D]] {
  var bandingInterval: AnonColumn = js.native
  var cell: AnonClassName[K, D] = js.native
  var currentCell: CurrentCell[K] | Null = js.native
  var data: DataProvider[K, D] = js.native
  var dnd: AnonReorder = js.native
  var editMode: none | cellNavigation | cellEdit = js.native
  var gridlines: AnonHorizontal = js.native
  var header: AnonColumnEnd[K, D] = js.native
  var onBandingIntervalChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCellChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCurrentCellChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEditModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGridlinesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHeaderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCurrentCell: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeEdit: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeEditEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjResize: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjScroll: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjSort: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPolicyOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScrollPositionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var scrollPolicy: auto | loadMoreOnScroll | scroll = js.native
  var scrollPolicyOptions: AnonMaxColumnCount = js.native
  var scrollPosition: AnonColumnIndex[K] = js.native
  var selection: js.Array[Selection[K]] = js.native
  var selectionMode: AnonCell = js.native
  @JSName("translations")
  var translations_ojDataGrid_ : AnonAccessibleActionableMode = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | cellNavigation | cellEdit], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: editModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[none | cellNavigation | cellEdit], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll | scroll], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: scrollPolicyChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | loadMoreOnScroll | scroll], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bandingIntervalChanged(
    `type`: bandingIntervalChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bandingIntervalChanged(
    `type`: bandingIntervalChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: cellChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellChanged(
    `type`: cellChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentCellChanged(
    `type`: currentCellChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentCellChanged(
    `type`: currentCellChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: ojBeforeCurrentCell,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCurrentCell(
    `type`: ojBeforeCurrentCell,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: ojBeforeEdit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEdit(
    `type`: ojBeforeEdit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: ojBeforeEditEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeEditEnd(
    `type`: ojBeforeEditEnd,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojResize(
    `type`: ojResize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: ojScroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojScroll(
    `type`: ojScroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: ojSort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSort(
    `type`: ojSort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPolicyOptionsChanged(
    `type`: scrollPolicyOptionsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionModeChanged(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): ((CellContext[K, D]) with AnonSubId) | ((HeaderContext[K, D]) with Anon2) | ((LabelContext[K, D]) with Anon3) = js.native
  @JSName("getProperty")
  def getProperty_bandingInterval(property: bandingInterval): AnonColumn = js.native
  @JSName("getProperty")
  def getProperty_cell(property: cell): AnonClassName[K, D] = js.native
  @JSName("getProperty")
  def getProperty_currentCell(property: currentCell): CurrentCell[K] | Null = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): DataProvider[K, D] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): AnonReorder = js.native
  @JSName("getProperty")
  def getProperty_editMode(property: editMode): none | cellNavigation | cellEdit = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: gridlines): AnonHorizontal = js.native
  @JSName("getProperty")
  def getProperty_header(property: header): AnonColumnEnd[K, D] = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicy(property: scrollPolicy): auto | loadMoreOnScroll | scroll = js.native
  @JSName("getProperty")
  def getProperty_scrollPolicyOptions(property: scrollPolicyOptions): AnonMaxColumnCount = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): AnonColumnIndex[K] = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[Selection[K]] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): AnonCell = js.native
  def setProperties(properties: ojDataGridSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: editMode, value: cellEdit): Unit = js.native
  def setProperty(property: editMode, value: cellNavigation): Unit = js.native
  def setProperty(property: editMode, value: none): Unit = js.native
  def setProperty(property: scrollPolicy, value: auto): Unit = js.native
  def setProperty(property: scrollPolicy, value: loadMoreOnScroll): Unit = js.native
  def setProperty(property: scrollPolicy, value: scroll): Unit = js.native
  @JSName("setProperty")
  def setProperty_bandingInterval(property: bandingInterval, value: AnonColumn): Unit = js.native
  @JSName("setProperty")
  def setProperty_cell(property: cell, value: AnonClassName[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(property: currentCell): Unit = js.native
  @JSName("setProperty")
  def setProperty_currentCell(property: currentCell, value: CurrentCell[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: AnonReorder): Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(property: gridlines, value: AnonHorizontal): Unit = js.native
  @JSName("setProperty")
  def setProperty_header(property: header, value: AnonColumnEnd[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPolicyOptions(property: scrollPolicyOptions, value: AnonMaxColumnCount): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: AnonColumnIndex[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[Selection[K]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionMode(property: selectionMode, value: AnonCell): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAccessibleActionableMode): Unit = js.native
}

