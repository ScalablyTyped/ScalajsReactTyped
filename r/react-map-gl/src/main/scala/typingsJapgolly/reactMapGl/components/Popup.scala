package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.mapboxGl.mod.Anchor
import typingsJapgolly.reactMapGl.mod.PopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popup {
  
  inline def apply(latitude: Double, longitude: Double): Builder = {
    val __props = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopupProps]))
  }
  
  @JSImport("react-map-gl", "Popup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.Popup] {
    
    inline def altitude(value: Double): this.type = set("altitude", value.asInstanceOf[js.Any])
    
    inline def anchor(value: Anchor): this.type = set("anchor", value.asInstanceOf[js.Any])
    
    inline def captureClick(value: Boolean): this.type = set("captureClick", value.asInstanceOf[js.Any])
    
    inline def captureDoubleClick(value: Boolean): this.type = set("captureDoubleClick", value.asInstanceOf[js.Any])
    
    inline def captureDrag(value: Boolean): this.type = set("captureDrag", value.asInstanceOf[js.Any])
    
    inline def captureScroll(value: Boolean): this.type = set("captureScroll", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeButton(value: Boolean): this.type = set("closeButton", value.asInstanceOf[js.Any])
    
    inline def closeOnClick(value: Boolean): this.type = set("closeOnClick", value.asInstanceOf[js.Any])
    
    inline def dynamicPosition(value: Boolean): this.type = set("dynamicPosition", value.asInstanceOf[js.Any])
    
    inline def offsetLeft(value: Double): this.type = set("offsetLeft", value.asInstanceOf[js.Any])
    
    inline def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def sortByDepth(value: Boolean): this.type = set("sortByDepth", value.asInstanceOf[js.Any])
    
    inline def tipSize(value: Double): this.type = set("tipSize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
