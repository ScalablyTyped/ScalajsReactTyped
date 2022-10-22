package typingsJapgolly.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelHangupRequest
  extends StObject
     with Event {
  
  /**
    * Integer representation of the cause of the hangup.
    */
  var cause: Double
  
  /**
    * The channel on which the hangup was requested.
    */
  var channel: Channel
  
  /**
    * Whether the hangup request was a soft hangup request.
    */
  var soft: Boolean
}
object ChannelHangupRequest {
  
  inline def apply(
    application: String,
    cause: Double,
    channel: Channel,
    soft: Boolean,
    timestamp: js.Date,
    `type`: String
  ): ChannelHangupRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cause = cause.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], soft = soft.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHangupRequest]
  }
  
  extension [Self <: ChannelHangupRequest](x: Self) {
    
    inline def setCause(value: Double): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setSoft(value: Boolean): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
  }
}
