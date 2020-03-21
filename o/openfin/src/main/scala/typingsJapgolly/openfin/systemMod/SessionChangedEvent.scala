package typingsJapgolly.openfin.systemMod

import typingsJapgolly.openfin.eventsBaseMod.BaseEvent
import typingsJapgolly.openfin.openfinStrings.`remote-connect`
import typingsJapgolly.openfin.openfinStrings.`remote-disconnect`
import typingsJapgolly.openfin.openfinStrings.lock
import typingsJapgolly.openfin.openfinStrings.unknown
import typingsJapgolly.openfin.openfinStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionChangedEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown
}

object SessionChangedEvent {
  @scala.inline
  def apply[Topic, Type](
    reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown,
    topic: Topic,
    `type`: Type
  ): SessionChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChangedEvent[Topic, Type]]
  }
}

