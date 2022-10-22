package typingsJapgolly.reactFinalFormListeners.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactFinalFormListeners.mod.OnChangeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnChange {
  
  inline def apply(children: (Any, Any) => Callback, name: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2((t0: Any, t1: Any) => (children(t0, t1)).runNow()), name = name.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[OnChangeProps]))
  }
  
  @JSImport("react-final-form-listeners", "OnChange")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OnChangeProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
