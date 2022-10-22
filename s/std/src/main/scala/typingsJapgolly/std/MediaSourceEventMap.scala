package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSourceEventMap extends StObject {
  
  /* standard dom */
  var sourceclose: org.scalajs.dom.Event
  
  /* standard dom */
  var sourceended: org.scalajs.dom.Event
  
  /* standard dom */
  var sourceopen: org.scalajs.dom.Event
}
object MediaSourceEventMap {
  
  inline def apply(
    sourceclose: org.scalajs.dom.Event,
    sourceended: org.scalajs.dom.Event,
    sourceopen: org.scalajs.dom.Event
  ): MediaSourceEventMap = {
    val __obj = js.Dynamic.literal(sourceclose = sourceclose.asInstanceOf[js.Any], sourceended = sourceended.asInstanceOf[js.Any], sourceopen = sourceopen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceEventMap]
  }
  
  extension [Self <: MediaSourceEventMap](x: Self) {
    
    inline def setSourceclose(value: org.scalajs.dom.Event): Self = StObject.set(x, "sourceclose", value.asInstanceOf[js.Any])
    
    inline def setSourceended(value: org.scalajs.dom.Event): Self = StObject.set(x, "sourceended", value.asInstanceOf[js.Any])
    
    inline def setSourceopen(value: org.scalajs.dom.Event): Self = StObject.set(x, "sourceopen", value.asInstanceOf[js.Any])
  }
}
