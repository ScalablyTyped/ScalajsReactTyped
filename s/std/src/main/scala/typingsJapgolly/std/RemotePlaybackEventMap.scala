package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemotePlaybackEventMap extends StObject {
  
  /* standard dom */
  var connect: org.scalajs.dom.Event
  
  /* standard dom */
  var connecting: org.scalajs.dom.Event
  
  /* standard dom */
  var disconnect: org.scalajs.dom.Event
}
object RemotePlaybackEventMap {
  
  inline def apply(
    connect: org.scalajs.dom.Event,
    connecting: org.scalajs.dom.Event,
    disconnect: org.scalajs.dom.Event
  ): RemotePlaybackEventMap = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], disconnect = disconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemotePlaybackEventMap]
  }
  
  extension [Self <: RemotePlaybackEventMap](x: Self) {
    
    inline def setConnect(value: org.scalajs.dom.Event): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnecting(value: org.scalajs.dom.Event): Self = StObject.set(x, "connecting", value.asInstanceOf[js.Any])
    
    inline def setDisconnect(value: org.scalajs.dom.Event): Self = StObject.set(x, "disconnect", value.asInstanceOf[js.Any])
  }
}
