package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.dark
import typingsJapgolly.gestalt.gestaltStrings.light
import typingsJapgolly.gestalt.gestaltStrings.userPreference
import typingsJapgolly.gestalt.mod.ColorSchemeProviderProps
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorSchemeProvider {
  
  inline def apply(colorScheme: light | dark | userPreference): Builder = {
    val __props = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[ColorSchemeProviderProps]]))
  }
  
  @JSImport("gestalt", "ColorSchemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[ColorSchemeProviderProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
