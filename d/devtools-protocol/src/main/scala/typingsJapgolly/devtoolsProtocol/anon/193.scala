package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Security.SetOverrideCertificateErrorsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  var paramsType: js.Array[SetOverrideCertificateErrorsRequest]
  
  var returnType: Unit
}
object `193` {
  
  inline def apply(paramsType: js.Array[SetOverrideCertificateErrorsRequest], returnType: Unit): `193` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`193`]
  }
  
  extension [Self <: `193`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetOverrideCertificateErrorsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetOverrideCertificateErrorsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
