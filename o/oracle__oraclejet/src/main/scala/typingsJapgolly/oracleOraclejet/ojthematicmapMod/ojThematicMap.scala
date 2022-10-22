package typingsJapgolly.oracleOraclejet.ojthematicmapMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.oracleOraclejet.anon.AreaSvgStyle
import typingsJapgolly.oracleOraclejet.anon.Focused
import typingsJapgolly.oracleOraclejet.anon.Geo
import typingsJapgolly.oracleOraclejet.anon.InsertSVGElement
import typingsJapgolly.oracleOraclejet.anon.LabelAndValue
import typingsJapgolly.oracleOraclejet.anon.`27`
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojThematicMap[K1, K2, K3, D1, D2, D3]
  extends StObject
     with dvtBaseComponent[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: highlightMatchChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: hoverBehaviorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: hoverBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: initialZoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: labelDisplayChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: labelTypeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: labelTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: markerZoomBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: markerZoomBehaviorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: panningChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: panningChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: tooltipDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: tooltipDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: touchResponseChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: touchResponseChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: zoomingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: zoomingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(`type`: areaDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaDataChanged(
    `type`: areaDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(`type`: focusRendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusRendererChanged(
    `type`: focusRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hiddenCategoriesChanged(
    `type`: hiddenCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highlightedCategoriesChanged(
    `type`: highlightedCategoriesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(`type`: hoverRendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverRendererChanged(
    `type`: hoverRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolatedItemChanged(`type`: isolatedItemChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolatedItemChanged(
    `type`: isolatedItemChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(`type`: linkDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_linkDataChanged(
    `type`: linkDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapProviderChanged(`type`: mapProviderChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapProviderChanged(
    `type`: mapProviderChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(`type`: markerDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerDataChanged(
    `type`: markerDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(`type`: maxZoomChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxZoomChanged(
    `type`: maxZoomChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(`type`: rendererChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rendererChanged(
    `type`: rendererChanged,
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
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionRendererChanged(
    `type`: selectionRendererChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(`type`: styleDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_styleDefaultsChanged(
    `type`: styleDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var animationDuration: Double = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var areaData: (DataProvider[K1, D1]) | Null = js.native
  
  var as: String = js.native
  
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
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
  def getProperty_focusRenderer(property: focusRenderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_hiddenCategories(property: hiddenCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_highlightMatch(property: highlightMatch): any | all = js.native
  @JSName("getProperty")
  def getProperty_highlightedCategories(property: highlightedCategories): js.Array[String] = js.native
  @JSName("getProperty")
  def getProperty_hoverBehavior(property: hoverBehavior): dim | none = js.native
  @JSName("getProperty")
  def getProperty_hoverRenderer(property: hoverRenderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
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
  def getProperty_mapProvider(property: mapProvider): Geo = js.native
  @JSName("getProperty")
  def getProperty_markerData(property: markerData): (DataProvider[K3, D3]) | Null = js.native
  @JSName("getProperty")
  def getProperty_markerZoomBehavior(property: markerZoomBehavior): zoom | fixed = js.native
  @JSName("getProperty")
  def getProperty_maxZoom(property: maxZoom): Double = js.native
  @JSName("getProperty")
  def getProperty_panning(property: panning): auto | none = js.native
  @JSName("getProperty")
  def getProperty_renderer(property: renderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K1 | K2 | K3] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_selectionRenderer(property: selectionRenderer): (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  @JSName("getProperty")
  def getProperty_styleDefaults(property: styleDefaults): AreaSvgStyle = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `27`[K1, K2, K3, D1, D2, D3] = js.native
  @JSName("getProperty")
  def getProperty_tooltipDisplay(property: tooltipDisplay): auto | labelAndShortDesc | none | shortDesc = js.native
  @JSName("getProperty")
  def getProperty_touchResponse(property: touchResponse): touchStart | auto = js.native
  @JSName("getProperty")
  def getProperty_zooming(property: zooming): auto | none = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  var initialZooming: auto | none = js.native
  
  var isolatedItem: K1 = js.native
  
  var labelDisplay: on | off | auto = js.native
  
  var labelType: long | short = js.native
  
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  
  var mapProvider: Geo = js.native
  
  var markerData: (DataProvider[K3, D3]) | Null = js.native
  
  var markerZoomBehavior: zoom | fixed = js.native
  
  var maxZoom: Double = js.native
  
  var onAnimationDurationChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAreaDataChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onFocusRendererChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHiddenCategoriesChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHighlightMatchChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHighlightedCategoriesChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHoverBehaviorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHoverRendererChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onInitialZoomingChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onIsolatedItemChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLabelDisplayChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLabelTypeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLinkDataChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMapProviderChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMarkerDataChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMarkerZoomBehaviorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMaxZoomChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onPanningChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onRendererChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSelectionModeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSelectionRendererChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onStyleDefaultsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTooltipDisplayChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTouchResponseChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onZoomingChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var panning: auto | none = js.native
  
  var renderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  var selection: js.Array[K1 | K2 | K3] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  def setProperties(properties: ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]): Unit = js.native
  
  def setProperty(property: animationOnDisplay, value: auto | none): Unit = js.native
  def setProperty(property: highlightMatch, value: any | all): Unit = js.native
  def setProperty(property: hoverBehavior, value: dim | none): Unit = js.native
  def setProperty(property: initialZooming, value: auto | none): Unit = js.native
  def setProperty(property: labelDisplay, value: on | off | auto): Unit = js.native
  def setProperty(property: labelType, value: long | short): Unit = js.native
  def setProperty(property: markerZoomBehavior, value: zoom | fixed): Unit = js.native
  def setProperty(property: panning, value: auto | none): Unit = js.native
  def setProperty(property: selectionMode, value: single | multiple | none): Unit = js.native
  def setProperty(property: tooltipDisplay, value: auto | labelAndShortDesc | none | shortDesc): Unit = js.native
  def setProperty(property: touchResponse, value: touchStart | auto): Unit = js.native
  def setProperty(property: zooming, value: auto | none): Unit = js.native
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
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
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
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_isolatedItem(property: isolatedItem, value: K1): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData): Unit = js.native
  @JSName("setProperty")
  def setProperty_linkData(property: linkData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_mapProvider(property: mapProvider, value: Geo): Unit = js.native
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
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K1 | K2 | K3]): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(property: selectionRenderer): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectionRenderer(
    property: selectionRenderer,
    value: js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_styleDefaults(property: styleDefaults, value: AreaSvgStyle): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `27`[K1, K2, K3, D1, D2, D3]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
  
  var styleDefaults: AreaSvgStyle = js.native
  
  var tooltip: `27`[K1, K2, K3, D1, D2, D3] = js.native
  
  var tooltipDisplay: auto | labelAndShortDesc | none | shortDesc = js.native
  
  var touchResponse: touchStart | auto = js.native
  
  @JSName("translations")
  var translations_ojThematicMap: LabelAndValue = js.native
  
  var zooming: auto | none = js.native
}
object ojThematicMap {
  
  // tslint:disable-next-line interface-over-type-literal
  trait DataContext extends StObject {
    
    var color: String
    
    var label: String
    
    var selected: Boolean
    
    var tooltip: String
  }
  object DataContext {
    
    inline def apply(color: String, label: String, selected: Boolean, tooltip: String): DataContext = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataContext]
    }
    
    extension [Self <: DataContext](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait NodeContext extends StObject {
    
    var index: Double
    
    var subId: String
  }
  object NodeContext {
    
    inline def apply(index: Double, subId: String): NodeContext = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeContext]
    }
    
    extension [Self <: NodeContext](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSubId(value: String): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait RendererContext[K1, K2, K3, D1, D2, D3] extends StObject {
    
    var color: String
    
    var componentElement: Element
    
    var data: js.Object
    
    var id: K1 | K2 | K3
    
    var itemData: D1 | D2 | D3
    
    var label: String
    
    var location: String | Null
    
    var parentElement: Element
    
    var previousState: Focused
    
    def renderDefaultFocus(): Unit
    
    def renderDefaultHover(): Unit
    
    def renderDefaultSelection(): Unit
    
    var root: Element | Null
    
    var state: Focused
    
    var x: Double | Null
    
    var y: Double | Null
  }
  object RendererContext {
    
    inline def apply[K1, K2, K3, D1, D2, D3](
      color: String,
      componentElement: Element,
      data: js.Object,
      id: K1 | K2 | K3,
      itemData: D1 | D2 | D3,
      label: String,
      parentElement: Element,
      previousState: Focused,
      renderDefaultFocus: Callback,
      renderDefaultHover: Callback,
      renderDefaultSelection: Callback,
      state: Focused
    ): RendererContext[K1, K2, K3, D1, D2, D3] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], renderDefaultFocus = renderDefaultFocus.toJsFn, renderDefaultHover = renderDefaultHover.toJsFn, renderDefaultSelection = renderDefaultSelection.toJsFn, state = state.asInstanceOf[js.Any], location = null, root = null, x = null, y = null)
      __obj.asInstanceOf[RendererContext[K1, K2, K3, D1, D2, D3]]
    }
    
    extension [Self <: RendererContext[?, ?, ?, ?, ?, ?], K1, K2, K3, D1, D2, D3](x: Self & (RendererContext[K1, K2, K3, D1, D2, D3])) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: K1 | K2 | K3): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: D1 | D2 | D3): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setPreviousState(value: Focused): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
      
      inline def setRenderDefaultFocus(value: Callback): Self = StObject.set(x, "renderDefaultFocus", value.toJsFn)
      
      inline def setRenderDefaultHover(value: Callback): Self = StObject.set(x, "renderDefaultHover", value.toJsFn)
      
      inline def setRenderDefaultSelection(value: Callback): Self = StObject.set(x, "renderDefaultSelection", value.toJsFn)
      
      inline def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setState(value: Focused): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXNull: Self = StObject.set(x, "x", null)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYNull: Self = StObject.set(x, "y", null)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait TooltipContext[K1, K2, K3, D1, D2, D3] extends StObject {
    
    var color: String | Null
    
    var componentElement: Element
    
    var data: js.Object | Null
    
    var id: K1 | K2 | K3
    
    var itemData: D1 | D2 | D3
    
    var label: String | Null
    
    var location: String | Null
    
    var locationName: String | Null
    
    var parentElement: Element
    
    var tooltip: String
    
    var x: Double
    
    var y: Double
  }
  object TooltipContext {
    
    inline def apply[K1, K2, K3, D1, D2, D3](
      componentElement: Element,
      id: K1 | K2 | K3,
      itemData: D1 | D2 | D3,
      parentElement: Element,
      tooltip: String,
      x: Double,
      y: Double
    ): TooltipContext[K1, K2, K3, D1, D2, D3] = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], color = null, data = null, label = null, location = null, locationName = null)
      __obj.asInstanceOf[TooltipContext[K1, K2, K3, D1, D2, D3]]
    }
    
    extension [Self <: TooltipContext[?, ?, ?, ?, ?, ?], K1, K2, K3, D1, D2, D3](x: Self & (TooltipContext[K1, K2, K3, D1, D2, D3])) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setId(value: K1 | K2 | K3): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: D1 | D2 | D3): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationName(value: String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
      
      inline def setLocationNameNull: Self = StObject.set(x, "locationName", null)
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
