package typingsJapgolly.semanticUiReact.dimmerDimmableMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictDimmerDimmableProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A dimmable element can blur its contents. */
  var blurring: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Controls whether or not the dim is displayed. */
  var dimmed: js.UndefOr[Boolean] = js.undefined
}

object StrictDimmerDimmableProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    blurring: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    dimmed: js.UndefOr[Boolean] = js.undefined
  ): StrictDimmerDimmableProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(blurring)) __obj.updateDynamic("blurring")(blurring.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dimmed)) __obj.updateDynamic("dimmed")(dimmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictDimmerDimmableProps]
  }
}

