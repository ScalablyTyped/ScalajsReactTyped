package typingsJapgolly.popmotion

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<popmotion.popmotion/lib/action/types.ColdSubscription> */
trait PartialColdSubscription extends js.Object {
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialColdSubscription {
  @scala.inline
  def apply(stop: js.UndefOr[Callback] = js.undefined): PartialColdSubscription = {
    val __obj = js.Dynamic.literal()
    stop.foreach(p => __obj.updateDynamic("stop")(p.toJsFn))
    __obj.asInstanceOf[PartialColdSubscription]
  }
}

