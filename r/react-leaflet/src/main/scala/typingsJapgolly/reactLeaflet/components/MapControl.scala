package typingsJapgolly.reactLeaflet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.leaflet.mod.Control_
import typingsJapgolly.reactLeaflet.mod.MapControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object MapControl {
  
  def apply[P /* <: MapControlProps */, E /* <: Control_ */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "MapControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: MapControlProps */, E /* <: Control_ */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeaflet.mod.MapControl[P, E]]
  
  implicit def make[P /* <: MapControlProps */, E /* <: Control_ */](companion: MapControl.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
