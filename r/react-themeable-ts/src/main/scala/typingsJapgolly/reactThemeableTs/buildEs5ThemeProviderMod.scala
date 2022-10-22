package typingsJapgolly.reactThemeableTs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEs5ThemeProviderMod {
  
  @JSImport("react-themeable-ts/build-es5/theme-provider", "ThemeProvider")
  @js.native
  open class ThemeProvider protected ()
    extends PureComponent[IThemeProviderProps, js.Object, Any] {
    def this(props: IThemeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IThemeProviderProps, context: Any) = this()
    
    def getChildContext(): StringDictionary[Any] = js.native
  }
  /* static members */
  object ThemeProvider {
    
    @JSImport("react-themeable-ts/build-es5/theme-provider", "ThemeProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-themeable-ts/build-es5/theme-provider", "ThemeProvider.childContextTypes")
    @js.native
    def childContextTypes: StringDictionary[Validator[Any]] = js.native
    inline def childContextTypes_=(x: StringDictionary[Validator[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-themeable-ts/build-es5/theme-provider", "ThemeProvider.defaultProps")
    @js.native
    def defaultProps: StringDictionary[js.Object] = js.native
    inline def defaultProps_=(x: StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IThemeProviderContext extends StObject {
    
    var reactThemeable: Any
  }
  object IThemeProviderContext {
    
    inline def apply(reactThemeable: Any): IThemeProviderContext = {
      val __obj = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThemeProviderContext]
    }
    
    extension [Self <: IThemeProviderContext](x: Self) {
      
      inline def setReactThemeable(value: Any): Self = StObject.set(x, "reactThemeable", value.asInstanceOf[js.Any])
    }
  }
  
  trait IThemeProviderProps extends StObject {
    
    var children: js.UndefOr[Any] = js.undefined
    
    var reactThemeable: Any
  }
  object IThemeProviderProps {
    
    inline def apply(reactThemeable: Any): IThemeProviderProps = {
      val __obj = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThemeProviderProps]
    }
    
    extension [Self <: IThemeProviderProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setReactThemeable(value: Any): Self = StObject.set(x, "reactThemeable", value.asInstanceOf[js.Any])
    }
  }
}
