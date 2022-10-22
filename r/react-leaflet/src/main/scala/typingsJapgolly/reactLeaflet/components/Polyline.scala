package typingsJapgolly.reactLeaflet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.leaflet.mod.Polyline_
import typingsJapgolly.reactLeaflet.mod.PolylineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Polyline {
  
  def apply[P /* <: PolylineProps */, E /* <: Polyline_[LineString | MultiLineString, Any] */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "Polyline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: PolylineProps */, E /* <: Polyline_[LineString | MultiLineString, Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeaflet.mod.Polyline[P, E]]
  
  implicit def make[P /* <: PolylineProps */, E /* <: Polyline_[LineString | MultiLineString, Any] */](companion: Polyline.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
