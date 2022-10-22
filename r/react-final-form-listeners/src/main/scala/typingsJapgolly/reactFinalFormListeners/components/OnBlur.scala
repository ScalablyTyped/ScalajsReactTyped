package typingsJapgolly.reactFinalFormListeners.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactFinalFormListeners.mod.OnBlurProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnBlur {
  
  inline def apply(children: Callback, name: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.toJsFn, name = name.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[OnBlurProps]))
  }
  
  @JSImport("react-final-form-listeners", "OnBlur")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OnBlurProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
