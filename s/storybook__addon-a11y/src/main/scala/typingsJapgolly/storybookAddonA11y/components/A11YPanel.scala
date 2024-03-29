package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object A11YPanel {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/A11YPanel", "A11YPanel")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: A11YPanel.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
