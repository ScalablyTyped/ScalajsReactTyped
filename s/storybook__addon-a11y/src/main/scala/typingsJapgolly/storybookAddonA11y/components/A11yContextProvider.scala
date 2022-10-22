package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsA11yContextMod.A11yContextProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object A11yContextProvider {
  
  inline def apply(active: Boolean): Default[js.Object] = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[A11yContextProviderProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/A11yContext", "A11yContextProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: A11yContextProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
