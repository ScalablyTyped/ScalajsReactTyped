package typingsJapgolly.googleMapsReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.googleMapsReact.mod.GoogleAPI
import typingsJapgolly.googleMapsReact.mod.IMapProps
import typingsJapgolly.googleMapsReact.mod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Map {
  
  inline def apply(google: GoogleAPI): Builder = {
    val __props = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IMapProps]))
  }
  
  @JSImport("google-maps-react", "Map")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.googleMapsReact.mod.Map] {
    
    inline def bounds(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngBounds */ Any
    ): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def center(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngLiteral */ Any
    ): this.type = set("center", value.asInstanceOf[js.Any])
    
    inline def centerAroundCurrentLocation(value: Boolean): this.type = set("centerAroundCurrentLocation", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: Style): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def initialCenter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngLiteral */ Any
    ): this.type = set("initialCenter", value.asInstanceOf[js.Any])
    
    inline def loaded(value: Boolean): this.type = set("loaded", value.asInstanceOf[js.Any])
    
    inline def onBoundsChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onBoundsChanged", js.Any.fromFunction3(value))
    
    inline def onCenterChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onCenterChanged", js.Any.fromFunction3(value))
    
    inline def onClick(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onClick", js.Any.fromFunction3(value))
    
    inline def onDblclick(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onDblclick", js.Any.fromFunction3(value))
    
    inline def onDragend(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onDragend", js.Any.fromFunction3(value))
    
    inline def onDragstart(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onDragstart", js.Any.fromFunction3(value))
    
    inline def onHeadingChange(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onHeadingChange", js.Any.fromFunction3(value))
    
    inline def onIdle(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onIdle", js.Any.fromFunction3(value))
    
    inline def onMaptypeidChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onMaptypeidChanged", js.Any.fromFunction3(value))
    
    inline def onMousemove(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onMousemove", js.Any.fromFunction3(value))
    
    inline def onMouseout(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onMouseout", js.Any.fromFunction3(value))
    
    inline def onMouseover(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onMouseover", js.Any.fromFunction3(value))
    
    inline def onProjectionChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onProjectionChanged", js.Any.fromFunction3(value))
    
    inline def onReady(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onReady", js.Any.fromFunction3(value))
    
    inline def onRecenter(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onRecenter", js.Any.fromFunction3(value))
    
    inline def onResize(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onResize", js.Any.fromFunction3(value))
    
    inline def onRightclick(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onRightclick", js.Any.fromFunction3(value))
    
    inline def onTilesloaded(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onTilesloaded", js.Any.fromFunction3(value))
    
    inline def onTiltChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onTiltChanged", js.Any.fromFunction3(value))
    
    inline def onZoomChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any
        ], /* event */ Any) => Any
    ): this.type = set("onZoomChanged", js.Any.fromFunction3(value))
    
    inline def style(value: Style): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IMapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
