package typingsJapgolly.nivoSankey

import typingsJapgolly.nivoSankey.anon.Node
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyMouseHandler
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyNodeDatum
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSankeyNodesMod {
  
  @JSImport("@nivo/sankey/dist/types/SankeyNodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SankeyNodes[N /* <: DefaultNode */, L /* <: DefaultLink */](
    hasNodesNodeOpacityNodeHoverOpacityNodeHoverOthersOpacityBorderWidthGetBorderColorBorderRadiusSetCurrentNodeCurrentNodeCurrentLinkIsCurrentNodeIsInteractiveOnClickTooltip: SankeyNodesProps[N, L]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SankeyNodes")(hasNodesNodeOpacityNodeHoverOpacityNodeHoverOthersOpacityBorderWidthGetBorderColorBorderRadiusSetCurrentNodeCurrentNodeCurrentLinkIsCurrentNodeIsInteractiveOnClickTooltip.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait SankeyNodesProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var borderRadius: Double = js.native
    
    var borderWidth: Double = js.native
    
    var currentLink: (SankeyLinkDatum[N, L]) | Null = js.native
    
    var currentNode: (SankeyNodeDatum[N, L]) | Null = js.native
    
    def getBorderColor(node: SankeyNodeDatum[N, L]): String = js.native
    
    def isCurrentNode(node: SankeyNodeDatum[N, L]): Boolean = js.native
    
    var isInteractive: Boolean = js.native
    
    var nodeHoverOpacity: Double = js.native
    
    var nodeHoverOthersOpacity: Double = js.native
    
    var nodeOpacity: Double = js.native
    
    var nodes: js.Array[SankeyNodeDatum[N, L]] = js.native
    
    var onClick: js.UndefOr[SankeyMouseHandler] = js.native
    
    def setCurrentNode(): Unit = js.native
    def setCurrentNode(node: SankeyNodeDatum[N, L]): Unit = js.native
    
    var tooltip: FunctionComponent[Node[N, L]] = js.native
  }
}
