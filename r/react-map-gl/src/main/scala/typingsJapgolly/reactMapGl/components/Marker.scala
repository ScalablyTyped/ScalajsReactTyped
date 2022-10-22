package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMapGl.mod.DragEvent
import typingsJapgolly.reactMapGl.mod.MarkerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Marker {
  
  inline def apply(latitude: Double, longitude: Double): Builder = {
    val __props = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MarkerProps]))
  }
  
  @JSImport("react-map-gl", "Marker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.Marker] {
    
    inline def captureClick(value: Boolean): this.type = set("captureClick", value.asInstanceOf[js.Any])
    
    inline def captureDoubleClick(value: Boolean): this.type = set("captureDoubleClick", value.asInstanceOf[js.Any])
    
    inline def captureDrag(value: Boolean): this.type = set("captureDrag", value.asInstanceOf[js.Any])
    
    inline def captureScroll(value: Boolean): this.type = set("captureScroll", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def offsetLeft(value: Double): this.type = set("offsetLeft", value.asInstanceOf[js.Any])
    
    inline def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: /* event */ DragEvent => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onDragEnd(value: /* event */ DragEvent => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onDragStart(value: /* event */ DragEvent => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
  }
  
  def withProps(p: MarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
