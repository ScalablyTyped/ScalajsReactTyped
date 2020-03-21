package typingsJapgolly.oracleOraclejet.ojdiagramMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.Anon5
import typingsJapgolly.oracleOraclejet.AnonAnimationDuration
import typingsJapgolly.oracleOraclejet.AnonDrop
import typingsJapgolly.oracleOraclejet.AnonHalign
import typingsJapgolly.oracleOraclejet.AnonInsertSVGElement
import typingsJapgolly.oracleOraclejet.AnonLabelClearSelection
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typingsJapgolly.oracleOraclejet.ojkeysetMod.KeySet
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`lazy`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.any
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dim
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.full
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.link
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.linkAndNodes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.node
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeAndIncomingLinks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeAndLinks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.nodeAndOutgoingLinks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.x
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramSettableProperties<K1, K2, D1, D2>> */
trait ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]
  extends /* key */ StringDictionary[js.Any] {
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var dnd: js.UndefOr[AnonDrop] = js.undefined
  var expanded: js.UndefOr[KeySet[K1]] = js.undefined
  var focusRenderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]] = js.undefined
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  var highlightMatch: js.UndefOr[any | all] = js.undefined
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  var hoverRenderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]] = js.undefined
  var layout: js.UndefOr[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]] = js.undefined
  var linkData: js.UndefOr[DataProvider[K2, D2]] = js.undefined
  var linkHighlightMode: js.UndefOr[linkAndNodes | link] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var nodeData: js.UndefOr[DataProvider[K1, D1]] = js.undefined
  var nodeHighlightMode: js.UndefOr[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node] = js.undefined
  var overview: js.UndefOr[AnonHalign] = js.undefined
  var panDirection: js.UndefOr[x | y | auto] = js.undefined
  var panning: js.UndefOr[auto | none] = js.undefined
  var promotedLinkBehavior: js.UndefOr[none | full | `lazy`] = js.undefined
  var renderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement]] = js.undefined
  var selection: js.UndefOr[js.Array[K1 | K2]] = js.undefined
  var selectionMode: js.UndefOr[single | multiple | none] = js.undefined
  var selectionRenderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]] = js.undefined
  var styleDefaults: js.UndefOr[AnonAnimationDuration] = js.undefined
  var tooltip: js.UndefOr[Anon5[K1, K2, D1, D2]] = js.undefined
  var touchResponse: js.UndefOr[touchStart | auto] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelClearSelection] = js.undefined
  var zoomRenderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]] = js.undefined
  var zooming: js.UndefOr[auto | none] = js.undefined
}

object ojDiagramSettablePropertiesLenient {
  @scala.inline
  def apply[K1, K2, D1, D2](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | none = null,
    as: String = null,
    dnd: AnonDrop = null,
    expanded: KeySet[K1] = null,
    focusRenderer: /* context */ RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement | Unit] = null,
    hiddenCategories: js.Array[String] = null,
    highlightMatch: any | all = null,
    highlightedCategories: js.Array[String] = null,
    hoverBehavior: dim | none = null,
    hoverRenderer: /* context */ RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement | Unit] = null,
    layout: /* param0 */ DvtDiagramLayoutContext => Callback = null,
    linkData: DataProvider[K2, D2] = null,
    linkHighlightMode: linkAndNodes | link = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    nodeData: DataProvider[K1, D1] = null,
    nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node = null,
    overview: AnonHalign = null,
    panDirection: x | y | auto = null,
    panning: auto | none = null,
    promotedLinkBehavior: none | full | `lazy` = null,
    renderer: /* context */ RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement] = null,
    selection: js.Array[K1 | K2] = null,
    selectionMode: single | multiple | none = null,
    selectionRenderer: /* context */ RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement | Unit] = null,
    styleDefaults: AnonAnimationDuration = null,
    tooltip: Anon5[K1, K2, D1, D2] = null,
    touchResponse: touchStart | auto = null,
    trackResize: on | off = null,
    translations: AnonLabelClearSelection = null,
    zoomRenderer: /* context */ RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement | Unit] = null,
    zooming: auto | none = null
  ): ojDiagramSettablePropertiesLenient[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (dnd != null) __obj.updateDynamic("dnd")(dnd.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (focusRenderer != null) __obj.updateDynamic("focusRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => focusRenderer(t0).runNow()))
    if (hiddenCategories != null) __obj.updateDynamic("hiddenCategories")(hiddenCategories.asInstanceOf[js.Any])
    if (highlightMatch != null) __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    if (highlightedCategories != null) __obj.updateDynamic("highlightedCategories")(highlightedCategories.asInstanceOf[js.Any])
    if (hoverBehavior != null) __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    if (hoverRenderer != null) __obj.updateDynamic("hoverRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => hoverRenderer(t0).runNow()))
    if (layout != null) __obj.updateDynamic("layout")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext) => layout(t0).runNow()))
    if (linkData != null) __obj.updateDynamic("linkData")(linkData.asInstanceOf[js.Any])
    if (linkHighlightMode != null) __obj.updateDynamic("linkHighlightMode")(linkHighlightMode.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (nodeHighlightMode != null) __obj.updateDynamic("nodeHighlightMode")(nodeHighlightMode.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (panDirection != null) __obj.updateDynamic("panDirection")(panDirection.asInstanceOf[js.Any])
    if (panning != null) __obj.updateDynamic("panning")(panning.asInstanceOf[js.Any])
    if (promotedLinkBehavior != null) __obj.updateDynamic("promotedLinkBehavior")(promotedLinkBehavior.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => renderer(t0).runNow()))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => selectionRenderer(t0).runNow()))
    if (styleDefaults != null) __obj.updateDynamic("styleDefaults")(styleDefaults.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (touchResponse != null) __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (zoomRenderer != null) __obj.updateDynamic("zoomRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => zoomRenderer(t0).runNow()))
    if (zooming != null) __obj.updateDynamic("zooming")(zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]]
  }
}

