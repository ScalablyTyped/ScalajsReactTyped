package typingsJapgolly.reactAvatarEditor.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.File
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAvatarEditor.mod.AvatarEditorProps
import typingsJapgolly.reactAvatarEditor.mod.ImageState
import typingsJapgolly.reactAvatarEditor.mod.Position
import typingsJapgolly.reactAvatarEditor.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAvatarEditor {
  
  inline def apply(image: String | File): Builder = {
    val __props = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarEditorProps]))
  }
  
  @JSImport("react-avatar-editor", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def border(value: Double | js.Array[Double]): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    
    inline def borderVarargs(value: Double*): this.type = set("border", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: js.Array[Double]): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorVarargs(value: Double*): this.type = set("color", js.Array(value*))
    
    inline def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def disableBoundaryChecks(value: Boolean): this.type = set("disableBoundaryChecks", value.asInstanceOf[js.Any])
    
    inline def disableCanvasRotation(value: Boolean): this.type = set("disableCanvasRotation", value.asInstanceOf[js.Any])
    
    inline def disableHiDPIScaling(value: Boolean): this.type = set("disableHiDPIScaling", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def onImageChange(value: Callback): this.type = set("onImageChange", value.toJsFn)
    
    inline def onImageReady(value: /* event */ Event => Callback): this.type = set("onImageReady", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def onLoadFailure(value: /* event */ Event => Callback): this.type = set("onLoadFailure", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def onLoadSuccess(value: /* imgInfo */ ImageState => Callback): this.type = set("onLoadSuccess", js.Any.fromFunction1((t0: /* imgInfo */ ImageState) => value(t0).runNow()))
    
    inline def onMouseMove(value: /* event */ Event => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def onMouseUp(value: Callback): this.type = set("onMouseUp", value.toJsFn)
    
    inline def onPositionChange(value: /* position */ Position => Callback): this.type = set("onPositionChange", js.Any.fromFunction1((t0: /* position */ Position) => value(t0).runNow()))
    
    inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
