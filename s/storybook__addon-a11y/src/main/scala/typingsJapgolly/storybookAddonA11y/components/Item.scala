package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsA11YPanelMod.RuleType
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsReportItemMod.ItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  inline def apply(item: Result, `type`: RuleType): Default[js.Object] = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ItemProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Item", "Item")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ItemProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
