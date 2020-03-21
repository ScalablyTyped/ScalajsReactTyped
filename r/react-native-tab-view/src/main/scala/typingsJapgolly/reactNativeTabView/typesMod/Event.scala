package typingsJapgolly.reactNativeTabView.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var defaultPrevented: Boolean
  def preventDefault(): Unit
}

object Event {
  @scala.inline
  def apply(defaultPrevented: Boolean, preventDefault: Callback): Event = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.asInstanceOf[Event]
  }
}

