package typingsJapgolly.antd.libResultMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[Node] = js.undefined
  var icon: js.UndefOr[Node] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[ResultStatusType] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[Node] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object ResultProps {
  @scala.inline
  def apply(
    className: String = null,
    extra: VdomNode = null,
    icon: VdomNode = null,
    prefixCls: String = null,
    status: ResultStatusType = null,
    style: CSSProperties = null,
    subTitle: VdomNode = null,
    title: VdomNode = null
  ): ResultProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultProps]
  }
}

