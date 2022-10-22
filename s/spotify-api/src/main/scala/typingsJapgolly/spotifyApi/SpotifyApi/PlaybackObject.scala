package typingsJapgolly.spotifyApi.SpotifyApi

import typingsJapgolly.spotifyApi.spotifyApiStrings.context
import typingsJapgolly.spotifyApi.spotifyApiStrings.off
import typingsJapgolly.spotifyApi.spotifyApiStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackObject extends StObject {
  
  var repeat_state: off | track | context
  
  var shuffle_state: Boolean
}
object PlaybackObject {
  
  inline def apply(repeat_state: off | track | context, shuffle_state: Boolean): PlaybackObject = {
    val __obj = js.Dynamic.literal(repeat_state = repeat_state.asInstanceOf[js.Any], shuffle_state = shuffle_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackObject]
  }
  
  extension [Self <: PlaybackObject](x: Self) {
    
    inline def setRepeat_state(value: off | track | context): Self = StObject.set(x, "repeat_state", value.asInstanceOf[js.Any])
    
    inline def setShuffle_state(value: Boolean): Self = StObject.set(x, "shuffle_state", value.asInstanceOf[js.Any])
  }
}
