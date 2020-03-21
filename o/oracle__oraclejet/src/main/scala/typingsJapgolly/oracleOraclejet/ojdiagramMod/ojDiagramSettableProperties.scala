package typingsJapgolly.oracleOraclejet.ojdiagramMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.Anon5
import typingsJapgolly.oracleOraclejet.AnonAnimationDuration
import typingsJapgolly.oracleOraclejet.AnonDrop
import typingsJapgolly.oracleOraclejet.AnonHalign
import typingsJapgolly.oracleOraclejet.AnonInsertSVGElement
import typingsJapgolly.oracleOraclejet.AnonLabelClearSelection
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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

trait ojDiagramSettableProperties[K1, K2, D1, D2] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var as: String
  var dnd: AnonDrop
  var expanded: KeySet[K1]
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  var linkData: (DataProvider[K2, D2]) | Null
  var linkHighlightMode: linkAndNodes | link
  var maxZoom: Double
  var minZoom: Double
  var nodeData: (DataProvider[K1, D1]) | Null
  var nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node
  var overview: AnonHalign
  var panDirection: x | y | auto
  var panning: auto | none
  var promotedLinkBehavior: none | full | `lazy`
  var selection: js.Array[K1 | K2]
  var selectionMode: single | multiple | none
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  var styleDefaults: AnonAnimationDuration
  var tooltip: Anon5[K1, K2, D1, D2]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojDiagramSettableProperties: AnonLabelClearSelection
  var zoomRenderer: (js.Function1[/* context */ RendererContext[K1, D1], AnonInsertSVGElement | Unit]) | Null
  var zooming: auto | none
  def layout(param0: DvtDiagramLayoutContext): Unit
  def renderer(context: RendererContext[K1, D1]): AnonInsertSVGElement
}

object ojDiagramSettableProperties {
  @scala.inline
  def apply[K1, K2, D1, D2](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    dnd: AnonDrop,
    expanded: KeySet[K1],
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    layout: DvtDiagramLayoutContext => Callback,
    linkHighlightMode: linkAndNodes | link,
    maxZoom: Double,
    minZoom: Double,
    nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node,
    overview: AnonHalign,
    panDirection: x | y | auto,
    panning: auto | none,
    promotedLinkBehavior: none | full | `lazy`,
    renderer: RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement],
    selection: js.Array[K1 | K2],
    selectionMode: single | multiple | none,
    styleDefaults: AnonAnimationDuration,
    tooltip: Anon5[K1, K2, D1, D2],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: AnonLabelClearSelection,
    zooming: auto | none,
    focusRenderer: /* context */ RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement | Unit] = null,
    hoverRenderer: /* context */ RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement | Unit] = null,
    linkData: DataProvider[K2, D2] = null,
    nodeData: DataProvider[K1, D1] = null,
    selectionRenderer: /* context */ RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement | Unit] = null,
    zoomRenderer: /* context */ RendererContext[K1, D1] => CallbackTo[AnonInsertSVGElement | Unit] = null
  ): ojDiagramSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], linkHighlightMode = linkHighlightMode.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], nodeHighlightMode = nodeHighlightMode.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], panDirection = panDirection.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], promotedLinkBehavior = promotedLinkBehavior.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
    __obj.updateDynamic("layout")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext) => layout(t0).runNow()))
    __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => renderer(t0).runNow()))
    if (focusRenderer != null) __obj.updateDynamic("focusRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => focusRenderer(t0).runNow()))
    if (hoverRenderer != null) __obj.updateDynamic("hoverRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => hoverRenderer(t0).runNow()))
    if (linkData != null) __obj.updateDynamic("linkData")(linkData.asInstanceOf[js.Any])
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => selectionRenderer(t0).runNow()))
    if (zoomRenderer != null) __obj.updateDynamic("zoomRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext[K1, D1]) => zoomRenderer(t0).runNow()))
    __obj.asInstanceOf[ojDiagramSettableProperties[K1, K2, D1, D2]]
  }
}

