package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMapGl.mod.NavigationControlProps
import typingsJapgolly.reactMapGl.mod.ViewStateChangeInfo
import typingsJapgolly.reactMapGl.mod.ViewportProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationControl {
  
  @JSImport("react-map-gl", "NavigationControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.NavigationControl] {
    
    inline def captureClick(value: Boolean): this.type = set("captureClick", value.asInstanceOf[js.Any])
    
    inline def captureDoubleClick(value: Boolean): this.type = set("captureDoubleClick", value.asInstanceOf[js.Any])
    
    inline def captureDrag(value: Boolean): this.type = set("captureDrag", value.asInstanceOf[js.Any])
    
    inline def captureScroll(value: Boolean): this.type = set("captureScroll", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def compassLabel(value: String): this.type = set("compassLabel", value.asInstanceOf[js.Any])
    
    inline def onViewStateChange(value: /* info */ ViewStateChangeInfo => Callback): this.type = set("onViewStateChange", js.Any.fromFunction1((t0: /* info */ ViewStateChangeInfo) => value(t0).runNow()))
    
    inline def onViewportChange(value: /* viewState */ ViewportProps => Callback): this.type = set("onViewportChange", js.Any.fromFunction1((t0: /* viewState */ ViewportProps) => value(t0).runNow()))
    
    inline def showCompass(value: Boolean): this.type = set("showCompass", value.asInstanceOf[js.Any])
    
    inline def showZoom(value: Boolean): this.type = set("showZoom", value.asInstanceOf[js.Any])
    
    inline def zoomInLabel(value: String): this.type = set("zoomInLabel", value.asInstanceOf[js.Any])
    
    inline def zoomOutLabel(value: String): this.type = set("zoomOutLabel", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NavigationControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NavigationControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
