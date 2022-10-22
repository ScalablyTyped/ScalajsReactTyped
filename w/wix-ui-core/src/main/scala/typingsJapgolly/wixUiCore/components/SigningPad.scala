package typingsJapgolly.wixUiCore.components

import typingsJapgolly.wixUiCore.anon.PickSigningPadPropschildr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SigningPad {
  
  @JSImport("wix-ui-core/dist/es/src", "SigningPad")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SigningPad.type): SharedBuilder_PickSigningPadPropschildr259741442 = new SharedBuilder_PickSigningPadPropschildr259741442(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickSigningPadPropschildr): SharedBuilder_PickSigningPadPropschildr259741442 = new SharedBuilder_PickSigningPadPropschildr259741442(js.Array(this.component, p.asInstanceOf[js.Any]))
}
