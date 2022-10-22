package typingsJapgolly.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMyUserProfileRequest extends StObject {
  
  /**
    * The user's SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.undefined
}
object UpdateMyUserProfileRequest {
  
  inline def apply(): UpdateMyUserProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMyUserProfileRequest]
  }
  
  extension [Self <: UpdateMyUserProfileRequest](x: Self) {
    
    inline def setSshPublicKey(value: String): Self = StObject.set(x, "SshPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyUndefined: Self = StObject.set(x, "SshPublicKey", js.undefined)
  }
}
