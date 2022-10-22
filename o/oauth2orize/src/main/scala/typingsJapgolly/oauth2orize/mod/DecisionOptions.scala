package typingsJapgolly.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecisionOptions extends StObject {
  
  var cancelField: String
  
  var loadTransaction: Boolean
  
  var sessionKey: String
  
  var userProperty: String
}
object DecisionOptions {
  
  inline def apply(cancelField: String, loadTransaction: Boolean, sessionKey: String, userProperty: String): DecisionOptions = {
    val __obj = js.Dynamic.literal(cancelField = cancelField.asInstanceOf[js.Any], loadTransaction = loadTransaction.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], userProperty = userProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionOptions]
  }
  
  extension [Self <: DecisionOptions](x: Self) {
    
    inline def setCancelField(value: String): Self = StObject.set(x, "cancelField", value.asInstanceOf[js.Any])
    
    inline def setLoadTransaction(value: Boolean): Self = StObject.set(x, "loadTransaction", value.asInstanceOf[js.Any])
    
    inline def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    inline def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
  }
}
