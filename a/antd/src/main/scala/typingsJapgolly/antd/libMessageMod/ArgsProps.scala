package typingsJapgolly.antd.libMessageMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var content: Node
  var duration: Double | Null
  var icon: js.UndefOr[Node] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: NoticeType
}

object ArgsProps {
  @scala.inline
  def apply(
    content: VdomNode,
    `type`: NoticeType,
    duration: Int | Double = null,
    icon: VdomNode = null,
    key: String | Double = null,
    onClose: js.UndefOr[Callback] = js.undefined
  ): ArgsProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    __obj.asInstanceOf[ArgsProps]
  }
}

