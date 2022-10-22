package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNative.mod.ImageBackground
import typingsJapgolly.reactNative.mod.StyleSheet.NamedStyles
import typingsJapgolly.reactNativeElements.anon.Black
import typingsJapgolly.reactNativeElements.anon.PartialFullTheme
import typingsJapgolly.reactNativeElements.anon.ThemeFullTheme
import typingsJapgolly.reactNativeElements.anon.ThemeUseDark
import typingsJapgolly.reactNativeElements.anon.TypeofImage
import typingsJapgolly.reactNativeElements.anon.UseDark
import typingsJapgolly.reactNativeElements.distConfigColorsMod.Colors
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProviderState
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.default
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.replaceTheme
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.theme
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.updateTheme
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigMod {
  
  @JSImport("react-native-elements/dist/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-elements/dist/config", "BackgroundImage")
  @js.native
  val BackgroundImage: Instantiable0[ImageBackground] | TypeofImage = js.native
  
  @JSImport("react-native-elements/dist/config", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[ThemeProps[js.Object]] = js.native
  
  @JSImport("react-native-elements/dist/config", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeProps[js.Object]] = js.native
  
  @JSImport("react-native-elements/dist/config", "ThemeProvider")
  @js.native
  open class ThemeProvider protected () extends default {
    def this(props: ThemeUseDark) = this()
  }
  /* static members */
  object ThemeProvider {
    
    @JSImport("react-native-elements/dist/config", "ThemeProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-elements/dist/config", "ThemeProvider.defaultProps")
    @js.native
    def defaultProps: UseDark = js.native
    inline def defaultProps_=(x: UseDark): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: ThemeUseDark, state: ThemeProviderState): ThemeFullTheme = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ThemeFullTheme]
  }
  
  @JSImport("react-native-elements/dist/config", "colors")
  @js.native
  val colors: Colors = js.native
  
  @JSImport("react-native-elements/dist/config", "colorsDark")
  @js.native
  val colorsDark: Colors = js.native
  
  object fonts {
    
    @JSImport("react-native-elements/dist/config", "fonts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-elements/dist/config", "fonts.android")
    @js.native
    def android: Black = js.native
    inline def android_=(x: Black): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
  }
  
  inline def makeStyles[T /* <: NamedStyles[Any | T] */, V](styles: T): js.Function1[/* props */ js.UndefOr[V], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[V], T]]
  inline def makeStyles[T /* <: NamedStyles[Any | T] */, V](styles: js.Function2[/* theme */ PartialFullTheme, /* props */ V, T]): js.Function1[/* props */ js.UndefOr[V], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[V], T]]
  
  inline def useTheme(): ThemeProps[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[ThemeProps[js.Object]]
  
  inline def withTheme[P, T](WrappedComponent: ComponentType[P & Partial[ThemeProps[T]]], themeKey: String): (FunctionComponent[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements/dist/config/ThemeProvider.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ]
  ]) | ForwardRefExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(WrappedComponent.asInstanceOf[js.Any], themeKey.asInstanceOf[js.Any])).asInstanceOf[(FunctionComponent[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements/dist/config/ThemeProvider.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ]
  ]) | ForwardRefExoticComponent[P]]
}
