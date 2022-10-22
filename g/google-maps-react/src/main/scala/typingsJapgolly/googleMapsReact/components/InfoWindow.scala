package typingsJapgolly.googleMapsReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.googleMapsReact.mod.IInfoWindowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InfoWindow {
  
  inline def apply(
    google: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google */ Any,
    map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any,
    marker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
  ): Builder = {
    val __props = js.Dynamic.literal(google = google.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IInfoWindowProps]))
  }
  
  @JSImport("google-maps-react", "InfoWindow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.googleMapsReact.mod.InfoWindow] {
    
    inline def mapCenter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLng */ Any
    ): this.type = set("mapCenter", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IInfoWindowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
