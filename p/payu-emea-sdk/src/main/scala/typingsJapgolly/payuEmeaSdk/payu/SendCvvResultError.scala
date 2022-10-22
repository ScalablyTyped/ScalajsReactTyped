package typingsJapgolly.payuEmeaSdk.payu

import typingsJapgolly.payuEmeaSdk.anon.Messages
import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendCvvResultError extends StObject {
  
  var correlationId: js.UndefOr[String] = js.undefined
  
  var error: Messages
  
  var status: ERROR
}
object SendCvvResultError {
  
  inline def apply(error: Messages): SendCvvResultError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = "ERROR")
    __obj.asInstanceOf[SendCvvResultError]
  }
  
  extension [Self <: SendCvvResultError](x: Self) {
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setError(value: Messages): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ERROR): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
