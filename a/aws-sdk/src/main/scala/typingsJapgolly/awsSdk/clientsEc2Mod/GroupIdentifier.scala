package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupIdentifier extends StObject {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}
object GroupIdentifier {
  
  inline def apply(): GroupIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupIdentifier]
  }
  
  extension [Self <: GroupIdentifier](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
