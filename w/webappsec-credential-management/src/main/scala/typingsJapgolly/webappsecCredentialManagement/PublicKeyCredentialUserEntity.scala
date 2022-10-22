package typingsJapgolly.webappsecCredentialManagement

import typingsJapgolly.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialuserentity}
  */
trait PublicKeyCredentialUserEntity
  extends StObject
     with PublicKeyCredentialEntity {
  
  var displayName: String
  
  var id: BufferSource
}
object PublicKeyCredentialUserEntity {
  
  inline def apply(displayName: String, id: BufferSource, name: String): PublicKeyCredentialUserEntity = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialUserEntity]
  }
  
  extension [Self <: PublicKeyCredentialUserEntity](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: BufferSource): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
