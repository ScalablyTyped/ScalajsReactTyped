package typingsJapgolly.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusCode extends StObject {
  
  var statusCode: Double
  
  var tempFilePath: js.UndefOr[String] = js.undefined
}
object StatusCode {
  
  inline def apply(statusCode: Double): StatusCode = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCode]
  }
  
  extension [Self <: StatusCode](x: Self) {
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    inline def setTempFilePathUndefined: Self = StObject.set(x, "tempFilePath", js.undefined)
  }
}
