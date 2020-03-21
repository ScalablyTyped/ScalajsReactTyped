package typingsJapgolly.shuffleArray.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShuffleOption extends js.Object {
  var copy: js.UndefOr[Boolean] = js.undefined
  var rng: js.UndefOr[js.Function0[Double]] = js.undefined
}

object ShuffleOption {
  @scala.inline
  def apply(copy: js.UndefOr[Boolean] = js.undefined, rng: js.UndefOr[CallbackTo[Double]] = js.undefined): ShuffleOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    rng.foreach(p => __obj.updateDynamic("rng")(p.toJsFn))
    __obj.asInstanceOf[ShuffleOption]
  }
}

