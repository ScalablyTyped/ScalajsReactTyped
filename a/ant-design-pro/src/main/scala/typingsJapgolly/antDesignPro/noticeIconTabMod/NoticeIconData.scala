package typingsJapgolly.antDesignPro.noticeIconTabMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeIconData extends js.Object {
  var avatar: js.UndefOr[String | Node] = js.undefined
  var datetime: js.UndefOr[Node] = js.undefined
  var description: js.UndefOr[Node] = js.undefined
  var extra: js.UndefOr[Node] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object NoticeIconData {
  @scala.inline
  def apply(
    avatar: String | Node = null,
    datetime: VdomNode = null,
    description: VdomNode = null,
    extra: VdomNode = null,
    style: CSSProperties = null,
    title: VdomNode = null
  ): NoticeIconData = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.rawNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeIconData]
  }
}

