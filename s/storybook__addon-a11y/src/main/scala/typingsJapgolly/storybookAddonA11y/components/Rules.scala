package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.axeCore.mod.CheckResult
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsReportRulesMod.RulesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rules {
  
  inline def apply(rules: js.Array[CheckResult]): Default[js.Object] = {
    val __props = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RulesProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Rules", "Rules")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RulesProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
