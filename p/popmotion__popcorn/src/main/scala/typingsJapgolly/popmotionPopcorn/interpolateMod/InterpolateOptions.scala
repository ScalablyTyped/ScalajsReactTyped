package typingsJapgolly.popmotionPopcorn.interpolateMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolateOptions[T] extends js.Object {
  var clamp: js.UndefOr[Boolean] = js.undefined
  var ease: js.UndefOr[MixEasing] = js.undefined
  var mixer: js.UndefOr[MixerFactory[T]] = js.undefined
}

object InterpolateOptions {
  @scala.inline
  def apply[T](
    clamp: js.UndefOr[Boolean] = js.undefined,
    ease: MixEasing = null,
    mixer: (T, T) => CallbackTo[Mix[T]] = null
  ): InterpolateOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (mixer != null) __obj.updateDynamic("mixer")(js.Any.fromFunction2((t0: T, t1: T) => mixer(t0, t1).runNow()))
    __obj.asInstanceOf[InterpolateOptions[T]]
  }
}

