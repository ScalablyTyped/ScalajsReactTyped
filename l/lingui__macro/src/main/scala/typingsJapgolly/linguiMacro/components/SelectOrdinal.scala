package typingsJapgolly.linguiMacro.components

import typingsJapgolly.linguiMacro.mod.ChoiceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectOrdinal {
  
  @JSImport("@lingui/macro", "SelectOrdinal_")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SelectOrdinal.type): SharedBuilder_ChoiceProps_1610191505 = new SharedBuilder_ChoiceProps_1610191505(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ChoiceProps): SharedBuilder_ChoiceProps_1610191505 = new SharedBuilder_ChoiceProps_1610191505(js.Array(this.component, p.asInstanceOf[js.Any]))
}
