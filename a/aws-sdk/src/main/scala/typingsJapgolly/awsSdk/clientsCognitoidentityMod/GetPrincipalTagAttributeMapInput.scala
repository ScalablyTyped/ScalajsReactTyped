package typingsJapgolly.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPrincipalTagAttributeMapInput extends StObject {
  
  /**
    * You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.
    */
  var IdentityPoolId: typingsJapgolly.awsSdk.clientsCognitoidentityMod.IdentityPoolId
  
  /**
    * You can use this operation to get the provider name.
    */
  var IdentityProviderName: typingsJapgolly.awsSdk.clientsCognitoidentityMod.IdentityProviderName
}
object GetPrincipalTagAttributeMapInput {
  
  inline def apply(IdentityPoolId: IdentityPoolId, IdentityProviderName: IdentityProviderName): GetPrincipalTagAttributeMapInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityProviderName = IdentityProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrincipalTagAttributeMapInput]
  }
  
  extension [Self <: GetPrincipalTagAttributeMapInput](x: Self) {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderName(value: IdentityProviderName): Self = StObject.set(x, "IdentityProviderName", value.asInstanceOf[js.Any])
  }
}
