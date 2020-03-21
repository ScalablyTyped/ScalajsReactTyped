package typingsJapgolly.openfin.externalApplicationMod

import typingsJapgolly.openfin.eventsBaseMod.BaseEventMap
import typingsJapgolly.openfin.eventsBaseMod.RuntimeEvent
import typingsJapgolly.openfin.openfinStrings.connected
import typingsJapgolly.openfin.openfinStrings.disconnected
import typingsJapgolly.openfin.openfinStrings.externalapplication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalApplicationEvents extends BaseEventMap {
  var connected: RuntimeEvent[externalapplication, typingsJapgolly.openfin.openfinStrings.connected]
  var disconnected: RuntimeEvent[externalapplication, typingsJapgolly.openfin.openfinStrings.disconnected]
}

object ExternalApplicationEvents {
  @scala.inline
  def apply(
    connected: RuntimeEvent[externalapplication, connected],
    disconnected: RuntimeEvent[externalapplication, disconnected],
    listenerRemoved: String,
    newListener: String
  ): ExternalApplicationEvents = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExternalApplicationEvents]
  }
}

