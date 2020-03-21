package typingsJapgolly.antDesignPro.avatarItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarItemProps extends js.Object {
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var src: String
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tips: Node
}

object AvatarItemProps {
  @scala.inline
  def apply(
    src: String,
    onClick: js.UndefOr[Callback] = js.undefined,
    size: SizeType = null,
    style: CSSProperties = null,
    tips: VdomNode = null
  ): AvatarItemProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tips != null) __obj.updateDynamic("tips")(tips.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarItemProps]
  }
}

