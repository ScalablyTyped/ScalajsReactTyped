package typingsJapgolly.novncCore.devicesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvKeyboardDefaults extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var onKeyPress: js.UndefOr[js.Function3[/* keysym */ String, /* code */ Double, /* down */ Boolean, Unit]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
}

object NvKeyboardDefaults {
  @scala.inline
  def apply(
    focused: js.UndefOr[Boolean] = js.undefined,
    onKeyPress: (/* keysym */ String, /* code */ Double, /* down */ Boolean) => Callback = null,
    target: Element = null
  ): NvKeyboardDefaults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction3((t0: /* keysym */ java.lang.String, t1: /* code */ scala.Double, t2: /* down */ scala.Boolean) => onKeyPress(t0, t1, t2).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NvKeyboardDefaults]
  }
}

