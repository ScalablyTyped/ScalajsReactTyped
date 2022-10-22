package typingsJapgolly.reactAnimatedModal.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactAnimatedModal.mod.ModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAnimatedModal {
  
  inline def apply(closemodal: Callback, visible: Boolean): SharedBuilder_ModalProps_476443866 = {
    val __props = js.Dynamic.literal(closemodal = closemodal.toJsFn, visible = visible.asInstanceOf[js.Any])
    new SharedBuilder_ModalProps_476443866(js.Array(this.component, __props.asInstanceOf[ModalProps]))
  }
  
  @JSImport("react-animated-modal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ModalProps): SharedBuilder_ModalProps_476443866 = new SharedBuilder_ModalProps_476443866(js.Array(this.component, p.asInstanceOf[js.Any]))
}
