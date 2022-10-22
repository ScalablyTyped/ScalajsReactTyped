package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ColorScheme
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ColorSchemeOrSystem
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.Theme
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply(colorScheme: ColorSchemeOrSystem): Builder = {
    val __props = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ThemeProviderProps]))
  }
  
  @JSImport("@orbit-ui/react-components", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def defaultColorScheme(value: ColorScheme): this.type = set("defaultColorScheme", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
