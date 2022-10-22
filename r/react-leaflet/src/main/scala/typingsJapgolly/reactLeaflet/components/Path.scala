package typingsJapgolly.reactLeaflet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLeaflet.mod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Path {
  
  def apply[P /* <: PathProps */, E /* <: typingsJapgolly.leaflet.mod.Path */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "Path")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: PathProps */, E /* <: typingsJapgolly.leaflet.mod.Path */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeaflet.mod.Path[P, E]]
  
  implicit def make[P /* <: PathProps */, E /* <: typingsJapgolly.leaflet.mod.Path */](companion: Path.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
