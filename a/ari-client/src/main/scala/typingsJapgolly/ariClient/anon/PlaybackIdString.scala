package typingsJapgolly.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackIdString extends StObject {
  
  var playbackId: String
}
object PlaybackIdString {
  
  inline def apply(playbackId: String): PlaybackIdString = {
    val __obj = js.Dynamic.literal(playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackIdString]
  }
  
  extension [Self <: PlaybackIdString](x: Self) {
    
    inline def setPlaybackId(value: String): Self = StObject.set(x, "playbackId", value.asInstanceOf[js.Any])
  }
}
