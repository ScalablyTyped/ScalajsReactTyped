package typingsJapgolly.reactDragtastic.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDragtastic.mod.DragStateProps
import typingsJapgolly.reactDragtastic.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragState {
  
  inline def apply(children: State => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[DragStateProps]))
  }
  
  @JSImport("react-dragtastic", "DragState")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDragtastic.mod.DragState] {
    
    inline def subscribeTo(value: js.Array[String]): this.type = set("subscribeTo", value.asInstanceOf[js.Any])
    
    inline def subscribeToNull: this.type = set("subscribeTo", null)
    
    inline def subscribeToVarargs(value: String*): this.type = set("subscribeTo", js.Array(value*))
  }
  
  def withProps(p: DragStateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
