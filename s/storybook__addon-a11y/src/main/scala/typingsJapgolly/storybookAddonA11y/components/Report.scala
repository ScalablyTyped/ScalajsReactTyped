package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsA11YPanelMod.RuleType
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsReportMod.ReportProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Report {
  
  inline def apply(empty: String, items: js.Array[Result], `type`: RuleType): Default[js.Object] = {
    val __props = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ReportProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report", "Report")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReportProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
