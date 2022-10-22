package typingsJapgolly.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPlaybackQualityChangeEvent
  extends StObject
     with PlayerEvent {
  
  /**
    * New playback quality.
    */
  var data: String
}
object OnPlaybackQualityChangeEvent {
  
  inline def apply(data: String, target: Player): OnPlaybackQualityChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPlaybackQualityChangeEvent]
  }
  
  extension [Self <: OnPlaybackQualityChangeEvent](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
