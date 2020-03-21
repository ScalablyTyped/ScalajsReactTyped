package typingsJapgolly.bounceJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var loop: js.UndefOr[Boolean] = js.undefined
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    loop: js.UndefOr[Boolean] = js.undefined,
    onComplete: js.UndefOr[Callback] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    onComplete.foreach(p => __obj.updateDynamic("onComplete")(p.toJsFn))
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

