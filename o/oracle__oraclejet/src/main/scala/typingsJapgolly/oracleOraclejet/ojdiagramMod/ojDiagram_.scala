package typingsJapgolly.oracleOraclejet.ojdiagramMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.Anon5
import typingsJapgolly.oracleOraclejet.AnonAnimationDuration
import typingsJapgolly.oracleOraclejet.AnonDrop
import typingsJapgolly.oracleOraclejet.AnonHalign
import typingsJapgolly.oracleOraclejet.AnonInsertSVGElement
import typingsJapgolly.oracleOraclejet.AnonLabelClearSelection
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsJapgolly.oracleOraclejet.ojkeysetMod.KeySet
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`lazy`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.any
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.as
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dim
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.expanded
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focusRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focusRendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.full
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hiddenCategories
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hiddenCategoriesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightMatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightMatchChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightedCategories
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highlightedCategoriesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hoverRendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.layoutChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.link
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.linkAndNodes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.linkData
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.linkDataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.linkHighlightMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.linkHighlightModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxZoom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxZoomChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minZoom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minZoomChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.node
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeAndIncomingLinks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeAndLinks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeAndOutgoingLinks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeData
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeDataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeHighlightMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeHighlightModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojExpand
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.overview
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.overviewChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.panDirection
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.panDirectionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.panning
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.panningChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.promotedLinkBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.promotedLinkBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selection
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionRendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.x
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.y
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomRendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zooming
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomingChanged
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojDiagram_[K1, K2, D1, D2] extends dvtBaseComponent[ojDiagramSettableProperties[K1, K2, D1, D2]] {
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var as: String = js.native
  var dnd: AnonDrop = js.native
  var expanded: KeySet[K1] = js.native
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null = js.native
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  var linkHighlightMode: linkAndNodes | link = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var nodeData: (DataProvider[K1, D1]) | Null = js.native
  var nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onExpandedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onFocusRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLayoutChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLinkDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLinkHighlightModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaxZoomChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMinZoomChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onNodeDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onNodeHighlightModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOverviewChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPanDirectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPanningChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPromotedLinkBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onZoomRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onZoomingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var overview: AnonHalign = js.native
  var panDirection: x | y | auto = js.native
  var panning: auto | none = js.native
  var promotedLinkBehavior: none | full | `lazy` = js.native
  var selection: js.Array[K1 | K2] = js.native
  var selectionMode: single | multiple | none = js.native
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null = js.native
  var styleDefaults: AnonAnimationDuration = js.native
  var tooltip: Anon5[K1, K2, D1, D2] = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojDiagram_ : AnonLabelClearSelection = js.native
  var zoomRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null = js.native
  var zooming: auto | none = js.native
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
    `type`: linkHighlightModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[linkAndNodes | link], _]
  ): Unit = js.native
  def addEventListener(
    `type`: linkHighlightModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[linkAndNodes | link], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: nodeHighlightModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: nodeHighlightModeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: panDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: panDirectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[x | y | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: panningChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: panningChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: promotedLinkBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | full | `lazy`], _]
  ): Unit = js.native
  def addEventListener(
    `type`: promotedLinkBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | full | `lazy`], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _],
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
  def addEventListener(
    `type`: zoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: zoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
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
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: focusRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: focusRendererChanged,
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
  def addEventListener_hoverRendererChanged(
    `type`: hoverRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(
    `type`: hoverRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_layoutChanged(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_layoutChanged(
    `type`: layoutChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: linkDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: linkDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: maxZoomChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: maxZoomChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minZoomChanged(
    `type`: minZoomChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minZoomChanged(
    `type`: minZoomChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDataChanged(
    `type`: nodeDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nodeDataChanged(
    `type`: nodeDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overviewChanged(
    `type`: overviewChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: rendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: rendererChanged,
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
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
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
  @JSName("addEventListener")
  def addEventListener_zoomRendererChanged(
    `type`: zoomRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_zoomRendererChanged(
    `type`: zoomRendererChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getContextByNode(node: Element): js.Object | Null = js.native
  def getLink(linkIndex: Double): js.Object | Null = js.native
  def getLinkCount(): Double = js.native
  def getNode(nodeIndex: Double): js.Object | Null = js.native
  def getNodeCount(): Double = js.native
  def getPromotedLink(startNodeIndex: Double, endNodeIndex: Double): js.Object | Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): AnonDrop = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): KeySet[K1] = js.native
  @JSName("getProperty")
  def getProperty_focusRenderer(property: focusRenderer): (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverRenderer(property: hoverRenderer): (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_linkData(property: linkData): (DataProvider[K2, D2]) | Null = js.native
  @JSName("getProperty")
  def getProperty_linkHighlightMode(property: linkHighlightMode): linkAndNodes | link = js.native
  @JSName("getProperty")
  def getProperty_maxZoom(property: maxZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_minZoom(property: minZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_nodeData(property: nodeData): (DataProvider[K1, D1]) | Null = js.native
  @JSName("getProperty")
  def getProperty_nodeHighlightMode(property: nodeHighlightMode): nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node = js.native
  @JSName("getProperty")
  def getProperty_overview(property: overview): AnonHalign = js.native
  @JSName("getProperty")
  def getProperty_panDirection(property: panDirection): x | y | auto = js.native
  @JSName("getProperty")
  def getProperty_panning(property: panning): auto | none = js.native
  @JSName("getProperty")
  def getProperty_promotedLinkBehavior(property: promotedLinkBehavior): none | full | `lazy` = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K1 | K2] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_selectionRenderer(property: selectionRenderer): (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): AnonAnimationDuration = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon5[K1, K2, D1, D2] = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_zoomRenderer(property: zoomRenderer): (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_zooming(property: zooming): auto | none = js.native
  def layout(param0: DvtDiagramLayoutContext): Unit = js.native
  def renderer(context: RendererContext[K1, D1]): AnonInsertSVGElement = js.native
  def setProperties(properties: ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: linkHighlightMode, value: link): Unit = js.native
  def setProperty(property: linkHighlightMode, value: linkAndNodes): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: node): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: nodeAndIncomingLinks): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: nodeAndLinks): Unit = js.native
  def setProperty(property: nodeHighlightMode, value: nodeAndOutgoingLinks): Unit = js.native
  def setProperty(property: panDirection, value: auto): Unit = js.native
  def setProperty(property: panDirection, value: x): Unit = js.native
  def setProperty(property: panDirection, value: y): Unit = js.native
  def setProperty(property: panning, value: auto): Unit = js.native
  def setProperty(property: panning, value: none): Unit = js.native
  def setProperty(property: promotedLinkBehavior, value: `lazy`): Unit = js.native
  def setProperty(property: promotedLinkBehavior, value: full): Unit = js.native
  def setProperty(property: promotedLinkBehavior, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  def setProperty(property: zooming, value: auto): Unit = js.native
  def setProperty(property: zooming, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: AnonDrop): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: KeySet[K1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(property: focusRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(
    property: focusRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_hiddenCategories(property: hiddenCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_highlightedCategories(property: highlightedCategories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverRenderer(property: hoverRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverRenderer(
    property: hoverRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_maxZoom(property: maxZoom, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_minZoom(property: minZoom, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeData(property: nodeData): Unit = js.native
  @JSName("setProperty")
  def setProperty_nodeData(property: nodeData, value: DataProvider[K1, D1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_overview(property: overview, value: AnonHalign): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K1 | K2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(property: selectionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(
    property: selectionRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: AnonAnimationDuration): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon5[K1, K2, D1, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelClearSelection): Unit = js.native
  @JSName("setProperty")
  def setProperty_zoomRenderer(property: zoomRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_zoomRenderer(
    property: zoomRenderer,
    value: js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]
  ): Unit = js.native
}

