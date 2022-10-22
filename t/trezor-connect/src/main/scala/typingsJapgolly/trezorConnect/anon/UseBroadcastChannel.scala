package typingsJapgolly.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseBroadcastChannel extends StObject {
  
  var useBroadcastChannel: Boolean
}
object UseBroadcastChannel {
  
  inline def apply(useBroadcastChannel: Boolean): UseBroadcastChannel = {
    val __obj = js.Dynamic.literal(useBroadcastChannel = useBroadcastChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseBroadcastChannel]
  }
  
  extension [Self <: UseBroadcastChannel](x: Self) {
    
    inline def setUseBroadcastChannel(value: Boolean): Self = StObject.set(x, "useBroadcastChannel", value.asInstanceOf[js.Any])
  }
}
