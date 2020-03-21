package typingsJapgolly.pause.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handle extends js.Object {
  def end(): Unit
  def resume(): Unit
}

object Handle {
  @scala.inline
  def apply(end: Callback, resume: Callback): Handle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.asInstanceOf[Handle]
  }
}

