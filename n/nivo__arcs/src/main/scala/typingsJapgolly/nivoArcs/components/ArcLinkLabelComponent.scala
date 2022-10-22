package typingsJapgolly.nivoArcs.components

import typingsJapgolly.nivoArcs.anon.LinkColor
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArcLinkLabelComponent {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](datum: Datum, label: String, style: LinkColor): SharedBuilder_ArcLinkLabelProps1230683044[Datum] = {
    val __props = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    new SharedBuilder_ArcLinkLabelProps1230683044[Datum](js.Array(this.component, __props.asInstanceOf[ArcLinkLabelProps[Datum]]))
  }
  
  @JSImport("@nivo/arcs", "ArcLinkLabelComponent")
  @js.native
  val component: js.Object = js.native
  
  def withProps[Datum /* <: DatumWithArcAndColor */](p: ArcLinkLabelProps[Datum]): SharedBuilder_ArcLinkLabelProps1230683044[Datum] = new SharedBuilder_ArcLinkLabelProps1230683044[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
