package typingsJapgolly.antDesignProLayout

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlankTarget extends js.Object {
  var blankTarget: js.UndefOr[Boolean] = js.undefined
  var href: String
  var key: js.UndefOr[String] = js.undefined
  var title: Node
}

object AnonBlankTarget {
  @scala.inline
  def apply(
    href: String,
    blankTarget: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    title: VdomNode = null
  ): AnonBlankTarget = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (!js.isUndefined(blankTarget)) __obj.updateDynamic("blankTarget")(blankTarget.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlankTarget]
  }
}

