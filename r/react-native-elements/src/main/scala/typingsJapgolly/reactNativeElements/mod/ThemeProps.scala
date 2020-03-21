package typingsJapgolly.reactNativeElements.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeElements.RecursivePartialFullTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProps[T] extends js.Object {
  var replaceTheme: ReplaceTheme
  var theme: Theme[T]
  var updateTheme: UpdateTheme
}

object ThemeProps {
  @scala.inline
  def apply[T](
    replaceTheme: /* updates */ RecursivePartialFullTheme => Callback,
    theme: Theme[T],
    updateTheme: /* updates */ RecursivePartialFullTheme => Callback
  ): ThemeProps[T] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("replaceTheme")(js.Any.fromFunction1((t0: /* updates */ typingsJapgolly.reactNativeElements.RecursivePartialFullTheme) => replaceTheme(t0).runNow()))
    __obj.updateDynamic("updateTheme")(js.Any.fromFunction1((t0: /* updates */ typingsJapgolly.reactNativeElements.RecursivePartialFullTheme) => updateTheme(t0).runNow()))
    __obj.asInstanceOf[ThemeProps[T]]
  }
}

