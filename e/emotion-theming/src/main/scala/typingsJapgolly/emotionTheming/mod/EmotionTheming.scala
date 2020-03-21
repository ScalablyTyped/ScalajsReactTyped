package typingsJapgolly.emotionTheming.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.emotionTheming.emotionThemingStrings.theme
import typingsJapgolly.emotionTheming.helperMod.AddOptionalTo
import typingsJapgolly.emotionTheming.helperMod.PropsOf
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionTheming[Theme] extends js.Object {
  def ThemeProvider(props: ThemeProviderProps[Theme]): Element
  def withTheme[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]]
}

object EmotionTheming {
  @scala.inline
  def apply[Theme](
    ThemeProvider: ThemeProviderProps[Theme] => CallbackTo[Element],
    withTheme: js.Any => CallbackTo[SFC[AddOptionalTo[PropsOf[js.Any], theme]]]
  ): EmotionTheming[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ThemeProvider")(js.Any.fromFunction1((t0: typingsJapgolly.emotionTheming.mod.ThemeProviderProps[Theme]) => ThemeProvider(t0).runNow()))
    __obj.updateDynamic("withTheme")(js.Any.fromFunction1((t0: js.Any) => withTheme(t0).runNow()))
    __obj.asInstanceOf[EmotionTheming[Theme]]
  }
}

