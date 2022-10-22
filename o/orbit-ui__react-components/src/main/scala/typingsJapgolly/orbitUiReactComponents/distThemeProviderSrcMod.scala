package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeContextMod.ThemeContextType
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ColorScheme
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ColorSchemeOrSystem
import typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcThemeProviderMod.ThemeProviderProps
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemeProviderSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src", "ThemeComputedStyle")
  @js.native
  open class ThemeComputedStyle protected ()
    extends typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcUseThemeComputedStyleMod.ThemeComputedStyle {
    def this(componentRef: RefHandle[Element]) = this()
  }
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeContextType] = js.native
  
  inline def ThemeProvider(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest: ThemeProviderProps): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  inline def toPixelValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPixelValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useColorScheme(colorScheme: ColorSchemeOrSystem, defaultColorScheme: ColorScheme): ColorScheme = (^.asInstanceOf[js.Dynamic].applyDynamic("useColorScheme")(colorScheme.asInstanceOf[js.Any], defaultColorScheme.asInstanceOf[js.Any])).asInstanceOf[ColorScheme]
  
  inline def useThemeComputedStyle(componentRef: RefHandle[Element]): typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcUseThemeComputedStyleMod.ThemeComputedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeComputedStyle")(componentRef.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.orbitUiReactComponents.distThemeProviderSrcUseThemeComputedStyleMod.ThemeComputedStyle]
  
  inline def useThemeContext(): ThemeContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeContext")().asInstanceOf[ThemeContextType]
}
