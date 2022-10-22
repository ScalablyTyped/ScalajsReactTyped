package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libModalDialogMod.ModalDialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dialog {
  
  @JSImport("react-bootstrap/lib/Modal", "Dialog")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Dialog.type): SharedBuilder_ModalDialogProps1043144873[typingsJapgolly.reactBootstrap.libModalMod.Dialog] = new SharedBuilder_ModalDialogProps1043144873[typingsJapgolly.reactBootstrap.libModalMod.Dialog](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalDialogProps): SharedBuilder_ModalDialogProps1043144873[typingsJapgolly.reactBootstrap.libModalMod.Dialog] = new SharedBuilder_ModalDialogProps1043144873[typingsJapgolly.reactBootstrap.libModalMod.Dialog](js.Array(this.component, p.asInstanceOf[js.Any]))
}
