package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.toastTypesMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  @JSImport("baseui/toast", "Toast")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Toast.type): SharedBuilder_ToastProps640370120[typingsJapgolly.baseui.toastMod.Toast] = new SharedBuilder_ToastProps640370120[typingsJapgolly.baseui.toastMod.Toast](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToastProps): SharedBuilder_ToastProps640370120[typingsJapgolly.baseui.toastMod.Toast] = new SharedBuilder_ToastProps640370120[typingsJapgolly.baseui.toastMod.Toast](js.Array(this.component, p.asInstanceOf[js.Any]))
}
