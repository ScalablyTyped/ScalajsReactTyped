package typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageListMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMessageListProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand Message.Items. */
  var items: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.undefined
}

object StrictMessageListProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    items: SemanticShorthandCollection[MessageItemProps] = null
  ): StrictMessageListProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictMessageListProps]
  }
}

