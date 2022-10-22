package typingsJapgolly.deezerSdk.DeezerSdk

import typingsJapgolly.deezerSdk.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/ready | DZ.ready}
  */
trait SdkOptions extends StObject {
  
  /**
    * In addition to the PlayerState properties,
    * {@link https://developers.deezer.com/sdk/javascript/ready | DZ.ready} also documents the
    * property current_track, but the author of this comment was not able no retrieve it.
    */
  val player: PlayerState
  
  val token: Accesstoken
}
object SdkOptions {
  
  inline def apply(player: PlayerState, token: Accesstoken): SdkOptions = {
    val __obj = js.Dynamic.literal(player = player.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkOptions]
  }
  
  extension [Self <: SdkOptions](x: Self) {
    
    inline def setPlayer(value: PlayerState): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setToken(value: Accesstoken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
