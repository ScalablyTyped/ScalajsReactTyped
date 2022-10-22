package typingsJapgolly.nivoChord.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcTooltipComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArcTooltip {
  
  inline def apply(arc: ArcDatum): Default[js.Object] = {
    val __props = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ArcTooltipComponentProps]))
  }
  
  @JSImport("@nivo/chord", "commonDefaultProps.arcTooltip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ArcTooltipComponentProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
