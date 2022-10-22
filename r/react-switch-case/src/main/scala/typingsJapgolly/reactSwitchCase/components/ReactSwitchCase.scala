package typingsJapgolly.reactSwitchCase.components

import typingsJapgolly.reactSwitchCase.mod.SwitchProps
import typingsJapgolly.reactSwitchCase.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSwitchCase {
  
  inline def apply(condition: Any): typingsJapgolly.StBuildingComponent.Default[default] = {
    val __props = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    new typingsJapgolly.StBuildingComponent.Default[default](js.Array(this.component, __props.asInstanceOf[SwitchProps]))
  }
  
  @JSImport("react-switch-case", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SwitchProps): typingsJapgolly.StBuildingComponent.Default[default] = new typingsJapgolly.StBuildingComponent.Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
