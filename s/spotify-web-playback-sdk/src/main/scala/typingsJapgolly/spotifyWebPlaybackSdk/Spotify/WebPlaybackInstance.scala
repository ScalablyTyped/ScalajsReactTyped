package typingsJapgolly.spotifyWebPlaybackSdk.Spotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebPlaybackInstance extends StObject {
  
  var device_id: String
}
object WebPlaybackInstance {
  
  inline def apply(device_id: String): WebPlaybackInstance = {
    val __obj = js.Dynamic.literal(device_id = device_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPlaybackInstance]
  }
  
  extension [Self <: WebPlaybackInstance](x: Self) {
    
    inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
  }
}
