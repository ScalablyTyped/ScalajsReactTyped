package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeSecurityGroupEgressResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The outbound rules that were unknown to the service. In some cases, unknownIpPermissionSet might be in a different format from the request parameter. 
    */
  var UnknownIpPermissions: js.UndefOr[IpPermissionList] = js.undefined
}
object RevokeSecurityGroupEgressResult {
  
  inline def apply(): RevokeSecurityGroupEgressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeSecurityGroupEgressResult]
  }
  
  extension [Self <: RevokeSecurityGroupEgressResult](x: Self) {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
    
    inline def setUnknownIpPermissions(value: IpPermissionList): Self = StObject.set(x, "UnknownIpPermissions", value.asInstanceOf[js.Any])
    
    inline def setUnknownIpPermissionsUndefined: Self = StObject.set(x, "UnknownIpPermissions", js.undefined)
    
    inline def setUnknownIpPermissionsVarargs(value: IpPermission*): Self = StObject.set(x, "UnknownIpPermissions", js.Array(value*))
  }
}
