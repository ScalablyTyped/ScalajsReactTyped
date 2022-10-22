package typingsJapgolly.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-passwordcredentialdata}
  */
trait PasswordCredentialData
  extends StObject
     with SiteBoundCredentialData {
  
  /**
    * The plain-text password.
    */
  var password: String
}
object PasswordCredentialData {
  
  inline def apply(id: String, password: String): PasswordCredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredentialData]
  }
  
  extension [Self <: PasswordCredentialData](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
