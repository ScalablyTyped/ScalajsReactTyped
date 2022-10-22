package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMapGl.anon.Height
import typingsJapgolly.reactMapGl.anon.MaxPitch
import typingsJapgolly.reactMapGl.mod.MapError
import typingsJapgolly.reactMapGl.mod.MapLoadEvent
import typingsJapgolly.reactMapGl.mod.MapRequest
import typingsJapgolly.reactMapGl.mod.StaticMapProps
import typingsJapgolly.reactMapGl.mod.ViewState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StaticMap {
  
  inline def apply(height: Double | String, width: Double | String): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StaticMapProps]))
  }
  
  @JSImport("react-map-gl", "StaticMap")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.StaticMap] {
    
    inline def altitude(value: Double): this.type = set("altitude", value.asInstanceOf[js.Any])
    
    inline def attributionControl(value: Boolean): this.type = set("attributionControl", value.asInstanceOf[js.Any])
    
    inline def bearing(value: Double): this.type = set("bearing", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def container(value: js.Object): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def disableTokenWarning(value: Boolean): this.type = set("disableTokenWarning", value.asInstanceOf[js.Any])
    
    inline def gl(value: js.Object): this.type = set("gl", value.asInstanceOf[js.Any])
    
    inline def latitude(value: Double): this.type = set("latitude", value.asInstanceOf[js.Any])
    
    inline def longitude(value: Double): this.type = set("longitude", value.asInstanceOf[js.Any])
    
    inline def mapOptions(value: js.Object): this.type = set("mapOptions", value.asInstanceOf[js.Any])
    
    inline def mapStyle(value: String | js.Object): this.type = set("mapStyle", value.asInstanceOf[js.Any])
    
    inline def mapboxApiAccessToken(value: String): this.type = set("mapboxApiAccessToken", value.asInstanceOf[js.Any])
    
    inline def mapboxApiUrl(value: String): this.type = set("mapboxApiUrl", value.asInstanceOf[js.Any])
    
    inline def onError(value: /* e */ MapError => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* e */ MapError) => value(t0).runNow()))
    
    inline def onLoad(value: /* event */ MapLoadEvent => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* event */ MapLoadEvent) => value(t0).runNow()))
    
    inline def onResize(value: /* dimensions */ Height => Callback): this.type = set("onResize", js.Any.fromFunction1((t0: /* dimensions */ Height) => value(t0).runNow()))
    
    inline def pitch(value: Double): this.type = set("pitch", value.asInstanceOf[js.Any])
    
    inline def preserveDrawingBuffer(value: Boolean): this.type = set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def preventStyleDiffing(value: Boolean): this.type = set("preventStyleDiffing", value.asInstanceOf[js.Any])
    
    inline def reuseMap(value: Boolean): this.type = set("reuseMap", value.asInstanceOf[js.Any])
    
    inline def reuseMaps(value: Boolean): this.type = set("reuseMaps", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def transformRequest(value: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest): this.type = set("transformRequest", js.Any.fromFunction2(value))
    
    inline def viewState(value: ViewState): this.type = set("viewState", value.asInstanceOf[js.Any])
    
    inline def visibilityConstraints(value: MaxPitch): this.type = set("visibilityConstraints", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StaticMapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
