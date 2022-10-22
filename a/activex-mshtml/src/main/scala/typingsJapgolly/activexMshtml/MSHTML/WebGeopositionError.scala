package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGeopositionError extends StObject {
  
  /* private */ @JSName("MSHTML.WebGeopositionError_typekey")
  var MSHTMLDotWebGeopositionError_typekey: WebGeopositionError
  
  val code: Double
  
  val message: String
}
object WebGeopositionError {
  
  inline def apply(MSHTMLDotWebGeopositionError_typekey: WebGeopositionError, code: Double, message: String): WebGeopositionError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeopositionError_typekey")(MSHTMLDotWebGeopositionError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeopositionError]
  }
  
  extension [Self <: WebGeopositionError](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotWebGeopositionError_typekey(value: WebGeopositionError): Self = StObject.set(x, "MSHTML.WebGeopositionError_typekey", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
