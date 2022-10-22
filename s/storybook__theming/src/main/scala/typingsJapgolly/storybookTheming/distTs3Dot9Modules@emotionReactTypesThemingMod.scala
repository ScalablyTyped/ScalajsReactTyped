package typingsJapgolly.storybookTheming

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FC
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesHelperMod`.DistributiveOmit
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesHelperMod`.PropsOf
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesIndexMod`.Theme
import typingsJapgolly.storybookTheming.storybookThemingStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTs3Dot9Modules@emotionReactTypesThemingMod` {
  
  @JSImport("@storybook/theming/dist/ts3.9/_modules/@emotion-react-types-theming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/theming/dist/ts3.9/_modules/@emotion-react-types-theming", "ThemeProvider")
  @js.native
  val ThemeProvider: typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesThemingMod`.ThemeProvider = js.native
  type ThemeProvider = js.Function1[/* props */ ThemeProviderProps, Element]
  
  inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]
  
  @JSImport("@storybook/theming/dist/ts3.9/_modules/@emotion-react-types-theming", "withTheme")
  @js.native
  val withTheme: typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesThemingMod`.withTheme = js.native
  type withTheme = js.Function1[
    /* component */ Any, 
    FC[
      (DistributiveOmit[PropsOf[Any], theme]) & typingsJapgolly.storybookTheming.anon.Theme
    ]
  ]
  
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])
  }
  object ThemeProviderProps {
    
    inline def apply(theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(value: /* outerTheme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    P extends {  theme :infer Theme} ? P & {  theme :std.Exclude<Theme, undefined>} : P & {  theme :T}
    }}}
    */
  @js.native
  trait WithTheme_[P, T] extends StObject
}
