package typingsJapgolly.styledDashComponents

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.Consumer
import typingsJapgolly.react.reactMod.Context
import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.CSSKeyframes
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.CSSObject
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.Interpolation
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.InterpolationFunction
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.Keyframes
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.SimpleInterpolation
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.StyledInterface
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemedCssFunction
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemedGlobalStyledClassProps
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemedStyledProps
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/macro", JSImport.Namespace)
@js.native
object macroMod extends js.Object {
  @js.native
  class ServerStyleSheet ()
    extends typingsJapgolly.styledDashComponents.styledDashComponentsMod.ServerStyleSheet
  
  @js.native
  class StyleSheetManager ()
    extends Component[StyleSheetManagerProps, js.Object, js.Any]
  
  @js.native
  class ThemeProvider protected ()
    extends Component[
          ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]], 
          ComponentState, 
          js.Any
        ] {
    def this(props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]) = this()
    def this(
      props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]],
      context: js.Any
    ) = this()
  }
  
  val ThemeConsumer: Consumer[AnyIfEmpty[DefaultTheme]] = js.native
  val ThemeContext: Context[AnyIfEmpty[DefaultTheme]] = js.native
  val ThemeProvider: ComponentClassP[
    (ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]) with js.Object
  ] = js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  val default: StyledInterface = js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ComponentClassP[(ThemedGlobalStyledClassProps[P, DefaultTheme]) with js.Object] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): ComponentClassP[(ThemedGlobalStyledClassProps[P, DefaultTheme]) with js.Object] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): ComponentClassP[(ThemedGlobalStyledClassProps[P, DefaultTheme]) with js.Object] = js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean = js.native
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes = js.native
}

