package typingsJapgolly.styledComponents.styledComponentsMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ServerStyleSheet: Instantiable0[typingsJapgolly.styledComponents.styledComponentsMod.ServerStyleSheet] = js.native
  var StyleSheetManager: Instantiable0[typingsJapgolly.styledComponents.styledComponentsMod.StyleSheetManager] = js.native
  var ThemeConsumer: Consumer[T] = js.native
  var ThemeContext: Context[T] = js.native
  var ThemeProvider: ComponentClassP[(ThemeProviderProps[AnyIfEmpty[T], AnyIfEmpty[U]]) with js.Object] = js.native
  var css: ThemedCssFunction[T] = js.native
  var default: ThemedStyledInterface[T] = js.native
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
  ] = js.native
  var withTheme: WithThemeFnInterface[T] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): ComponentClassP[(ThemedGlobalStyledClassProps[P, T]) with js.Object] = js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, T]])*): ComponentClassP[(ThemedGlobalStyledClassProps[P, T]) with js.Object] = js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, T]],
    interpolations: (Interpolation[ThemedStyledProps[P, T]])*
  ): ComponentClassP[(ThemedGlobalStyledClassProps[P, T]) with js.Object] = js.native
  // unfortunately keyframes can't interpolate props from the theme
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  def useTheme(): T = js.native
}

