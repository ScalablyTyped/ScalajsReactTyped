package typingsJapgolly.reactSwitchCase.components

import typingsJapgolly.reactSwitchCase.mod.CaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Case {
  
  inline def apply(value: Any): typingsJapgolly.StBuildingComponent.Default[typingsJapgolly.reactSwitchCase.mod.Case] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new typingsJapgolly.StBuildingComponent.Default[typingsJapgolly.reactSwitchCase.mod.Case](js.Array(this.component, __props.asInstanceOf[CaseProps]))
  }
  
  @JSImport("react-switch-case", "Case")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CaseProps): typingsJapgolly.StBuildingComponent.Default[typingsJapgolly.reactSwitchCase.mod.Case] = new typingsJapgolly.StBuildingComponent.Default[typingsJapgolly.reactSwitchCase.mod.Case](js.Array(this.component, p.asInstanceOf[js.Any]))
}
