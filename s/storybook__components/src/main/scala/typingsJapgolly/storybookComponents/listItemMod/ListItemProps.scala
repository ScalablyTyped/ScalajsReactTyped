package typingsJapgolly.storybookComponents.listItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps extends js.Object {
  var LinkWrapper: js.UndefOr[LinkWrapperType] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var center: js.UndefOr[Node] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var href: js.UndefOr[String | js.Object] = js.native
  var left: js.UndefOr[Node] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var right: js.UndefOr[Node] = js.native
  var title: js.UndefOr[Node] = js.native
}

object ListItemProps {
  @scala.inline
  def apply(
    LinkWrapper: LinkWrapperType = null,
    active: js.UndefOr[Boolean] = js.undefined,
    center: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String | js.Object = null,
    left: VdomNode = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onClick: js.UndefOr[Callback] = js.undefined,
    right: VdomNode = null,
    title: VdomNode = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (right != null) __obj.updateDynamic("right")(right.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

