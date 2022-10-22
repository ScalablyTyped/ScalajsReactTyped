package typingsJapgolly.reactNativeReanimated.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IMMEDIATE_CB_INVOCATION {
  
  inline def apply(
    apply: CallbackTo[Any],
    args: String,
    bind: (js.Any, js.Any) => js.Dynamic,
    call: (js.Any, js.Any) => js.Dynamic,
    length: Int
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(apply = apply.toJsFn, args = args.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), call = js.Any.fromFunction2(call), length = length.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[js.Function0[Any]]))
  }
  
  @JSGlobal("IMMEDIATE_CB_INVOCATION")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: js.Function0[Any]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
