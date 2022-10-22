package typingsJapgolly.exaroton.mod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestError
  extends StObject
     with Error {
  
  val response: Response
  
  /**
    * Set error and status code from response object
    *
    * Returns if an error message was found
    *
    * @param response
    */
  def setErrorFromResponseBody(response: js.Object): Boolean
  
  val statusCode: Double
}
object RequestError {
  
  inline def apply(
    message: String,
    name: String,
    response: Response,
    setErrorFromResponseBody: js.Object => Boolean,
    statusCode: Double
  ): RequestError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], setErrorFromResponseBody = js.Any.fromFunction1(setErrorFromResponseBody), statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestError]
  }
  
  extension [Self <: RequestError](x: Self) {
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setSetErrorFromResponseBody(value: js.Object => Boolean): Self = StObject.set(x, "setErrorFromResponseBody", js.Any.fromFunction1(value))
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
