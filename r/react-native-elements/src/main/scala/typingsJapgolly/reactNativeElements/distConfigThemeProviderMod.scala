package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNativeElements.anon.PartialFullTheme
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.anon.ThemeFullTheme
import typingsJapgolly.reactNativeElements.anon.ThemeUseDark
import typingsJapgolly.reactNativeElements.anon.UseDark
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigThemeProviderMod {
  
  @JSImport("react-native-elements/dist/config/ThemeProvider", JSImport.Default)
  @js.native
  open class default protected () extends ThemeProvider {
    def this(props: ThemeUseDark) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-elements/dist/config/ThemeProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-elements/dist/config/ThemeProvider", "default.defaultProps")
    @js.native
    def defaultProps: UseDark = js.native
    inline def defaultProps_=(x: UseDark): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: ThemeUseDark, state: ThemeProviderState): ThemeFullTheme = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ThemeFullTheme]
  }
  
  @JSImport("react-native-elements/dist/config/ThemeProvider", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[ThemeProps[js.Object]] = js.native
  
  @JSImport("react-native-elements/dist/config/ThemeProvider", "ThemeContext")
  @js.native
  val ThemeContext: Context[ThemeProps[js.Object]] = js.native
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? react-native-elements.react-native-elements/dist/config/ThemeProvider.RecursivePartial<T[P]>}
    }}}
    */
  @js.native
  trait RecursivePartial[T] extends StObject
  
  trait ThemeProps[T] extends StObject {
    
    def replaceTheme(updates: RecursivePartialFullThemeAvatar): Unit
    
    var theme: Theme[T]
    
    def updateTheme(updates: RecursivePartialFullThemeAvatar): Unit
  }
  object ThemeProps {
    
    inline def apply[T](
      replaceTheme: RecursivePartialFullThemeAvatar => Callback,
      theme: Theme[T],
      updateTheme: RecursivePartialFullThemeAvatar => Callback
    ): ThemeProps[T] = {
      val __obj = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
      __obj.asInstanceOf[ThemeProps[T]]
    }
    
    extension [Self <: ThemeProps[?], T](x: Self & ThemeProps[T]) {
      
      inline def setReplaceTheme(value: RecursivePartialFullThemeAvatar => Callback): Self = StObject.set(x, "replaceTheme", js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => value(t0).runNow()))
      
      inline def setTheme(value: Theme[T]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUpdateTheme(value: RecursivePartialFullThemeAvatar => Callback): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait ThemeProvider extends Component[ThemeProviderProps, ThemeProviderState, Any] {
    
    var defaultTheme: PartialFullTheme = js.native
    
    def getTheme(): PartialFullTheme = js.native
    
    def replaceTheme(theme: RecursivePartialFullThemeAvatar): Unit = js.native
    
    def updateTheme(updates: RecursivePartialFullThemeAvatar): Unit = js.native
  }
  
  trait ThemeProviderProps extends StObject {
    
    var useDark: js.UndefOr[Boolean] = js.undefined
  }
  object ThemeProviderProps {
    
    inline def apply(): ThemeProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setUseDark(value: Boolean): Self = StObject.set(x, "useDark", value.asInstanceOf[js.Any])
      
      inline def setUseDarkUndefined: Self = StObject.set(x, "useDark", js.undefined)
    }
  }
  
  trait ThemeProviderState extends StObject {
    
    var theme: typingsJapgolly.reactNativeElements.anon.Theme
    
    var useDark: Boolean
  }
  object ThemeProviderState {
    
    inline def apply(theme: typingsJapgolly.reactNativeElements.anon.Theme, useDark: Boolean): ThemeProviderState = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], useDark = useDark.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderState]
    }
    
    extension [Self <: ThemeProviderState](x: Self) {
      
      inline def setTheme(value: typingsJapgolly.reactNativeElements.anon.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUseDark(value: Boolean): Self = StObject.set(x, "useDark", value.asInstanceOf[js.Any])
    }
  }
}
