package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionHandlingScope extends StObject {
  
  def get_errorMessage(): String
  
  def get_hasException(): Boolean
  
  def get_processed(): Boolean
  
  def get_serverErrorCode(): Double
  
  def get_serverErrorDetails(): Any
  
  def get_serverErrorTypeName(): String
  
  def get_serverErrorValue(): String
  
  def get_serverStackTrace(): String
  
  def startCatch(): Any
  
  def startFinally(): Any
  
  def startScope(): Any
  
  def startTry(): Any
}
object ExceptionHandlingScope {
  
  inline def apply(
    get_errorMessage: CallbackTo[String],
    get_hasException: CallbackTo[Boolean],
    get_processed: CallbackTo[Boolean],
    get_serverErrorCode: CallbackTo[Double],
    get_serverErrorDetails: CallbackTo[Any],
    get_serverErrorTypeName: CallbackTo[String],
    get_serverErrorValue: CallbackTo[String],
    get_serverStackTrace: CallbackTo[String],
    startCatch: CallbackTo[Any],
    startFinally: CallbackTo[Any],
    startScope: CallbackTo[Any],
    startTry: CallbackTo[Any]
  ): ExceptionHandlingScope = {
    val __obj = js.Dynamic.literal(get_errorMessage = get_errorMessage.toJsFn, get_hasException = get_hasException.toJsFn, get_processed = get_processed.toJsFn, get_serverErrorCode = get_serverErrorCode.toJsFn, get_serverErrorDetails = get_serverErrorDetails.toJsFn, get_serverErrorTypeName = get_serverErrorTypeName.toJsFn, get_serverErrorValue = get_serverErrorValue.toJsFn, get_serverStackTrace = get_serverStackTrace.toJsFn, startCatch = startCatch.toJsFn, startFinally = startFinally.toJsFn, startScope = startScope.toJsFn, startTry = startTry.toJsFn)
    __obj.asInstanceOf[ExceptionHandlingScope]
  }
  
  extension [Self <: ExceptionHandlingScope](x: Self) {
    
    inline def setGet_errorMessage(value: CallbackTo[String]): Self = StObject.set(x, "get_errorMessage", value.toJsFn)
    
    inline def setGet_hasException(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_hasException", value.toJsFn)
    
    inline def setGet_processed(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_processed", value.toJsFn)
    
    inline def setGet_serverErrorCode(value: CallbackTo[Double]): Self = StObject.set(x, "get_serverErrorCode", value.toJsFn)
    
    inline def setGet_serverErrorDetails(value: CallbackTo[Any]): Self = StObject.set(x, "get_serverErrorDetails", value.toJsFn)
    
    inline def setGet_serverErrorTypeName(value: CallbackTo[String]): Self = StObject.set(x, "get_serverErrorTypeName", value.toJsFn)
    
    inline def setGet_serverErrorValue(value: CallbackTo[String]): Self = StObject.set(x, "get_serverErrorValue", value.toJsFn)
    
    inline def setGet_serverStackTrace(value: CallbackTo[String]): Self = StObject.set(x, "get_serverStackTrace", value.toJsFn)
    
    inline def setStartCatch(value: CallbackTo[Any]): Self = StObject.set(x, "startCatch", value.toJsFn)
    
    inline def setStartFinally(value: CallbackTo[Any]): Self = StObject.set(x, "startFinally", value.toJsFn)
    
    inline def setStartScope(value: CallbackTo[Any]): Self = StObject.set(x, "startScope", value.toJsFn)
    
    inline def setStartTry(value: CallbackTo[Any]): Self = StObject.set(x, "startTry", value.toJsFn)
  }
}
