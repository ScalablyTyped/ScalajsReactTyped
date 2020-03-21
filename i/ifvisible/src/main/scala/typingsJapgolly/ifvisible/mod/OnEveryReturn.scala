package typingsJapgolly.ifvisible.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEveryReturn extends js.Object {
  /**
    * Timer Id of setInterval
    */
  var code: Double
  /**
    * Callback function you passed to onEvery
    */
  def callback(): Unit
  /**
    * Pauses the interval, it's resumable
    */
  def pause(): Boolean
  /**
    * Resumes paused interval
    */
  def resume(): Boolean
  /**
    * Stop the interval, you cannot resume
    */
  def stop(): Boolean
}

object OnEveryReturn {
  @scala.inline
  def apply(
    callback: Callback,
    code: Double,
    pause: CallbackTo[Boolean],
    resume: CallbackTo[Boolean],
    stop: CallbackTo[Boolean]
  ): OnEveryReturn = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[OnEveryReturn]
  }
}

