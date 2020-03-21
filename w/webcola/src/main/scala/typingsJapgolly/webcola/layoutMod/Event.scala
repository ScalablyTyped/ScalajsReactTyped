package typingsJapgolly.webcola.layoutMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var alpha: Double
  var listener: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stress: js.UndefOr[Double] = js.undefined
  var `type`: EventType
}

object Event {
  @scala.inline
  def apply(
    alpha: Double,
    `type`: EventType,
    listener: js.UndefOr[Callback] = js.undefined,
    stress: Int | Double = null
  ): Event = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    listener.foreach(p => __obj.updateDynamic("listener")(p.toJsFn))
    if (stress != null) __obj.updateDynamic("stress")(stress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

