package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.axeCore.mod.NodeResult
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsA11YPanelMod.RuleType
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsReportElementsMod.ElementsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Elements {
  
  inline def apply(elements: js.Array[NodeResult], `type`: RuleType): Default[js.Object] = {
    val __props = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ElementsProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Elements", "Elements")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ElementsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
