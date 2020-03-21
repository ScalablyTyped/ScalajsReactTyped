package typingsJapgolly.pollyjsCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerEvent extends js.Object {
  val `type`: String
  def stopPropagation(): Unit
}

object ListenerEvent {
  @scala.inline
  def apply(stopPropagation: Callback, `type`: String): ListenerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerEvent]
  }
}

