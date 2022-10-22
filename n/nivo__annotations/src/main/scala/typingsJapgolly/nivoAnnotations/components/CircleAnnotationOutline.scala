package typingsJapgolly.nivoAnnotations.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoAnnotations.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircleAnnotationOutline {
  
  inline def apply(size: Double, x: Double, y: Double): Default[js.Object] = {
    val __props = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Size]))
  }
  
  @JSImport("@nivo/annotations/dist/types/CircleAnnotationOutline", "CircleAnnotationOutline")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Size): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
