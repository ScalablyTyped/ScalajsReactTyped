package typingsJapgolly.openfin.windowMod

import typingsJapgolly.openfin.eventsBaseMod.WindowEvent
import typingsJapgolly.openfin.openfinStrings.`hide-on-close`
import typingsJapgolly.openfin.openfinStrings.closing
import typingsJapgolly.openfin.openfinStrings.hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowHiddenEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var reason: closing | hide | `hide-on-close`
}

object WindowHiddenEvent {
  @scala.inline
  def apply[Topic, Type](name: String, reason: closing | hide | `hide-on-close`, topic: Topic, `type`: Type, uuid: String): WindowHiddenEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHiddenEvent[Topic, Type]]
  }
}

