package typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsCardCardMetaMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.center
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictCardMetaProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A card meta can adjust its text alignment. */
  var textAlign: js.UndefOr[center | left | right] = js.undefined
}

object StrictCardMetaProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    textAlign: center | left | right = null
  ): StrictCardMetaProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictCardMetaProps]
  }
}

