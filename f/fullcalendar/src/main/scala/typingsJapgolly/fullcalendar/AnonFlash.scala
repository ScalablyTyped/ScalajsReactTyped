package typingsJapgolly.fullcalendar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlash extends js.Object {
  def flash(): Unit
  def teardown(): Unit
}

object AnonFlash {
  @scala.inline
  def apply(flash: Callback, teardown: Callback): AnonFlash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flash")(flash.toJsFn)
    __obj.updateDynamic("teardown")(teardown.toJsFn)
    __obj.asInstanceOf[AnonFlash]
  }
}

