package typingsJapgolly.reactLeaflet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.leaflet.mod.Evented
import typingsJapgolly.reactLeaflet.mod.MapComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object MapComponent {
  
  def apply[P /* <: MapComponentProps */, E /* <: Evented */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "MapComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: MapComponentProps */, E /* <: Evented */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeaflet.mod.MapComponent[P, E]]
  
  implicit def make[P /* <: MapComponentProps */, E /* <: Evented */](companion: MapComponent.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
