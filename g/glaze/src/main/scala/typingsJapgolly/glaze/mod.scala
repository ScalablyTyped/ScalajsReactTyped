package typingsJapgolly.glaze

import typingsJapgolly.glaze.anon.AnimationDelay
import typingsJapgolly.glaze.anon.Bg
import typingsJapgolly.glaze.anon.Border
import typingsJapgolly.glaze.anon.Inset
import typingsJapgolly.glaze.anon.PickConsoleLogLevel
import typingsJapgolly.glaze.distTypesStyleInjectorContextMod.StyleInjectorProviderProps
import typingsJapgolly.glaze.distTypesThemeContextMod.ThemeProviderProps
import typingsJapgolly.glaze.distTypesThemeMod.RuntimeTheme
import typingsJapgolly.glaze.distTypesThemeMod.StaticTheme
import typingsJapgolly.glaze.distTypesUseStylingMod.ThemedStyle
import typingsJapgolly.glaze.glazeInts.`1024`
import typingsJapgolly.glaze.glazeInts.`1280`
import typingsJapgolly.glaze.glazeInts.`640`
import typingsJapgolly.glaze.glazeInts.`768`
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glaze", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StyleInjectorProvider(hasChildrenInjector: StyleInjectorProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleInjectorProvider")(hasChildrenInjector.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ThemeProvider(hasThemeChildren: ThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("glaze", "VirtualStyleInjector")
  @js.native
  open class VirtualStyleInjector ()
    extends typingsJapgolly.glaze.distTypesStyleInjectorMod.VirtualStyleInjector
  
  inline def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any) & StaticTheme
  ): RuntimeTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any]).asInstanceOf[RuntimeTheme]
  inline def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ Any) & StaticTheme,
    localDebugName: String
  ): RuntimeTheme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[RuntimeTheme]
  
  object defaultTokens {
    
    @JSImport("glaze", "defaultTokens.aliases")
    @js.native
    val aliases: Bg = js.native
    
    @JSImport("glaze", "defaultTokens.breakpoints")
    @js.native
    val breakpoints: js.Tuple4[`640`, `768`, `1024`, `1280`] = js.native
    
    @JSImport("glaze", "defaultTokens.matchers")
    @js.native
    val matchers: AnimationDelay = js.native
    
    @JSImport("glaze", "defaultTokens.scales")
    @js.native
    val scales: Border = js.native
    
    @JSImport("glaze", "defaultTokens.shorthands")
    @js.native
    val shorthands: Inset = js.native
  }
  
  inline def modularScale(ratio: Double): /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in type-fest.type-fest/source/value-of.ValueOf<[-1, -0.5, 0, 1, 2, 3, 4, 5, 6], number> ]: string} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(ratio.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in type-fest.type-fest/source/value-of.ValueOf<[-1, -0.5, 0, 1, 2, 3, 4, 5, 6], number> ]: string} */ js.Any]
  inline def modularScale[T /* <: Double */](ratio: Double, steps: js.Array[T]): /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in T ]: string} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(ratio.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in T ]: string} */ js.Any]
  
  inline def setLogger(logger: PickConsoleLogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useStyling(): js.Function1[/* themedStyle */ ThemedStyle, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyling")().asInstanceOf[js.Function1[/* themedStyle */ ThemedStyle, String]]
  
  inline def useTheme(): RuntimeTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[RuntimeTheme]
}
