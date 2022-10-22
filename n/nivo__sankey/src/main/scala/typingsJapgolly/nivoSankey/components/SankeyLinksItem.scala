package typingsJapgolly.nivoSankey.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoSankey.anon.Link
import typingsJapgolly.nivoSankey.distTypesSankeyLinksItemMod.SankeyLinksItemProps
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

object SankeyLinksItem {
  
  inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
    blendMode: CssMixBlendMode,
    color: String,
    enableGradient: Boolean,
    isInteractive: Boolean,
    layout: horizontal | vertical,
    link: SankeyLinkDatum[N, L],
    opacity: Double,
    path: String,
    setCurrent: js.UndefOr[SankeyLinkDatum[N, L]] => Callback,
    tooltip: FunctionComponent[Link[N, L]]
  ): Builder[N, L] = {
    val __props = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], enableGradient = enableGradient.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setCurrent = js.Any.fromFunction1((t0: js.UndefOr[SankeyLinkDatum[N, L]]) => setCurrent(t0).runNow()), tooltip = tooltip.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[SankeyLinksItemProps[N, L]]))
  }
  
  @JSImport("@nivo/sankey/dist/types/SankeyLinksItem", "SankeyLinksItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[N /* <: DefaultNode */, L /* <: DefaultLink */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onClick(
      value: (/* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), /* event */ ReactMouseEventFrom[Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* data */ (SankeyNodeDatum[DefaultNode, DefaultLink]) | (SankeyLinkDatum[DefaultNode, DefaultLink]), t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  }
  
  def withProps[N /* <: DefaultNode */, L /* <: DefaultLink */](p: SankeyLinksItemProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
