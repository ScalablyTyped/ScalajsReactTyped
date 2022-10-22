package typingsJapgolly.terraButton.components

import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.terraButton.libButtonMod.ButtonProps
import typingsJapgolly.terraButton.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TerraButton {
  
  inline def apply[T /* <: HTMLAnchorElement | HTMLButtonElement */](text: String): SharedBuilder_ButtonProps_781340470[default[T], T] = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new SharedBuilder_ButtonProps_781340470[default[T], T](js.Array(this.component, __props.asInstanceOf[ButtonProps[T]]))
  }
  
  @JSImport("terra-button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps[T /* <: HTMLAnchorElement | HTMLButtonElement */](p: ButtonProps[T]): SharedBuilder_ButtonProps_781340470[default[T], T] = new SharedBuilder_ButtonProps_781340470[default[T], T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
