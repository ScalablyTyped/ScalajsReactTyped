package typingsJapgolly.reactThemeableTs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactThemeableTs.buildEs5ThemeProviderMod.IThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  inline def apply(reactThemeable: Any): Builder = {
    val __props = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IThemeProviderProps]))
  }
  
  @JSImport("react-themeable-ts", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactThemeableTs.mod.ThemeProvider] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
