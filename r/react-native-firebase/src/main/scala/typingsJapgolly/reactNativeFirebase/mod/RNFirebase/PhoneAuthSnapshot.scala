package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.sent
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.timeout
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.verified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneAuthSnapshot extends StObject {
  
  var code: String | Null
  
  var error: NativeError | Null
  
  var state: sent | timeout | verified | error_
  
  var verificationId: String
}
object PhoneAuthSnapshot {
  
  inline def apply(state: sent | timeout | verified | error_, verificationId: String): PhoneAuthSnapshot = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], verificationId = verificationId.asInstanceOf[js.Any], code = null, error = null)
    __obj.asInstanceOf[PhoneAuthSnapshot]
  }
  
  extension [Self <: PhoneAuthSnapshot](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setError(value: NativeError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setState(value: sent | timeout | verified | error_): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
  }
}
