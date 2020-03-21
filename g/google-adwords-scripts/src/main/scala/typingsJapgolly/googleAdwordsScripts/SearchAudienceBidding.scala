package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAudienceBidding extends canSetBidModifier {
  def clearBidModifier(): Unit
}

object SearchAudienceBidding {
  @scala.inline
  def apply(clearBidModifier: Callback, getBidModifier: CallbackTo[Double], setBidModifier: Double => Callback): SearchAudienceBidding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearBidModifier")(clearBidModifier.toJsFn)
    __obj.updateDynamic("getBidModifier")(getBidModifier.toJsFn)
    __obj.updateDynamic("setBidModifier")(js.Any.fromFunction1((t0: scala.Double) => setBidModifier(t0).runNow()))
    __obj.asInstanceOf[SearchAudienceBidding]
  }
}

