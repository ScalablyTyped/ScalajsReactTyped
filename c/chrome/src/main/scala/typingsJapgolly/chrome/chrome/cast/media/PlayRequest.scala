package typingsJapgolly.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayRequest extends StObject {
  
  var customData: js.Object
}
object PlayRequest {
  
  inline def apply(customData: js.Object): PlayRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayRequest]
  }
  
  extension [Self <: PlayRequest](x: Self) {
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
  }
}
