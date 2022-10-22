package typingsJapgolly.nivoArcs.components

import typingsJapgolly.nivoArcs.anon.Progress
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArcLabelComponent {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](datum: Datum, label: String, style: Progress): SharedBuilder_ArcLabelProps_210604701[Datum] = {
    val __props = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    new SharedBuilder_ArcLabelProps_210604701[Datum](js.Array(this.component, __props.asInstanceOf[ArcLabelProps[Datum]]))
  }
  
  @JSImport("@nivo/arcs", "ArcLabelComponent")
  @js.native
  val component: js.Object = js.native
  
  def withProps[Datum /* <: DatumWithArcAndColor */](p: ArcLabelProps[Datum]): SharedBuilder_ArcLabelProps_210604701[Datum] = new SharedBuilder_ArcLabelProps_210604701[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
