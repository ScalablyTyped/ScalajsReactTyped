package typingsJapgolly.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelEnteredBridge
  extends StObject
     with Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge
  
  /**
    * Channel.
    */
  var channel: Channel
}
object ChannelEnteredBridge {
  
  inline def apply(application: String, bridge: Bridge, channel: Channel, timestamp: js.Date, `type`: String): ChannelEnteredBridge = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEnteredBridge]
  }
  
  extension [Self <: ChannelEnteredBridge](x: Self) {
    
    inline def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
