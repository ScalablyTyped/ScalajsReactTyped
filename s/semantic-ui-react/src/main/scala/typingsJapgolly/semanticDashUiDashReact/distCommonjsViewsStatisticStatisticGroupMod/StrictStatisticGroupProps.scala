package typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsStatisticStatisticGroupMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsStatisticStatisticMod.StatisticProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsStatisticStatisticMod.StatisticSizeProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictStatisticGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A statistic group can be formatted to be different colors. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A statistic group can present its measurement horizontally. */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /** A statistic group can present its measurement horizontally. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Array of props for Statistic. */
  var items: js.UndefOr[SemanticShorthandCollection[StatisticProps]] = js.undefined
  /** A statistic group can vary in size. */
  var size: js.UndefOr[StatisticSizeProp] = js.undefined
  /** A statistic group can have its items divided evenly. */
  var widths: js.UndefOr[SemanticWIDTHS] = js.undefined
}

object StrictStatisticGroupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    content: SemanticShorthandContent = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[StatisticProps] = null,
    size: StatisticSizeProp = null,
    widths: SemanticWIDTHS = null
  ): StrictStatisticGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictStatisticGroupProps]
  }
}

