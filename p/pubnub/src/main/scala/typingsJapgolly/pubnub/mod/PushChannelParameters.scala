package typingsJapgolly.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushChannelParameters extends StObject {
  
  var channels: js.Array[String]
  
  var device: String
  
  var pushGateway: String
}
object PushChannelParameters {
  
  inline def apply(channels: js.Array[String], device: String, pushGateway: String): PushChannelParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], pushGateway = pushGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushChannelParameters]
  }
  
  extension [Self <: PushChannelParameters](x: Self) {
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setPushGateway(value: String): Self = StObject.set(x, "pushGateway", value.asInstanceOf[js.Any])
  }
}
