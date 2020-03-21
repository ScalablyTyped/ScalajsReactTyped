package typingsJapgolly.antDesignPro.countDownMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICountDownProps extends js.Object {
  var format: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var target: js.Date | Double
}

object ICountDownProps {
  @scala.inline
  def apply(
    target: js.Date | Double,
    format: /* time */ Double => Callback = null,
    onEnd: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null
  ): ICountDownProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1((t0: /* time */ scala.Double) => format(t0).runNow()))
    onEnd.foreach(p => __obj.updateDynamic("onEnd")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICountDownProps]
  }
}

