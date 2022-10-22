package typingsJapgolly.terraActionHeader.components

import typingsJapgolly.terraActionHeader.libActionHeaderMod.ActionHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TerraActionHeader {
  
  @JSImport("terra-action-header", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TerraActionHeader.type): SharedBuilder_ActionHeaderProps_620688395 = new SharedBuilder_ActionHeaderProps_620688395(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ActionHeaderProps): SharedBuilder_ActionHeaderProps_620688395 = new SharedBuilder_ActionHeaderProps_620688395(js.Array(this.component, p.asInstanceOf[js.Any]))
}
