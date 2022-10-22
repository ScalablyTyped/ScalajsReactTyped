package typingsJapgolly.reactLeaflet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.leaflet.mod.GeoJSON__
import typingsJapgolly.reactLeaflet.mod.GeoJSONProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object GeoJSON {
  
  def apply[P /* <: GeoJSONProps */, E /* <: GeoJSON__[Any] */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "GeoJSON")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: GeoJSONProps */, E /* <: GeoJSON__[Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeaflet.mod.GeoJSON[P, E]]
  
  implicit def make[P /* <: GeoJSONProps */, E /* <: GeoJSON__[Any] */](companion: GeoJSON.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
