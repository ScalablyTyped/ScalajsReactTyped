package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.Height
import typingsJapgolly.gestalt.mod.CollageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collage {
  
  inline def apply(columns: Double, height: Double, renderImage: Height => Node, width: Double): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], renderImage = js.Any.fromFunction1(renderImage), width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CollageProps]))
  }
  
  @JSImport("gestalt", "Collage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def cover(value: Boolean): this.type = set("cover", value.asInstanceOf[js.Any])
    
    inline def gutter(value: Double): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    inline def layoutKey(value: Double): this.type = set("layoutKey", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CollageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
