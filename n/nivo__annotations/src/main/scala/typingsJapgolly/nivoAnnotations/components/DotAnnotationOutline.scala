package typingsJapgolly.nivoAnnotations.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DotAnnotationOutline {
  
  inline def apply(x: Double, y: Double): Builder = {
    val __props = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[X]))
  }
  
  @JSImport("@nivo/annotations/dist/types/DotAnnotationOutline", "DotAnnotationOutline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: X): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
