package typingsJapgolly.nivoAnnotations.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.anon.BorderRadius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RectAnnotationOutline {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BorderRadius]))
  }
  
  @JSImport("@nivo/annotations/dist/types/RectAnnotationOutline", "RectAnnotationOutline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BorderRadius): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
