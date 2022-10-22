package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.stylesTypesMod.Theme
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesThemeProviderMod extends Shortcut {
  
  @JSImport("baseui/styles/theme-provider", JSImport.Default)
  @js.native
  val default: FC[ThemeProviderProps] = js.native
  
  @JSImport("baseui/styles/theme-provider", "ThemeContext")
  @js.native
  val ThemeContext: Context[Theme] = js.native
  
  trait ThemeProviderProps extends StObject {
    
    var theme: Theme
  }
  object ThemeProviderProps {
    
    inline def apply(theme: Theme): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[ThemeProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `stylesThemeProviderMod.foo` */
  override def _to: FC[ThemeProviderProps] = default
}
