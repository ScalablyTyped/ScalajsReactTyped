package typingsJapgolly.reactDragtastic.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDragtastic.anon.StateisOverAcceptedboolea
import typingsJapgolly.reactDragtastic.mod.DragComponentProps
import typingsJapgolly.reactDragtastic.mod.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragComponent {
  
  inline def apply(children: StateisOverAcceptedboolea => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[DragComponentProps]))
  }
  
  @JSImport("react-dragtastic", "DragComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDragtastic.mod.DragComponent] {
    
    inline def alwaysRender(value: Boolean): this.type = set("alwaysRender", value.asInstanceOf[js.Any])
    
    inline def `for`(value: Id): this.type = set("for", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: Callback): this.type = set("onDrag", value.toJsFn)
    
    inline def subscribeTo(value: js.Array[String]): this.type = set("subscribeTo", value.asInstanceOf[js.Any])
    
    inline def subscribeToNull: this.type = set("subscribeTo", null)
    
    inline def subscribeToVarargs(value: String*): this.type = set("subscribeTo", js.Array(value*))
  }
  
  def withProps(p: DragComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
