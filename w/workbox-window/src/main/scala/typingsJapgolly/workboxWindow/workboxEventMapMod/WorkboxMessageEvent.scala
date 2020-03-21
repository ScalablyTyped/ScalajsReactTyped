package typingsJapgolly.workboxWindow.workboxEventMapMod

import typingsJapgolly.std.Event_
import typingsJapgolly.workboxWindow.workboxEventMod.WorkboxEvent
import typingsJapgolly.workboxWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxMessageEvent extends WorkboxEvent {
  val data: js.Any
}

object WorkboxMessageEvent {
  @scala.inline
  def apply(data: js.Any, originalEvent: Event_, target: Workbox, `type`: String): WorkboxMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxMessageEvent]
  }
}

