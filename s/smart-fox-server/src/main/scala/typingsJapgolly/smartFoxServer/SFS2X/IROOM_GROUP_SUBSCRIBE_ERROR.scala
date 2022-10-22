package typingsJapgolly.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IROOM_GROUP_SUBSCRIBE_ERROR extends StObject {
  
  var errorCode: Double
  
  var errorMessage: String
}
object IROOM_GROUP_SUBSCRIBE_ERROR {
  
  inline def apply(errorCode: Double, errorMessage: String): IROOM_GROUP_SUBSCRIBE_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_GROUP_SUBSCRIBE_ERROR]
  }
  
  extension [Self <: IROOM_GROUP_SUBSCRIBE_ERROR](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
