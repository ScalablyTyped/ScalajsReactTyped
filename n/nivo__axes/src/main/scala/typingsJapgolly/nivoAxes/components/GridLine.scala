package typingsJapgolly.nivoAxes.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoAxes.anon.AnimatedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridLine {
  
  inline def apply(
    animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  opacity :number,   x1 :number,   x2 :number,   y1 :number,   y2 :number}> */ Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasAnimatedProps */ AnimatedProps]))
  }
  
  @JSImport("@nivo/axes", "GridLine")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasAnimatedProps */ AnimatedProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
