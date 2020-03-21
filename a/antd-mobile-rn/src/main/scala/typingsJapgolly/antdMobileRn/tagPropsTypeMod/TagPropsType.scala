package typingsJapgolly.antdMobileRn.tagPropsTypeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagPropsType extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* selected */ Boolean, Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var small: js.UndefOr[Boolean] = js.undefined
}

object TagPropsType {
  @scala.inline
  def apply(
    afterClose: js.UndefOr[Callback] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* selected */ Boolean => Callback = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined
  ): TagPropsType = {
    val __obj = js.Dynamic.literal()
    afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* selected */ scala.Boolean) => onChange(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagPropsType]
  }
}

