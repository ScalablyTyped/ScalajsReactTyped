package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait canSetBidModifier extends js.Object {
  def getBidModifier(): Double
  def setBidModifier(modifier: Double): Unit
}

object canSetBidModifier {
  @scala.inline
  def apply(getBidModifier: CallbackTo[Double], setBidModifier: Double => Callback): canSetBidModifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBidModifier")(getBidModifier.toJsFn)
    __obj.updateDynamic("setBidModifier")(js.Any.fromFunction1((t0: scala.Double) => setBidModifier(t0).runNow()))
    __obj.asInstanceOf[canSetBidModifier]
  }
}

