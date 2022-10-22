package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme
import typingsJapgolly.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MuiThemeProvider {
  
  @JSImport("material-ui/styles", "MuiThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.stylesMod.MuiThemeProvider] {
    
    inline def muiTheme(value: MuiTheme): this.type = set("muiTheme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MuiThemeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MuiThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
