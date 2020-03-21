package typingsJapgolly.inboxsdk

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreventDefault extends js.Object {
  def preventDefault(): Unit
}

object AnonPreventDefault {
  @scala.inline
  def apply(preventDefault: Callback): AnonPreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.asInstanceOf[AnonPreventDefault]
  }
}

