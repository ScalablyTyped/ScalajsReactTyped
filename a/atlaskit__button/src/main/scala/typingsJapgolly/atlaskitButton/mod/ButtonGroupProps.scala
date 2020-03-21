package typingsJapgolly.atlaskitButton.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  /** The appearance to apply to all buttons. */
  val appearance: js.UndefOr[ButtonAppearances] = js.undefined
  /** The buttons to render. */
  val children: Node
}

object ButtonGroupProps {
  @scala.inline
  def apply(appearance: ButtonAppearances = null, children: VdomNode = null): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

