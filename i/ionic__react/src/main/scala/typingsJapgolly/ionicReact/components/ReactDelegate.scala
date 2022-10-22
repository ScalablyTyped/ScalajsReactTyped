package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDelegate {
  
  inline def apply(
    apply: /* view */ Element => Callback,
    args: String,
    bind: (js.Any, js.Any) => js.Dynamic,
    call: (js.Any, js.Any) => js.Dynamic,
    length: Int
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: /* view */ Element) => apply(t0).runNow()), args = args.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), call = js.Any.fromFunction2(call), length = length.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[js.Function1[/* view */ Element, Unit]]))
  }
  
  @JSImport("@ionic/react/dist/types/framework-delegate", "ReactDelegate")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: js.Function1[/* view */ Element, Unit]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
