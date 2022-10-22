package typingsJapgolly.terraThemeContext.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.terraThemeContext.anon.Name
import typingsJapgolly.terraThemeContext.libThemeContextProviderMod.ThemeContextProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeContextProvider {
  
  @JSImport("terra-theme-context/lib/ThemeContextProvider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def theme(value: Name): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ThemeContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ThemeContextProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
