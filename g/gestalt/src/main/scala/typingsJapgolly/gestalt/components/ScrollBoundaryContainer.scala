package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.auto
import typingsJapgolly.gestalt.gestaltStrings.scroll
import typingsJapgolly.gestalt.gestaltStrings.scrollX
import typingsJapgolly.gestalt.gestaltStrings.scrollY
import typingsJapgolly.gestalt.mod.ScrollBoundaryContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollBoundaryContainer {
  
  @JSImport("gestalt", "ScrollBoundaryContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def overflow(value: scroll | scrollX | scrollY | auto): this.type = set("overflow", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScrollBoundaryContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollBoundaryContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
