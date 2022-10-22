package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.ExceptionDetails
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateOnCallFrameResponse extends StObject {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Object wrapper for the evaluation result.
    */
  var result: RemoteObject
}
object EvaluateOnCallFrameResponse {
  
  inline def apply(result: RemoteObject): EvaluateOnCallFrameResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnCallFrameResponse]
  }
  
  extension [Self <: EvaluateOnCallFrameResponse](x: Self) {
    
    inline def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    inline def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    inline def setResult(value: RemoteObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
