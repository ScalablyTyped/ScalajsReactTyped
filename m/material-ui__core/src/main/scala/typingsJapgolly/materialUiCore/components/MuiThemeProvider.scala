package typingsJapgolly.materialUiCore.components

import typingsJapgolly.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MuiThemeProvider {
  
  inline def apply[T](theme: Partial[T] | (js.Function1[T, T])): SharedBuilder_ThemeProviderProps_332645208[T] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new SharedBuilder_ThemeProviderProps_332645208[T](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[T]]))
  }
  
  @JSImport("@material-ui/core", "MuiThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps[T](p: ThemeProviderProps[T]): SharedBuilder_ThemeProviderProps_332645208[T] = new SharedBuilder_ThemeProviderProps_332645208[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
