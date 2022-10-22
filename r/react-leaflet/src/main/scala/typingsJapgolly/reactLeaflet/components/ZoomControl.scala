package typingsJapgolly.reactLeaflet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.leaflet.mod.Control_.Zoom
import typingsJapgolly.reactLeaflet.mod.ZoomControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object ZoomControl {
  
  def apply[P /* <: ZoomControlProps */, E /* <: Zoom */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "ZoomControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: ZoomControlProps */, E /* <: Zoom */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeaflet.mod.ZoomControl[P, E]]
  
  implicit def make[P /* <: ZoomControlProps */, E /* <: Zoom */](companion: ZoomControl.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
