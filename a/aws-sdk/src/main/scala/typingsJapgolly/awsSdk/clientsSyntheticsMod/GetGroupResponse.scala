package typingsJapgolly.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupResponse extends StObject {
  
  /**
    * A structure that contains information about the group.
    */
  var Group: js.UndefOr[typingsJapgolly.awsSdk.clientsSyntheticsMod.Group] = js.undefined
}
object GetGroupResponse {
  
  inline def apply(): GetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupResponse]
  }
  
  extension [Self <: GetGroupResponse](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
