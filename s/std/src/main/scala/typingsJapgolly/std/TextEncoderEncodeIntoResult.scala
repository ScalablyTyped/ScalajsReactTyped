package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEncoderEncodeIntoResult extends StObject {
  
  /* standard dom */
  var read: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var written: js.UndefOr[Double] = js.undefined
}
object TextEncoderEncodeIntoResult {
  
  inline def apply(): TextEncoderEncodeIntoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncoderEncodeIntoResult]
  }
  
  extension [Self <: TextEncoderEncodeIntoResult](x: Self) {
    
    inline def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setWritten(value: Double): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
    
    inline def setWrittenUndefined: Self = StObject.set(x, "written", js.undefined)
  }
}
