package typingsJapgolly.chromecastCafSender.cast.framework

import typingsJapgolly.chrome.chrome.cast.media.Media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSessionEventData
  extends StObject
     with EventData {
  
  var mediaSession: Media
}
object MediaSessionEventData {
  
  inline def apply(mediaSession: Media, `type`: String): MediaSessionEventData = {
    val __obj = js.Dynamic.literal(mediaSession = mediaSession.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionEventData]
  }
  
  extension [Self <: MediaSessionEventData](x: Self) {
    
    inline def setMediaSession(value: Media): Self = StObject.set(x, "mediaSession", value.asInstanceOf[js.Any])
  }
}
