package typingsJapgolly.asyncSema

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapacity extends js.Object {
  var capacity: js.UndefOr[Double] = js.undefined
  var initFn: js.UndefOr[js.Function0[_]] = js.undefined
  var pauseFn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resumeFn: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonCapacity {
  @scala.inline
  def apply(
    capacity: Int | Double = null,
    initFn: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    pauseFn: js.UndefOr[Callback] = js.undefined,
    resumeFn: js.UndefOr[Callback] = js.undefined
  ): AnonCapacity = {
    val __obj = js.Dynamic.literal()
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    initFn.foreach(p => __obj.updateDynamic("initFn")(p.toJsFn))
    pauseFn.foreach(p => __obj.updateDynamic("pauseFn")(p.toJsFn))
    resumeFn.foreach(p => __obj.updateDynamic("resumeFn")(p.toJsFn))
    __obj.asInstanceOf[AnonCapacity]
  }
}

