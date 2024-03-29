package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxValidationError...
  */
trait INxValidationError extends StObject {
  
  /**
    * Context related to the error, from the user app domain.
    * It can be the identifier of an object, a field name, a table name.
    * This parameter is optional.
    * String
    */
  var qContext: js.UndefOr[String] = js.undefined
  
  /**
    * Error code.
    * This parameter is always displayed in case of error.
    * Integer
    */
  var qErrorCode: Double
  
  /**
    * Internal information from the server.
    * This parameter is optional.
    * String
    */
  var qExtendedMessage: js.UndefOr[String] = js.undefined
}
object INxValidationError {
  
  inline def apply(qErrorCode: Double): INxValidationError = {
    val __obj = js.Dynamic.literal(qErrorCode = qErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxValidationError]
  }
  
  extension [Self <: INxValidationError](x: Self) {
    
    inline def setQContext(value: String): Self = StObject.set(x, "qContext", value.asInstanceOf[js.Any])
    
    inline def setQContextUndefined: Self = StObject.set(x, "qContext", js.undefined)
    
    inline def setQErrorCode(value: Double): Self = StObject.set(x, "qErrorCode", value.asInstanceOf[js.Any])
    
    inline def setQExtendedMessage(value: String): Self = StObject.set(x, "qExtendedMessage", value.asInstanceOf[js.Any])
    
    inline def setQExtendedMessageUndefined: Self = StObject.set(x, "qExtendedMessage", js.undefined)
  }
}
