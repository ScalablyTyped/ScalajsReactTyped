package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemeProviderSrcThemeProviderMod {
  
  @JSImport("@orbit-ui/react-components/dist/theme-provider/src/ThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ThemeProvider(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest: ThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeColorSchemeDefaultColorSchemeChildrenAsRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.light
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dark
  */
  trait ColorScheme extends StObject
  object ColorScheme {
    
    inline def dark: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dark = "dark".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dark]
    
    inline def light: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.light = "light".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.light]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.system
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.light
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dark
  */
  trait ColorSchemeOrSystem extends StObject
  object ColorSchemeOrSystem {
    
    inline def dark: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dark = "dark".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dark]
    
    inline def light: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.light = "light".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.light]
    
    inline def system: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.system = "system".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.system]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.apricot
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.desktop
  */
  trait Theme extends StObject
  object Theme {
    
    inline def apricot: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.apricot = "apricot".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.apricot]
    
    inline def desktop: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.desktop = "desktop".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.desktop]
  }
  
  trait ThemeProviderProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * @ignore
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * The color scheme to use.
      */
    var colorScheme: ColorSchemeOrSystem
    
    /**
      * Default color scheme to use when a user prefered color scheme (system) is not available.
      */
    var defaultColorScheme: js.UndefOr[ColorScheme] = js.undefined
    
    /**
      * The theme to use.
      */
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object ThemeProviderProps {
    
    inline def apply(colorScheme: ColorSchemeOrSystem): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColorScheme(value: ColorSchemeOrSystem): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setDefaultColorScheme(value: ColorScheme): Self = StObject.set(x, "defaultColorScheme", value.asInstanceOf[js.Any])
      
      inline def setDefaultColorSchemeUndefined: Self = StObject.set(x, "defaultColorScheme", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
