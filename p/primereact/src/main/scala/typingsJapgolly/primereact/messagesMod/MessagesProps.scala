package typingsJapgolly.primereact.messagesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagesProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object MessagesProps {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    onClick: /* message */ Message => Callback = null,
    onRemove: /* message */ Message => Callback = null,
    style: js.Object = null
  ): MessagesProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.messagesMod.Message) => onClick(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.messagesMod.Message) => onRemove(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesProps]
  }
}

