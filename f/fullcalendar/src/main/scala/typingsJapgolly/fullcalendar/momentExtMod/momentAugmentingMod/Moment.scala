package typingsJapgolly.fullcalendar.momentExtMod.momentAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fullcalendar.momentExtMod.MomentExtDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moment extends js.Object {
  def hasTime(): Boolean
  def stripTime(): js.Any
  def stripZone(): js.Any
  def time(): MomentExtDuration
}

object Moment {
  @scala.inline
  def apply(
    hasTime: CallbackTo[Boolean],
    stripTime: CallbackTo[js.Any],
    stripZone: CallbackTo[js.Any],
    time: CallbackTo[MomentExtDuration]
  ): Moment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasTime")(hasTime.toJsFn)
    __obj.updateDynamic("stripTime")(stripTime.toJsFn)
    __obj.updateDynamic("stripZone")(stripZone.toJsFn)
    __obj.updateDynamic("time")(time.toJsFn)
    __obj.asInstanceOf[Moment]
  }
}

