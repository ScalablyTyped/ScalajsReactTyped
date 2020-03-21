package typingsJapgolly.theming.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.theming.AnonTheme
import typingsJapgolly.theming.AnonThemeNonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theming[Theme] extends js.Object {
  var ThemeProvider: ThemeProviderFactory[Theme]
  var context: Context[Theme]
  var useTheme: UseThemeFactory[Theme]
  var withTheme: WithThemeFactory[Theme]
}

object Theming {
  @scala.inline
  def apply[Theme](
    ThemeProvider: ThemeProviderFactory[Theme],
    context: Context[Theme],
    useTheme: CallbackTo[Theme],
    withTheme: /* comp */ ComponentType[AnonTheme[Theme]] => CallbackTo[ComponentType[AnonTheme[Theme] with AnonThemeNonNullable[Theme]]]
  ): Theming[Theme] = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("useTheme")(useTheme.toJsFn)
    __obj.updateDynamic("withTheme")(js.Any.fromFunction1((t0: /* comp */ typingsJapgolly.react.mod.ComponentType[typingsJapgolly.theming.AnonTheme[Theme]]) => withTheme(t0).runNow()))
    __obj.asInstanceOf[Theming[Theme]]
  }
}

