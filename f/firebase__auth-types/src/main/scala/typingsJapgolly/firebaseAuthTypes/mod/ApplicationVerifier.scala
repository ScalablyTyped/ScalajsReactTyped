package typingsJapgolly.firebaseAuthTypes.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationVerifier extends StObject {
  
  var `type`: String
  
  def verify(): js.Promise[String]
}
object ApplicationVerifier {
  
  inline def apply(`type`: String, verify: CallbackTo[js.Promise[String]]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(verify = verify.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVerifier]
  }
  
  extension [Self <: ApplicationVerifier](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerify(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "verify", value.toJsFn)
  }
}
