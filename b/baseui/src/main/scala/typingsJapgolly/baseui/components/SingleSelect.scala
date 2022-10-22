package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.anon.PartialSelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SingleSelect {
  
  @JSImport("baseui/select", "SingleSelect")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SingleSelect.type): SharedBuilder_PartialSelectProps_575069375 = new SharedBuilder_PartialSelectProps_575069375(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialSelectProps): SharedBuilder_PartialSelectProps_575069375 = new SharedBuilder_PartialSelectProps_575069375(js.Array(this.component, p.asInstanceOf[js.Any]))
}
