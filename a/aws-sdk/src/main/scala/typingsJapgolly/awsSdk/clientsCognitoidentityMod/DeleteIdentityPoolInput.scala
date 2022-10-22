package typingsJapgolly.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentityPoolInput extends StObject {
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typingsJapgolly.awsSdk.clientsCognitoidentityMod.IdentityPoolId
}
object DeleteIdentityPoolInput {
  
  inline def apply(IdentityPoolId: IdentityPoolId): DeleteIdentityPoolInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityPoolInput]
  }
  
  extension [Self <: DeleteIdentityPoolInput](x: Self) {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
  }
}
