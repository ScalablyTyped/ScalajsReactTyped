package typingsJapgolly.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error object
  * [error object](https://developer.spotify.com/web-api/object-model/)
  */
trait ErrorObject extends StObject {
  
  /**
    * A short description of the cause of the error.
    */
  var message: String
  
  /**
    * The HTTP status code (also returned in the response header;
    * see [Response Status Codes](https://developer.spotify.com/documentation/web-api/#response-status-codes) for more information).
    */
  var status: Double
}
object ErrorObject {
  
  inline def apply(message: String, status: Double): ErrorObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorObject]
  }
  
  extension [Self <: ErrorObject](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
