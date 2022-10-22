package typingsJapgolly.googleMapReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.googleMapReact.anon.Map
import typingsJapgolly.googleMapReact.mod.BootstrapURLKeys
import typingsJapgolly.googleMapReact.mod.ChangeEventValue
import typingsJapgolly.googleMapReact.mod.ClickEventValue
import typingsJapgolly.googleMapReact.mod.Coords
import typingsJapgolly.googleMapReact.mod.Heatmap
import typingsJapgolly.googleMapReact.mod.MapOptions
import typingsJapgolly.googleMapReact.mod.Maps
import typingsJapgolly.googleMapReact.mod.Point
import typingsJapgolly.googleMapReact.mod.Props
import typingsJapgolly.googleMapReact.mod.^
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GoogleMapReact {
  
  @JSImport("google-map-react", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def bootstrapURLKeys(value: BootstrapURLKeys): this.type = set("bootstrapURLKeys", value.asInstanceOf[js.Any])
    
    inline def center(value: Coords): this.type = set("center", value.asInstanceOf[js.Any])
    
    inline def debounced(value: Boolean): this.type = set("debounced", value.asInstanceOf[js.Any])
    
    inline def defaultCenter(value: Coords): this.type = set("defaultCenter", value.asInstanceOf[js.Any])
    
    inline def defaultZoom(value: Double): this.type = set("defaultZoom", value.asInstanceOf[js.Any])
    
    inline def distanceToMouse(value: (/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object]) => Double): this.type = set("distanceToMouse", js.Any.fromFunction3(value))
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def googleMapLoader(value: /* bootstrapURLKeys */ Any => Callback): this.type = set("googleMapLoader", js.Any.fromFunction1((t0: /* bootstrapURLKeys */ Any) => value(t0).runNow()))
    
    inline def heatmap(value: Heatmap): this.type = set("heatmap", value.asInstanceOf[js.Any])
    
    inline def heatmapLibrary(value: Boolean): this.type = set("heatmapLibrary", value.asInstanceOf[js.Any])
    
    inline def hoverDistance(value: Double): this.type = set("hoverDistance", value.asInstanceOf[js.Any])
    
    inline def layerTypes(value: js.Array[String]): this.type = set("layerTypes", value.asInstanceOf[js.Any])
    
    inline def layerTypesVarargs(value: String*): this.type = set("layerTypes", js.Array(value*))
    
    inline def margin(value: js.Array[Any]): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def marginVarargs(value: Any*): this.type = set("margin", js.Array(value*))
    
    inline def onChange(value: /* value */ ChangeEventValue => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onChildClick(value: (/* hoverKey */ Any, /* childProps */ Any) => Callback): this.type = set("onChildClick", js.Any.fromFunction2((t0: /* hoverKey */ Any, t1: /* childProps */ Any) => (value(t0, t1)).runNow()))
    
    inline def onChildMouseDown(value: (/* childKey */ Any, /* childProps */ Any, /* mouse */ Any) => Callback): this.type = set("onChildMouseDown", js.Any.fromFunction3((t0: /* childKey */ Any, t1: /* childProps */ Any, t2: /* mouse */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def onChildMouseEnter(value: (/* hoverKey */ Any, /* childProps */ Any) => Callback): this.type = set("onChildMouseEnter", js.Any.fromFunction2((t0: /* hoverKey */ Any, t1: /* childProps */ Any) => (value(t0, t1)).runNow()))
    
    inline def onChildMouseLeave(value: (/* hoverKey */ Any, /* childProps */ Any) => Callback): this.type = set("onChildMouseLeave", js.Any.fromFunction2((t0: /* hoverKey */ Any, t1: /* childProps */ Any) => (value(t0, t1)).runNow()))
    
    inline def onChildMouseMove(value: (/* childKey */ Any, /* childProps */ Any, /* mouse */ Any) => Callback): this.type = set("onChildMouseMove", js.Any.fromFunction3((t0: /* childKey */ Any, t1: /* childProps */ Any, t2: /* mouse */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def onChildMouseUp(value: (/* childKey */ Any, /* childProps */ Any, /* mouse */ Any) => Callback): this.type = set("onChildMouseUp", js.Any.fromFunction3((t0: /* childKey */ Any, t1: /* childProps */ Any, t2: /* mouse */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def onClick(value: /* value */ ClickEventValue => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onDrag(value: /* map */ Any => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: /* map */ Any) => value(t0).runNow()))
    
    inline def onDragEnd(value: /* map */ Any => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* map */ Any) => value(t0).runNow()))
    
    inline def onGoogleApiLoaded(value: /* maps */ Map => Callback): this.type = set("onGoogleApiLoaded", js.Any.fromFunction1((t0: /* maps */ Map) => value(t0).runNow()))
    
    inline def onMapTypeIdChange(value: /* args */ Any => Callback): this.type = set("onMapTypeIdChange", js.Any.fromFunction1((t0: /* args */ Any) => value(t0).runNow()))
    
    inline def onTilesLoaded(value: Callback): this.type = set("onTilesLoaded", value.toJsFn)
    
    inline def onZoomAnimationEnd(value: /* args */ Any => Callback): this.type = set("onZoomAnimationEnd", js.Any.fromFunction1((t0: /* args */ Any) => value(t0).runNow()))
    
    inline def onZoomAnimationStart(value: /* args */ Any => Callback): this.type = set("onZoomAnimationStart", js.Any.fromFunction1((t0: /* args */ Any) => value(t0).runNow()))
    
    inline def options(value: MapOptions | (js.Function1[/* maps */ Maps, MapOptions])): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsFunction1(value: /* maps */ Maps => MapOptions): this.type = set("options", js.Any.fromFunction1(value))
    
    inline def resetBoundsOnResize(value: Boolean): this.type = set("resetBoundsOnResize", value.asInstanceOf[js.Any])
    
    inline def shouldUnregisterMapOnUnmount(value: Boolean): this.type = set("shouldUnregisterMapOnUnmount", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def yesIWantToUseGoogleMapApiInternals(value: Boolean): this.type = set("yesIWantToUseGoogleMapApiInternals", value.asInstanceOf[js.Any])
    
    inline def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GoogleMapReact.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
