package typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsRailRailMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.big
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRailProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A rail can appear attached to the main viewport. */
  var attached: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A rail can appear closer to the main viewport. */
  var close: js.UndefOr[Boolean | very] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A rail can create a division between itself and a container. */
  var dividing: js.UndefOr[Boolean] = js.undefined
  /** A rail can attach itself to the inside of a container. */
  var internal: js.UndefOr[Boolean] = js.undefined
  /** A rail can be presented on the left or right side of a container. */
  var position: SemanticFLOATS
  /** A rail can have different sizes. */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.undefined
}

object StrictRailProps {
  @scala.inline
  def apply(
    position: SemanticFLOATS,
    as: js.Any = null,
    attached: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    close: Boolean | very = null,
    content: SemanticShorthandContent = null,
    dividing: js.UndefOr[Boolean] = js.undefined,
    internal: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null
  ): StrictRailProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(attached)) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dividing)) __obj.updateDynamic("dividing")(dividing.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRailProps]
  }
}

