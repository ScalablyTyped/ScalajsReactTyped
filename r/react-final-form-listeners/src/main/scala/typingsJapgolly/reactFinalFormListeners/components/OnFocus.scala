package typingsJapgolly.reactFinalFormListeners.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactFinalFormListeners.mod.OnFocusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnFocus {
  
  inline def apply(children: Callback, name: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.toJsFn, name = name.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[OnFocusProps]))
  }
  
  @JSImport("react-final-form-listeners", "OnFocus")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OnFocusProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
