package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credential extends StObject {
  
  /**
    * Unique ID identifying the credential
    */
  var credentialId: String
  
  /**
    * password
    */
  var password: String
}
object Credential {
  
  inline def apply(credentialId: String, password: String): Credential = {
    val __obj = js.Dynamic.literal(credentialId = credentialId.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
  
  extension [Self <: Credential](x: Self) {
    
    inline def setCredentialId(value: String): Self = StObject.set(x, "credentialId", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
