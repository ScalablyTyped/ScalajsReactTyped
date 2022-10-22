package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpCodingParameters extends StObject {
  
  /* standard dom */
  var rid: js.UndefOr[java.lang.String] = js.undefined
}
object RTCRtpCodingParameters {
  
  inline def apply(): RTCRtpCodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpCodingParameters]
  }
  
  extension [Self <: RTCRtpCodingParameters](x: Self) {
    
    inline def setRid(value: java.lang.String): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setRidUndefined: Self = StObject.set(x, "rid", js.undefined)
  }
}
