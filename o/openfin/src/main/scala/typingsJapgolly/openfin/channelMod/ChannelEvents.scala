package typingsJapgolly.openfin.channelMod

import typingsJapgolly.openfin.eventsBaseMod.BaseEventMap
import typingsJapgolly.openfin.openfinStrings.connected
import typingsJapgolly.openfin.openfinStrings.disconnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEvents extends BaseEventMap {
  var connected: ChannelEvent[typingsJapgolly.openfin.openfinStrings.connected]
  var disconnected: ChannelEvent[typingsJapgolly.openfin.openfinStrings.disconnected]
}

object ChannelEvents {
  @scala.inline
  def apply(
    connected: ChannelEvent[connected],
    disconnected: ChannelEvent[disconnected],
    listenerRemoved: String,
    newListener: String
  ): ChannelEvents = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelEvents]
  }
}

