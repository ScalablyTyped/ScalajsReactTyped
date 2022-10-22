package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorderErrorEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var error: org.scalajs.dom.DOMException
}
object MediaRecorderErrorEventInit {
  
  inline def apply(error: org.scalajs.dom.DOMException): MediaRecorderErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderErrorEventInit]
  }
  
  extension [Self <: MediaRecorderErrorEventInit](x: Self) {
    
    inline def setError(value: org.scalajs.dom.DOMException): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
