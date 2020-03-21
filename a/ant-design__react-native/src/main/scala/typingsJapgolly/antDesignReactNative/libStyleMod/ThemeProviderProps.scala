package typingsJapgolly.antDesignReactNative.libStyleMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[PartialTheme] = js.undefined
}

object ThemeProviderProps {
  @scala.inline
  def apply(children: VdomNode = null, value: PartialTheme = null): ThemeProviderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps]
  }
}

