package typingsJapgolly.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSources extends StObject {
  
  var sourceId: String
}
object MediaSources {
  
  inline def apply(sourceId: String): MediaSources = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSources]
  }
  
  extension [Self <: MediaSources](x: Self) {
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
