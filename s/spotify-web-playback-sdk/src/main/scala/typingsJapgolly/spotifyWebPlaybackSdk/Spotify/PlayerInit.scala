package typingsJapgolly.spotifyWebPlaybackSdk.Spotify

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerInit extends StObject {
  
  def getOAuthToken(cb: js.Function1[/* token */ String, Unit]): Unit
  
  var name: String
  
  var volume: js.UndefOr[Double] = js.undefined
}
object PlayerInit {
  
  inline def apply(getOAuthToken: js.Function1[/* token */ String, Unit] => Callback, name: String): PlayerInit = {
    val __obj = js.Dynamic.literal(getOAuthToken = js.Any.fromFunction1((t0: js.Function1[/* token */ String, Unit]) => getOAuthToken(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerInit]
  }
  
  extension [Self <: PlayerInit](x: Self) {
    
    inline def setGetOAuthToken(value: js.Function1[/* token */ String, Unit] => Callback): Self = StObject.set(x, "getOAuthToken", js.Any.fromFunction1((t0: js.Function1[/* token */ String, Unit]) => value(t0).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
