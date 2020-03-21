package typingsJapgolly.reactElemental.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactElemental.AnonPrimary
import typingsJapgolly.reactElemental.AnonPrimaryDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementalProps extends js.Object {
  val children: Node
  val colorOpts: js.UndefOr[AnonPrimaryDark] = js.undefined
  val fontOpts: js.UndefOr[AnonPrimary] = js.undefined
}

object ElementalProps {
  @scala.inline
  def apply(children: VdomNode = null, colorOpts: AnonPrimaryDark = null, fontOpts: AnonPrimary = null): ElementalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (colorOpts != null) __obj.updateDynamic("colorOpts")(colorOpts.asInstanceOf[js.Any])
    if (fontOpts != null) __obj.updateDynamic("fontOpts")(fontOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementalProps]
  }
}

