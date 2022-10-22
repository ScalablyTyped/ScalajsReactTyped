package typingsJapgolly.reactDragtastic.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDragtastic.anon.StateisOverbooleanwillAcc
import typingsJapgolly.reactDragtastic.mod.Accepts
import typingsJapgolly.reactDragtastic.mod.DroppableProps
import typingsJapgolly.reactDragtastic.mod.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Droppable {
  
  inline def apply(children: StateisOverbooleanwillAcc => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[DroppableProps]))
  }
  
  @JSImport("react-dragtastic", "Droppable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDragtastic.mod.Droppable] {
    
    inline def accepts(value: Accepts): this.type = set("accepts", value.asInstanceOf[js.Any])
    
    inline def acceptsVarargs(value: String*): this.type = set("accepts", js.Array(value*))
    
    inline def id(value: Id): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onDragEnter(value: Callback): this.type = set("onDragEnter", value.toJsFn)
    
    inline def onDragLeave(value: Callback): this.type = set("onDragLeave", value.toJsFn)
    
    inline def onDrop(value: /* data */ Any => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: /* data */ Any) => value(t0).runNow()))
    
    inline def subscribeTo(value: js.Array[String]): this.type = set("subscribeTo", value.asInstanceOf[js.Any])
    
    inline def subscribeToNull: this.type = set("subscribeTo", null)
    
    inline def subscribeToVarargs(value: String*): this.type = set("subscribeTo", js.Array(value*))
  }
  
  def withProps(p: DroppableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
