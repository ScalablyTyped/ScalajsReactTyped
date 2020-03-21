package typingsJapgolly.aliApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ToTempFilePathOptions> */
trait PartialToTempFilePathOpti extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var destHeight: js.UndefOr[Double] = js.undefined
  var destWidth: js.UndefOr[Double] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object PartialToTempFilePathOpti {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    destHeight: Int | Double = null,
    destWidth: Int | Double = null,
    fail: /* res */ js.Any => Callback = null,
    height: Int | Double = null,
    success: /* res */ js.Any => Callback = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): PartialToTempFilePathOpti = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (destHeight != null) __obj.updateDynamic("destHeight")(destHeight.asInstanceOf[js.Any])
    if (destWidth != null) __obj.updateDynamic("destWidth")(destWidth.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialToTempFilePathOpti]
  }
}

