package typingsJapgolly.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueParameterObject extends StObject {
  
  var device_id: js.UndefOr[String] = js.undefined
}
object QueueParameterObject {
  
  inline def apply(): QueueParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueParameterObject]
  }
  
  extension [Self <: QueueParameterObject](x: Self) {
    
    inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    inline def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
  }
}
