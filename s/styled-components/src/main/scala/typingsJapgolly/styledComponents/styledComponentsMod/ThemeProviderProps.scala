package typingsJapgolly.styledComponents.styledComponentsMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var theme: T | (js.Function1[/* theme */ U, T])
}

object ThemeProviderProps {
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](theme: T | (js.Function1[/* theme */ U, T]), children: VdomNode = null): ThemeProviderProps[T, U] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[T, U]]
  }
}

