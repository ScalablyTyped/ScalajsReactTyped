package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.mapboxGl.mod.FitBoundsOptions
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMapGl.mod.GeolocateControlProps
import typingsJapgolly.reactMapGl.mod.PositionOptions
import typingsJapgolly.reactMapGl.mod.ViewStateChangeInfo
import typingsJapgolly.reactMapGl.mod.ViewportProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeolocateControl {
  
  @JSImport("react-map-gl", "GeolocateControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.GeolocateControl] {
    
    inline def auto(value: Boolean): this.type = set("auto", value.asInstanceOf[js.Any])
    
    inline def captureClick(value: Boolean): this.type = set("captureClick", value.asInstanceOf[js.Any])
    
    inline def captureDoubleClick(value: Boolean): this.type = set("captureDoubleClick", value.asInstanceOf[js.Any])
    
    inline def captureDrag(value: Boolean): this.type = set("captureDrag", value.asInstanceOf[js.Any])
    
    inline def captureScroll(value: Boolean): this.type = set("captureScroll", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def fitBoundsOptions(value: FitBoundsOptions): this.type = set("fitBoundsOptions", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def onGeolocate(value: /* options */ PositionOptions => Callback): this.type = set("onGeolocate", js.Any.fromFunction1((t0: /* options */ PositionOptions) => value(t0).runNow()))
    
    inline def onViewStateChange(value: /* info */ ViewStateChangeInfo => Callback): this.type = set("onViewStateChange", js.Any.fromFunction1((t0: /* info */ ViewStateChangeInfo) => value(t0).runNow()))
    
    inline def onViewportChange(value: /* viewState */ ViewportProps => Callback): this.type = set("onViewportChange", js.Any.fromFunction1((t0: /* viewState */ ViewportProps) => value(t0).runNow()))
    
    inline def positionOptions(value: typingsJapgolly.mapboxGl.mod.PositionOptions): this.type = set("positionOptions", value.asInstanceOf[js.Any])
    
    inline def showUserLocation(value: Boolean): this.type = set("showUserLocation", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def trackUserLocation(value: Boolean): this.type = set("trackUserLocation", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GeolocateControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GeolocateControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
