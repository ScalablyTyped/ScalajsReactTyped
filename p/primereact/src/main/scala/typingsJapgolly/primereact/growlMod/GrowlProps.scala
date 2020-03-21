package typingsJapgolly.primereact.growlMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrowlProps extends js.Object {
  var baseZIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* message */ GrowlMessage, Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* message */ GrowlMessage, Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* message */ GrowlMessage, Unit]] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object GrowlProps {
  @scala.inline
  def apply(
    baseZIndex: Int | Double = null,
    className: String = null,
    id: String = null,
    onClick: /* message */ GrowlMessage => Callback = null,
    onClose: /* message */ GrowlMessage => Callback = null,
    onRemove: /* message */ GrowlMessage => Callback = null,
    position: String = null,
    style: js.Object = null
  ): GrowlProps = {
    val __obj = js.Dynamic.literal()
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.growlMod.GrowlMessage) => onClick(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.growlMod.GrowlMessage) => onClose(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.growlMod.GrowlMessage) => onRemove(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrowlProps]
  }
}

