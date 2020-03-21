package typingsJapgolly.oracleOraclejet.ojnboxMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.Anon13
import typingsJapgolly.oracleOraclejet.AnonCellDefaults
import typingsJapgolly.oracleOraclejet.AnonHighlightedCount
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsJapgolly.oracleOraclejet.ojnboxMod.ojNBox.Cell
import typingsJapgolly.oracleOraclejet.ojnboxMod.ojNBox.Column
import typingsJapgolly.oracleOraclejet.ojnboxMod.ojNBox.CountLabelContext
import typingsJapgolly.oracleOraclejet.ojnboxMod.ojNBox.Row
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.acrossCells
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.any
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.as
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cellContent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cellContentChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cellMaximize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cellMaximizeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cells
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cellsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.color
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.columns
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.columnsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.columnsTitle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.columnsTitleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.countLabelChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.counts
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.data
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dim
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupAttributes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupAttributesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ifRequired
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.indicatorColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.indicatorIconColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.indicatorIconPattern
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.indicatorIconShape
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelTruncation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelTruncationChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maximizedColumn
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maximizedColumnChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maximizedRow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maximizedRowChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.otherColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.otherColorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.otherThreshold
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.otherThresholdChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rows
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowsTitle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowsTitleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selection
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.withinCell
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojNBox_[K, D] extends dvtBaseComponent[ojNBoxSettableProperties[K, D]] {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var cellContent: counts | auto = js.native
  var cellMaximize: off | on = js.native
  var cells: js.Promise[js.Array[Cell]] | Null = js.native
  var columns: js.Promise[js.Array[Column]] | Null = js.native
  var columnsTitle: String = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var groupAttributes: color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape = js.native
  var groupBehavior: acrossCells | none | withinCell = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var labelTruncation: ifRequired | on = js.native
  var maximizedColumn: String = js.native
  var maximizedRow: String = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCellContentChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCellMaximizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCellsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColumnsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColumnsTitleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onCountLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGroupAttributesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGroupBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelTruncationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaximizedColumnChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaximizedRowChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOtherColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOtherThresholdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRowsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRowsTitleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var otherColor: String = js.native
  var otherThreshold: Double = js.native
  var rows: js.Promise[js.Array[Row]] | Null = js.native
  var rowsTitle: String = js.native
  var selection: js.Array[K] = js.native
  var selectionMode: none | single | multiple = js.native
  var styleDefaults: AnonCellDefaults = js.native
  var tooltip: Anon13[K] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojNBox_ : AnonHighlightedCount = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: cellContentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[counts | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: cellContentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[counts | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: cellMaximizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on], _]
  ): Unit = js.native
  def addEventListener(
    `type`: cellMaximizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[off | on], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: groupAttributesChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: groupAttributesChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: groupBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[acrossCells | none | withinCell], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: groupBehaviorChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[acrossCells | none | withinCell], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[any | all], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dim | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelTruncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ifRequired | on], _]
  ): Unit = js.native
  def addEventListener(
    `type`: labelTruncationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[ifRequired | on], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | single | multiple], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | single | multiple], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[touchStart | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellsChanged(
    `type`: cellsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cellsChanged(
    `type`: cellsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsChanged(
    `type`: columnsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsTitleChanged(
    `type`: columnsTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_columnsTitleChanged(
    `type`: columnsTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_countLabelChanged(
    `type`: countLabelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_countLabelChanged(
    `type`: countLabelChanged,
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
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedColumnChanged(
    `type`: maximizedColumnChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedColumnChanged(
    `type`: maximizedColumnChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedRowChanged(
    `type`: maximizedRowChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maximizedRowChanged(
    `type`: maximizedRowChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherColorChanged(
    `type`: otherColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherColorChanged(
    `type`: otherColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_otherThresholdChanged(
    `type`: otherThresholdChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsTitleChanged(
    `type`: rowsTitleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsTitleChanged(
    `type`: rowsTitleChanged,
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
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def countLabel(context: CountLabelContext): String | Null = js.native
  def getCell(rowValue: String, columnValue: String): js.Object | Null = js.native
  def getColumn(columnValue: String): js.Object | Null = js.native
  def getColumnCount(): Double = js.native
  def getColumnsTitle(): String = js.native
  def getContextByNode(node: Element): js.Object | Null = js.native
  def getDialog(): js.Object | Null = js.native
  def getGroupBehavior(): String = js.native
  def getGroupNode(groupCategory: String): js.Object | Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_cellContent(property: cellContent): counts | auto = js.native
  @JSName("getProperty")
  def getProperty_cellMaximize(property: cellMaximize): off | on = js.native
  @JSName("getProperty")
  def getProperty_cells(property: cells): js.Promise[js.Array[Cell]] | Null = js.native
  @JSName("getProperty")
  def getProperty_columns(property: columns): js.Promise[js.Array[Column]] | Null = js.native
  @JSName("getProperty")
  def getProperty_columnsTitle(property: columnsTitle): String = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_groupAttributes(property: groupAttributes): color | indicatorColor | indicatorIconColor | indicatorIconPattern | indicatorIconShape = js.native
  @JSName("getProperty")
  def getProperty_groupBehavior(property: groupBehavior): acrossCells | none | withinCell = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_labelTruncation(property: labelTruncation): ifRequired | on = js.native
  @JSName("getProperty")
  def getProperty_maximizedColumn(property: maximizedColumn): String = js.native
  @JSName("getProperty")
  def getProperty_maximizedRow(property: maximizedRow): String = js.native
  @JSName("getProperty")
  def getProperty_otherColor(property: otherColor): String = js.native
  @JSName("getProperty")
  def getProperty_otherThreshold(property: otherThreshold): Double = js.native
  @JSName("getProperty")
  def getProperty_rows(property: rows): js.Promise[js.Array[Row]] | Null = js.native
  @JSName("getProperty")
  def getProperty_rowsTitle(property: rowsTitle): String = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): none | single | multiple = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): AnonCellDefaults = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon13[K] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  def getRow(rowValue: String): js.Object | Null = js.native
  def getRowCount(): Double = js.native
  def getRowsTitle(): String = js.native
  def setProperties(properties: ojNBoxSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: cellContent, value: auto): Unit = js.native
  def setProperty(property: cellContent, value: counts): Unit = js.native
  def setProperty(property: cellMaximize, value: off): Unit = js.native
  def setProperty(property: cellMaximize, value: on): Unit = js.native
  def setProperty(property: groupAttributes, value: color): Unit = js.native
  def setProperty(property: groupAttributes, value: indicatorColor): Unit = js.native
  def setProperty(property: groupAttributes, value: indicatorIconColor): Unit = js.native
  def setProperty(property: groupAttributes, value: indicatorIconPattern): Unit = js.native
  def setProperty(property: groupAttributes, value: indicatorIconShape): Unit = js.native
  def setProperty(property: groupBehavior, value: acrossCells): Unit = js.native
  def setProperty(property: groupBehavior, value: none): Unit = js.native
  def setProperty(property: groupBehavior, value: withinCell): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: labelTruncation, value: ifRequired): Unit = js.native
  def setProperty(property: labelTruncation, value: on): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_cells(property: cells): Unit = js.native
  @JSName("setProperty")
  def setProperty_cells(property: cells, value: js.Array[Cell]): Unit = js.native
  @JSName("setProperty")
  def setProperty_cells(property: cells, value: js.Promise[js.Array[Cell]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Array[Column]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columns(property: columns, value: js.Promise[js.Array[Column]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_columnsTitle(property: columnsTitle, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_maximizedColumn(property: maximizedColumn, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_maximizedRow(property: maximizedRow, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherColor(property: otherColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_otherThreshold(property: otherThreshold, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_rows(property: rows): Unit = js.native
  @JSName("setProperty")
  def setProperty_rows(property: rows, value: js.Array[Row]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rows(property: rows, value: js.Promise[js.Array[Row]]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowsTitle(property: rowsTitle, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: AnonCellDefaults): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon13[K]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonHighlightedCount): Unit = js.native
}

