package typingsJapgolly.reactDraggable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDraggable.anon.PartialDraggableCoreProps
import typingsJapgolly.reactDraggable.mod.DraggableData
import typingsJapgolly.reactDraggable.mod.DraggableEvent
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DraggableCore {
  
  @JSImport("react-draggable", "DraggableCore")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDraggable.mod.DraggableCore] {
    
    inline def allowAnyClick(value: Boolean): this.type = set("allowAnyClick", value.asInstanceOf[js.Any])
    
    inline def cancel(value: String): this.type = set("cancel", value.asInstanceOf[js.Any])
    
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
    
    inline def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DraggableCore.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialDraggableCoreProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
