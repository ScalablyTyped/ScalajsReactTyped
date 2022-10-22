package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.PrintToPDFRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.PrintToPDFResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypePrintToPDFResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[PrintToPDFRequest]]
  
  var returnType: PrintToPDFResponse
}
object ReturnTypePrintToPDFResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[PrintToPDFRequest]], returnType: PrintToPDFResponse): ReturnTypePrintToPDFResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePrintToPDFResponse]
  }
  
  extension [Self <: ReturnTypePrintToPDFResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[PrintToPDFRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[PrintToPDFRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: PrintToPDFResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
