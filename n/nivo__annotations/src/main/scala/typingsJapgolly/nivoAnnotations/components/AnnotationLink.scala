package typingsJapgolly.nivoAnnotations.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAnnotations.anon.IsOutline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnnotationLink {
  
  inline def apply(points: js.Array[js.Tuple2[Double, Double]]): Builder = {
    val __props = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IsOutline]))
  }
  
  @JSImport("@nivo/annotations/dist/types/AnnotationLink", "AnnotationLink")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def isOutline(value: Boolean): this.type = set("isOutline", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IsOutline): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
