package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeDBSecurityGroupIngressResult extends StObject {
  
  var DBSecurityGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.DBSecurityGroup] = js.undefined
}
object RevokeDBSecurityGroupIngressResult {
  
  inline def apply(): RevokeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeDBSecurityGroupIngressResult]
  }
  
  extension [Self <: RevokeDBSecurityGroupIngressResult](x: Self) {
    
    inline def setDBSecurityGroup(value: DBSecurityGroup): Self = StObject.set(x, "DBSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupUndefined: Self = StObject.set(x, "DBSecurityGroup", js.undefined)
  }
}
