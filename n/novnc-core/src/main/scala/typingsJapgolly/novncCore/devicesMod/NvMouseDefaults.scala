package typingsJapgolly.novncCore.devicesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvMouseDefaults extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var onMouseButton: js.UndefOr[
    js.Function4[/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double, Unit]
  ] = js.undefined
  var onMouseMove: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var touchButton: js.UndefOr[Double] = js.undefined
}

object NvMouseDefaults {
  @scala.inline
  def apply(
    focused: js.UndefOr[Boolean] = js.undefined,
    onMouseButton: (/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double) => Callback = null,
    onMouseMove: (/* x */ Double, /* y */ Double) => Callback = null,
    target: Element = null,
    touchButton: Int | Double = null
  ): NvMouseDefaults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (onMouseButton != null) __obj.updateDynamic("onMouseButton")(js.Any.fromFunction4((t0: /* x */ scala.Double, t1: /* y */ scala.Double, t2: /* down */ scala.Boolean, t3: /* bmask */ scala.Double) => onMouseButton(t0, t1, t2, t3).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2((t0: /* x */ scala.Double, t1: /* y */ scala.Double) => onMouseMove(t0, t1).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (touchButton != null) __obj.updateDynamic("touchButton")(touchButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[NvMouseDefaults]
  }
}

