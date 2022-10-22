package typingsJapgolly.reactKeyboardEventHandler.components

import typingsJapgolly.reactKeyboardEventHandler.mod.KeyboardEventHandlerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactKeyboardEventHandler {
  
  @JSImport("react-keyboard-event-handler", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactKeyboardEventHandler.type): SharedBuilder_KeyboardEventHandlerProps523878931 = new SharedBuilder_KeyboardEventHandlerProps523878931(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: KeyboardEventHandlerProps): SharedBuilder_KeyboardEventHandlerProps523878931 = new SharedBuilder_KeyboardEventHandlerProps523878931(js.Array(this.component, p.asInstanceOf[js.Any]))
}
