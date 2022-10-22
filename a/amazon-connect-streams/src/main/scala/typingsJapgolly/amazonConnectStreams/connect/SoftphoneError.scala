package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftphoneError extends StObject {
  
  val endPointUrl: String
  
  val errorMessage: String
  
  val errorType: String
  
  def getEndPointUrl(): String
  
  def getErrorMessage(): String
  
  def getErrorType(): String
}
object SoftphoneError {
  
  inline def apply(
    endPointUrl: String,
    errorMessage: String,
    errorType: String,
    getEndPointUrl: CallbackTo[String],
    getErrorMessage: CallbackTo[String],
    getErrorType: CallbackTo[String]
  ): SoftphoneError = {
    val __obj = js.Dynamic.literal(endPointUrl = endPointUrl.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], getEndPointUrl = getEndPointUrl.toJsFn, getErrorMessage = getErrorMessage.toJsFn, getErrorType = getErrorType.toJsFn)
    __obj.asInstanceOf[SoftphoneError]
  }
  
  extension [Self <: SoftphoneError](x: Self) {
    
    inline def setEndPointUrl(value: String): Self = StObject.set(x, "endPointUrl", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setGetEndPointUrl(value: CallbackTo[String]): Self = StObject.set(x, "getEndPointUrl", value.toJsFn)
    
    inline def setGetErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "getErrorMessage", value.toJsFn)
    
    inline def setGetErrorType(value: CallbackTo[String]): Self = StObject.set(x, "getErrorType", value.toJsFn)
  }
}
