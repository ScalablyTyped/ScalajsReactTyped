package typingsJapgolly.oracleOraclejet.ojthematicmapMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.Anon25
import typingsJapgolly.oracleOraclejet.AnonAreaSvgStyle
import typingsJapgolly.oracleOraclejet.AnonGeo
import typingsJapgolly.oracleOraclejet.AnonInsertSVGElement
import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsJapgolly.oracleOraclejet.ojthematicmapMod.ojThematicMap.DataContext
import typingsJapgolly.oracleOraclejet.ojthematicmapMod.ojThematicMap.NodeContext
import typingsJapgolly.oracleOraclejet.ojthematicmapMod.ojThematicMap.RendererContext
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.any
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.areaData
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.areaDataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.as
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dim
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fixed
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focusRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focusRendererChanged
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
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialZooming
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialZoomingChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.isolatedItem
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.isolatedItemChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelAndShortDesc
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelType
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelTypeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.linkData
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.linkDataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.long
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mapProvider
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mapProviderChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.markerData
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.markerDataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.markerZoomBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.markerZoomBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxZoom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxZoomChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.panning
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.panningChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.renderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selection
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionRendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.short
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.shortDesc
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.styleDefaults
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.styleDefaultsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchResponse
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchResponseChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zooming
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zoomingChanged
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojThematicMap_[K1, K2, K3, D1, D2, D3] extends dvtBaseComponent[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  var animationDuration: Double = js.native
  var animationOnDisplay: auto | none = js.native
  var areaData: (DataProvider[K1, D1]) | Null = js.native
  var as: String = js.native
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  var hiddenCategories: js.Array[String] = js.native
  var highlightMatch: any | all = js.native
  var highlightedCategories: js.Array[String] = js.native
  var hoverBehavior: dim | none = js.native
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  var initialZooming: auto | none = js.native
  var isolatedItem: K1 = js.native
  var labelDisplay: on | off | auto = js.native
  var labelType: long | short = js.native
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  var mapProvider: AnonGeo = js.native
  var markerData: (DataProvider[K3, D3]) | Null = js.native
  var markerZoomBehavior: zoom | fixed = js.native
  var maxZoom: Double = js.native
  var onAnimationDurationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAreaDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onFocusRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightMatchChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onInitialZoomingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onIsolatedItemChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLinkDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMapProviderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMarkerDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMarkerZoomBehaviorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaxZoomChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPanningChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionModeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectionRendererChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTouchResponseChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onZoomingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var panning: auto | none = js.native
  var renderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  var selection: js.Array[K1 | K2 | K3] = js.native
  var selectionMode: single | multiple | none = js.native
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  var styleDefaults: AnonAreaSvgStyle = js.native
  var tooltip: Anon25[K1, K2, K3, D1, D2, D3] = js.native
  var tooltipDisplay: auto | labelAndShortDesc | none | shortDesc = js.native
  var touchResponse: touchStart | auto = js.native
  @JSName("translations")
  var translations_ojThematicMap_ : AnonLabelAndValue = js.native
  var zooming: auto | none = js.native
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
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[long | short], _]
  ): Unit = js.native
  def addEventListener(
    `type`: labelTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[long | short], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: markerZoomBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zoom | fixed], _]
  ): Unit = js.native
  def addEventListener(
    `type`: markerZoomBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zoom | fixed], _],
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
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[single | multiple | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: tooltipDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: tooltipDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[auto | labelAndShortDesc | none | shortDesc], 
      _
    ],
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
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(
    `type`: areaDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(
    `type`: areaDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
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
  def addEventListener_isolatedItemChanged(
    `type`: isolatedItemChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolatedItemChanged(
    `type`: isolatedItemChanged,
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
  def addEventListener_mapProviderChanged(
    `type`: mapProviderChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapProviderChanged(
    `type`: mapProviderChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(
    `type`: markerDataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(
    `type`: markerDataChanged,
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
  def getArea(index: Double): DataContext | Null = js.native
  def getContextByNode(node: Element): NodeContext | Null = js.native
  def getLink(index: Double): DataContext | Null = js.native
  def getMarker(index: Double): DataContext | Null = js.native
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): Double = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_areaData(property: areaData): (DataProvider[K1, D1]) | Null = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_focusRenderer(property: focusRenderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverRenderer(property: hoverRenderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_initialZooming(property: initialZooming): auto | none = js.native
  @JSName("getProperty")
  def getProperty_isolatedItem(property: isolatedItem): K1 = js.native
  @JSName("getProperty")
  def getProperty_labelDisplay(property: labelDisplay): on | off | auto = js.native
  @JSName("getProperty")
  def getProperty_labelType(property: labelType): long | short = js.native
  @JSName("getProperty")
  def getProperty_linkData(property: linkData): (DataProvider[K2, D2]) | Null = js.native
  @JSName("getProperty")
  def getProperty_mapProvider(property: mapProvider): AnonGeo = js.native
  @JSName("getProperty")
  def getProperty_markerData(property: markerData): (DataProvider[K3, D3]) | Null = js.native
  @JSName("getProperty")
  def getProperty_markerZoomBehavior(property: markerZoomBehavior): zoom | fixed = js.native
  @JSName("getProperty")
  def getProperty_maxZoom(property: maxZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_panning(property: panning): auto | none = js.native
  @JSName("getProperty")
  def getProperty_renderer(property: renderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K1 | K2 | K3] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_selectionRenderer(property: selectionRenderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): AnonAreaSvgStyle = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon25[K1, K2, K3, D1, D2, D3] = js.native
  @JSName("getProperty")
  def getProperty_tooltipDisplay(property: tooltipDisplay): auto | labelAndShortDesc | none | shortDesc = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_zooming(property: zooming): auto | none = js.native
  def setProperties(properties: ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: highlightMatch, value: all): Unit = js.native
  def setProperty(property: highlightMatch, value: any): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim): Unit = js.native
  def setProperty(property: hoverBehavior, value: none): Unit = js.native
  def setProperty(property: initialZooming, value: auto): Unit = js.native
  def setProperty(property: initialZooming, value: none): Unit = js.native
  def setProperty(property: labelDisplay, value: auto): Unit = js.native
  def setProperty(property: labelDisplay, value: off): Unit = js.native
  def setProperty(property: labelDisplay, value: on): Unit = js.native
  def setProperty(property: labelType, value: long): Unit = js.native
  def setProperty(property: labelType, value: short): Unit = js.native
  def setProperty(property: markerZoomBehavior, value: fixed): Unit = js.native
  def setProperty(property: markerZoomBehavior, value: zoom): Unit = js.native
  def setProperty(property: panning, value: auto): Unit = js.native
  def setProperty(property: panning, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: multiple): Unit = js.native
  def setProperty(property: selectionMode, value: none): Unit = js.native
  def setProperty(property: selectionMode, value: single): Unit = js.native
  def setProperty(property: tooltipDisplay, value: auto): Unit = js.native
  def setProperty(property: tooltipDisplay, value: labelAndShortDesc): Unit = js.native
  def setProperty(property: tooltipDisplay, value: none): Unit = js.native
  def setProperty(property: tooltipDisplay, value: shortDesc): Unit = js.native
  def setProperty(property: touchResponse, value: auto): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart): Unit = js.native
  def setProperty(property: zooming, value: auto): Unit = js.native
  def setProperty(property: zooming, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaData(property: areaData): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaData(property: areaData, value: DataProvider[K1, D1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(property: focusRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_focusRenderer(
    property: focusRenderer,
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]
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
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_isolatedItem(property: isolatedItem, value: K1): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_mapProvider(property: mapProvider, value: AnonGeo): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerData(property: markerData): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerData(property: markerData, value: DataProvider[K3, D3]): Unit = js.native
  @JSName("setProperty")
  def setProperty_maxZoom(property: maxZoom, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_renderer(property: renderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_renderer(
    property: renderer,
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K1 | K2 | K3]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(property: selectionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(
    property: selectionRenderer,
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: AnonAreaSvgStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon25[K1, K2, K3, D1, D2, D3]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelAndValue): Unit = js.native
}

