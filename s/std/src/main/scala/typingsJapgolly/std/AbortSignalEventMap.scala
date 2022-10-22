package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortSignalEventMap extends StObject {
  
  /* standard dom */
  var abort: org.scalajs.dom.Event
}
object AbortSignalEventMap {
  
  inline def apply(abort: org.scalajs.dom.Event): AbortSignalEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortSignalEventMap]
  }
  
  extension [Self <: AbortSignalEventMap](x: Self) {
    
    inline def setAbort(value: org.scalajs.dom.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
  }
}
