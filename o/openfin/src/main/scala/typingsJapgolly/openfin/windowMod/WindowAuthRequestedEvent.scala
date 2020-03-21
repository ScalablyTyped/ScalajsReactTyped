package typingsJapgolly.openfin.windowMod

import typingsJapgolly.openfin.AnonHost
import typingsJapgolly.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowAuthRequestedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var authInfo: AnonHost
}

object WindowAuthRequestedEvent {
  @scala.inline
  def apply[Topic, Type](authInfo: AnonHost, name: String, topic: Topic, `type`: Type, uuid: String): WindowAuthRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequestedEvent[Topic, Type]]
  }
}

