package typingsJapgolly.rmcAlign.alignMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlignProps extends js.Object {
  var childrenProps: js.UndefOr[js.Object] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var monitorBufferTime: js.UndefOr[Double] = js.undefined
  var monitorWindowResize: js.UndefOr[Boolean] = js.undefined
  var onAlign: js.UndefOr[js.Function2[/* source */ js.Any, /* align */ js.Any, Unit]] = js.undefined
  def target(): Unit
}

object IAlignProps {
  @scala.inline
  def apply(
    target: Callback,
    childrenProps: js.Object = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    monitorBufferTime: Int | Double = null,
    monitorWindowResize: js.UndefOr[Boolean] = js.undefined,
    onAlign: (/* source */ js.Any, /* align */ js.Any) => Callback = null
  ): IAlignProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target.toJsFn)
    if (childrenProps != null) __obj.updateDynamic("childrenProps")(childrenProps.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (monitorBufferTime != null) __obj.updateDynamic("monitorBufferTime")(monitorBufferTime.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWindowResize)) __obj.updateDynamic("monitorWindowResize")(monitorWindowResize.asInstanceOf[js.Any])
    if (onAlign != null) __obj.updateDynamic("onAlign")(js.Any.fromFunction2((t0: /* source */ js.Any, t1: /* align */ js.Any) => onAlign(t0, t1).runNow()))
    __obj.asInstanceOf[IAlignProps]
  }
}

