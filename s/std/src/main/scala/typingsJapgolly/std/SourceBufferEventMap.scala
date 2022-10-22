package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceBufferEventMap extends StObject {
  
  /* standard dom */
  var abort: org.scalajs.dom.Event
  
  /* standard dom */
  var error: org.scalajs.dom.Event
  
  /* standard dom */
  var update: org.scalajs.dom.Event
  
  /* standard dom */
  var updateend: org.scalajs.dom.Event
  
  /* standard dom */
  var updatestart: org.scalajs.dom.Event
}
object SourceBufferEventMap {
  
  inline def apply(
    abort: org.scalajs.dom.Event,
    error: org.scalajs.dom.Event,
    update: org.scalajs.dom.Event,
    updateend: org.scalajs.dom.Event,
    updatestart: org.scalajs.dom.Event
  ): SourceBufferEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateend = updateend.asInstanceOf[js.Any], updatestart = updatestart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferEventMap]
  }
  
  extension [Self <: SourceBufferEventMap](x: Self) {
    
    inline def setAbort(value: org.scalajs.dom.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: org.scalajs.dom.Event): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateend(value: org.scalajs.dom.Event): Self = StObject.set(x, "updateend", value.asInstanceOf[js.Any])
    
    inline def setUpdatestart(value: org.scalajs.dom.Event): Self = StObject.set(x, "updatestart", value.asInstanceOf[js.Any])
  }
}
