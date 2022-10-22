package typingsJapgolly.reactQuery.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactQuery.typesDevtoolsThemeMod.ProviderProps
import typingsJapgolly.reactQuery.typesDevtoolsThemeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply(theme: Theme): Default[js.Object] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps]))
  }
  
  @JSImport("react-query/types/devtools/theme", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
