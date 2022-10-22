package typingsJapgolly.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictionsObject extends StObject {
  
  var reason: String
}
object RestrictionsObject {
  
  inline def apply(reason: String): RestrictionsObject = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictionsObject]
  }
  
  extension [Self <: RestrictionsObject](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
