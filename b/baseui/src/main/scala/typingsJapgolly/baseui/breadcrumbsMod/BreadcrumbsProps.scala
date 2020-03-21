package typingsJapgolly.baseui.breadcrumbsMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var overrides: js.UndefOr[BreadcrumbsOverrides] = js.undefined
}

object BreadcrumbsProps {
  @scala.inline
  def apply(ariaLabel: String = null, children: VdomNode = null, overrides: BreadcrumbsOverrides = null): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsProps]
  }
}

