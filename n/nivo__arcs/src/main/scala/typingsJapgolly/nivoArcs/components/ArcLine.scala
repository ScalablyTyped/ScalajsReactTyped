package typingsJapgolly.nivoArcs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoArcs.distTypesArcLineMod.ArcLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArcLine {
  
  inline def apply(
    animated: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedProps<{  radius :number,   startAngle :number,   endAngle :number,   opacity :number}> */ Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ArcLineProps]))
  }
  
  @JSImport("@nivo/arcs", "ArcLine")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ArcLineProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
