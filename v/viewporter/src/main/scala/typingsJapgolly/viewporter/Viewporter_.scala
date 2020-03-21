package typingsJapgolly.viewporter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewporter_ extends js.Object {
  var ACTIVE: Boolean
  var READY: Boolean
  var forceDetection: Boolean
  var preventPageScroll: Boolean
  def change(callback: EventListener): Unit
  def isLandscape(): Boolean
  def ready(callback: EventListener): Unit
  def refresh(): Unit
}

object Viewporter_ {
  @scala.inline
  def apply(
    ACTIVE: Boolean,
    READY: Boolean,
    change: EventListener => Callback,
    forceDetection: Boolean,
    isLandscape: CallbackTo[Boolean],
    preventPageScroll: Boolean,
    ready: EventListener => Callback,
    refresh: Callback
  ): Viewporter_ = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], forceDetection = forceDetection.asInstanceOf[js.Any], preventPageScroll = preventPageScroll.asInstanceOf[js.Any])
    __obj.updateDynamic("change")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => change(t0).runNow()))
    __obj.updateDynamic("isLandscape")(isLandscape.toJsFn)
    __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => ready(t0).runNow()))
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.asInstanceOf[Viewporter_]
  }
}

