package typingsJapgolly.theming.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[Theme] extends js.Object {
  var children: Node
  var theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])
}

object ThemeProviderProps {
  @scala.inline
  def apply[Theme](
    theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]]),
    children: VdomNode = null
  ): ThemeProviderProps[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[Theme]]
  }
}

