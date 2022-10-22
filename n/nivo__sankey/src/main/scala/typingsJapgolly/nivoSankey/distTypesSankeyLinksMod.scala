package typingsJapgolly.nivoSankey

import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoSankey.anon.Link
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyMouseHandler
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyNodeDatum
import typingsJapgolly.nivoSankey.nivoSankeyStrings.horizontal
import typingsJapgolly.nivoSankey.nivoSankeyStrings.vertical
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSankeyLinksMod {
  
  @JSImport("@nivo/sankey/dist/types/SankeyLinks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SankeyLinks[N /* <: DefaultNode */, L /* <: DefaultLink */](
    hasLinksLayoutLinkOpacityLinkHoverOpacityLinkHoverOthersOpacityLinkContractLinkBlendModeEnableLinkGradientSetCurrentLinkCurrentLinkCurrentNodeIsCurrentLinkIsInteractiveOnClickTooltip: SankeyLinksProps[N, L]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SankeyLinks")(hasLinksLayoutLinkOpacityLinkHoverOpacityLinkHoverOthersOpacityLinkContractLinkBlendModeEnableLinkGradientSetCurrentLinkCurrentLinkCurrentNodeIsCurrentLinkIsInteractiveOnClickTooltip.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait SankeyLinksProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var currentLink: (SankeyLinkDatum[N, L]) | Null = js.native
    
    var currentNode: (SankeyNodeDatum[N, L]) | Null = js.native
    
    var enableLinkGradient: Boolean = js.native
    
    def isCurrentLink(link: SankeyLinkDatum[N, L]): Boolean = js.native
    
    var isInteractive: Boolean = js.native
    
    var layout: horizontal | vertical = js.native
    
    var linkBlendMode: CssMixBlendMode = js.native
    
    var linkContract: Double = js.native
    
    var linkHoverOpacity: Double = js.native
    
    var linkHoverOthersOpacity: Double = js.native
    
    var linkOpacity: Double = js.native
    
    var links: js.Array[SankeyLinkDatum[N, L]] = js.native
    
    var onClick: js.UndefOr[SankeyMouseHandler] = js.native
    
    def setCurrentLink(): Unit = js.native
    def setCurrentLink(link: SankeyLinkDatum[N, L]): Unit = js.native
    
    var tooltip: FunctionComponent[Link[N, L]] = js.native
  }
}
