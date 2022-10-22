package typingsJapgolly.reactDragtastic.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDragtastic.anon.StateisActivebooleanevent
import typingsJapgolly.reactDragtastic.mod.DraggableProps
import typingsJapgolly.reactDragtastic.mod.Id
import typingsJapgolly.reactDragtastic.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draggable {
  
  inline def apply(children: StateisActivebooleanevent => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[DraggableProps]))
  }
  
  @JSImport("react-dragtastic", "Draggable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDragtastic.mod.Draggable] {
    
    inline def data(value: Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def id(value: Id): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: Callback): this.type = set("onDrag", value.toJsFn)
    
    inline def onDragEnd(value: /* data */ Any => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* data */ Any) => value(t0).runNow()))
    
    inline def onDragStart(value: /* data */ Any => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: /* data */ Any) => value(t0).runNow()))
    
    inline def subscribeTo(value: js.Array[String]): this.type = set("subscribeTo", value.asInstanceOf[js.Any])
    
    inline def subscribeToNull: this.type = set("subscribeTo", null)
    
    inline def subscribeToVarargs(value: String*): this.type = set("subscribeTo", js.Array(value*))
    
    inline def `type`(value: Type): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DraggableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
