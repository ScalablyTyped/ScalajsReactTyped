package typingsJapgolly.nivoTreemap

import typingsJapgolly.d3Hierarchy.mod.HierarchyNode
import typingsJapgolly.d3Hierarchy.mod.TreemapLayout
import typingsJapgolly.nivoTreemap.anon.BorderColor
import typingsJapgolly.nivoTreemap.anon.EnableParentLabel
import typingsJapgolly.nivoTreemap.anon.GetValue
import typingsJapgolly.nivoTreemap.anon.Hierarchy
import typingsJapgolly.nivoTreemap.anon.IsInteractive
import typingsJapgolly.nivoTreemap.distTypesTypesMod.ComputedNode
import typingsJapgolly.nivoTreemap.distTypesTypesMod.ComputedNodeWithHandlers
import typingsJapgolly.nivoTreemap.distTypesTypesMod.CustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/treemap/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCustomLayerProps[Datum /* <: js.Object */](hasNodes: CustomLayerProps[Datum]): CustomLayerProps[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCustomLayerProps")(hasNodes.asInstanceOf[js.Any]).asInstanceOf[CustomLayerProps[Datum]]
  
  inline def useHierarchy[Datum /* <: js.Object */](hasRootGetValue: GetValue[Datum]): HierarchyNode[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHierarchy")(hasRootGetValue.asInstanceOf[js.Any]).asInstanceOf[HierarchyNode[Datum]]
  
  inline def useInteractiveTreeMapNodes[Datum /* <: js.Object */](
    nodes: js.Array[ComputedNode[Datum]],
    hasIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip: IsInteractive[Datum]
  ): js.Array[ComputedNodeWithHandlers[Datum]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInteractiveTreeMapNodes")(nodes.asInstanceOf[js.Any], hasIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedNodeWithHandlers[Datum]]]
  
  inline def useTreeMap[Datum /* <: js.Object */](
    hasDataWidthHeightIdentityValueValueFormatLeavesOnlyTileInnerPaddingOuterPaddingLabelOrientLabelEnableParentLabelParentLabelParentLabelSizeParentLabelPositionParentLabelPaddingColorsColorByNodeOpacityBorderColorLabelTextColorParentLabelTextColor: BorderColor[Datum]
  ): Hierarchy[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeMap")(hasDataWidthHeightIdentityValueValueFormatLeavesOnlyTileInnerPaddingOuterPaddingLabelOrientLabelEnableParentLabelParentLabelParentLabelSizeParentLabelPositionParentLabelPaddingColorsColorByNodeOpacityBorderColorLabelTextColorParentLabelTextColor.asInstanceOf[js.Any]).asInstanceOf[Hierarchy[Datum]]
  
  inline def useTreeMapLayout[Datum /* <: js.Object */](
    hasWidthHeightTileInnerPaddingOuterPaddingEnableParentLabelParentLabelSizeParentLabelPositionLeavesOnly: EnableParentLabel
  ): TreemapLayout[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeMapLayout")(hasWidthHeightTileInnerPaddingOuterPaddingEnableParentLabelParentLabelSizeParentLabelPositionLeavesOnly.asInstanceOf[js.Any]).asInstanceOf[TreemapLayout[Datum]]
}
