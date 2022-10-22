package typingsJapgolly.reactNodeResolver.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNodeResolver.mod.Props
import typingsJapgolly.reactNodeResolver.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNodeResolver {
  
  inline def apply(innerRef: HTMLElement | Null => Callback): Default[default] = {
    val __props = js.Dynamic.literal(innerRef = js.Any.fromFunction1((t0: HTMLElement | Null) => innerRef(t0).runNow()))
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-node-resolver", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
