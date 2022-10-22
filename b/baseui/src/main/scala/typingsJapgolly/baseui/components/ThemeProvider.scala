package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.stylesThemeProviderMod.ThemeProviderProps
import typingsJapgolly.baseui.stylesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply(theme: Theme): Default[js.Object] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps]))
  }
  
  @JSImport("baseui/styles", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThemeProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
