package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticatorGroupsConfig extends StObject {
  
  /** Whether this cluster should return group membership lookups during authentication using a group of security groups. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the security group-of-groups to be used. Only relevant if enabled = true. */
  var securityGroup: js.UndefOr[String] = js.undefined
}
object AuthenticatorGroupsConfig {
  
  inline def apply(): AuthenticatorGroupsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticatorGroupsConfig]
  }
  
  extension [Self <: AuthenticatorGroupsConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setSecurityGroup(value: String): Self = StObject.set(x, "securityGroup", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupUndefined: Self = StObject.set(x, "securityGroup", js.undefined)
  }
}
