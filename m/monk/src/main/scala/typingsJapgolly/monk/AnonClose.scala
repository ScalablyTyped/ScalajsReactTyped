package typingsJapgolly.monk

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  def close(): Unit
  def pause(): Unit
  def resume(): Unit
}

object AnonClose {
  @scala.inline
  def apply(close: Callback, pause: Callback, resume: Callback): AnonClose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.asInstanceOf[AnonClose]
  }
}

