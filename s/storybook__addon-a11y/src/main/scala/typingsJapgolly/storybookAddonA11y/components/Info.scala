package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsReportInfoMod.InfoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Info {
  
  inline def apply(item: Result): Default[js.Object] = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[InfoProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Info", "Info")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: InfoProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
