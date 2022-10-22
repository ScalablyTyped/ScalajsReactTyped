package typingsJapgolly.googleMapsReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.googleMapsReact.mod.IMarkerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Marker {
  
  @JSImport("google-maps-react", "Marker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.googleMapsReact.mod.Marker] {
    
    inline def mapCenter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLng */ Any
    ): this.type = set("mapCenter", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onClick", js.Any.fromFunction3(value))
    
    inline def onMouseover(
      value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onMouseover", js.Any.fromFunction3(value))
  }
  
  implicit def make(companion: Marker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
