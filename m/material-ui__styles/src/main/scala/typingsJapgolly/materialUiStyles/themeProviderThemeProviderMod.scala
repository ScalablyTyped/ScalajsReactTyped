package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderThemeProviderMod {
  
  @JSImport("@material-ui/styles/ThemeProvider/ThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](props: ThemeProviderProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ThemeProviderProps[Theme] extends StObject {
    
    var children: Node
    
    var theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])
  }
  object ThemeProviderProps {
    
    inline def apply[Theme](theme: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ThemeProviderProps[Theme]]
    }
    
    extension [Self <: ThemeProviderProps[?], Theme](x: Self & ThemeProviderProps[Theme]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: Partial[Theme] | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
}
