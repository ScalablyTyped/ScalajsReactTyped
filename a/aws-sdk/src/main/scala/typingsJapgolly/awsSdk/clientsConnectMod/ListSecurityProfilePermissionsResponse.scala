package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityProfilePermissionsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The permissions granted to the security profile. For a complete list of valid permissions, see List of security profile permissions.
    */
  var Permissions: js.UndefOr[PermissionsList] = js.undefined
}
object ListSecurityProfilePermissionsResponse {
  
  inline def apply(): ListSecurityProfilePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilePermissionsResponse]
  }
  
  extension [Self <: ListSecurityProfilePermissionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPermissions(value: PermissionsList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SecurityProfilePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
  }
}
