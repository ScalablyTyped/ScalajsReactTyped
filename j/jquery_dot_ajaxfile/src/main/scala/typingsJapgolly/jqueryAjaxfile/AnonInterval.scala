package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterval extends js.Object {
  /**
    * The rate (in milliseconds) at which animations fire.
    */
  var interval: Double
  /**
    * Globally disable all animations.
    */
  var off: Boolean
  var speeds: AnonFast
  var step: js.Any
  def stop(): Unit
  def tick(): Unit
}

object AnonInterval {
  @scala.inline
  def apply(interval: Double, off: Boolean, speeds: AnonFast, step: js.Any, stop: Callback, tick: Callback): AnonInterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.updateDynamic("tick")(tick.toJsFn)
    __obj.asInstanceOf[AnonInterval]
  }
}

