package typingsJapgolly.reactToolbox.listListItemContentMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactToolbox.reactToolboxStrings.auto
import typingsJapgolly.reactToolbox.reactToolboxStrings.large
import typingsJapgolly.reactToolbox.reactToolboxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemContentProps extends js.Object {
  /**
    * Main text of the item.
    */
  var caption: js.UndefOr[Node] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[Node] = js.undefined
  /**
    * Secondary text to display under the caption.
    */
  var legend: js.UndefOr[String] = js.undefined
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemContentTheme] = js.undefined
  /**
    * List item content type.
    */
  var `type`: js.UndefOr[auto | normal | large] = js.undefined
}

object ListItemContentProps {
  @scala.inline
  def apply(
    caption: VdomNode = null,
    children: VdomNode = null,
    legend: String = null,
    theme: ListItemContentTheme = null,
    `type`: auto | normal | large = null
  ): ListItemContentProps = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.rawNode.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemContentProps]
  }
}

