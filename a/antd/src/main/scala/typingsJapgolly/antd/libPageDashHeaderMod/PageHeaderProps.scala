package typingsJapgolly.antd.libPageDashHeaderMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antd.libAvatarMod.AvatarProps
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderProps extends js.Object {
  var avatar: js.UndefOr[AvatarProps] = js.undefined
  var backIcon: js.UndefOr[Node] = js.undefined
  var breadcrumb: js.UndefOr[BreadcrumbProps] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[Node] = js.undefined
  var footer: js.UndefOr[Node] = js.undefined
  var ghost: js.UndefOr[Boolean] = js.undefined
  var onBack: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[Node] = js.undefined
  var tags: js.UndefOr[Element | js.Array[Element]] = js.undefined
  var title: Node
}

object PageHeaderProps {
  @scala.inline
  def apply(
    avatar: AvatarProps = null,
    backIcon: VdomNode = null,
    breadcrumb: BreadcrumbProps = null,
    className: String = null,
    extra: VdomNode = null,
    footer: VdomNode = null,
    ghost: js.UndefOr[Boolean] = js.undefined,
    onBack: /* e */ ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    subTitle: VdomNode = null,
    tags: Element | js.Array[Element] = null,
    title: VdomNode = null
  ): PageHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon.rawNode.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost.asInstanceOf[js.Any])
    if (onBack != null) __obj.updateDynamic("onBack")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onBack(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.rawNode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderProps]
  }
}

