package typingsJapgolly.reactToolbox.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCssThemr.mod.TReactCSSThemrTheme
import typingsJapgolly.reactCssThemr.mod.ThemeProviderProps
import typingsJapgolly.reactToolbox.componentsThemeProviderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply(theme: TReactCSSThemrTheme): Builder = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ThemeProviderProps]))
  }
  
  @JSImport("react-toolbox/components/ThemeProvider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def innerRef(value: js.Function): this.type = set("innerRef", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
