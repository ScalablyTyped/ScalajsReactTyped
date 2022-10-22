package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonA11y.anon.Items
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsTabsMod.TabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  inline def apply(tabs: js.Array[Items]): Default[js.Object] = {
    val __props = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TabsProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Tabs", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TabsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
