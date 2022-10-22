package typingsJapgolly.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdReason extends StObject {
  
  var channelId: String
  
  var reason: js.UndefOr[String] = js.undefined
}
object ChannelIdReason {
  
  inline def apply(channelId: String): ChannelIdReason = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdReason]
  }
  
  extension [Self <: ChannelIdReason](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
