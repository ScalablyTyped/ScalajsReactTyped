package typingsJapgolly.storybookComponents.tooltipLinkListMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.storybookComponents.listItemMod.LinkWrapperType
import typingsJapgolly.storybookComponents.listItemMod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link extends ListItemProps {
  var id: String = js.native
  var isGatsby: js.UndefOr[Boolean] = js.native
}

object Link {
  @scala.inline
  def apply(
    id: String,
    LinkWrapper: LinkWrapperType = null,
    active: js.UndefOr[Boolean] = js.undefined,
    center: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String | js.Object = null,
    isGatsby: js.UndefOr[Boolean] = js.undefined,
    left: VdomNode = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[Callback] = js.undefined,
    right: VdomNode = null,
    title: VdomNode = null
  ): Link = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(isGatsby)) __obj.updateDynamic("isGatsby")(isGatsby.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (right != null) __obj.updateDynamic("right")(right.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

