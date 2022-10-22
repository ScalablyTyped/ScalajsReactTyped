package typingsJapgolly.reactDraggable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDraggable.anon.PartialDraggableProps
import typingsJapgolly.reactDraggable.mod.ControlPosition
import typingsJapgolly.reactDraggable.mod.DraggableBounds
import typingsJapgolly.reactDraggable.mod.DraggableData
import typingsJapgolly.reactDraggable.mod.DraggableEvent
import typingsJapgolly.reactDraggable.mod.PositionOffsetControlPosition
import typingsJapgolly.reactDraggable.mod.default
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import typingsJapgolly.reactDraggable.reactDraggableStrings.both
import typingsJapgolly.reactDraggable.reactDraggableStrings.none
import typingsJapgolly.reactDraggable.reactDraggableStrings.x
import typingsJapgolly.reactDraggable.reactDraggableStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDraggable {
  
  @JSImport("react-draggable", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def allowAnyClick(value: Boolean): this.type = set("allowAnyClick", value.asInstanceOf[js.Any])
    
    inline def axis(value: both | x | y | none): this.type = set("axis", value.asInstanceOf[js.Any])
    
    inline def bounds(value: DraggableBounds | String | `false`): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def cancel(value: String): this.type = set("cancel", value.asInstanceOf[js.Any])
    
    inline def defaultClassName(value: String): this.type = set("defaultClassName", value.asInstanceOf[js.Any])
    
    inline def defaultClassNameDragged(value: String): this.type = set("defaultClassNameDragged", value.asInstanceOf[js.Any])
    
    inline def defaultClassNameDragging(value: String): this.type = set("defaultClassNameDragging", value.asInstanceOf[js.Any])
    
    inline def defaultPosition(value: ControlPosition): this.type = set("defaultPosition", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def enableUserSelectHack(value: Boolean): this.type = set("enableUserSelectHack", value.asInstanceOf[js.Any])
    
    inline def grid(value: js.Tuple2[Double, Double]): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def handle(value: String): this.type = set("handle", value.asInstanceOf[js.Any])
    
    inline def nodeRef(value: RefHandle[HTMLElement]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
    
    inline def offsetParent(value: HTMLElement): this.type = set("offsetParent", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onDrag", js.Any.fromFunction2(value))
    
    inline def onMouseDown(value: /* e */ MouseEvent => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: /* e */ MouseEvent) => value(t0).runNow()))
    
    inline def onStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onStart", js.Any.fromFunction2(value))
    
    inline def onStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onStop", js.Any.fromFunction2(value))
    
    inline def position(value: ControlPosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def positionOffset(value: PositionOffsetControlPosition): this.type = set("positionOffset", value.asInstanceOf[js.Any])
    
    inline def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactDraggable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialDraggableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
