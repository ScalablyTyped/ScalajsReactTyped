package typingsJapgolly.reactToastify.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactToastify.distTypesMod.ToastPosition
import typingsJapgolly.reactToastify.distTypesMod.ToastTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Zoom {
  
  inline def apply(
    done: Callback,
    isIn: Boolean,
    nodeRef: RefHandle[HTMLElement],
    position: ToastPosition | String,
    preventExitTransition: Boolean
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(done = done.toJsFn, isIn = isIn.asInstanceOf[js.Any], nodeRef = nodeRef.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventExitTransition = preventExitTransition.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ToastTransitionProps]))
  }
  
  @JSImport("react-toastify", "Zoom")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ToastTransitionProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
