package typingsJapgolly.wixUiCore.components

import typingsJapgolly.wixUiCore.anon.PickClearButtonPropschild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClearButton {
  
  @JSImport("wix-ui-core/dist/es/src", "ClearButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ClearButton.type): SharedBuilder_PickClearButtonPropschild727939066 = new SharedBuilder_PickClearButtonPropschild727939066(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickClearButtonPropschild): SharedBuilder_PickClearButtonPropschild727939066 = new SharedBuilder_PickClearButtonPropschild727939066(js.Array(this.component, p.asInstanceOf[js.Any]))
}
