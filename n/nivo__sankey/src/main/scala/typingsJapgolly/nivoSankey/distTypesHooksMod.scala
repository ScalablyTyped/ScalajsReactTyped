package typingsJapgolly.nivoSankey

import typingsJapgolly.nivoSankey.anon.Align
import typingsJapgolly.nivoSankey.anon.AlignFunction
import typingsJapgolly.nivoSankey.anon.CurrentLink
import typingsJapgolly.nivoSankey.anon.Nodes
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/sankey/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeNodeAndLinks[N /* <: DefaultNode */, L /* <: DefaultLink */](
    has_dataFormatValueLayoutAlignFunctionSortFunctionLinkSortModeNodeThicknessNodeSpacingNodeInnerPaddingWidthHeightGetColorGetLabel: AlignFunction[N, L]
  ): Nodes[N, L] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNodeAndLinks")(has_dataFormatValueLayoutAlignFunctionSortFunctionLinkSortModeNodeThicknessNodeSpacingNodeInnerPaddingWidthHeightGetColorGetLabel.asInstanceOf[js.Any]).asInstanceOf[Nodes[N, L]]
  
  inline def useSankey[N /* <: DefaultNode */, L /* <: DefaultLink */](
    hasDataValueFormatLayoutWidthHeightSortAlignColorsNodeThicknessNodeSpacingNodeInnerPaddingNodeBorderColorLabelLabelTextColor: Align[N, L]
  ): CurrentLink[N, L] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSankey")(hasDataValueFormatLayoutWidthHeightSortAlignColorsNodeThicknessNodeSpacingNodeInnerPaddingNodeBorderColorLabelLabelTextColor.asInstanceOf[js.Any]).asInstanceOf[CurrentLink[N, L]]
}
