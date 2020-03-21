package typingsJapgolly.styledComponents

import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty
import typingsJapgolly.styledComponents.styledComponentsMod.CSSKeyframes
import typingsJapgolly.styledComponents.styledComponentsMod.CSSObject
import typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme
import typingsJapgolly.styledComponents.styledComponentsMod.Interpolation
import typingsJapgolly.styledComponents.styledComponentsMod.InterpolationFunction
import typingsJapgolly.styledComponents.styledComponentsMod.Keyframes_
import typingsJapgolly.styledComponents.styledComponentsMod.SimpleInterpolation
import typingsJapgolly.styledComponents.styledComponentsMod.StyleSheetManagerProps
import typingsJapgolly.styledComponents.styledComponentsMod.StyledInterface
import typingsJapgolly.styledComponents.styledComponentsMod.ThemeProviderComponent
import typingsJapgolly.styledComponents.styledComponentsMod.ThemeProviderProps
import typingsJapgolly.styledComponents.styledComponentsMod.ThemedCssFunction
import typingsJapgolly.styledComponents.styledComponentsMod.ThemedGlobalStyledClassProps
import typingsJapgolly.styledComponents.styledComponentsMod.ThemedStyledProps
import typingsJapgolly.styledComponents.styledComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/macro", JSImport.Namespace)
@js.native
object macroMod extends js.Object {
  @js.native
  class ServerStyleSheet ()
    extends typingsJapgolly.styledComponents.styledComponentsMod.ServerStyleSheet
  
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
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  def useTheme(): DefaultTheme = js.native
  @js.native
  object ThemeProvider extends TopLevel[ThemeProviderComponent[AnyIfEmpty[DefaultTheme], AnyIfEmpty[DefaultTheme]]]
  
}

