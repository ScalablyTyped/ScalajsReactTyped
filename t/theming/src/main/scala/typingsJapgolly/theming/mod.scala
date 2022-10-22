package typingsJapgolly.theming

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.std.NonNullable
import typingsJapgolly.theming.anon.ThemeNonNullable
import typingsJapgolly.theming.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("theming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("theming", "ThemeContext")
  @js.native
  val ThemeContext: Context[DefaultTheme] = js.native
  
  @JSImport("theming", "ThemeProvider")
  @js.native
  val ThemeProvider: ThemeProviderFactory[DefaultTheme] = js.native
  
  inline def createTheming[Theme](context: Context[Theme]): Theming[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheming")(context.asInstanceOf[js.Any]).asInstanceOf[Theming[Theme]]
  
  @JSImport("theming", "useTheme")
  @js.native
  val useTheme: UseThemeFactory[DefaultTheme] = js.native
  
  @JSImport("theming", "withTheme")
  @js.native
  val withTheme: WithThemeFactory[DefaultTheme] = js.native
  
  type DefaultTheme = js.Object | Null
  
  type ThemeProviderFactory[Theme] = ComponentType[ThemeProviderProps[Theme]]
  
  trait ThemeProviderProps[Theme] extends StObject {
    
    var children: Node
    
    var theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])
  }
  object ThemeProviderProps {
    
    inline def apply[Theme](theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): ThemeProviderProps[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ThemeProviderProps[Theme]]
    }
    
    extension [Self <: ThemeProviderProps[?], Theme](x: Self & ThemeProviderProps[Theme]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(value: /* outerTheme */ Theme => NonNullable[Theme]): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  trait Theming[Theme] extends StObject {
    
    var ThemeProvider: ThemeProviderFactory[Theme]
    
    var context: Context[Theme]
    
    var useTheme: UseThemeFactory[Theme]
    
    var withTheme: WithThemeFactory[Theme]
  }
  object Theming {
    
    inline def apply[Theme](
      ThemeProvider: ThemeProviderFactory[Theme],
      context: Context[Theme],
      useTheme: CallbackTo[Theme],
      withTheme: /* comp */ ComponentType[ThemeNonNullable[Theme]] => ComponentType[ThemeNonNullable[Theme] & `0`[Theme]]
    ): Theming[Theme] = {
      val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], useTheme = useTheme.toJsFn, withTheme = js.Any.fromFunction1(withTheme))
      __obj.asInstanceOf[Theming[Theme]]
    }
    
    extension [Self <: Theming[?], Theme](x: Self & Theming[Theme]) {
      
      inline def setContext(value: Context[Theme]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setThemeProvider(value: ThemeProviderFactory[Theme]): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
      
      inline def setUseTheme(value: CallbackTo[Theme]): Self = StObject.set(x, "useTheme", value.toJsFn)
      
      inline def setWithTheme(
        value: /* comp */ ComponentType[ThemeNonNullable[Theme]] => ComponentType[ThemeNonNullable[Theme] & `0`[Theme]]
      ): Self = StObject.set(x, "withTheme", js.Any.fromFunction1(value))
    }
  }
  
  type UseThemeFactory[Theme] = js.Function0[Theme]
  
  type WithThemeFactory[Theme] = js.Function1[
    /* comp */ ComponentType[ThemeNonNullable[Theme]], 
    ComponentType[ThemeNonNullable[Theme] & `0`[Theme]]
  ]
}
