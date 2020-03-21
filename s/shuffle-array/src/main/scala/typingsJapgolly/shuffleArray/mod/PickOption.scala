package typingsJapgolly.shuffleArray.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * picks - Specifies how many random elements you want to pick. By default it picks 1.
  * rng - Specifies a custom random number generator.
  */
trait PickOption extends js.Object {
  var picks: js.UndefOr[Double] = js.undefined
  var rng: js.UndefOr[js.Function0[Double]] = js.undefined
}

object PickOption {
  @scala.inline
  def apply(picks: Int | Double = null, rng: js.UndefOr[CallbackTo[Double]] = js.undefined): PickOption = {
    val __obj = js.Dynamic.literal()
    if (picks != null) __obj.updateDynamic("picks")(picks.asInstanceOf[js.Any])
    rng.foreach(p => __obj.updateDynamic("rng")(p.toJsFn))
    __obj.asInstanceOf[PickOption]
  }
}

