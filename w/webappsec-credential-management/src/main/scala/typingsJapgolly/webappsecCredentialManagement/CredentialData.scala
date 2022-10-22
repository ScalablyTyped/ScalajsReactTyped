package typingsJapgolly.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-credentialdata}
  */
trait CredentialData extends StObject {
  
  /**
    * The credential’s identifier. This might be a GUID, username, or email
    * address, for instance.
    */
  val id: String
}
object CredentialData {
  
  inline def apply(id: String): CredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialData]
  }
  
  extension [Self <: CredentialData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
