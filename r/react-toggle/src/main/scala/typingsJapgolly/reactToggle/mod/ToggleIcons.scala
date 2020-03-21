package typingsJapgolly.reactToggle.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleIcons extends js.Object {
  var checked: js.UndefOr[Node] = js.undefined
  var unchecked: js.UndefOr[Node] = js.undefined
}

object ToggleIcons {
  @scala.inline
  def apply(checked: VdomNode = null, unchecked: VdomNode = null): ToggleIcons = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.rawNode.asInstanceOf[js.Any])
    if (unchecked != null) __obj.updateDynamic("unchecked")(unchecked.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleIcons]
  }
}

