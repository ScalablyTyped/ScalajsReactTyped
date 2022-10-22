package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDTMFToneChangeEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var tone: js.UndefOr[java.lang.String] = js.undefined
}
object RTCDTMFToneChangeEventInit {
  
  inline def apply(): RTCDTMFToneChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDTMFToneChangeEventInit]
  }
  
  extension [Self <: RTCDTMFToneChangeEventInit](x: Self) {
    
    inline def setTone(value: java.lang.String): Self = StObject.set(x, "tone", value.asInstanceOf[js.Any])
    
    inline def setToneUndefined: Self = StObject.set(x, "tone", js.undefined)
  }
}
