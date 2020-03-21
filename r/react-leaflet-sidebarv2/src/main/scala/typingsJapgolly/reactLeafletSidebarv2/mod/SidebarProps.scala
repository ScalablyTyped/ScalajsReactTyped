package typingsJapgolly.reactLeafletSidebarv2.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var children: TabType
  var closeIcon: js.UndefOr[Icon] = js.undefined
  var collapsed: Boolean
  var id: String
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
  var position: Position
  var selected: String
}

object SidebarProps {
  @scala.inline
  def apply(
    children: TabType,
    collapsed: Boolean,
    id: String,
    position: Position,
    selected: String,
    closeIcon: Icon = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: /* id */ String => Callback = null
  ): SidebarProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* id */ java.lang.String) => onOpen(t0).runNow()))
    __obj.asInstanceOf[SidebarProps]
  }
}

