package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityProfileResponse extends StObject {
  
  /**
    * The security profile.
    */
  var SecurityProfile: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.SecurityProfile] = js.undefined
}
object DescribeSecurityProfileResponse {
  
  inline def apply(): DescribeSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityProfileResponse]
  }
  
  extension [Self <: DescribeSecurityProfileResponse](x: Self) {
    
    inline def setSecurityProfile(value: SecurityProfile): Self = StObject.set(x, "SecurityProfile", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileUndefined: Self = StObject.set(x, "SecurityProfile", js.undefined)
  }
}
