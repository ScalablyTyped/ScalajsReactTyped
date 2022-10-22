package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ColorScheme
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.Theme
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemeProviderSrcThemeContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src/ThemeContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src/ThemeContext", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeContextType] = js.native
  
  inline def useThemeContext(): ThemeContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeContext")().asInstanceOf[ThemeContextType]
  
  trait ThemeContextType extends StObject {
    
    var colorScheme: js.UndefOr[ColorScheme] = js.undefined
    
    var setColorScheme: js.UndefOr[js.Function1[/* newColorScheme */ ColorScheme, Unit]] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object ThemeContextType {
    
    inline def apply(): ThemeContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeContextType]
    }
    
    extension [Self <: ThemeContextType](x: Self) {
      
      inline def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      inline def setSetColorScheme(value: /* newColorScheme */ ColorScheme => Callback): Self = StObject.set(x, "setColorScheme", js.Any.fromFunction1((t0: /* newColorScheme */ ColorScheme) => value(t0).runNow()))
      
      inline def setSetColorSchemeUndefined: Self = StObject.set(x, "setColorScheme", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
