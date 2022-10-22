package typingsJapgolly.reactImageMagnifiers.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactImageMagnifiers.mod.MagnifierContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MagnifierContainer {
  
  @JSImport("react-image-magnifiers", "MagnifierContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoInPlace(value: Boolean): this.type = set("autoInPlace", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def inPlaceMinBreakpoint(value: Double): this.type = set("inPlaceMinBreakpoint", value.asInstanceOf[js.Any])
    
    inline def style(value: String): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MagnifierContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MagnifierContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
