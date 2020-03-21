package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdd extends js.Object {
  def add(): Unit
}

object AnonAdd {
  @scala.inline
  def apply(add: Callback): AnonAdd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add.toJsFn)
    __obj.asInstanceOf[AnonAdd]
  }
}

