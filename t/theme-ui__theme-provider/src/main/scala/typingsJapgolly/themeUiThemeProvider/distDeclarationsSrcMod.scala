package typingsJapgolly.themeUiThemeProvider

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("@theme-ui/theme-provider/dist/declarations/src", "ThemeProvider")
  @js.native
  val ThemeProvider: FC[ThemeProviderProps] = js.native
  
  /* Inlined parent std.Pick<@theme-ui/core.@theme-ui/core.ThemeProviderProps, 'theme'> */
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var theme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ])
  }
  object ThemeProviderProps {
    
    inline def apply(
      theme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
        ])
    ): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
            ])
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
}
