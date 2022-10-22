package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInputSecurityGroupResponse extends StObject {
  
  var SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
}
object CreateInputSecurityGroupResponse {
  
  inline def apply(): CreateInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputSecurityGroupResponse]
  }
  
  extension [Self <: CreateInputSecurityGroupResponse](x: Self) {
    
    inline def setSecurityGroup(value: InputSecurityGroup): Self = StObject.set(x, "SecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupUndefined: Self = StObject.set(x, "SecurityGroup", js.undefined)
  }
}
