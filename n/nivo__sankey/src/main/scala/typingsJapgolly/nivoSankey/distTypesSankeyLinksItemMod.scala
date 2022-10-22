package typingsJapgolly.nivoSankey

import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoSankey.anon.Link
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyMouseHandler
import typingsJapgolly.nivoSankey.nivoSankeyStrings.horizontal
import typingsJapgolly.nivoSankey.nivoSankeyStrings.vertical
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSankeyLinksItemMod {
  
  @JSImport("@nivo/sankey/dist/types/SankeyLinksItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SankeyLinksItem[N /* <: DefaultNode */, L /* <: DefaultLink */](
    hasLinkLayoutPathColorOpacityBlendModeEnableGradientSetCurrentTooltipIsInteractiveOnClick: SankeyLinksItemProps[N, L]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SankeyLinksItem")(hasLinkLayoutPathColorOpacityBlendModeEnableGradientSetCurrentTooltipIsInteractiveOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait SankeyLinksItemProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    var blendMode: CssMixBlendMode = js.native
    
    var color: String = js.native
    
    var enableGradient: Boolean = js.native
    
    var isInteractive: Boolean = js.native
    
    var layout: horizontal | vertical = js.native
    
    var link: SankeyLinkDatum[N, L] = js.native
    
    var onClick: js.UndefOr[SankeyMouseHandler] = js.native
    
    var opacity: Double = js.native
    
    var path: String = js.native
    
    def setCurrent(): Unit = js.native
    def setCurrent(link: SankeyLinkDatum[N, L]): Unit = js.native
    
    var tooltip: FunctionComponent[Link[N, L]] = js.native
  }
}
