package typingsJapgolly.nivoCirclePacking

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.nivoCirclePacking.anon.CanvasEl
import typingsJapgolly.nivoCirclePacking.anon.ChildColor
import typingsJapgolly.nivoCirclePacking.anon.Filter
import typingsJapgolly.nivoCirclePacking.anon.Label
import typingsJapgolly.nivoCirclePacking.anon.Nodes
import typingsJapgolly.nivoCirclePacking.anon.PartialRecordonMouseMoveo
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CirclePackingCustomLayerProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.MouseHandlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/circle-packing/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCirclePacking[RawDatum](
    hasDataIdValueValueFormatWidthHeightPaddingLeavesOnlyColorsColorByInheritColorFromParentChildColor: ChildColor[RawDatum]
  ): js.Array[ComputedDatum[RawDatum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePacking")(hasDataIdValueValueFormatWidthHeightPaddingLeavesOnlyColorsColorByInheritColorFromParentChildColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  
  inline def useCirclePackingLabels[RawDatum](hasNodesLabelFilterSkipRadiusTextColor: Filter[RawDatum]): js.Array[Label[RawDatum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingLabels")(hasNodesLabelFilterSkipRadiusTextColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[Label[RawDatum]]]
  
  inline def useCirclePackingLayerContext[RawDatum](hasNodes: Nodes[RawDatum]): CirclePackingCustomLayerProps[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingLayerContext")(hasNodes.asInstanceOf[js.Any]).asInstanceOf[CirclePackingCustomLayerProps[RawDatum]]
  
  inline def useCirclePackingZoom[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]], zoomedId: String, width: Double, height: Double): js.Array[ComputedDatum[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingZoom")(nodes.asInstanceOf[js.Any], zoomedId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  inline def useCirclePackingZoom[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]], zoomedId: Null, width: Double, height: Double): js.Array[ComputedDatum[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingZoom")(nodes.asInstanceOf[js.Any], zoomedId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  inline def useCirclePackingZoom[RawDatum](nodes: js.Array[ComputedDatum[RawDatum]], zoomedId: Unit, width: Double, height: Double): js.Array[ComputedDatum[RawDatum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCirclePackingZoom")(nodes.asInstanceOf[js.Any], zoomedId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedDatum[RawDatum]]]
  
  inline def useMouseCircleDetection[RawDatum](hasNodesCanvasElMargin: CanvasEl[RawDatum]): js.Function1[
    /* event */ ReactMouseEventFrom[Element], 
    js.UndefOr[ComputedDatum[RawDatum] | Null]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMouseCircleDetection")(hasNodesCanvasElMargin.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* event */ ReactMouseEventFrom[Element], 
    js.UndefOr[ComputedDatum[RawDatum] | Null]
  ]]
  
  inline def useNodeMouseHandlers[RawDatum](
    node: ComputedDatum[RawDatum],
    hasOnMouseEnterOnMouseMoveOnMouseLeaveOnClick: MouseHandlers[RawDatum]
  ): PartialRecordonMouseMoveo = (^.asInstanceOf[js.Dynamic].applyDynamic("useNodeMouseHandlers")(node.asInstanceOf[js.Any], hasOnMouseEnterOnMouseMoveOnMouseLeaveOnClick.asInstanceOf[js.Any])).asInstanceOf[PartialRecordonMouseMoveo]
}
