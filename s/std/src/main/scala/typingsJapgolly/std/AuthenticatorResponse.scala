package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait AuthenticatorResponse extends StObject {
  
  /* standard dom */
  val clientDataJSON: js.typedarray.ArrayBuffer
}
object AuthenticatorResponse {
  
  inline def apply(clientDataJSON: js.typedarray.ArrayBuffer): AuthenticatorResponse = {
    val __obj = js.Dynamic.literal(clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorResponse]
  }
  
  extension [Self <: AuthenticatorResponse](x: Self) {
    
    inline def setClientDataJSON(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "clientDataJSON", value.asInstanceOf[js.Any])
  }
}
