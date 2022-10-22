package typingsJapgolly.reactFinalFormListeners.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactFinalFormListeners.mod.ExternallyChangedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExternallyChanged {
  
  inline def apply(children: Boolean => Node, name: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ExternallyChangedProps]))
  }
  
  @JSImport("react-final-form-listeners", "ExternallyChanged")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ExternallyChangedProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
