package typingsJapgolly.spotifyWebPlaybackSdk

import japgolly.scalajs.react.Callback
import typingsJapgolly.spotifyWebPlaybackSdk.anon.TypeofSpotify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var Spotify: TypeofSpotify
  
  def onSpotifyWebPlaybackSDKReady(): Unit
}
object Window {
  
  inline def apply(Spotify: TypeofSpotify, onSpotifyWebPlaybackSDKReady: Callback): Window = {
    val __obj = js.Dynamic.literal(Spotify = Spotify.asInstanceOf[js.Any], onSpotifyWebPlaybackSDKReady = onSpotifyWebPlaybackSDKReady.toJsFn)
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setOnSpotifyWebPlaybackSDKReady(value: Callback): Self = StObject.set(x, "onSpotifyWebPlaybackSDKReady", value.toJsFn)
    
    inline def setSpotify(value: TypeofSpotify): Self = StObject.set(x, "Spotify", value.asInstanceOf[js.Any])
  }
}
