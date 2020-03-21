package typingsJapgolly.reactBootstrap.breadcrumbItemMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemProps extends Props[BreadcrumbItem] {
  var active: js.UndefOr[Boolean] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    href: String = null,
    key: Key = null,
    ref: LegacyRef[BreadcrumbItem] = null,
    target: String = null,
    title: VdomNode = null
  ): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
}

