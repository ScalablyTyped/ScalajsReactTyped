package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeThemingThemeProviderMod`.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply(value: typingsJapgolly.tuyaPanelKit.`@reactNavigationNativeTypesMod`.Theme): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
