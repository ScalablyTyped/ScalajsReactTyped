package typingsJapgolly.storybookAddonA11y.colorBlindnessMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var active: Boolean
  var id: String
  var right: js.UndefOr[Node] = js.undefined
  var title: Node
  def onClick(): Unit
}

object Link {
  @scala.inline
  def apply(active: Boolean, id: String, onClick: Callback, right: VdomNode = null, title: VdomNode = null): Link = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    if (right != null) __obj.updateDynamic("right")(right.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

