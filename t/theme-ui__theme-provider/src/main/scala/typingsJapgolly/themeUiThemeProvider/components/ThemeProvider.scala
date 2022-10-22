package typingsJapgolly.themeUiThemeProvider.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.themeUiThemeProvider.distDeclarationsSrcMod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply(
    theme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
    ])
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps]))
  }
  
  @JSImport("@theme-ui/theme-provider/dist/declarations/src", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThemeProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
