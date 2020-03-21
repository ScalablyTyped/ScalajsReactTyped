package typingsJapgolly.reactNativeElements.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[T] extends js.Object {
  var children: Node
  var theme: js.UndefOr[Theme[T]] = js.undefined
}

object ThemeProviderProps {
  @scala.inline
  def apply[T](children: VdomNode = null, theme: Theme[T] = null): ThemeProviderProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[T]]
  }
}

