package typingsJapgolly.nivoSankey.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoSankey.anon.Link
import typingsJapgolly.nivoSankey.distTypesSankeyLinksMod.SankeyLinksProps
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyLinkDatum
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyNodeDatum
import typingsJapgolly.nivoSankey.nivoSankeyStrings.horizontal
import typingsJapgolly.nivoSankey.nivoSankeyStrings.vertical
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SankeyLinks {
  
  inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
    enableLinkGradient: Boolean,
    isCurrentLink: SankeyLinkDatum[N, L] => Boolean,
    isInteractive: Boolean,
    layout: horizontal | vertical,
    linkBlendMode: CssMixBlendMode,
    linkContract: Double,
    linkHoverOpacity: Double,
    linkHoverOthersOpacity: Double,
    linkOpacity: Double,
    links: js.Array[SankeyLinkDatum[N, L]],
    setCurrentLink: js.UndefOr[SankeyLinkDatum[N, L]] => Callback,
    tooltip: FunctionComponent[Link[N, L]]
  ): Builder[N, L] = {
    val __props = js.Dynamic.literal(enableLinkGradient = enableLinkGradient.asInstanceOf[js.Any], isCurrentLink = js.Any.fromFunction1(isCurrentLink), isInteractive = isInteractive.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], linkBlendMode = linkBlendMode.asInstanceOf[js.Any], linkContract = linkContract.asInstanceOf[js.Any], linkHoverOpacity = linkHoverOpacity.asInstanceOf[js.Any], linkHoverOthersOpacity = linkHoverOthersOpacity.asInstanceOf[js.Any], linkOpacity = linkOpacity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], setCurrentLink = js.Any.fromFunction1((t0: js.UndefOr[SankeyLinkDatum[N, L]]) => setCurrentLink(t0).runNow()), tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[SankeyLinksProps[N, L]]))
  }
  
  @JSImport("@nivo/sankey/dist/types/SankeyLinks", "SankeyLinks")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[N /* <: DefaultNode */, L /* <: DefaultLink */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def currentLink(value: SankeyLinkDatum[N, L]): this.type = set("currentLink", value.asInstanceOf[js.Any])
    
    inline def currentLinkNull: this.type = set("currentLink", null)
    
    inline def currentNode(value: SankeyNodeDatum[N, L]): this.type = set("currentNode", value.asInstanceOf[js.Any])
    
    inline def currentNodeNull: this.type = set("currentNode", null)
    
    inline def onClick(
      value: (/* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), /* event */ ReactMouseEventFrom[Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[N /* <: DefaultNode */, L /* <: DefaultLink */](p: SankeyLinksProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
