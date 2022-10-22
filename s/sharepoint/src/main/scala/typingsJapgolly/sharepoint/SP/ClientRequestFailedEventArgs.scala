package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.EventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequestFailedEventArgs
  extends StObject
     with ClientRequestEventArgs {
  
  def get_errorCode(): Double
  
  def get_errorDetails(): Any
  
  def get_errorTraceCorrelationId(): String
  
  def get_errorTypeName(): String
  
  def get_errorValue(): String
  
  def get_message(): String
  
  def get_stackTrace(): String
}
object ClientRequestFailedEventArgs {
  
  inline def apply(
    Empty: EventArgs,
    get_errorCode: CallbackTo[Double],
    get_errorDetails: CallbackTo[Any],
    get_errorTraceCorrelationId: CallbackTo[String],
    get_errorTypeName: CallbackTo[String],
    get_errorValue: CallbackTo[String],
    get_message: CallbackTo[String],
    get_request: CallbackTo[ClientRequest],
    get_stackTrace: CallbackTo[String]
  ): ClientRequestFailedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_errorCode = get_errorCode.toJsFn, get_errorDetails = get_errorDetails.toJsFn, get_errorTraceCorrelationId = get_errorTraceCorrelationId.toJsFn, get_errorTypeName = get_errorTypeName.toJsFn, get_errorValue = get_errorValue.toJsFn, get_message = get_message.toJsFn, get_request = get_request.toJsFn, get_stackTrace = get_stackTrace.toJsFn)
    __obj.asInstanceOf[ClientRequestFailedEventArgs]
  }
  
  extension [Self <: ClientRequestFailedEventArgs](x: Self) {
    
    inline def setGet_errorCode(value: CallbackTo[Double]): Self = StObject.set(x, "get_errorCode", value.toJsFn)
    
    inline def setGet_errorDetails(value: CallbackTo[Any]): Self = StObject.set(x, "get_errorDetails", value.toJsFn)
    
    inline def setGet_errorTraceCorrelationId(value: CallbackTo[String]): Self = StObject.set(x, "get_errorTraceCorrelationId", value.toJsFn)
    
    inline def setGet_errorTypeName(value: CallbackTo[String]): Self = StObject.set(x, "get_errorTypeName", value.toJsFn)
    
    inline def setGet_errorValue(value: CallbackTo[String]): Self = StObject.set(x, "get_errorValue", value.toJsFn)
    
    inline def setGet_message(value: CallbackTo[String]): Self = StObject.set(x, "get_message", value.toJsFn)
    
    inline def setGet_stackTrace(value: CallbackTo[String]): Self = StObject.set(x, "get_stackTrace", value.toJsFn)
  }
}
