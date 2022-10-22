package typingsJapgolly.reactFps.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFps.buildFpsViewMod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FpsView {
  
  @JSImport("react-fps/build", "FpsView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def bottom(value: Double | String): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def left(value: Double | String): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def right(value: Double | String): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def top(value: Double | String): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FpsView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
